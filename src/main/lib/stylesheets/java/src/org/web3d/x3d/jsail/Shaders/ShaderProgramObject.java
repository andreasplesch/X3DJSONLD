/*
Copyright (c) 1995-2017 held by the author(s).  All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:

    * Redistributions of source code must retain the above copyright
      notice, this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright
      notice, this list of conditions and the following disclaimer
      in the documentation and/or other materials provided with the
      distribution.
    * Neither the name of the Web3D Consortium (http://www.web3D.org)
      nor the names of its contributors may be used to endorse or
      promote products derived from this software without specific
      prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
POSSIBILITY OF SUCH DAMAGE.
*/

package org.web3d.x3d.jsail.Shaders;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.jsail.fields.*; // making sure #4
import org.web3d.x3d.jsail.Core.fieldObject;
import org.web3d.x3d.sai.Shaders.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;

/**
 * ShaderProgram can contain field declarations and a CDATA section of plain-text source code.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.1 or later) ShaderProgram is contained by ProgramShader and provides the source and interface to a self-contained program that occupies one part of the rendering process: either a vertex or fragment shader.
 * <ul>
 *  <li> <i>Hint:</i> ShaderProgram contains field declarations and then corresponding IS/connect statements (if any). </li> 
 *  <li> <i>Hint:</i>  ShaderProgram can contain a CDATA section of plain-text source code, which must follow field and IS/connect statements. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This org.web3d.x3d.jsail concrete class is used for implementing a standalone X3D object as a <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object" target="_blank">Plain Old Java Object (POJO)</a>.
 * If you are writing Java code for use inside an X3D Script node, compile separate code using only the <i>org.web3d.x3d.sai</i> package instead.
 *
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="http://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shaders.html#ShaderProgram" target="blank">X3D Abstract Specification: ShaderProgram</a>

 * @see <a href="http://www.web3d.org/x3d/tooltips/X3dTooltips.html#ShaderProgram" target="_blank">X3D Tooltips: ShaderProgram</a>
 * @see <a href="http://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
 */
public class ShaderProgramObject extends org.web3d.x3d.jsail.X3DConcreteNode implements org.web3d.x3d.sai.Shaders.ShaderProgram
{
	/** required by internal interface, empty list provided since no children array present in this class */
    private ArrayList<String> commentsList; 

	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

	private X3DMetadataObject metadata; // SFNode acceptable node types: X3DMetadataObject
	private ProtoInstanceObject metadataProtoInstance; // allowed alternative for metadata field

	private String type; // SFString

	private ArrayList<String> url = new ArrayList<>(); // MFString

	private ArrayList<fieldObject> fieldList = new ArrayList<>(); // instantiation

	private String sourceCode;

	/** IS/connect statements might be used if this node is within a ProtoBody and connections are defined between prototype fields and built-in node fields */
	private ISObject IS;

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** SFString field named <i>type</i> can equal this enumeration value <i>"VERTEX"</i> (Java syntax) or <i>VERTEX</i> (XML syntax). */
	public static final String TYPE_VERTEX = "VERTEX";

	/** SFString field named <i>type</i> can equal this enumeration value <i>"FRAGMENT"</i> (Java syntax) or <i>FRAGMENT</i> (XML syntax). */
	public static final String TYPE_FRAGMENT = "FRAGMENT";

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>ShaderProgram</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "ShaderProgram";

	/** Provides name of this element: <i>ShaderProgram</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>ShaderProgram</i> element: <i>Shaders</i> */
	public static final String COMPONENT = "Shaders";

	/** Defines X3D component for the <i>ShaderProgram</i> element: <i>Shaders</i>
	 * @return X3D component for this element
	 */
	@Override
	public final String getComponent()
	{
		return COMPONENT;
	}

	/** Integer constant <i>LEVEL</i> provides default X3D <i>Shaders</i> component level for this element: <i>1</i> */
	public static final int LEVEL = 1;

	/** Provides default X3D component level for this element: <i>1</i>
	 * @return default X3D component level for this element
	 */
	@Override
	public final int getComponentLevel()
	{
		return LEVEL;
	}

	/** SFString field named <i>type</i> has default value <i>"VERTEX"</i> (Java syntax) or <i>VERTEX</i> (XML syntax). */
	public static final String TYPE_DEFAULT_VALUE = "VERTEX";

	/** MFString field named <i>url</i> has default value equal to an empty list. */
	public static final ArrayList<String> URL_DEFAULT_VALUE = new ArrayList<String>(Arrays.<String>asList());

	/** Indicate type corresponding to given fieldName.
	 * @param fieldName name of field in this X3D node
	 * @see ConfigurationProperties#ERROR_UNKNOWN_FIELD_TYPE
	 * @return X3D type (SFvec3f etc.), otherwise ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE if not recognized
	 */
	@Override		
	public String getFieldType(String fieldName)
	{
		String result;

		switch (fieldName)
		{
			// String constants for exact field type values matching X3D Schema definitions,
			// thus avoiding spelling errors and allowing type-matching checks
											
			case "containerField":
				result = "SFString";
				break;
			case "metadata":
				result = "SFNode";
				break;
			case "type":
				result = "SFString";
				break;
			case "url":
				result = "MFString";
				break;
			case "DEF":
				result = "SFString";
				break;
			case "USE":
				result = "SFString";
				break;
			case "class":
				result = "SFString";
				break;
			default:
			{
				// if fieldName has a prefix "set_" prepended (or a suffix "_changed" appended) then try again by stripping it and recursing once
				if      (fieldName.trim().startsWith("set_"))
						 result = getFieldType(fieldName.trim().substring(4)); // after "set_"
				else if (fieldName.trim().endsWith("_changed"))
						 result = getFieldType(fieldName.trim().substring(0, fieldName.length() - 8)); // before "_changed"
				else     result = ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE; // unique return value avoids mistaken matches
			}
		}
		// now check author-defined fields
		fieldObject fieldDeclaration = this.findFieldByName(fieldName);
		if (fieldDeclaration != null)
			result = fieldDeclaration.getType(); // found it!
		return result;
	}

