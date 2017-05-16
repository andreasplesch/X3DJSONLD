from jnius import autoclass
from X3Dautoclass import *
X3D0 =  X3DObject().setProfile("Immersive").setVersion("3.3")
head1 = headObject()
component2 = componentObject().setName("EnvironmentalEffects").setLevel(3)
head1.addComponent(component2)
meta3 = metaObject().setName("title").setContent("mirror.x3d")
head1.addMeta(meta3)
meta4 = metaObject().setName("creator").setContent("John Carlson")
head1.addMeta(meta4)
meta5 = metaObject().setName("generator").setContent("manual")
head1.addMeta(meta5)
meta6 = metaObject().setName("identifier").setContent("http://coderextreme.net/X3DJSONLD/mirror.x3d")
head1.addMeta(meta6)
meta7 = metaObject().setName("description").setContent("sphere with alternating backgrounds")
head1.addMeta(meta7)
X3D0.setHead(head1)
Scene8 = SceneObject()
Viewpoint9 = ViewpointObject().setPosition([0,5,100]).setDescription("Switch background and images texture")
Scene8.addChild(Viewpoint9)
TextureBackground10 = TextureBackgroundObject()
ImageTexture11 = ImageTextureObject().setDEF("leftBack").setUrl(["images/all_probes/beach_cross/beach_left.png","http://coderextreme.net/images/all_probes/beach_cross/beach_left.png"])
TextureBackground10.setLeftTexture(ImageTexture11)
ImageTexture12 = ImageTextureObject().setDEF("rightBack").setUrl(["images/all_probes/beach_cross/beach_right.png","http://coderextreme.net/images/all_probes/beach_cross/beach_right.png"])
TextureBackground10.setRightTexture(ImageTexture12)
ImageTexture13 = ImageTextureObject().setDEF("frontBack").setUrl(["images/all_probes/beach_cross/beach_front.png","http://coderextreme.net/images/all_probes/beach_cross/beach_front.png"])
TextureBackground10.setFrontTexture(ImageTexture13)
ImageTexture14 = ImageTextureObject().setDEF("backBack").setUrl(["images/all_probes/beach_cross/beach_back.png","http://coderextreme.net/images/all_probes/beach_cross/beach_back.png"])
TextureBackground10.setBackTexture(ImageTexture14)
ImageTexture15 = ImageTextureObject().setDEF("topBack").setUrl(["images/all_probes/beach_cross/beach_top.png","http://coderextreme.net/images/all_probes/beach_cross/beach_top.png"])
TextureBackground10.setTopTexture(ImageTexture15)
ImageTexture16 = ImageTextureObject().setDEF("bottomBack").setUrl(["images/all_probes/beach_cross/beach_bottom.png","http://coderextreme.net/images/all_probes/beach_cross/beach_bottom.png"])
TextureBackground10.setBottomTexture(ImageTexture16)
Scene8.addChild(TextureBackground10)
Transform17 = TransformObject()
Shape18 = ShapeObject()
Appearance19 = AppearanceObject()
Material20 = MaterialObject().setDiffuseColor([0.7,0.7,0.7]).setSpecularColor([0.5,0.5,0.5])
Appearance19.setMaterial(Material20)
ComposedCubeMapTexture21 = ComposedCubeMapTextureObject()
ImageTexture22 = ImageTextureObject().setDEF("backShader").setUrl(["images/all_probes/beach_cross/beach_back.png","http://coderextreme.net/images/all_probes/beach_cross/beach_back.png"])
ComposedCubeMapTexture21.setBack(ImageTexture22)
ImageTexture23 = ImageTextureObject().setDEF("bottomShader").setUrl(["images/all_probes/beach_cross/beach_bottom.png","http://coderextreme.net/images/all_probes/beach_cross/beach_bottom.png"])
ComposedCubeMapTexture21.setBottom(ImageTexture23)
ImageTexture24 = ImageTextureObject().setDEF("frontShader").setUrl(["images/all_probes/beach_cross/beach_front.png","http://coderextreme.net/images/all_probes/beach_cross/beach_front.png"])
ComposedCubeMapTexture21.setFront(ImageTexture24)
ImageTexture25 = ImageTextureObject().setDEF("leftShader").setUrl(["images/all_probes/beach_cross/beach_left.png","http://coderextreme.net/images/all_probes/beach_cross/beach_left.png"])
ComposedCubeMapTexture21.setLeft(ImageTexture25)
ImageTexture26 = ImageTextureObject().setDEF("rightShader").setUrl(["images/all_probes/beach_cross/beach_right.png","http://coderextreme.net/images/all_probes/beach_cross/beach_right.png"])
ComposedCubeMapTexture21.setRight(ImageTexture26)
ImageTexture27 = ImageTextureObject().setDEF("topShader").setUrl(["images/all_probes/beach_cross/beach_top.png","http://coderextreme.net/images/all_probes/beach_cross/beach_top.png"])
ComposedCubeMapTexture21.setTop(ImageTexture27)
Appearance19.setTexture(ComposedCubeMapTexture21)
ComposedShader28 = ComposedShaderObject().setDEF("x3dom").setLanguage("GLSL")

