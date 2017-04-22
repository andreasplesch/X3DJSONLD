"use strict";

function JavaScriptSerializer () {
};


var code = [];
var codeno = 0;

JavaScriptSerializer.prototype = {
	serializeToString : function(json, element, clazz, mapToMethod, fieldTypes) {
		code = [];
		codeno = 0;
		/*
		for (let a in element.attributes) {
			let attrs = element.attributes;
			let attributeName = attrs[a].nodeName;
			if (attributeName === "version" && attrs[a].nodeValue !== "3.3") {
				console.log(clazz, attrs[a].nodeValue);
				return;
			}
		}
		*/

		let str = "";
		let pc = clazz.replace(/-|\.| /g, "$");
		let c = pc.lastIndexOf("/");
		if (pc.lastIndexOf("\\") > c) {
			c = pc.lastIndexOf("\\");
		}
		let clz = pc.substr(c+1);
		clz = clz.replace(/^([0-9].*|default$)/, "_$1")
		let pkg = pc.substr(0, c).replace(/[\/\\]/g, ".").trim();

		str += "load('X3Dautoclass.js');\n";
		str += "var ConfigurationProperties = Packages.org.web3d.x3d.jsail.ConfigurationProperties;\n";
		str += "ConfigurationProperties.showDefaultAttributes = false;\n";
		str += "ConfigurationProperties.xsltEngine = ConfigurationProperties.XSLT_ENGINE_nativeJava;\n";
		str += "ConfigurationProperties.deleteIntermediateFiles = false;\n";
		str += "ConfigurationProperties.setStripTrailingZeroes(true);\n";
		str += printMethod(element, mapToMethod, fieldTypes, 1);
		str += "	.toFileX3D(\""+clazz+".new.x3d\");\n";

		return str;
	}
}

function printSubArray(type, values, j, lead, trail) {
	return 'Java.to(['+lead+values.join(j)+trail+'], Java.type("'+type+'[]"))';
}

function printMethod(node, mapToMethod, fieldTypes, n) {
	var str = "new "+node.nodeName+"Object()\n";
	str += JavaScriptSerializer.subSerializeToString(node, mapToMethod, fieldTypes, n);
	return str;
}

function printParentChild(element, node, cn, mapToMethod, n) {
	let addpre = ".set";
	if (cn > 0 && node.nodeName !== 'IS') {
		addpre = ".add";
	}
	if (node.nodeName === 'field') {
		addpre = ".add";
	}

	let method = node.nodeName;
	if (typeof mapToMethod[element.nodeName] === 'object') {
		if (typeof mapToMethod[element.nodeName][node.nodeName] === 'string') {
			addpre = ".";
			method = mapToMethod[element.nodeName][node.nodeName];
		} else {
			method = method.charAt(0).toUpperCase() + method.slice(1);
		}
	} else if (typeof mapToMethod[element.nodeName] === 'string') {
		addpre = ".";
		method = mapToMethod[element.nodeName];
	} else {
		method = method.charAt(0).toUpperCase() + method.slice(1);
	}
	return "  ".repeat(n)+addpre+method+"(";
}