	/** Indicate accessType corresponding to given fieldName.
	 * @param fieldName name of field in this X3D node
	 * @see ConfigurationProperties#ERROR_UNKNOWN_FIELD_ACCESSTYPE
	 * @return X3D accessType (inputOnly etc.), otherwise ConfigurationProperties.ERROR_UNKNOWN_FIELD_ACCESSTYPE if not recognized
	 */
	@Override
	public String getAccessType(String fieldName)
	{
		String result; // set by following checks
		switch (fieldName)
		{
			// String constants for field accessType values matching X3D Schema definitions,
			// thus avoiding spelling errors and allowing accessType-matching checks
			case "metadata":
				result = "inputOutput";
				break;
			case "type":
				result = "inputOutput";
				break;
			case "url":
				result = "inputOutput";
				break;
			case "DEF":
				result = "inputOutput";
				break;
			case "USE":
				result = "inputOutput";
				break;
			case "class":
				result = "inputOutput";
				break;
			default:
			{
				// if user has added a prefix "set_" or suffix "_changed" then try again by stripping it and recursing once
				if      (fieldName.trim().startsWith("set_"))
						 result = getAccessType(fieldName.trim().substring(4)); // after "set_"
				else if (fieldName.trim().endsWith("_changed"))
						 result = getAccessType(fieldName.trim().substring(0, fieldName.length() - 8)); // before "_changed"
				else     result = ConfigurationProperties.ERROR_UNKNOWN_FIELD_ACCESSTYPE; // unique return value avoids mistaken matches
			}
		}
		// now check author-defined fields
		fieldObject fieldDeclaration = this.findFieldByName(fieldName);
		if (fieldDeclaration != null)
			result = fieldDeclaration.getAccessType(); // found it!
		return result;
	}

	/** Contained plain-text source code */
	private String SOURCECODE_DEFAULT_VALUE = "";
								
	/** containerField describes typical field relationship of a node to its parent.
	 * Usage is not ordinarily needed when using this API, default value is provided for informational purposes. */
	String containerField_DEFAULT_VALUE = "programs";

	// String constants for field names usable in ROUTE statements

	/** fromField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String fromField_METADATA = "metadata";

	/** toField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String toField_METADATA = "metadata";

	/** fromField ROUTE name for SFString field named <i>type</i>. */
	public static final String fromField_TYPE = "type";

	/** toField ROUTE name for SFString field named <i>type</i>. */
	public static final String toField_TYPE = "type";

	/** fromField ROUTE name for MFString field named <i>url</i>. */
	public static final String fromField_URL = "url";

	/** toField ROUTE name for MFString field named <i>url</i>. */
	public static final String toField_URL = "url";

	/** Constructor for ShaderProgramObject to initialize member variables with default values. */
	public ShaderProgramObject()
	{
		super(); // constructor invocation and corresponding initialize()
		initialize();
	}

	/** Initialize all member variables to default values. */
	@Override
	public final void initialize()
	{
		super.initialize();

		containerField_ALTERNATE_VALUES = new String[] { "programs" };

		metadata = null; // clear out any prior node
		type = TYPE_DEFAULT_VALUE;
		url = new ArrayList<>(URL_DEFAULT_VALUE);

		commentsList = new ArrayList<>(); // instantiate

			fieldList = new ArrayList<>(); // instantiate

			sourceCode = SOURCECODE_DEFAULT_VALUE; // reset
		}

	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide X3DMetadataObject instance (using a properly typed node) from inputOutput SFNode field <i>metadata</i>.
	 * @see #getMetadataProtoInstance()
	 * @see <a href="http://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata">X3D Scene Authoring Hints: Metadata Nodes</a>
	 * @return value of metadata field
	 */
	@Override
	public X3DMetadataObject getMetadata()
	{
		return metadata;
	}