ComposedShader28.addComments(CommentsBlock("http://hypertextbook.com/facts/2005/JustinChe.shtml"))
field29 = fieldObject().setType(fieldObject.TYPE_SFVEC3F).setName("chromaticDispertion").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0.98 1 1.033")
ComposedShader28.addField(field29)
field30 = fieldObject().setType(fieldObject.TYPE_SFINT32).setName("cube").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0")
ComposedShader28.addField(field30)
field31 = fieldObject().setType(fieldObject.TYPE_SFFLOAT).setName("bias").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0.5")
ComposedShader28.addField(field31)
field32 = fieldObject().setType(fieldObject.TYPE_SFFLOAT).setName("scale").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0.5")
ComposedShader28.addField(field32)
field33 = fieldObject().setType(fieldObject.TYPE_SFFLOAT).setName("power").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("2")
ComposedShader28.addField(field33)
ShaderPart34 = ShaderPartObject().setType("VERTEX").setUrl(["x3dom.vs","http://coderextreme.net/X3DJSONLD/x3dom.vs"])
ComposedShader28.addParts(ShaderPart34)
ShaderPart35 = ShaderPartObject().setType("FRAGMENT").setUrl(["mix.fs","http://coderextreme.net/X3DJSONLD/mix.fs"])
ComposedShader28.addParts(ShaderPart35)
Appearance19.addShaders(ComposedShader28)
ComposedShader36 = ComposedShaderObject().setDEF("cobweb").setLanguage("GLSL")