JavaScriptSerializer.subSerializeToString = function(element, mapToMethod, fieldTypes, n) {
	let str = "";
	let fieldAttrType = "";
	for (let a in element.attributes) {
		let attrs = element.attributes;
		try {
			parseInt(a);
			if (attrs.hasOwnProperty(a) && attrs[a].nodeType == 2) {
				let attr = attrs[a].nodeName;
				if (attr == "type") {
					fieldAttrType = attrs[a].nodeValue;
				}
			}
		} catch (e) {
			console.error(e);
		}
	}
	let attrType = "";
	for (let a in element.attributes) {
		let attrs = element.attributes;
		try {
			parseInt(a);
			if (attrs.hasOwnProperty(a) && attrs[a].nodeType == 2) {
				let attr = attrs[a].nodeName;
				if (attr == "xmlns:xsd" || attr == "xsd:noNamespaceSchemaLocation") {
					continue;
				}
				if (attr !== 'containerField') {
					let method = attr;
					// look at object model
					let attrType = "SFString";
					if (typeof fieldTypes[element.nodeName] !== 'undefined') {
						attrType = fieldTypes[element.nodeName][attr];
					}

					// str += "attrType "+attrType+" FAT "+fieldAttrType+" "+attrs[a].nodeValue+"\n";
					// but if it's NULL, look at the field type
					if (attrs[a].nodeValue === 'NULL' &&
					   (fieldAttrType === "SFNode"  ||
					    fieldAttrType === "MFNode")) {
						method = "clearChildren";
					} else {
						method = "set"+method.charAt(0).toUpperCase() + method.slice(1);
					}
					str += "  ".repeat(n)+"."+method+"(";
					if (attrs[a].nodeValue === 'NULL') {
						str += "";
					} else if (attrType === "SFString") {
						if (attr === "type" && attrs[a].nodeValue !== "VERTEX" && attrs[a].nodeValue !== "FRAGMENT") {
							str += "fieldObject.TYPE_"+attrs[a].nodeValue.toUpperCase();
						} else if (attr === "accessType") {
							str += "fieldObject.ACCESSTYPE_"+attrs[a].nodeValue.toUpperCase();
						} else if (
							attrs[a].nodeValue.indexOf("_changed") > 0 &&

							((element.nodeName === 'field' ||
							attr === "name") ||
							attr === "fromField")) {
							str += '"'+attrs[a].nodeValue.substring(0, attrs[a].nodeValue.indexOf("_changed")).replace(/\n/g, '\\\\n').replace(/\\?"/g, "\\\"")+'"';
						} else if (
							attrs[a].nodeValue.indexOf("set_") === 0 &&

							((element.nodeName === 'field' &&
							attr === "name") ||
							attr === "toField")) {
							str += '"'+attrs[a].nodeValue.substring(4).replace(/\n/g, '\\\\n').replace(/\\?"/g, "\\\"")+'"';
						} else {
							str += '"'+attrs[a].nodeValue.replace(/\n/g, '\\\\n').replace(/\\?"/g, "\\\"")+'"';
						}
					} else if (attrType === "SFInt32") {
						str += attrs[a].nodeValue;
					} else if (attrType === "SFFloat") {
						str += attrs[a].nodeValue;
					} else if (attrType === "SFDouble") {
						str += attrs[a].nodeValue;
					} else if (attrType === "SFBool") {
						str += attrs[a].nodeValue;
					} else if (attrType === "MFString") {
						str += printSubArray("java.lang.String",
							attrs[a].nodeValue.substring(1, attrs[a].nodeValue.length-1).split(/" "/).
							map(function(x) {

								let y = x.
								       replace(/([^\\]| )\\\\\\\\([^\\"]| )/g, "$1\\\\\\\\\\\\\\\\$2").
								       replace(/([^\\])\\\\([^\\"])/g, "$1\\\\\\\\$2").
								       replace(/([^\\])\\([^\\"])/g, "$1\\\\$2").
								       replace(/\\\\"/g, '\\\"').
								       replace(/(\\)+([&"])/g, '\\\\\\\$2').
								       replace(/""/g, '\\"\\"').
								       replace(/&quot;&quot;/g, '\\"\\"').
								       replace(/&/g, "&amp;").
								       replace(/\\n/g, '\\n');
								if (y !== x) {
									console.error("JavaScript Replacing "+x+" with "+y);
								}
								return y;
							}), '","', '"', '"');
					} else if (
						attrType === "MFInt32"||
						attrType === "MFImage"||
						attrType === "SFImage") {
						str += printSubArray("int", attrs[a].nodeValue.split(' '), ',', '', '');
					} else if (
						attrType === "SFColor"||
						attrType === "MFColor"||
						attrType === "SFColorRGBA"||
						attrType === "MFColorRGBA"||
						attrType === "SFVec2f"||
						attrType === "SFVec3f"||
						attrType === "SFVec4f"||
						attrType === "MFVec2f"||
						attrType === "MFVec3f"||
						attrType === "MFVec4f"||
						attrType === "SFMatrix3f"||
						attrType === "SFMatrix4f"|
						attrType === "MFMatrix3f"||
						attrType === "MFMatrix4f"|
						attrType === "SFRotation"|
						attrType === "MFRotation"|
						attrType === "MFFloat") {
						str += printSubArray("float", attrs[a].nodeValue.split(' '), ',', '', '');
					} else if (
						attrType === "SFVec2d"||
						attrType === "SFVec3d"||
						attrType === "SFVec4d"|
						attrType === "MFVec2d"||
						attrType === "MFVec3d"||
						attrType === "MFVec4d"|
						attrType === "SFMatrix3d"||
						attrType === "SFMatrix4d"|
						attrType === "MFMatrix3d"||
						attrType === "MFMatrix4d"|
						attrType === "MFDouble") {
						str += printSubArray("double", attrs[a].nodeValue.split(' '), ',', '', '');
					} else if (attrType === "MFBool") {
						str += printSubArray("boolean", attrs[a].nodeValue.split(' '), ',', '', '');
					} else {
						str += attrs[a].nodeValue;
					}
					str += ")\n";
				}
			}
		} catch (e) {
			console.error(e);
		}
		attrType = "";
	}
	for (let cn in element.childNodes) {
		let node = element.childNodes[cn];
		if (element.childNodes.hasOwnProperty(cn) && node.nodeType == 1) {
			str += printParentChild(element, node, cn, mapToMethod, n);
			str += printMethod(node, mapToMethod, fieldTypes, n+1);
			str += "  ".repeat(n)+")\n";
		} else if (element.childNodes.hasOwnProperty(cn) && node.nodeType == 8) {
			str += "  ".repeat(n)+".addComments(new CommentsBlock(\""+node.nodeValue.replace(/"/g, '\\"')+"\"))\n";
		} else if (element.childNodes.hasOwnProperty(cn) && node.nodeType == 4) {
			str += "  ".repeat(n)+".setSourceCode(\""+node.nodeValue.split("\r\n").map(function(x) {
				return x.replace(/\\"/g, '\\\\"').
					replace(/"/g, '\\"').
					replace(/\\n/g, "\\\\n");
			}).join('\\n\"+\n\"')+'")\n';
		}
	}
	return str;
}


if (typeof module === 'object')  {
	module.exports = JavaScriptSerializer;
}