	/**
	 * Assign X3DMetadataObject instance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(ProtoInstanceObject)
	 * @see <a href="http://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata">X3D Scene Authoring Hints: Metadata Nodes</a>
	 * @param newValue is new value for the metadata field.
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same node object).
	 */
	@Override
	public ShaderProgramObject setMetadata(X3DMetadataObject newValue)
	{
		metadata = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) metadata).setParentObject(this); // parentTest15
		}
		if (metadataProtoInstance != null)
		{
			metadataProtoInstance.setParentObject(null); // housekeeping, clear prior object
			metadataProtoInstance = null;
		}

		return this;
	}

	/**
	 * Utility method to clear SFNode value of metadata field.
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public ShaderProgramObject clearMetadata()
	{
		((X3DConcreteElement) metadata).clearParentObject(); // remove references to facilitate Java memory management
		metadata = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance to <i>metadata</i> field;

	 * <i>Warning:</i> ProtoInstance must match acceptable node type X3DMetadataObject.
	 * @param newProtoInstanceNode is the new ProtoInstance node for the metadata field
	 * @see #setMetadata(X3DMetadataObject)
	 * @see <a href="http://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata">X3D Scene Authoring Hints: Metadata Nodes</a>
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public ShaderProgramObject setMetadata(ProtoInstanceObject newProtoInstanceNode)
	{
		if (metadata != null)
		{
			((X3DConcreteElement) metadata).setParentObject(null); // housekeeping, clear prior object
			metadata = null;
		}
		metadataProtoInstance = newProtoInstanceNode;
		if (newProtoInstanceNode != null)
		{
			newProtoInstanceNode.setParentObject(this);
		}
		return this;
	}
	/**
	 * Provide properly typed ProtoInstance for inputOutput SFNode field <i>metadata</i>, if available.
	 * @see #getMetadata()
	 * @see <a href="http://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata">X3D Scene Authoring Hints: Metadata Nodes</a>
	 * @return ProtoInstance value of geometry field
	 */
	public ProtoInstanceObject getMetadataProtoInstance()
	{
		return metadataProtoInstance;
	}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>metadata</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getMetadata()
	 * @see #getMetadataProtoInstance()
	 * @see <a href="http://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata">X3D Scene Authoring Hints: Metadata Nodes</a>
	 */
	public boolean hasMetadata()
	{
		return (metadata != null) || (metadataProtoInstance != null);
	}
	/**
	 * Provide String enumeration value ['VERTEX'|'FRAGMENT'|'etc.'] from inputOutput SFString field named <i>type</i>.
	 * <br><br>
	 * <i>Tooltip:</i> type indicates whether this ShaderProgram is a vertex or fragment (pixel) shader.
 * <ul>
 *  <li> <i> Warning:</i>  do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #TYPE_VERTEX VERTEX}, {@link #TYPE_FRAGMENT FRAGMENT}.
	 * @return value of type field
	 */
	@Override
	public String getType()
	{
		return type;
	}

	/**
	 * Assign String enumeration value ("VERTEX"|"FRAGMENT") ['VERTEX'|'FRAGMENT'|'etc.'] to inputOutput SFString field named <i>type</i>.
	 * <br><br>
	 * <i>Hint:</i> authors have option to choose from an extendible list of predefined enumeration values ({@link #TYPE_VERTEX VERTEX}, {@link #TYPE_FRAGMENT FRAGMENT}).
	 * <br><br>
	 * <i>Tooltip:</i> type indicates whether this ShaderProgram is a vertex or fragment (pixel) shader. Warning: do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values.
	 * @param newValue is new value for the type field.
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same node object).
	 */
	@Override
	public ShaderProgramObject setType(String newValue)
	{
		if (newValue == null) 
			newValue = new String(); // Principle of Least Astonishment (POLA)
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		type = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString type field, similar to {@link #setType(String)}.
	 * @param newValue is new value for the type field.
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same node object).
	 */
	public ShaderProgramObject setType(SFStringObject newValue)
	{
		setType(newValue.getPrimitiveValue());
		return this;
	}
	/**
	 * Provide array of String results from inputOutput MFString field named <i>url</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Location and filename of shader. Multiple locations are more reliable, and including a Web address lets e-mail attachments work.
 * <ul>
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so separate each individual string by quote marks <br> "<a href="http://www.web3d.org" target="_blank">http://www.web3d.org</a>" <br> "<a href="http://www.web3d.org/about" target="_blank">http://www.web3d.org/about</a>" "etc." </li> 
 *  <li> <i>Hint:</i> XML encoding for quotation mark " is &amp;quot; (which is an example of a character entity). </li> 
 *  <li> <i>Warning:</i> strictly match directory and filename capitalization for http links! This is important for portability. Some operating systems are forgiving of capitalization mismatches, but http/https and other operating systems are not. </li> 
 *  <li> <i>Hint:</i> can replace embedded blank(s) in url queries with %20 for each blank character. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, urls <br> <a href="http://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#urls" target="_blank">http://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#urls</a> </li> 
 * </ul>
	 * @return value of url field
	 */
	@Override
	public String[] getUrl()
	{
		final String[] valuesArray = new String[url.size()];
		int i = 0;
		for (String arrayElement : url) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFString url field, similar to {@link #getUrl()}.

	 * @return value of url field
	 */
	public ArrayList<String> getUrlList()
	{
		return url;
	}

	/**
	 * Assign String array to inputOutput MFString field named <i>url</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Location and filename of shader. Multiple locations are more reliable, and including a Web address lets e-mail attachments work. Hint: MFString arrays can have multiple values, so separate each individual string by quote marks "http://www.web3d.org" "http://www.web3d.org/about" "etc." Hint: XML encoding for quotation mark " is &amp;quot; (which is an example of a character entity). Warning: strictly match directory and filename capitalization for http links! This is important for portability. Some operating systems are forgiving of capitalization mismatches, but http/https and other operating systems are not. Hint: can replace embedded blank(s) in url queries with %20 for each blank character. Hint: X3D Scene Authoring Hints, urls http://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#urls
	 * @param newValue is new value for the url field.
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same node object).
	 */
	@Override
	public ShaderProgramObject setUrl(String[] newValue)
	{
		if (newValue == null)
		{
			clearUrl(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		url.clear(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			url.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFString url field, similar to {@link #setUrl(String[])}.
	 * @param newValue is new value for the url field.
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same node object).
	 */
	public ShaderProgramObject setUrl(MFStringObject newValue)
	{
		if (newValue == null)
		{
			clearUrl(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		setUrl(newValue.getPrimitiveValue());
		return this;
	}
	/**
	 * Assign single SFString object value to MFString url field, similar to {@link #setUrl(String[])}.
	 * @param newValue is new value for the url field.
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same node object).
	 */
	public ShaderProgramObject setUrl(SFStringObject newValue)
	{
		if (newValue == null)
		{
			clearUrl(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		setUrl(newValue.getValue());
		return this;
	}
	/**
	 * Assign singleton String value to MFString url field, similar to {@link #setUrl(String[])}.
	 * @param newValue is new value for the url field.
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same node object).
	 */
	public ShaderProgramObject setUrl(String newValue)
	{
		if (newValue == null)
		{
			clearUrl(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		url.clear();
		url.add(newValue);
		return this;
	}
	/**
	 * Assign ArrayList value of MFString url field, similar to {@link #setUrl(String[])}.
	 * @param newValue is new value for the url field.
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same node object).
	 */
	public ShaderProgramObject setUrl(ArrayList<String> newValue)
	{
		if (newValue == null)
		{
			clearUrl(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		url = newValue;
		return this;
	}
	/**
	 * Utility method to clear MFString value of url field.
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public ShaderProgramObject clearUrl()
	{
		url.clear(); // reset
		return this;
	}

	/**
	 * Assign String value to inputOutput SFString field named <i>DEF</i>.
	 * <br><br>
	 * <i>Tooltip:</i> DEF defines a unique ID name for this node, referenceable by other nodes. Hint: descriptive DEF names improve clarity and help document a model. Hint: well-defined names can simplify design and debugging through improved author understanding. Hint: X3D Scene Authoring Hints, Naming Conventions http://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions
	 * <br><br>
	 *  Note that setting the DEF value clears the USE value.
	 * @param newValue is new value for the DEF field.
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same node object).
	 */
	@Override
	public final ShaderProgramObject setDEF(String newValue)
	{

		if (newValue == null) 
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to ShaderProgram
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("ShaderProgram DEF newValue='" + newValue + "'" + 
				" has illegal name value, cannot be empty and must be defined with valid NMTOKEN name string" + 
				" (with legal characters and no embedded whitespace).");
		}
		setConcreteUSE(""); // ensure that no previous USE value remains
		setConcreteDEF(newValue); // private superclass methods
		return this;
	}

	/**
	 * Assign typed object value to SFString DEF field, similar to {@link #setDEF(String)}.
	 * @param newValue is new value for the DEF field.
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same node object).
	 */
	public ShaderProgramObject setDEF(SFStringObject newValue)
	{
		setDEF(newValue.getPrimitiveValue());
		return this;
	}

	/**
	 * Assign String value to inputOutput SFString field named <i>USE</i>.
	 * <br><br>
	 * <i>Tooltip:</i> USE means reuse an already DEF-ed node ID, excluding all child nodes and all other attributes (except for containerField, which can have a different value). Hint: USE references to previously defined DEF geometry (instead of duplicating nodes) can improve performance. Warning: do NOT include any child nodes, a DEF attribute, or any other attribute values (except for containerField) when defining a USE attribute. Warning: each USE value must match a corresponding DEF value that is defined earlier in the scene.
	 * <br><br>
	 * <i>Note:</i> each <code>USE</code> node is still an independent object, with the <code>USE</code> value matching the <code>DEF</code> value in the preceding object. 
	 * <br><br>
	 * <i>Warning:</i> invoking the <code>setUSE()</code> method on this node resets all other fields to their default values (except for containerField) and also releases all child nodes.<br><br>
	 * <i>Warning:</i> no other operations can be performed to modify a USE node other than setting an alternate containerField value.
	 * @param newValue is new value for the USE field.
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same node object).
	 */
	@Override
	public final ShaderProgramObject setUSE(String newValue)
	{

		if (newValue == null) 
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to ShaderProgram
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("ShaderProgram USE newValue='" + newValue + "'" + 
				" has illegal name value, cannot be empty and must be defined with valid NMTOKEN name string" + 
				" (with legal characters and no embedded whitespace).");
		}
		initialize(); // reset all other field values to default (equivalent to empty)
		setConcreteUSE(newValue); // private superclass method
		return this;
	}

	/**
	 * Assign typed object value to SFString USE field, similar to {@link #setUSE(String)}.
	 * @param newValue is new value for the USE field.
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same node object).
	 */
	public ShaderProgramObject setUSE(SFStringObject newValue)
	{
		setUSE(newValue.getPrimitiveValue());
		return this;
	}

	/**
	 * Assign String value to inputOutput SFString field named <i>class</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The class attribute is a space-separated list of classes, reserved for use by CSS cascading stylesheets. Warning: currently the class attribute is only supported in XML encoding of X3D scenes. Hint: W3C Cascading Style Sheets https://www.w3.org/Style/CSS
	 * @param newValue is new value for the class field.
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same node object).
	 */
	@Override
	public final ShaderProgramObject setCssClass(String newValue)
	{
		if (newValue == null) 
			newValue = new String(); // Principle of Least Astonishment (POLA)
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		setConcreteCssClass(newValue); // private superclass method
		return this;
	}

	/**
	 * Assign typed object value to SFString cssClass field, similar to {@link #setCssClass(String)}.
	 * @param newValue is new value for the class field.
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same node object).
	 */
	public ShaderProgramObject setCssClass(SFStringObject newValue)
	{
		setCssClass(newValue.getPrimitiveValue());
		return this;
	}

	// Additional utility methods for this class ==============================

	/**
	 * Utility constructor that assigns DEF name after initializing member variables with default values
	 * @param DEFname unique DEF name for this X3D node
	 */
	public ShaderProgramObject (String DEFname)
	{
		initialize();
		setDEF(DEFname); // apply checks
	}

	/**
	 * Assign field named <i>IS</i> for establishing IS/connect field connections between ProtoInterface fields and internal ProtoBody nodes.
	 * The IS statement connects node fields defined inside a ProtoBody declaration back to corresponding ProtoInterface fields.
	 * @param newValue is new value for the description field.
	 * @see <a href="http://www.web3d.org/x3d/tooltips/X3dTooltips.html#IS">X3D Tooltips: IS</a>
	 * @see <a href="http://www.web3d.org/x3d/tooltips/X3dTooltips.html#connect">X3D Tooltips: connect</a>
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same node object).
	 */
	@Override
	public ShaderProgramObject setIS(ISObject newValue)
	{
		if (IS != null)
			IS.setParentObject(null); // housekeeping, clear prior object
		IS = newValue;
		IS.setParentObject(this);
		return this;
	}
	/**
	 * Provide field named <i>IS</i> for establishing IS/connect field connections between ProtoInterface fields and internal ProtoBody nodes.
	 * The IS statement connects node fields defined inside a ProtoBody declaration back to corresponding ProtoInterface fields.
	 * @see <a href="http://www.web3d.org/x3d/tooltips/X3dTooltips.html#IS">X3D Tooltips: IS</a>
	 * @see <a href="http://www.web3d.org/x3d/tooltips/X3dTooltips.html#connect">X3D Tooltips: connect</a>
	 * @return current ISObject, if any.
	 */
	@Override
	public ISObject getIS()
	{
		return IS;
	}
	/**
	 * Assign a USE reference to another DEF node of same node type, similar to {@link #setUSE(String)}.
	 * <br ><br >
	 * <i>Warning:</i> note that the <code>setUSE()</code> method on this node resets all other fields to their default values (except for containerField) and also releases all child nodes.
	 * <br><br>
	 * <i>Warning:</i> no other operations can be performed to modify a USE node other than setting an alternate containerField value.
	 * @param DEFnode must have a DEF value defined
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same node object).
	 */
	public ShaderProgramObject setUSE(ShaderProgramObject DEFnode)
	{
		if (DEFnode.getDEF().isEmpty())
		{
			String errorNotice = "setUSE(DEFnode) invoked on ShaderProgramObject" +
				" that has no DEF name defined, thus a copy cannot be referenced as a USE node";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
		setUSE(DEFnode.getDEF());
		return this;
	}
	/**
	 * Add comment as String to contained commentsList.
	 * @param newComment initial value
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public ShaderProgramObject addComments (String newComment)
	{
		if (isUSE())
		{
			String errorNotice = "addComments(\"" + newComment + "\")" + "\n" +
					"cannot be applied to a USE node (USE='" + getUSE() + "') which only contains a reference to a DEF node";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
								
		commentsList.add(newComment);
		return this;
	}
	/**
	 * Add comments as String[] array to contained commentsList.
	 * @param newComments array of comments
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public ShaderProgramObject addComments (String[] newComments)
	{
		if (isUSE())
		{
			String errorNotice = "addComments(" + Arrays.toString(newComments) + ")" + "\n" +
					"cannot be applied to a USE node (USE='" + getUSE() + "') which only contains a reference to a DEF node";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
								
		commentsList.addAll(Arrays.asList(newComments));
		return this;
	}
	/**
	 * Add CommentsBlock to contained commentsList.
	 * @param newCommentsBlock block of comments to add
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public ShaderProgramObject addComments (CommentsBlock newCommentsBlock)
	{
		if (isUSE())
		{
			String errorNotice = "addComments(CommentsBlock) " +
					"cannot be applied to a USE node (USE='" + getUSE() + "') which only contains a reference to a DEF node";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
								
		commentsList.addAll(newCommentsBlock.toStringList());
		return this;
	}
		
	/**
	 * Recursive method to provide X3D string serialization of this model subgraph.
	 * @param indentLevel number of levels of indentation for this element
	 * @return X3D string
	 */
	@Override
	public String toStringX3D(int indentLevel)
	{
		boolean hasAttributes = true; // TODO check for non-default attribute values
		boolean      hasChild = (IS != null) || (!fieldList.isEmpty()) || (!sourceCode.isEmpty()) || (metadata != null) || (metadataProtoInstance != null) || !commentsList.isEmpty();

		if (isUSE())
			hasChild = false; // USE nodes only include attributes for USE and non-default containerField
		StringBuilder indent = new StringBuilder();
		int  indentIncrement = ConfigurationProperties.getIndentIncrement();
		char indentCharacter = ConfigurationProperties.getIndentCharacter();
		for (int i = 0; i < (indentLevel * indentIncrement); i++)
			indent.append(indentCharacter); // level of indentation for this level

		StringBuilder stringX3D = new StringBuilder();

		stringX3D.append(indent).append("<ShaderProgram"); // start opening tag
		if (hasAttributes)
		{
			if (!getDEF().equals(DEF_DEFAULT_VALUE) && !isUSE())
			{
				stringX3D.append(" DEF='").append(SFStringObject.toString(getDEF())).append("'");
			}
			
			if (!getUSE().equals(USE_DEFAULT_VALUE))
			{
				stringX3D.append(" USE='").append(SFStringObject.toString(getUSE())).append("'");
			}
			
			if (!getContainerFieldOverride().isEmpty() && !getContainerFieldOverride().equals(containerField_DEFAULT_VALUE))
			{
				stringX3D.append(" containerField='").append(getContainerFieldOverride()).append("'");
			}
			
			if ((!getType().equals(TYPE_DEFAULT_VALUE) || ConfigurationProperties.isShowDefaultAttributes()) && !isUSE())
			{
				stringX3D.append(" type='").append(new SFStringObject(getType()).toStringX3D()).append("'");
			}
			if (((getUrl().length > 0) || ConfigurationProperties.isShowDefaultAttributes()) && !isUSE())
			{
				stringX3D.append(" url='").append(new MFStringObject(getUrl()).toStringX3D()).append("'");
			}
			if ((!getCssClass().equals(CLASS_DEFAULT_VALUE) || ConfigurationProperties.isShowDefaultAttributes()) && !isUSE())
			{
				stringX3D.append(" class='").append(new SFStringObject(getCssClass()).toStringX3D()).append("'");
			}
		}
		if ((hasChild) && !isUSE()) // has contained node(s), comment(s), IS/connect and/or source code
		{
			stringX3D.append(">").append("\n"); // finish opening tag

			if (getIS() != null)
				stringX3D.append(getIS().toStringX3D(indentLevel + indentIncrement));

			// recursively iterate over child element
			if (!commentsList.isEmpty())
			{
				CommentsBlock commentsBlock = new CommentsBlock(commentsList);
				stringX3D.append(commentsBlock.toStringX3D(indentLevel + indentIncrement));
			}
			if      (metadata != null)
			{
				stringX3D.append(((X3DConcreteElement)metadata).toStringX3D(indentLevel + indentIncrement));
			}
			else if (metadataProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)metadataProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}

			for (fieldObject element : fieldList)
				 stringX3D.append(element.toStringX3D(indentLevel + indentIncrement));

			if (getIS() != null)
				stringX3D.append(getIS().toStringX3D(indentLevel + indentIncrement)); // IS follows field definitions

			if (sourceCode.trim().length() > 0)
				stringX3D.append("<![CDATA[\n").append(sourceCode)
				         .append("\n]]>\n");

			stringX3D.append(indent).append("</ShaderProgram>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}

	/**
	 * Recursive method to provide ClassicVRML string serialization.
	 * @param indentLevel number of levels of indentation for this element
	 * @see <a href="http://www.web3d.org/x3d/content/examples/X3dResources.html#VRML">X3D Resources: Virtual Reality Modeling Language (VRML) 97</a>
	 * @see <a href="http://www.web3d.org/documents/specifications/19776-2/V3.3/Part02/grammar.html">Extensible 3D (X3D) encodings Part 2: Classic VRML encoding, Annex A: Grammar</a>
	 * @return ClassicVRML string
	 */
	@Override
	public String toStringClassicVRML(int indentLevel)
	{
		StringBuilder stringClassicVRML = new StringBuilder();
		boolean hasAttributes = true; // TODO further refinement
		boolean      hasChild = (IS != null) || (!fieldList.isEmpty()) || (!sourceCode.isEmpty()) || (metadata != null) || (metadataProtoInstance != null) || !commentsList.isEmpty();
		if (isUSE())
		{
			hasAttributes = false;
			hasChild      = false; // USE nodes include no other fields
		}
		StringBuilder  indent = new StringBuilder();
		char  indentCharacter = ConfigurationProperties.getIndentCharacter();
		int   indentIncrement = ConfigurationProperties.getIndentIncrement();
		for (int i = 0; i < (indentLevel * indentIncrement); i++)
			indent.append(indentCharacter); // level of indentation for this level

		if (!getDEF().equals(DEF_DEFAULT_VALUE))
		{
			stringClassicVRML.append("DEF ").append(SFStringObject.toString(getDEF())).append(" ");
		}
		if (!getUSE().equals(USE_DEFAULT_VALUE))
		{
			 stringClassicVRML.append("USE ").append(SFStringObject.toString(getUSE())).append("\n");
		}
		else // only have further output if not a USE node
		{
			stringClassicVRML.append("ShaderProgram").append(" { "); // define node name, node content follows

			if (hasAttributes || hasChild)
			{
				stringClassicVRML.append("\n").append(indent).append(indentCharacter); // fields for this node follow
			}
			if (hasAttributes)
			{

				boolean hasISconnect = (getIS() != null) && !getIS().getConnectList().isEmpty();
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("type"))
						{
							stringClassicVRML.append(indentCharacter).append("type").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!getType().equals(TYPE_DEFAULT_VALUE) || ConfigurationProperties.isShowDefaultAttributes())
				{
					stringClassicVRML.append("type ").append("\"").append(SFStringObject.toString(getType())).append("\"").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("url"))
						{
							stringClassicVRML.append(indentCharacter).append("url").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (getUrl().length > 0)
				{
					stringClassicVRML.append("url ").append("[ ").append(MFStringObject.toString(getUrl())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("class"))
						{
							stringClassicVRML.append(indentCharacter).append("class").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!getCssClass().equals(CLASS_DEFAULT_VALUE) || ConfigurationProperties.isShowDefaultAttributes())
				{
					stringClassicVRML.append("# class ").append("\"").append(SFStringObject.toString(getCssClass())).append("\"").append("\n").append(indent).append(indentCharacter);
				}
			}
		}
		if (hasChild) // has contained node(s), comment(s), IS/connect and/or source code
		{
			// recursively iterate over child element
			if (metadata != null)
			{
				stringClassicVRML.append(indentCharacter).append("metadata").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) metadata).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (metadataProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("metadata").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) metadataProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}

			for (fieldObject element : fieldList)
			{
				 stringClassicVRML.append(element.toStringClassicVRML(indentLevel + indentIncrement));
			}
			if (sourceCode.trim().length() > 0)
			{
				String trimmedSource = sourceCode; // workaround, TODO fix BS Contact bug with leading whitespace
				stringClassicVRML.append(indent).append(indentCharacter).append(indentCharacter)
					.append("url [ \"").append(sourceCode).append("\n").append("\" ]").append("\n");
			}

			if (!commentsList.isEmpty())
			{
				CommentsBlock commentsBlock = new CommentsBlock(commentsList);
				stringClassicVRML.append(commentsBlock.toStringClassicVRML(indentLevel));
				stringClassicVRML.append(indent); // end SFNode
			}
		}
		if (hasAttributes || hasChild)
		{
			stringClassicVRML.append("}").append("\n"); // finish node content
		}
		return stringClassicVRML.toString();
	}

	/**
	 * Recursive method to provide VRML97 string serialization.
	 * @param indentLevel number of levels of indentation for this element
	 * @see <a href="http://www.web3d.org/x3d/content/examples/X3dResources.html#VRML">X3D Resources: Virtual Reality Modeling Language (VRML) 97</a>
	 * @see <a href="http://www.web3d.org/documents/specifications/14772/V2.0/index.html">Virtual Reality Modeling Language (VRML) 97 specification</a>
	 * @see <a href="http://www.web3d.org/documents/specifications/14772-1/V2.1/index.html">VRML 97 v2.1 Amendment</a>
	 * @return VRML97 string
	 */
	@Override
	public String toStringVRML97(int indentLevel)
	{
		return toStringClassicVRML(indentLevel);
	}

	/**
	 * Recursive method to provide object reference to node by DEF name, if found as this node or in a contained node.
	 * @param DEFname DEF name of node to find
	 * @return object reference to node
	 */
	@Override
	public X3DConcreteNode getNodeByDEF(String DEFname)
	{
		X3DConcreteNode referenceNode;

		if (getDEF().equals(DEFname))
			return this;

		if (metadata != null)
		{
			referenceNode = ((X3DConcreteNode) metadata).getNodeByDEF(DEFname); // SFNode
			if (referenceNode != null)
				return referenceNode;
		}
		return null; // not found, in this node or in children nodes
	}

	/**
	 * Recursive method to provide object reference to node or statement by name attribute, if found as part of this element or in a contained element.
	 * Elements with name fields include meta, Metadata* nodes, field/fieldValue, ProtoDeclare/ExternProtoDeclare/ProtoInstance, HAnim nodes.
	 * <br ><br >
	 * <i>Warning:</i> more than one element may be found that has the same name, this method does not handle that case.
	 * @param nameValue is value of the name field being searched for in this element and child elements(if any)
	 * @return object reference to found element, null otherwise
	 * @see #findNodeByDEF(String)
	 */
	@Override
	public X3DConcreteElement findElementByNameValue(String nameValue)
	{
		return findElementByNameValue(nameValue, ""); // empty string is wildcard, any element match is allowed
	}
								
	/**
	 * Recursive method to provide object reference to node or statement by name attribute, if found as part of this element or in a contained element.
	 * Elements with name fields include meta, Metadata* nodes, field/fieldValue, ProtoDeclare/ExternProtoDeclare/ProtoInstance, HAnim nodes.
	 * <br ><br >
	 * <i>Warning:</i> more than one element may be found that has the same name, this method does not handle that case.
	 * @param nameValue is value of the name field being searched for in this element and child elements(if any)
	 * @param elementName identifies the element of interest (meta MetadataString ProtoDeclare CADassembly ProtoInstance HAnimHumanoid etc.)
	 * @return object reference to found element, null otherwise
	 * @see #findNodeByDEF(String)
	 */
	@Override
	public X3DConcreteElement findElementByNameValue(String nameValue, String elementName)
	{
		if ((nameValue == null) || nameValue.isEmpty())
		{
			String errorNotice = "findElementByNameValue(\"\", " + elementName + ") cannot use empty string to find a name attribute";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
		// no name field available for this element
		X3DConcreteElement referenceElement;
		if (metadata != null)
		{
			referenceElement = ((X3DConcreteElement) metadata).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (metadataProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) metadataProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		return null; // not found
	}
	/**
	 * Recursive method to determine whether node or statement with given name attribute is found, meaning both objects are attached to same scene graph.
	 * @param nameValue is value of the name field being searched for in this element and child elements(if any)
	 * @param elementName identifies the element of interest (meta MetadataString ProtoDeclare CADassembly ProtoInstance HAnimHumanoid etc.)
	 * @see #findElementByNameValue(String, String)
	 * @return whether node is found
	 */
	public boolean hasElementByNameValue(String nameValue, String elementName)
	{
		return (findElementByNameValue(nameValue, elementName) != null);
	}

	/**
	 * Recursive method to provide object reference to node by DEF, if found as this node or in a contained node.
	 * <br ><br >
	 * <i>Warning:</i> more than one element may be found that has the same DEF, this method does not handle that case.
	 * @param DEFvalue is value of the name field being searched for in this element and child elements(if any)
	 * @return object reference to found node, null otherwise
	 * @see #findElementByNameValue(String)
	 */
	@Override
	public X3DConcreteNode findNodeByDEF(String DEFvalue)
	{
		if ((DEFvalue == null) || DEFvalue.isEmpty())
		{
			String errorNotice = "findNodeByDEF(\"\") cannot use empty string to find a name";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
		if (getDEF().equals(DEFvalue))
			return this;
		X3DConcreteNode referenceNode;
		if (metadata != null)
		{
			referenceNode = ((X3DConcreteElement) metadata).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		return null; // not found
	}
	/**
	 * Recursive method to determine whether node with DEFvalue is found, meaning both objects are attached to same scene graph.
	 * @param DEFvalue is value of the name field being searched for in this element and child elements(if any)
	 * @see #findNodeByDEF(String)
	 * @return whether node is found
	 */
	public boolean hasNodeByDEF(String DEFvalue)
	{
		return (findNodeByDEF(DEFvalue) != null);
	}

		
	/**
	 * Recursive method to validate this element plus all contained nodes and statements.
	 * @return validation results (if any)
	 */
	@Override
	public String validate()
	{
		validationResult = new StringBuilder(); // prepare for updated results

		setType(getType()); // exercise field checks, simple types

		setUrl(getUrl()); // exercise field checks, simple types

		if (!isUSE()) // be careful! setting DEF via setDEF() method will reset USE value
			setDEF(getDEF()); // exercise field checks, simple types

		if (isUSE()) // be careful! setting USE via setUSE() method resets all attributes to default values and wipes out all children
			setUSE(getUSE()); // exercise field checks, simple types

		setCssClass(getCssClass()); // exercise field checks, simple types

		if (metadata != null)
		{
			setMetadata(getMetadata());
			((X3DConcreteElement) metadata).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) metadata).getValidationResult());
		}
		if (metadataProtoInstance != null)
		{
			setMetadata(getMetadataProtoInstance());
			((X3DConcreteElement) metadataProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) metadataProtoInstance).getValidationResult());
		}
		if ((metadata != null) && (metadataProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both metadata and metadataProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasMetadata()) // test USE restrictions
		{
			String errorNotice = "ShaderProgram USE='" + getUSE() + "' is not allowed to have contained SFNode metadata";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "ShaderProgram USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		for (fieldObject field : fieldList) // check each field
		{
			field.validate(); // exercise field checks to ensure connected and valid
			validationResult.append(field.getValidationResult());
		}

		if (getIS() != null)
		{
			if (getIS().getConnectList().isEmpty())
			{
				String errorNotice = "IS statement present, but contains no connect statements";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidProtoException(errorNotice); // report error
			}				
			// TODO also check that this node has ancestor ProtoBody, and that a field with same name also exists, so that IS is legal
		}
		if (!getContainerFieldOverride().isEmpty() &&
			!Arrays.asList(containerField_ALTERNATE_VALUES).contains(getContainerFieldOverride()))
		{
			String errorNotice = ConfigurationProperties.ERROR_ILLEGAL_VALUE + 
				": illegal value encountered, containerField='" + getContainerFieldOverride() +
				"' but allowed values are containerField_ALTERNATE_VALUES='" + 
				new MFStringObject(containerField_ALTERNATE_VALUES).toStringX3D() + "'.";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldException(errorNotice); // report error
		}

		// profile validation test, if connected to full scene
		if (findAncestorX3DObject() != null)
		{
			String     modelProfile = findAncestorX3DObject().getProfile();
			headObject modelHead    = findAncestorX3DObject().getHead();
			ArrayList<componentObject> sceneComponentsList = new ArrayList<>();
			if (modelHead != null) 
				sceneComponentsList = modelHead.getComponentList();
			boolean hasSatisfactoryComponent = false;
			for (componentObject nextComponent : sceneComponentsList)
			{
				if ( nextComponent.getName().equals("Shaders") &&
					(nextComponent.getLevel() >= 1))
					hasSatisfactoryComponent = true;
			}
			if (!hasSatisfactoryComponent &&
				!modelProfile.equals("Full"))
			{
				String errorNotice = ConfigurationProperties.ERROR_ILLEGAL_VALUE + 
					" invalid X3D profile='" + getContainerFieldOverride() +
					"' for parent X3D model, add element <componentInfo name='Shaders' level='1'/>\n" +
					"or source-code assignment: " +
					" findAncestorX3DObject().getHead().addComponentInfo(\"Shaders\").setLevel(1);";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldException(errorNotice); // report error
			}
		}
		return validationResult.toString();
	}

	/**
	 * Add field to fieldList for this ShaderProgramObject
	 * @param newField is field to add
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public ShaderProgramObject addField (fieldObject newField)
	{
		String errorNotice = new String();
		for (fieldObject priorField : fieldList) // check for field with duplicate name
		{
			if (priorField.getName().equals(newField.getName()))
			{
				errorNotice = "Illegal addField() invocation for ShaderProgramObject DEF='" + getDEF() + "', provided duplicate newField name='" + newField.getName() + "'";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldException(errorNotice);
			}
		}
		String fieldValidationResult = newField.validate();
		if (!fieldValidationResult.trim().isEmpty())
		{
			errorNotice = "Illegal addField() invocation for ShaderProgramObject DEF='" + getDEF() + "', newField.validation() failure: " + fieldValidationResult;
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldException(errorNotice);
		}
		fieldList.add(newField);
		newField.setParentObject(this);
		return this;
	}
	/**
	 * Remove a field from contained fieldList
	 * @param fieldToRemove matching field of interest
	 * @see #removeField(String)
	 * @return whether field was removed
	 */
	public boolean removeField (fieldObject fieldToRemove)
	{
		int  fieldIndex = fieldList.indexOf(fieldToRemove);
		if  (fieldIndex >= 0)
		{
			 fieldObject removedField = fieldList.remove(fieldIndex);
			 return (removedField != null);
		}
		else return false;
	}
	/**
	 * Remove a field by name from contained fieldList
	 * @param fieldName matching field of interest
	 * @see #removeField(fieldObject)
	 * @return whether field was removed
	 */
	public boolean removeField (String fieldName)
	{
		fieldObject fieldToRemove = findFieldByName (fieldName);
		if (fieldToRemove != null)
			return removeField (fieldToRemove);
		else return false;
	}

	/**
	 * Clear all fields
	 */
	public void clearFields ()
	{
		fieldList.clear();
	}

	/**
	 * Determine whether field(s) are available
	 * @return whether field(s) are found
	 */
	public boolean hasField ()
	{
		return !fieldList.isEmpty();
	}

	/**
	 * Provide list of fields.
	 * @return value of field list
	 */
	public ArrayList<fieldObject> getFieldList()
	{
		return fieldList;
	}
		
	/**
	 * Find contained field statement by name, if present.
	 * @param fieldName is name attribute for field of interest
	 * @return fieldObject reference of interest, null otherwise
	 */
	public fieldObject findFieldByName (String fieldName)
	{
		for (fieldObject element : fieldList)
		{
			 if (element.getName().equalsIgnoreCase(fieldName))
				 return element;
		}
		return null;
	}
	/**
	 * Determine if field statement is present.
	 * @param fieldName is name attribute for field of interest
	 * @return whether field is found
	 */
	public boolean hasField (String fieldName)
	{
		return (findFieldByName(fieldName) != null);
	}


	/**
	 * Set new source code (for example, JavaScript)
	 * @param newSourceText is source code to set
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public ShaderProgramObject setSourceCode (String[] newSourceText)
	{
		return setSourceCode (Arrays.toString(newSourceText));
	}

	/**
	 * Set new source code (for example, JavaScript)
	 * @see <a href="http://www.web3d.org/x3d/content/X3dTooltips.html#CDATA" target="_blank">X3D Scene Authoring Hints: CDATA Character Data</a>
	 * @param newSourceText is source code to set
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public ShaderProgramObject setSourceCode (String newSourceText)
	{
		String errorNotice = new String();
		if (newSourceText == null)
		{
			errorNotice = "Illegal setSourceCode() invocation, String newSourceText is null. ";
			validationResult.append(errorNotice).append("\n");
		}
		else if (newSourceText.trim().isEmpty())
		{
			errorNotice = "Illegal setSourceCode() invocation, String newSourceText is empty. ";
			validationResult.append(errorNotice).append("\n");
		}
		else if (newSourceText.trim().startsWith("<![CDATA[") || newSourceText.endsWith("]" + "]>"))
		{
			errorNotice = "Illegal setSourceCode() invocation, String newSourceText is wrapped in <![CDATA[ ...(source)...  block which can be omitted";
			validationResult.append(errorNotice).append("\n");
		}
		if (!newSourceText.trim().startsWith("") && !newSourceText.trim().startsWith("ecmascript:"))
		{
			errorNotice = "Illegal setSourceCode() invocation, String newSourceText must start with \"ecmascript:\"";
			validationResult.append(errorNotice).append("\n");
		}
		if (!errorNotice.isEmpty())
			throw new InvalidFieldValueException(errorNotice);

		sourceCode = newSourceText;
		return this;
	}

	/**
	 * Set new source code (for example, JavaScript)
	 * @param newSourceText is source to set
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public ShaderProgramObject setSourceCode (StringBuilder newSourceText)
	{
		if (newSourceText == null)
		{
			String errorNotice = "Illegal setSourceCode() invocation, StringBuilder newSourceText is null";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice);
		}
		else if (!newSourceText.toString().trim().startsWith("ecmascript:") && (newSourceText.toString().trim().length() > 0))
		{
			String errorNotice = "Illegal setSourceCode() invocation, StringBuilder newSourceText must start with \"ecmascript:\"";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice);
		}
		setSourceCode(newSourceText.toString()); // apply further diagnostics
		return this;
	}

	/**
	 * Append source code (for example, JavaScript)
	 * @param newSourceText is source to append
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public ShaderProgramObject appendSourceCode (String newSourceText)
	{
		sourceCode += newSourceText;
		return this;
	}

	/**
	 * Append source code (for example, JavaScript)
	 * @param newSourceText is source to append
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public ShaderProgramObject appendSourceCode (StringBuilder newSourceText)
	{
		if (newSourceText == null)
		{
			String errorNotice = "Illegal appendSourceCode() invocation, StringBuilder newSourceText is null";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice);
		}
		else sourceCode += newSourceText.toString();
		return this;
	}

	/**
	 * Clear all contained CDATA source code.
	 * @return {@link ShaderProgramObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public ShaderProgramObject clearSource ()
	{
		sourceCode = SOURCECODE_DEFAULT_VALUE;
		return this;
	}
}