ComposedShader36.addComments(CommentsBlock("http://hypertextbook.com/facts/2005/JustinChe.shtml"))
field37 = fieldObject().setType(fieldObject.TYPE_SFVEC3F).setName("chromaticDispertion").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0.98 1 1.033")
ComposedShader36.addField(field37)
field38 = fieldObject().setType(fieldObject.TYPE_SFINT32).setName("cube").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0")
ComposedShader36.addField(field38)
field39 = fieldObject().setType(fieldObject.TYPE_SFFLOAT).setName("bias").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0.5")
ComposedShader36.addField(field39)
field40 = fieldObject().setType(fieldObject.TYPE_SFFLOAT).setName("scale").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("0.5")
ComposedShader36.addField(field40)
field41 = fieldObject().setType(fieldObject.TYPE_SFFLOAT).setName("power").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("2")
ComposedShader36.addField(field41)
ShaderPart42 = ShaderPartObject().setType("VERTEX").setUrl(["cobweb.vs","http://coderextreme.net/X3DJSONLD/cobweb.vs"])
ComposedShader36.addParts(ShaderPart42)
ShaderPart43 = ShaderPartObject().setType("FRAGMENT").setUrl(["mix.fs","http://coderextreme.net/X3DJSONLD/mix.fs"])
ComposedShader36.addParts(ShaderPart43)
Appearance19.addShaders(ComposedShader36)
Shape18.setAppearance(Appearance19)
Sphere44 = SphereObject().setRadius(30)
Shape18.setGeometry(Sphere44)
Transform17.addChild(Shape18)
Script45 = ScriptObject().setDEF("UrlSelector").setDirectOutput(True)
field46 = fieldObject().setType(fieldObject.TYPE_MFSTRING).setName("frontUrls").setAccessType(fieldObject.ACCESSTYPE_INITIALIZEONLY).setValue("\"images/all_probes/beach_cross/beach_front.png\" \"images/all_probes/building_cross/building_front.png\" \"images/all_probes/campus_cross/campus_front.png\" \"images/all_probes/galileo_cross/galileo_front.png\" \"images/all_probes/grace_cross/grace_front.png\" \"images/all_probes/kitchen_cross/kitchen_front.png\" \"images/all_probes/rnl_cross/rnl_front.png\" \"images/all_probes/stpeters_cross/stpeters_front.png\" \"images/all_probes/uffizi_cross/uffizi_front.png\"")
Script45.addField(field46)
field47 = fieldObject().setType(fieldObject.TYPE_MFSTRING).setName("backUrls").setAccessType(fieldObject.ACCESSTYPE_INITIALIZEONLY).setValue("\"images/all_probes/beach_cross/beach_back.png\" \"images/all_probes/building_cross/building_back.png\" \"images/all_probes/campus_cross/campus_back.png\" \"images/all_probes/galileo_cross/galileo_back.png\" \"images/all_probes/grace_cross/grace_back.png\" \"images/all_probes/kitchen_cross/kitchen_back.png\" \"images/all_probes/rnl_cross/rnl_back.png\" \"images/all_probes/stpeters_cross/stpeters_back.png\" \"images/all_probes/uffizi_cross/uffizi_back.png\"")
Script45.addField(field47)
field48 = fieldObject().setType(fieldObject.TYPE_MFSTRING).setName("leftUrls").setAccessType(fieldObject.ACCESSTYPE_INITIALIZEONLY).setValue("\"images/all_probes/beach_cross/beach_left.png\" \"images/all_probes/building_cross/building_left.png\" \"images/all_probes/campus_cross/campus_left.png\" \"images/all_probes/galileo_cross/galileo_left.png\" \"images/all_probes/grace_cross/grace_left.png\" \"images/all_probes/kitchen_cross/kitchen_left.png\" \"images/all_probes/rnl_cross/rnl_left.png\" \"images/all_probes/stpeters_cross/stpeters_left.png\" \"images/all_probes/uffizi_cross/uffizi_left.png\"")
Script45.addField(field48)
field49 = fieldObject().setType(fieldObject.TYPE_MFSTRING).setName("rightUrls").setAccessType(fieldObject.ACCESSTYPE_INITIALIZEONLY).setValue("\"images/all_probes/beach_cross/beach_right.png\" \"images/all_probes/building_cross/building_right.png\" \"images/all_probes/campus_cross/campus_right.png\" \"images/all_probes/galileo_cross/galileo_right.png\" \"images/all_probes/grace_cross/grace_right.png\" \"images/all_probes/kitchen_cross/kitchen_right.png\" \"images/all_probes/rnl_cross/rnl_right.png\" \"images/all_probes/stpeters_cross/stpeters_right.png\" \"images/all_probes/uffizi_cross/uffizi_right.png\"")
Script45.addField(field49)
field50 = fieldObject().setType(fieldObject.TYPE_MFSTRING).setName("topUrls").setAccessType(fieldObject.ACCESSTYPE_INITIALIZEONLY).setValue("\"images/all_probes/beach_cross/beach_top.png\" \"images/all_probes/building_cross/building_top.png\" \"images/all_probes/campus_cross/campus_top.png\" \"images/all_probes/galileo_cross/galileo_top.png\" \"images/all_probes/grace_cross/grace_top.png\" \"images/all_probes/kitchen_cross/kitchen_top.png\" \"images/all_probes/rnl_cross/rnl_top.png\" \"images/all_probes/stpeters_cross/stpeters_top.png\" \"images/all_probes/uffizi_cross/uffizi_top.png\"")
Script45.addField(field50)
field51 = fieldObject().setType(fieldObject.TYPE_MFSTRING).setName("bottomUrls").setAccessType(fieldObject.ACCESSTYPE_INITIALIZEONLY).setValue("\"images/all_probes/beach_cross/beach_bottom.png\" \"images/all_probes/building_cross/building_bottom.png\" \"images/all_probes/campus_cross/campus_bottom.png\" \"images/all_probes/galileo_cross/galileo_bottom.png\" \"images/all_probes/grace_cross/grace_bottom.png\" \"images/all_probes/kitchen_cross/kitchen_bottom.png\" \"images/all_probes/rnl_cross/rnl_bottom.png\" \"images/all_probes/stpeters_cross/stpeters_bottom.png\" \"images/all_probes/uffizi_cross/uffizi_bottom.png\"")
Script45.addField(field51)
field52 = fieldObject().setType(fieldObject.TYPE_MFSTRING).setName("front_changed").setAccessType(fieldObject.ACCESSTYPE_OUTPUTONLY)
Script45.addField(field52)
field53 = fieldObject().setType(fieldObject.TYPE_MFSTRING).setName("back_changed").setAccessType(fieldObject.ACCESSTYPE_OUTPUTONLY)
Script45.addField(field53)
field54 = fieldObject().setType(fieldObject.TYPE_MFSTRING).setName("left_changed").setAccessType(fieldObject.ACCESSTYPE_OUTPUTONLY)
Script45.addField(field54)
field55 = fieldObject().setType(fieldObject.TYPE_MFSTRING).setName("right_changed").setAccessType(fieldObject.ACCESSTYPE_OUTPUTONLY)
Script45.addField(field55)
field56 = fieldObject().setType(fieldObject.TYPE_MFSTRING).setName("top_changed").setAccessType(fieldObject.ACCESSTYPE_OUTPUTONLY)
Script45.addField(field56)
field57 = fieldObject().setType(fieldObject.TYPE_MFSTRING).setName("bottom_changed").setAccessType(fieldObject.ACCESSTYPE_OUTPUTONLY)
Script45.addField(field57)
field58 = fieldObject().setType(fieldObject.TYPE_SFFLOAT).setName("set_fraction").setAccessType(fieldObject.ACCESSTYPE_INPUTONLY)
Script45.addField(field58)
field59 = fieldObject().setType(fieldObject.TYPE_SFINT32).setName("old").setAccessType(fieldObject.ACCESSTYPE_INPUTOUTPUT).setValue("-1")
Script45.addField(field59)

