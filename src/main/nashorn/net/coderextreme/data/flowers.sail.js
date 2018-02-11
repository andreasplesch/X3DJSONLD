load('X3Dautoclass.js');
var ConfigurationProperties = Packages.org.web3d.x3d.jsail.ConfigurationProperties;
ConfigurationProperties.showDefaultAttributes = false;
ConfigurationProperties.xsltEngine = ConfigurationProperties.XSLT_ENGINE_NATIVE_JAVA;
ConfigurationProperties.deleteIntermediateFiles = false;
ConfigurationProperties.setStripTrailingZeroes(true);
var ProtoInstance0 = null;
      var X3D0 =  new X3DObject().setProfile("Immersive").setVersion("3.3")
      .setHead(new headObject()
        .addComponent(new componentObject().setName("Shaders").setLevel(1))
        .addComponent(new componentObject().setName("CubeMapTexturing").setLevel(1))
        .addMeta(new metaObject().setName("title").setContent("flowers.x3d"))
        .addMeta(new metaObject().setName("creator").setContent("John Carlson"))
        .addMeta(new metaObject().setName("description").setContent("5 or more prismatic flowers"))
        .addMeta(new metaObject().setName("generator").setContent("X3D-Edit, https://savage.nps.edu/X3D-Edit"))
        .addMeta(new metaObject().setName("identifier").setContent("https://coderextreme.net/X3DJSONLD/flowers.x3d")))
      .setScene(new SceneObject()
        .addChild(new NavigationInfoObject())
        .addChild(new BackgroundObject().setBackUrl(Java.to(["../resources/images/all_probes/stpeters_cross/stpeters_back.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_back.png"], Java.type("java.lang.String[]"))).setBottomUrl(Java.to(["../resources/images/all_probes/stpeters_cross/stpeters_bottom.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_bottom.png"], Java.type("java.lang.String[]"))).setFrontUrl(Java.to(["../resources/images/all_probes/stpeters_cross/stpeters_front.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_front.png"], Java.type("java.lang.String[]"))).setLeftUrl(Java.to(["../resources/images/all_probes/stpeters_cross/stpeters_left.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_left.png"], Java.type("java.lang.String[]"))).setRightUrl(Java.to(["../resources/images/all_probes/stpeters_cross/stpeters_right.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_right.png"], Java.type("java.lang.String[]"))).setTopUrl(Java.to(["../resources/images/all_probes/stpeters_cross/stpeters_top.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_top.png"], Java.type("java.lang.String[]"))))
        .addChild(new ProtoDeclareObject().setName("flower")
          .setProtoBody(new ProtoBodyObject()
            .addChild(new TransformObject().setDEF("transform")
              .addChild(new ShapeObject()
                .setAppearance(new AppearanceObject()
                  .setMaterial(new MaterialObject().setDiffuseColor(Java.to([0.7,0.7,0.7], Java.type("float[]"))).setSpecularColor(Java.to([0.5,0.5,0.5], Java.type("float[]"))))
                  .setTexture(new ComposedCubeMapTextureObject().setDEF("texture")
                    .setBack(new ImageTextureObject().setUrl(Java.to(["../resources/images/all_probes/stpeters_cross/stpeters_back.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_back.png"], Java.type("java.lang.String[]"))))
                    .setBottom(new ImageTextureObject().setUrl(Java.to(["../resources/images/all_probes/stpeters_cross/stpeters_bottom.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_bottom.png"], Java.type("java.lang.String[]"))))
                    .setFront(new ImageTextureObject().setUrl(Java.to(["../resources/images/all_probes/stpeters_cross/stpeters_front.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_front.png"], Java.type("java.lang.String[]"))))
                    .setLeft(new ImageTextureObject().setUrl(Java.to(["../resources/images/all_probes/stpeters_cross/stpeters_left.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_left.png"], Java.type("java.lang.String[]"))))
                    .setRight(new ImageTextureObject().setUrl(Java.to(["../resources/images/all_probes/stpeters_cross/stpeters_right.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_right.png"], Java.type("java.lang.String[]"))))
                    .setTop(new ImageTextureObject().setUrl(Java.to(["../resources/images/all_probes/stpeters_cross/stpeters_top.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_top.png"], Java.type("java.lang.String[]")))))
                  .addShaders(new ComposedShaderObject().setLanguage("GLSL")
                    .addField(new fieldObject().setType(fieldObject.TYPE_SFINT32).setName("xxxcube").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0"))
                    .addField(new fieldObject().setType(fieldObject.TYPE_SFNODE).setName("cube").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT)
                      .addChild(new ComposedCubeMapTextureObject().setUSE("texture")))
                    .addField(new fieldObject().setType(fieldObject.TYPE_SFVEC3F).setName("chromaticDispertion").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0.98 1 1.033"))
                    .addField(new fieldObject().setType(fieldObject.TYPE_SFFLOAT).setName("bias").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0.5"))
                    .addField(new fieldObject().setType(fieldObject.TYPE_SFFLOAT).setName("scale").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0.5"))
                    .addField(new fieldObject().setType(fieldObject.TYPE_SFFLOAT).setName("power").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("2"))
                    .addParts(new ShaderPartObject().setType("VERTEX").setUrl(Java.to(["../shaders/common.vs","https://coderextreme.net/X3DJSONLD/src/main/shaders/common.vs"], Java.type("java.lang.String[]"))))
                    .addParts(new ShaderPartObject().setType("FRAGMENT").setUrl(Java.to(["../shaders/gl_flowers_chromatic.fs","https://coderextreme.net/X3DJSONLD/src/main/shaders/gl_flowers_chromatic.fs"], Java.type("java.lang.String[]")))))
                  .addShaders(new ComposedShaderObject().setLanguage("GLSL")
                    .addField(new fieldObject().setType(fieldObject.TYPE_SFINT32).setName("xxxcube").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0"))
                    .addField(new fieldObject().setType(fieldObject.TYPE_SFNODE).setName("cube").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT)
                      .addChild(new ComposedCubeMapTextureObject().setUSE("texture")))
                    .addField(new fieldObject().setType(fieldObject.TYPE_SFVEC3F).setName("chromaticDispertion").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0.98 1 1.033"))
                    .addField(new fieldObject().setType(fieldObject.TYPE_SFFLOAT).setName("bias").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0.5"))
                    .addField(new fieldObject().setType(fieldObject.TYPE_SFFLOAT).setName("scale").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0.5"))
                    .addField(new fieldObject().setType(fieldObject.TYPE_SFFLOAT).setName("power").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("2"))
                    .addParts(new ShaderPartObject().setType("VERTEX").setUrl(Java.to(["../shaders/x3dom.vs","https://coderextreme.net/X3DJSONLD/src/main/shaders/x3dom.vs"], Java.type("java.lang.String[]"))))
                    .addParts(new ShaderPartObject().setType("FRAGMENT").setUrl(Java.to(["../shaders/pc_bubbles.fs","https://coderextreme.net/X3DJSONLD/src/main/shaders/pc_bubbles.fs"], Java.type("java.lang.String[]")))))
                  .addShaders(new ComposedShaderObject().setDEF("shader").setLanguage("GLSL")
                    .addField(new fieldObject().setType(fieldObject.TYPE_SFINT32).setName("xxxcube").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0"))
                    .addField(new fieldObject().setType(fieldObject.TYPE_SFNODE).setName("cube").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT)
                      .addChild(new ComposedCubeMapTextureObject().setUSE("texture")))
                    .addField(new fieldObject().setType(fieldObject.TYPE_SFVEC3F).setName("chromaticDispertion").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0.98 1 1.033"))
                    .addField(new fieldObject().setType(fieldObject.TYPE_SFFLOAT).setName("bias").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("10"))
                    .addField(new fieldObject().setType(fieldObject.TYPE_SFFLOAT).setName("scale").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("10"))
                    .addField(new fieldObject().setType(fieldObject.TYPE_SFFLOAT).setName("power").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("2"))
                    .addParts(new ShaderPartObject().setType("VERTEX").setUrl(Java.to(["../shaders/x_ite.vs","https://coderextreme.net/X3DJSONLD/src/main/shaders/x_ite.vs"], Java.type("java.lang.String[]"))))
                    .addParts(new ShaderPartObject().setType("FRAGMENT").setUrl(Java.to(["../shaders/pc_bubbles.fs","https://coderextreme.net/X3DJSONLD/src/main/shaders/pc_bubbles.fs"], Java.type("java.lang.String[]"))))))
                .addComments(new CommentsBlock('<Sphere></Sphere>'))
                .setGeometry(new IndexedFaceSetObject().setConvex(false).setDEF("Orbit")
                  .setCoord(new CoordinateObject().setDEF("OrbitCoordinates")))))
            .addChild(new ScriptObject().setDEF("Bounce")
              .addField(new fieldObject().setType(fieldObject.TYPE_SFVEC3F).setName("translation").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0 0 0"))
              .addField(new fieldObject().setType(fieldObject.TYPE_SFVEC3F).setName("velocity").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0 0 0"))
              .addField(new fieldObject().setType(fieldObject.TYPE_SFTIME).setName("set_fraction").setAccessType(fieldObject.ACCESSTYPE_INPUTONLY))
              .addField(new fieldObject().setType(fieldObject.TYPE_MFVEC3F).setName("coordinates").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT))
              .addField(new fieldObject().setType(fieldObject.TYPE_MFINT32).setName("coordIndexes").setAccessType(fieldObject.ACCESSTYPE_OUTPUTONLY))
              .addField(new fieldObject().setType(fieldObject.TYPE_SFFLOAT).setName("a").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0.5"))
              .addField(new fieldObject().setType(fieldObject.TYPE_SFFLOAT).setName("b").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0.5"))
              .addField(new fieldObject().setType(fieldObject.TYPE_SFFLOAT).setName("c").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("3"))
              .addField(new fieldObject().setType(fieldObject.TYPE_SFFLOAT).setName("d").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("3"))
              .addField(new fieldObject().setType(fieldObject.TYPE_SFFLOAT).setName("tdelta").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0.5"))
              .addField(new fieldObject().setType(fieldObject.TYPE_SFFLOAT).setName("pdelta").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0.5"))
              .setSourceCode("ecmascript: function newBubble() { translation = new SFVec3f(0, 0, 0); velocity = new SFVec3f( Math.random() - 0.5, Math.random() - 0.5, Math.random() - 0.5); } function set_fraction() { translation = new SFVec3f( translation.x + velocity.x, translation.y + velocity.y, translation.z + velocity.z); if (Math.abs(translation.x) > 10) { newBubble(); } else if (Math.abs(translation.y) > 10) { newBubble(); } else if (Math.abs(translation.z) > 10) { newBubble(); } else { velocity = new SFVec3f( velocity.x + Math.random() * 0.2 - 0.1, velocity.y + Math.random() * 0.2 - 0.1, velocity.z + Math.random() * 0.2 - 0.1 ); } animate_flowers(); } function initialize() { var cis = []; newBubble(); resolution = 100; updateCoordinates(resolution); for ( i = 0; i < resolution-1; i++) { for ( j = 0; j < resolution-1; j++) { cis.push(i*resolution+j); cis.push(i*resolution+j+1); cis.push((i+1)*resolution+j+1); cis.push((i+1)*resolution+j); cis.push(-1); } } coordIndexes = new MFInt32(cis); } function updateCoordinates(resolution) { theta = 0.0; phi = 0.0; delta = (2 * 3.141592653) / (resolution-1); var crds = []; for ( i = 0; i < resolution; i++) { for ( j = 0; j < resolution; j++) { rho = a + b * Math.cos(c * theta) * Math.cos(d * phi); crds.push(new SFVec3f( rho * Math.cos(phi) * Math.cos(theta), rho * Math.cos(phi) * Math.sin(theta), rho * Math.sin(phi) )); theta += delta; } phi += delta; coordinates = new MFVec3f(crds); } } function animate_flowers(fraction, eventTime) { choice = Math.floor(Math.random() * 4); switch (choice) { case 0: a += Math.random() * 0.2 - 0.1; break; case 1: b += Math.random() * 0.2 - 0.1; break; case 2: c += Math.random() * 2 - 1; break; case 3: d += Math.random() * 2 - 1; break; } if (a > 1) { a = 0.5; } if (b > 1) { b = 0.5; } if (c < 1) { c = 4; } if (d < 1) { d = 4; } if (c > 10) { c = 4; } if (d > 10) { d = 4; } resolution = 100; updateCoordinates(resolution); }\n"+
""))
            .addChild(new TimeSensorObject().setDEF("TourTime").setCycleInterval(0.15).setLoop(true))
            .addChild(new TimeSensorObject().setDEF("SongTime").setLoop(true))
            .addChild(new SoundObject().setMaxBack(100).setMaxFront(100).setMinBack(20).setMinFront(20)
              .setSource(new AudioClipObject().setDEF("AudioClip").setDescription("Chandubabamusic #1").setUrl(Java.to(["../resources/chandubabamusic1.wav"], Java.type("java.lang.String[]")))))
            .addChild(new ROUTEObject().setFromField("cycleTime").setFromNode("SongTime").setToField("startTime").setToNode("AudioClip"))
            .addChild(new ROUTEObject().setFromNode("TourTime").setFromField("cycleTime").setToNode("Bounce").setToField("set_fraction"))
            .addChild(new ROUTEObject().setFromNode("Bounce").setFromField("translation").setToNode("transform").setToField("set_translation"))
            .addComments(new CommentsBlock('<ROUTE fromField="coordIndexes"fromNode="Bounce"toField="set_coordIndex"toNode="Orbit"/> <ROUTE fromField="coordinates"fromNode="Bounce"toField="set_point"toNode="OrbitCoordinates"/>'))))
        .addChild(new TransformObject()
          .addChild(ProtoInstance0 = new ProtoInstanceObject().setName("flower"))
          .addComments(new CommentsBlock('<ProtoInstance name="flower"/> <ProtoInstance name="flower"/>'))))      ;
    X3D0.toFileX3D("../data/flowers.new.x3d");
