load('nashorn/node/X3Dautoclass.js');
var ConfigurationProperties = Packages.org.web3d.x3d.jsail.ConfigurationProperties;
ConfigurationProperties.showDefaultAttributes = false;
ConfigurationProperties.xsltEngine = ConfigurationProperties.XSLT_ENGINE_NATIVE_JAVA;
ConfigurationProperties.deleteIntermediateFiles = false;
ConfigurationProperties.setStripTrailingZeroes(true);
var ProtoInstance0 = null;
var ProtoInstance1 = null;
var ProtoInstance2 = null;
var ProtoInstance3 = null;
      var X3D0 =  new X3DObject().setProfile("Immersive").setVersion("3.3")
      .setHead(new headObject()
        .addComments(new CommentsBlock("comment #1"))
        .addComments(new CommentsBlock("comment #2"))
        .addComments(new CommentsBlock("comment #3"))
        .addComments(new CommentsBlock("comment #4"))
        .addComponent(new componentObject().setName("Navigation").setLevel(3))
        .addComponent(new componentObject().setName("Layering").setLevel(1))
        .addUnit(new unitObject().setName("AngleUnitConversion").setCategory("angle").setConversionFactor(1))
        .addUnit(new unitObject().setName("LengthUnitConversion").setCategory("length").setConversionFactor(1))
        .addMeta(new metaObject().setName("title").setContent("HelloWorldProgramOutput.x3d"))
        .addMeta(new metaObject().setName("description").setContent("Example HelloWorldProgram creates an X3D model using the X3D Java Scene Access Interface (SAI) Library"))
        .addMeta(new metaObject().setName("reference").setContent("http://www.web3d.org/specifications/java/X3DJSAIL.html"))
        .addMeta(new metaObject().setName("generator").setContent("HelloWorldProgramOutput.java"))
        .addMeta(new metaObject().setName("created").setContent("6 September 2016"))
        .addMeta(new metaObject().setName("modified").setContent("18 December 2017"))
        .addMeta(new metaObject().setName("generator").setContent("X3D Java Scene Access Interface Library (X3DJSAIL)"))
        .addMeta(new metaObject().setName("generator").setContent("http://www.web3d.org/specifications/java/examples/HelloWorldProgram.java"))
        .addMeta(new metaObject().setName("generator").setContent("Netbeans http://www.netbeans.org"))
        .addMeta(new metaObject().setName("creator").setContent("Don Brutzman"))
        .addMeta(new metaObject().setName("reference").setContent("https://sourceforge.net/p/x3d/code/HEAD/tree/www.web3d.org/x3d/stylesheets/java/examples/HelloWorldProgramOutput.x3d"))
        .addMeta(new metaObject().setName("reference").setContent("Console output, ClassicVRML encoding, VRML97 encoding and pretty-print documentation:"))
        .addMeta(new metaObject().setName("reference").setContent("HelloWorldProgramOutput.txt"))
        .addMeta(new metaObject().setName("reference").setContent("HelloWorldProgramOutput.x3dv"))
        .addMeta(new metaObject().setName("reference").setContent("HelloWorldProgramOutput.wrl"))
        .addMeta(new metaObject().setName("reference").setContent("HelloWorldProgramOutput.html"))
        .addMeta(new metaObject().setName("X3dValidator").setContent("https://savage.nps.edu/X3dValidator?url=http://www.web3d.org/specifications/java/examples/HelloWorldProgramOutput.x3d"))
        .addMeta(new metaObject().setName("identifier").setContent("http://www.web3d.org/specifications/java/examples/HelloWorldProgramOutput.x3d"))
        .addMeta(new metaObject().setName("license").setContent("../license.html"))
        .addMeta(new metaObject().setName("SpecialTest").setContent("tested sat: name value cannot contain embedded space character")))
      .setScene(new SceneObject()
        .addChild(new ViewpointGroupObject().setDescription("Available viewpoints")
          .addChild(new ViewpointObject().setDEF("DefaultView").setDescription("Hello X3DJSAIL"))
          .addChild(new ViewpointObject().setDEF("TopDownView").setDescription("top-down view from above").setOrientation(Java.to([1,0,0,-1.570796], Java.type("float[]"))).setPosition(Java.to([0,100,0], Java.type("float[]")))))
        .addChild(new WorldInfoObject().setDEF("WorldInfoDEF").setTitle("HelloWorldProgram produced by X3D Java SAI Library (X3DJSAIL)"))
        .addChild(new WorldInfoObject().setUSE("WorldInfoDEF"))
        .addChild(new WorldInfoObject().setUSE("WorldInfoDEF"))
        .addChild(new LayerSetObject().setDEF("scene.addChildLayerSetObjectTest"))
        .addChild(new TransformObject().setDEF("LogoGeometryTransform").setTranslation(Java.to([0,1.5,0], Java.type("float[]")))
          .addChild(new AnchorObject().setDescription("select for X3D Java SAI Library (X3DJSAIL) description").setUrl(Java.to(["/X3DJSAIL.html","http://www.web3d.org/specifications/java/X3DJSAIL.html"], Java.type("java.lang.String[]")))
            .addChild(new ShapeObject().setDEF("BoxShape")
              .setAppearance(new AppearanceObject()
                .setMaterial(new MaterialObject().setDEF("GreenMaterial").setDiffuseColor(Java.to([0,1,1], Java.type("float[]"))).setEmissiveColor(Java.to([0.8,0,0], Java.type("float[]"))).setTransparency(0.1))
                .setTexture(new ImageTextureObject().setUrl(Java.to(["flipper.json/images/X3dJavaSceneAccessInterfaceSaiLibrary.png","http://www.web3d.org/specifications/java/examples/images/X3dJavaSceneAccessInterfaceSaiLibrary.png"], Java.type("java.lang.String[]")))))
              .setGeometry(new BoxObject().setDEF("test-NMTOKEN_regex.0123456789").setCssClass("textured")))))
        .addChild(new ShapeObject().setDEF("LineShape")
          .setAppearance(new AppearanceObject()
            .setMaterial(new MaterialObject().setEmissiveColor(Java.to([0.6,0.19607843,0.8], Java.type("float[]")))))
          .setGeometry(new IndexedLineSetObject().setCoordIndex(Java.to([0,1,2,3,4,0], Java.type("int[]")))
            .setCoord(new CoordinateObject().setPoint(Java.to([0,1.5,0,2,1.5,0,2,1.5,-2,-2,1.5,-2,-2,1.5,0,0,1.5,0], Java.type("float[]"))))))
        .addChild(new PositionInterpolatorObject().setDEF("BoxPathAnimator").setKey(Java.to([0,0.125,0.375,0.625,0.875,1], Java.type("float[]"))).setKeyValue(Java.to([0,1.5,0,2,1.5,0,2,1.5,-2,-2,1.5,-2,-2,1.5,0,0,1.5,0], Java.type("float[]"))))
        .addChild(new TimeSensorObject().setDEF("OrbitClock").setCycleInterval(8).setLoop(true))
        .addChild(new ROUTEObject().setFromField("fraction_changed").setFromNode("OrbitClock").setToField("set_fraction").setToNode("BoxPathAnimator"))
        .addChild(new ROUTEObject().setFromField("value_changed").setFromNode("BoxPathAnimator").setToField("set_translation").setToNode("LogoGeometryTransform"))
        .addChild(new TransformObject().setDEF("TextTransform").setTranslation(Java.to([0,-1.5,0], Java.type("float[]")))
          .addChild(new ShapeObject()
            .setAppearance(new AppearanceObject()
              .setMaterial(new MaterialObject().setUSE("GreenMaterial")))
            .setGeometry(new TextObject().setString(Java.to(["X3D Java","SAI Library","X3DJSAIL"], Java.type("java.lang.String[]")))
              .addComments(new CommentsBlock("escaped quotation marks example 3: He said, \"Immel did it!\""))
              .addComments(new CommentsBlock("escaped quotation marks example 4: He said, &quot;Immel did it!&quot;"))
              .setMetadata(new MetadataSetObject().setName("EscapedQuotationMarksMetadataSet")
                .addValue(new MetadataStringObject().setName("escapedQuotesTest1").setValue(Java.to(["escaped quotation marks example 1: He said, \"Immel did it!\""], Java.type("java.lang.String[]"))))
                .addValue(new MetadataStringObject().setName("escapedQuotesTest2").setValue(Java.to(["escaped quotation marks example 2: He said, &quot;Immel did it!&quot;"], Java.type("java.lang.String[]")))))
              .setFontStyle(new FontStyleObject().setJustify(Java.to(["MIDDLE","MIDDLE"], Java.type("java.lang.String[]"))))))
          .addChild(new CollisionObject()
            .addComments(new CommentsBlock("test containerField='proxy'"))
            .setProxy(new ShapeObject().setDEF("ProxyShape")
              .addComments(new CommentsBlock("alternative XML encoding: Text string='\"One, Two, Three\" \"\" \"He said, \\&quot;Immel did it!\\&quot;\"'"))
              .addComments(new CommentsBlock("alternative Java source: .setString(new String [] {\"One, Two, Three\", \"\", \"He said, \\\"Immel did it!\\\"\"})"))
              .addComments(new CommentsBlock("reference: http://www.web3d.org/x3d/content/examples/Basic/X3dSpecifications/StringArrayEncodingExamplesIndex.html"))
              .setGeometry(new TextObject().setString(Java.to(["One, Two, Three","","He said, \"Immel did it!\""], Java.type("java.lang.String[]"))))))
          .addComments(new CommentsBlock("It's a beautiful world"))
          .addComments(new CommentsBlock("... for you!"))
          .addComments(new CommentsBlock("https://en.wikipedia.org/wiki/Beautiful_World_(Devo_song)")))
        .addComments(new CommentsBlock("repeatedly spin 180 degrees as a readable special effect"))
        .addChild(new OrientationInterpolatorObject().setDEF("SpinInterpolator").setKey(Java.to([0,0.5,1], Java.type("float[]"))).setKeyValue(Java.to([0,1,0,4.712389,0,1,0,0,0,1,0,1.5707964], Java.type("float[]"))))
        .addChild(new TimeSensorObject().setDEF("SpinClock").setCycleInterval(5).setLoop(true))
        .addChild(new ROUTEObject().setFromField("fraction_changed").setFromNode("SpinClock").setToField("set_fraction").setToNode("SpinInterpolator"))
        .addChild(new ROUTEObject().setFromField("value_changed").setFromNode("SpinInterpolator").setToField("rotation").setToNode("TextTransform"))
        .addChild(new GroupObject().setDEF("BackgroundGroup")
          .addChild(new BackgroundObject().setDEF("GradualBackground"))
          .addChild(new ScriptObject().setDEF("colorTypeConversionScript")
            .addField(new fieldObject().setType(fieldObject.TYPE_SFCOLOR).setName("colorInput").setAccessType(fieldObject.ACCESSTYPE_INPUTONLY))
            .addField(new fieldObject().setType(fieldObject.TYPE_MFCOLOR).setName("colorsOutput").setAccessType(fieldObject.ACCESSTYPE_OUTPUTONLY))
            .setSourceCode("ecmascript:\n"+
"\n"+
"function colorInput (eventValue) // Example source code\n"+
"{\n"+
"   colorsOutput = new MFColor(eventValue); // assigning value sends output event\n"+
"// Browser.print('colorInput=' + eventValue + ', colorsOutput=' + colorsOutput + '\\n');\n"+
"}\n"+
""))
          .addChild(new ColorInterpolatorObject().setDEF("ColorAnimator").setKey(Java.to([0,0.5,1], Java.type("float[]"))).setKeyValue(Java.to([0.9411765,1,1,0.29411766,0,0.50980395,0.9411765,1,1], Java.type("float[]")))
            .addComments(new CommentsBlock("AZURE to INDIGO and back again")))
          .addChild(new TimeSensorObject().setDEF("ColorClock").setCycleInterval(60).setLoop(true))
          .addChild(new ROUTEObject().setFromField("colorsOutput").setFromNode("colorTypeConversionScript").setToField("skyColor").setToNode("GradualBackground"))
          .addChild(new ROUTEObject().setFromField("value_changed").setFromNode("ColorAnimator").setToField("colorInput").setToNode("colorTypeConversionScript"))
          .addChild(new ROUTEObject().setFromField("fraction_changed").setFromNode("ColorClock").setToField("set_fraction").setToNode("ColorAnimator")))
        .addChild(new ProtoDeclareObject().setName("ArtDeco01Material").setAppinfo("tooltip: ArtDeco01Material prototype is a Material node")
          .setProtoInterface(new ProtoInterfaceObject()
            .addField(new fieldObject().setType(fieldObject.TYPE_SFSTRING).setName("description").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setAppinfo("tooltip for descriptionField").setValue("ArtDeco01Material prototype is a Material node"))
            .addField(new fieldObject().setType(fieldObject.TYPE_SFBOOL).setName("enabled").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("true")))
          .setProtoBody(new ProtoBodyObject()
            .addComments(new CommentsBlock("Initial node of ProtoBody determines prototype node type"))
            .addChild(new MaterialObject().setAmbientIntensity(0.25).setDiffuseColor(Java.to([0.282435,0.085159,0.134462], Java.type("float[]"))).setShininess(0.127273).setSpecularColor(Java.to([0.276305,0.11431,0.139857], Java.type("float[]"))))
            .addComments(new CommentsBlock("[HelloWorldProgram diagnostic] should be connected to scene graph: ArtDeco01ProtoDeclare.getNodeType()=\"Material\""))
            .addComments(new CommentsBlock("presence of follow-on TouchSensor shows that additional nodes are allowed in ProtoBody after initial node, regardless of node types"))
            .addChild(new TouchSensorObject().setDescription("within ProtoBody")
              .setIS(new ISObject()
                .addConnect(new connectObject().setNodeField("description").setProtoField("description"))
                .addConnect(new connectObject().setNodeField("enabled").setProtoField("enabled"))))))
        .addChild(new ExternProtoDeclareObject().setName("ArtDeco02Material").setAppinfo("this is a different Material node").setUrl(Java.to(["http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoPrototypesExcerpt.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoPrototypesExcerpt.x3dv"], Java.type("java.lang.String[]")))
          .addComments(new CommentsBlock("[HelloWorldProgram diagnostic] ArtDeco02ExternProtoDeclare.getNodeType()=\"ERROR_UNKNOWN_EXTERNPROTODECLARE_NODE_TYPE: ExternProtoDeclare name='ArtDeco02Material' type cannot be remotely accessed at run time, TODO X3DJSAIL needs to add further capability.\""))
          .addField(new fieldObject().setType(fieldObject.TYPE_SFSTRING).setName("description").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setAppinfo("tooltip for descriptionField")))
        .addComments(new CommentsBlock("Tested ArtDeco01ProtoInstance, ArtDeco02ProtoInstance for improper node type when ProtoInstance is added in wrong place"))
        .addChild(new ShapeObject().setDEF("TestShape1")
          .setAppearance(new AppearanceObject().setDEF("TestAppearance1")
            .addComments(new CommentsBlock("ArtDeco01Material prototype goes here..."))
            .addProtoInstance(ProtoInstance0 = new ProtoInstanceObject().setName("ArtDeco01Material")
              .addComments(new CommentsBlock("[HelloWorldProgram diagnostic] ArtDeco01ProtoInstance.getNodeType()=\"Material\""))))
          .setGeometry(new SphereObject().setRadius(0.001)))
        .addChild(new ShapeObject().setDEF("TestShape2")
          .setAppearance(new AppearanceObject().setDEF("TestAppearance2")
            .addComments(new CommentsBlock("ArtDeco02Material prototype goes here..."))
            .addProtoInstance(ProtoInstance1 = new ProtoInstanceObject().setName("ArtDeco02Material").setDEF("ArtDeco02MaterialDEF")
              .addComments(new CommentsBlock("[HelloWorldProgram diagnostic] ArtDeco02ProtoInstance.getNodeType()=\"ERROR_UNKNOWN_EXTERNPROTODECLARE_NODE_TYPE: ExternProtoDeclare name='ArtDeco02Material' type cannot be remotely accessed at run time, TODO X3DJSAIL needs to add further capability.\""))))
          .setGeometry(new ConeObject().setBottomRadius(0.001).setHeight(0.001)))
        .addChild(new ShapeObject().setDEF("TestShape3")
          .setAppearance(new AppearanceObject().setDEF("TestAppearance3")
            .addComments(new CommentsBlock("ArtDeco02Material ProtoInstance USE goes here..."))
            .addProtoInstance(ProtoInstance2 = new ProtoInstanceObject().setUSE("ArtDeco02MaterialDEF")))
          .setGeometry(new CylinderObject().setHeight(0.001).setRadius(0.001)))
        .addChild(new InlineObject().setDEF("inlineSceneDef").setUrl(Java.to(["flipper.json/someOtherScene.x3d"], Java.type("java.lang.String[]"))))
        .addChild(new IMPORTObject().setAS("WorldInfoDEF2").setImportedDEF("WorldInfoDEF").setInlineDEF("inlineSceneDef"))
        .addChild(new EXPORTObject().setAS("WorldInfoDEF3").setLocalDEF("WorldInfoDEF"))
        .addChild(new ProtoDeclareObject().setName("MaterialModulator").setAppinfo("mimic a Material node and modulate fields as an animation effect").setDocumentation("http://x3dgraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/MaterialModulatorIndex.html")
          .setProtoInterface(new ProtoInterfaceObject()
            .addField(new fieldObject().setType(fieldObject.TYPE_SFBOOL).setName("enabled").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("true"))
            .addField(new fieldObject().setType(fieldObject.TYPE_SFCOLOR).setName("diffuseColor").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0 0 0"))
            .addField(new fieldObject().setType(fieldObject.TYPE_SFCOLOR).setName("emissiveColor").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0.05 0.05 0.5"))
            .addField(new fieldObject().setType(fieldObject.TYPE_SFCOLOR).setName("specularColor").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0 0 0"))
            .addField(new fieldObject().setType(fieldObject.TYPE_SFFLOAT).setName("transparency").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0"))
            .addField(new fieldObject().setType(fieldObject.TYPE_SFFLOAT).setName("shininess").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0"))
            .addField(new fieldObject().setType(fieldObject.TYPE_SFFLOAT).setName("ambientIntensity").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0")))
          .setProtoBody(new ProtoBodyObject()
            .addChild(new MaterialObject().setDEF("MaterialNode")
              .setIS(new ISObject()
                .addConnect(new connectObject().setNodeField("diffuseColor").setProtoField("diffuseColor"))
                .addConnect(new connectObject().setNodeField("emissiveColor").setProtoField("emissiveColor"))
                .addConnect(new connectObject().setNodeField("specularColor").setProtoField("specularColor"))
                .addConnect(new connectObject().setNodeField("transparency").setProtoField("transparency"))
                .addConnect(new connectObject().setNodeField("shininess").setProtoField("shininess"))
                .addConnect(new connectObject().setNodeField("ambientIntensity").setProtoField("ambientIntensity"))))
            .addComments(new CommentsBlock("Only first node (the node type) is renderable, others are along for the ride"))
            .addChild(new ScriptObject().setDEF("MaterialModulatorScript")
              .addField(new fieldObject().setType(fieldObject.TYPE_SFBOOL).setName("enabled").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT))
              .addField(new fieldObject().setType(fieldObject.TYPE_SFCOLOR).setName("diffuseColor").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT))
              .addField(new fieldObject().setType(fieldObject.TYPE_SFCOLOR).setName("newColor").setAccessType(fieldObject.ACCESSTYPE_OUTPUTONLY))
              .addField(new fieldObject().setType(fieldObject.TYPE_SFTIME).setName("clockTrigger").setAccessType(fieldObject.ACCESSTYPE_INPUTONLY))
              .setIS(new ISObject()
                .addConnect(new connectObject().setNodeField("enabled").setProtoField("enabled"))
                .addConnect(new connectObject().setNodeField("diffuseColor").setProtoField("diffuseColor")))
              .setSourceCode("ecmascript:\n"+
"function initialize ()\n"+
"{\n"+
"    newColor = diffuseColor; // start with correct color\n"+
"}\n"+
"function set_enabled (newValue)\n"+
"{\n"+
"	enabled = newValue;\n"+
"}\n"+
"function clockTrigger (timeValue)\n"+
"{\n"+
"    if (!enabled) return;\n"+
"    red   = newColor.r;\n"+
"    green = newColor.g;\n"+
"    blue  = newColor.b;\n"+
"    \n"+
"    // note different modulation rates for each color component, % is modulus operator\n"+
"    newColor = new SFColor ((red + 0.02) % 1, (green + 0.03) % 1, (blue + 0.04) % 1);\n"+
"	if (enabled)\n"+
"	{\n"+
"		Browser.print ('diffuseColor=(' + red + ',' + green + ',' + blue + ') newColor=' + newColor.toString() + '\\n');\n"+
"	}\n"+
"}\n"+
""))))
        .addComments(new CommentsBlock("Test success: declarative statement createDeclarativeShapeTests()"))
        .addChild(new GroupObject().setDEF("DeclarativeGroupExample")
          .addChild(new ShapeObject()
            .setMetadata(new MetadataStringObject().setName("findThisNameValue").setDEF("FindableMetadataStringTest").setValue(Java.to(["test case"], Java.type("java.lang.String[]"))))
            .setAppearance(new AppearanceObject().setDEF("DeclarativeAppearanceExample")
              .addComments(new CommentsBlock("DeclarativeMaterialExample gets overridden by subsequently added MaterialModulator ProtoInstance"))
              .addProtoInstance(ProtoInstance3 = new ProtoInstanceObject().setName("MaterialModulator").setDEF("MyMaterialModulator")))
            .setGeometry(new ConeObject().setBottom(false).setBottomRadius(0.05).setHeight(0.1)))
          .addComments(new CommentsBlock("Test success: declarativeGroup.addChild() singleton pipeline method")))
        .addComments(new CommentsBlock("Test success: declarative statement addChild()"))
        .addComments(new CommentsBlock("Test success: x3dModel.findNodeByDEF(DeclarativeAppearanceExample) = <Appearance DEF='DeclarativeAppearanceExample'/> i.e."))
        .addComments(new CommentsBlock("<Appearance DEF='DeclarativeAppearanceExample'>"))
        .addComments(new CommentsBlock("<!- - DeclarativeMaterialExample gets overridden by subsequently added MaterialModulator ProtoInstance - ->"))
        .addComments(new CommentsBlock("<ProtoInstance DEF='MyMaterialModulator' name='MaterialModulator' containerField='material'/>"))
        .addComments(new CommentsBlock("</Appearance>"))
        .addComments(new CommentsBlock("Test success: x3dModel.findElementByNameValue(findThisNameValue) = <MetadataString DEF='FindableMetadataStringTest' name='findThisNameValue' value='\"test case\"'/>"))
        .addComments(new CommentsBlock("Test success: x3dModel.findElementByNameValue(\"ArtDeco01Material\", \"ProtoDeclare\") found"))
        .addComments(new CommentsBlock("Test success: x3dModel.findElementByNameValue(\"MaterialModulator\", \"ProtoDeclare\") found"))
        .addComments(new CommentsBlock("Test success: x3dModel.findElementByNameValue(\"MaterialModulator\", \"ProtoInstance\") found"))
        .addChild(new GroupObject().setDEF("TestFieldObjectsGroup")
          .addComments(new CommentsBlock("testFieldObjects() results"))
          .addComments(new CommentsBlock("SFBool default=true, true=true, false=false, negate()=true"))
          .addComments(new CommentsBlock("MFBool default=, initial=true false true, negate()=false true false"))
          .addComments(new CommentsBlock("SFFloat default=0.0, initial=1.0, setValue(2)=2.0, setValue(3.0f)=3.0, setValue(4.0)=4.0"))
          .addComments(new CommentsBlock("MFFloat default=, initial=1 2 3, append(5)=1 2 3 5, inserts(3,4)(0,0)=0 1 2 3 4 5, append(6)=0 1 2 3 4 5 6, size()=7"))
          .addComments(new CommentsBlock("... get1Value[3]=3.0, remove[1]=0 2 3 4 5 6, set1Value(0,10)=10 2 3 4 5 6, multiply(2)=20 4 6 8 10 12, clear="))
          .addComments(new CommentsBlock("SFVec3f default=0 0 0, initial=1 2 3, setValue=4 5 6, multiply(2)=8 10 12, normalize()=0.45584232 0.5698029 0.68376344")))
        .addChild(new SoundObject().setLocation(Java.to([0,1.6,0], Java.type("float[]")))
          .addComments(new CommentsBlock("set sound-ellipsoid location height at 1.6m to match typical avatar height"))
          .setSource(new AudioClipObject().setDescription("chimes").setUrl(Java.to(["flipper.json/chimes.wav","http://www.web3d.org/x3d/content/examples/ConformanceNist/Sounds/AudioClip/chimes.wav"], Java.type("java.lang.String[]")))
            .addComments(new CommentsBlock("Scene example fragment from http://www.web3d.org/x3d/content/examples/ConformanceNist/Sounds/AudioClip/default.x3d"))))
        .addChild(new SoundObject().setLocation(Java.to([0,1.6,0], Java.type("float[]")))
          .addComments(new CommentsBlock("set sound-ellipsoid location height at 1.6m to match typical avatar height"))
          .setSource(new MovieTextureObject().setDescription("mpgsys.mpg from ConformanceNist suite").setUrl(Java.to(["flipper.json/mpgsys.mpg","http://www.web3d.org/x3d/content/examples/ConformanceNist/Appearance/MovieTexture/mpgsys.mpg"], Java.type("java.lang.String[]")))
            .addComments(new CommentsBlock("Scene example fragment from http://www.web3d.org/x3d/content/examples/ConformanceNist/Appearance/MovieTexture/mpeg1-systems.x3d"))
            .addComments(new CommentsBlock("Expected containerField='source', allowed containerField values=\"texture\" \"source\" \"back\" \"bottom\" \"front\" \"left\" \"right\" \"top\" \"backTexture\" \"bottomTexture\" \"frontTexture\" \"leftTexture\" \"rightTexture\" \"topTexture\""))))
        .addComments(new CommentsBlock("Test success: AnchorObject.isNode()=true, siteAnchor.isNode()=true"))
        .addComments(new CommentsBlock("Test success: AnchorObject.isStatement()=false, siteAnchor.isStatement()=false"))
        .addComments(new CommentsBlock("Test success: ROUTEObject.isNode()=false, orbitPositionROUTE.isNode()=false"))
        .addComments(new CommentsBlock("Test success: ROUTEObject.isStatement()=true, orbitPositionROUTE.isStatement()=true"))
        .addComments(new CommentsBlock("Test success: CommentsBlock.isNode()=false, testComments.isNode()=false"))
        .addComments(new CommentsBlock("Test success: CommentsBlock.isStatement()=false, testComments.isStatement()=false"))
        .addChild(new ShapeObject().setDEF("ExtrusionShape")
          .addComments(new CommentsBlock("ExampleExtrusion isCrossSectionClosed()=true, crossSection='[1.0, 1.0, 1.0, -1.0, -1.0, -1.0, -1.0, 1.0, 1.0, 1.0]'"))
          .addComments(new CommentsBlock("ExampleExtrusion isSpineClosed()=false, spine='[0.0, 0.0, 0.0, 0.0, 1.0, 0.0]'"))
          .setAppearance(new AppearanceObject().setDEF("TransparentAppearance")
            .setMaterial(new MaterialObject().setTransparency(1)))
          .setGeometry(new ExtrusionObject().setDEF("ExampleExtrusion"))))      ;
ProtoInstance0
              .addFieldValue(new fieldValueObject().setName("description").setValue("ArtDeco01Material can substitute for a Material node"));
ProtoInstance1
              .addFieldValue(new fieldValueObject().setName("description").setValue("ArtDeco02Material can substitute for another Material node"));
    X3D0.toFileX3D("nashorn/examples/HelloWorldProgramOutput.js.new.x3d");