Script45.setSourceCode("ecmascript:\n"+
"        function set_fraction( f, tm ) {\n"+
"	    var side = Math.floor(f*frontUrls.length);\n"+
"	    if (side > frontUrls.length-1) {\n"+
"	    	side = 0;\n"+
"	    }\n"+
"	    if (side != old) {\n"+
"	    	    Browser.print(f+\" \"+side);\n"+
"	    	    old = side;\n"+
"		    front_changed[0] = frontUrls[side];\n"+
"		    back_changed[0] = backUrls[side];\n"+
"		    left_changed[0] = leftUrls[side];\n"+
"		    right_changed[0] = rightUrls[side];\n"+
"		    top_changed[0] = topUrls[side];\n"+
"		    bottom_changed[0] = bottomUrls[side];\n"+
"            }\n"+
"        }\n"+
"")
Transform17.addChild(Script45)
TimeSensor60 = TimeSensorObject().setDEF("Clock").setCycleInterval(45).setLoop(True)
Transform17.addChild(TimeSensor60)
ROUTE61 = ROUTEObject().setFromNode("Clock").setFromField("fraction_changed").setToNode("UrlSelector").setToField("set_fraction")
Transform17.addChild(ROUTE61)
ROUTE62 = ROUTEObject().setFromNode("UrlSelector").setFromField("front_changed").setToNode("frontBack").setToField("url")
Transform17.addChild(ROUTE62)
ROUTE63 = ROUTEObject().setFromNode("UrlSelector").setFromField("back_changed").setToNode("backBack").setToField("url")
Transform17.addChild(ROUTE63)
ROUTE64 = ROUTEObject().setFromNode("UrlSelector").setFromField("left_changed").setToNode("leftBack").setToField("url")
Transform17.addChild(ROUTE64)
ROUTE65 = ROUTEObject().setFromNode("UrlSelector").setFromField("right_changed").setToNode("rightBack").setToField("url")
Transform17.addChild(ROUTE65)
ROUTE66 = ROUTEObject().setFromNode("UrlSelector").setFromField("top_changed").setToNode("topBack").setToField("url")
Transform17.addChild(ROUTE66)
ROUTE67 = ROUTEObject().setFromNode("UrlSelector").setFromField("bottom_changed").setToNode("bottomBack").setToField("url")
Transform17.addChild(ROUTE67)
ROUTE68 = ROUTEObject().setFromNode("UrlSelector").setFromField("front_changed").setToNode("frontShader").setToField("url")
Transform17.addChild(ROUTE68)
ROUTE69 = ROUTEObject().setFromNode("UrlSelector").setFromField("back_changed").setToNode("backShader").setToField("url")
Transform17.addChild(ROUTE69)
ROUTE70 = ROUTEObject().setFromNode("UrlSelector").setFromField("left_changed").setToNode("leftShader").setToField("url")
Transform17.addChild(ROUTE70)
ROUTE71 = ROUTEObject().setFromNode("UrlSelector").setFromField("right_changed").setToNode("rightShader").setToField("url")
Transform17.addChild(ROUTE71)
ROUTE72 = ROUTEObject().setFromNode("UrlSelector").setFromField("top_changed").setToNode("topShader").setToField("url")
Transform17.addChild(ROUTE72)
ROUTE73 = ROUTEObject().setFromNode("UrlSelector").setFromField("bottom_changed").setToNode("bottomShader").setToField("url")
Transform17.addChild(ROUTE73)
Scene8.addChild(Transform17)
X3D0.setScene(Scene8)

X3D0.toFileX3D("../new/json/mirror.new.x3d")
