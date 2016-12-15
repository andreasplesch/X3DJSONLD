"use strict";

// 'http://www.web3d.org/specifications/x3d-namespace'

// Convert X3D JSON to XML

var fs = require('fs');

var xmldom = require('xmldom');
var DOMImplementation = new xmldom.DOMImplementation();

var X3DJSONLD = require('./X3DJSONLD.js');
var ConvertToX3DOM = X3DJSONLD.ConvertToX3DOM;
var loadX3DJS = require('./serverX3DJSONLD');
var JavaSerializer = require('./JavaSerializer.js');

process.argv.shift();
process.argv.shift();

var files = process.argv;
for (var f in files) {
	var file = files[f];
	try {
		var file = file.substr(0, file.lastIndexOf("."))+".json";
		var json = JSON.parse(fs.readFileSync(file).toString());
		var element = loadX3DJS(json, file);
		var java = JavaSerializer.serializeToString(element, file.substr(0, file.lastIndexOf(".")));

		var javafile = "";
		javafile += file.substr(0, file.lastIndexOf("."))+".java";
		fs.writeFileSync(javafile, java);
		process.stdout.write(javafile);
		process.stdout.write('\0');
	} catch (e) {
		console.error("Error reading", file, e);
		console.trace();
	}
}

if (typeof module === 'object')  {
	module.exports = {
		loadX3DJS : loadX3DJS,
	};
}
