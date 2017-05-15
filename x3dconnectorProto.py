from jnius import autoclass
from X3Dautoclass import *
X3D0 =  X3DObject().setProfile("Immersive").setVersion("3.3")
head1 = headObject()
meta2 = metaObject().setName("title").setContent("x3dconnectorProto")
head1.addMeta(meta2)
meta3 = metaObject().setName("creator").setContent("Lost, Doug Sanden I think")
head1.addMeta(meta3)
meta4 = metaObject().setName("generator").setContent("manual")
head1.addMeta(meta4)
meta5 = metaObject().setName("identifier").setContent("http://coderextreme.net/X3DJSONLD/x3dconnectorProto.x3d")
head1.addMeta(meta5)
meta6 = metaObject().setName("description").setContent("a generic proto to connect two objects")
head1.addMeta(meta6)
meta7 = metaObject().setName("translated").setContent("15 May 2017")
head1.addMeta(meta7)
meta8 = metaObject().setName("generator").setContent("X3dToJson.xslt, http://www.web3d.org/x3d/stylesheets/X3dToJson.html")
head1.addMeta(meta8)
meta9 = metaObject().setName("reference").setContent("X3D JSON encoding: http://www.web3d.org/wiki/index.php/X3D_JSON_Encoding")
head1.addMeta(meta9)
meta10 = metaObject().setName("translated").setContent("15 May 2017")
head1.addMeta(meta10)
meta11 = metaObject().setName("generator").setContent("X3DJSONLD: https://github.com/coderextreme/X3DJSONLD")
head1.addMeta(meta11)
X3D0.setHead(head1)
Scene12 = SceneObject()
Viewpoint13 = ViewpointObject().setPosition([0,0,5]).setDescription("Only Viewpoint")
Scene12.addChild(Viewpoint13)
Background14 = BackgroundObject().setSkyColor([0.4,0.4,0.4])
Scene12.addChild(Background14)
Transform15 = TransformObject().setDEF("G1")
Shape16 = ShapeObject()
Appearance17 = AppearanceObject()
Material18 = MaterialObject().setDiffuseColor([0.7,0.2,0.2])
Appearance17.setMaterial(Material18)
Shape16.setAppearance(Appearance17)
Sphere19 = SphereObject().setRadius(0.1)
Shape16.setGeometry(Sphere19)
Transform15.addChild(Shape16)
PlaneSensor20 = PlaneSensorObject().setDescription("Grab to move").setDEF("PS1")
Transform15.addChild(PlaneSensor20)
ROUTE21 = ROUTEObject().setFromNode("PS1").setFromField("translation_changed").setToNode("G1").setToField("set_translation")
Transform15.addChild(ROUTE21)
Scene12.addChild(Transform15)
Transform22 = TransformObject().setDEF("G2").setTranslation([1,-1,0.01])
Shape23 = ShapeObject()
Appearance24 = AppearanceObject()
Material25 = MaterialObject().setDiffuseColor([0.2,0.7,0.2])
Appearance24.setMaterial(Material25)
Shape23.setAppearance(Appearance24)
Sphere26 = SphereObject().setRadius(0.1)
Shape23.setGeometry(Sphere26)
Transform22.addChild(Shape23)
PlaneSensor27 = PlaneSensorObject().setDescription("Grab to move").setDEF("PS2")
Transform22.addChild(PlaneSensor27)
ROUTE28 = ROUTEObject().setFromNode("PS2").setFromField("translation_changed").setToNode("G2").setToField("set_translation")
Transform22.addChild(ROUTE28)
Scene12.addChild(Transform22)
Transform29 = TransformObject().setDEF("G3").setTranslation([1,1,0.01])
Shape30 = ShapeObject()
Appearance31 = AppearanceObject()
Material32 = MaterialObject().setDiffuseColor([0.2,0.7,0.2])
Appearance31.setMaterial(Material32)
Shape30.setAppearance(Appearance31)
Sphere33 = SphereObject().setRadius(0.1)
Shape30.setGeometry(Sphere33)
Transform29.addChild(Shape30)
PlaneSensor34 = PlaneSensorObject().setDescription("Grab to move").setDEF("PS3")
Transform29.addChild(PlaneSensor34)
ROUTE35 = ROUTEObject().setFromNode("PS3").setFromField("translation_changed").setToNode("G3").setToField("set_translation")
Transform29.addChild(ROUTE35)
Scene12.addChild(Transform29)
Transform36 = TransformObject().setDEF("G4").setTranslation([-1,1,0.01])
Shape37 = ShapeObject()
Appearance38 = AppearanceObject()
Material39 = MaterialObject().setDiffuseColor([0.2,0.7,0.2])
Appearance38.setMaterial(Material39)
Shape37.setAppearance(Appearance38)
Sphere40 = SphereObject().setRadius(0.1)
Shape37.setGeometry(Sphere40)
Transform36.addChild(Shape37)
PlaneSensor41 = PlaneSensorObject().setDescription("Grab to move").setDEF("PS4")
Transform36.addChild(PlaneSensor41)
ROUTE42 = ROUTEObject().setFromNode("PS4").setFromField("translation_changed").setToNode("G4").setToField("set_translation")
Transform36.addChild(ROUTE42)
Scene12.addChild(Transform36)
Transform43 = TransformObject().setDEF("C1")
Shape44 = ShapeObject()
Appearance45 = AppearanceObject()
Material46 = MaterialObject().setDiffuseColor([0.2,0.7,0.7]).setTransparency(0.5)
Appearance45.setMaterial(Material46)
Shape44.setAppearance(Appearance45)
Cylinder47 = CylinderObject().setRadius(0.05)
Shape44.setGeometry(Cylinder47)
Transform43.addChild(Shape44)
Scene12.addChild(Transform43)
Transform48 = TransformObject().setDEF("C2")
Shape49 = ShapeObject()
Appearance50 = AppearanceObject()
Material51 = MaterialObject().setDiffuseColor([0.2,0.7,0.7]).setTransparency(0.5)
Appearance50.setMaterial(Material51)
Shape49.setAppearance(Appearance50)
Cylinder52 = CylinderObject().setRadius(0.05)
Shape49.setGeometry(Cylinder52)
Transform48.addChild(Shape49)
Scene12.addChild(Transform48)
Transform53 = TransformObject().setDEF("C3")
Shape54 = ShapeObject()
Appearance55 = AppearanceObject()
Material56 = MaterialObject().setDiffuseColor([0.2,0.7,0.7]).setTransparency(0.5)
Appearance55.setMaterial(Material56)
Shape54.setAppearance(Appearance55)
Cylinder57 = CylinderObject().setRadius(0.05)
Shape54.setGeometry(Cylinder57)
Transform53.addChild(Shape54)
Scene12.addChild(Transform53)
ProtoDeclare58 = ProtoDeclareObject().setName("x3dconnector")
ProtoInterface59 = ProtoInterfaceObject()
field60 = fieldObject().setType(fieldObject.TYPE_SFNODE).setName("startnode").setAccessType(fieldObject.ACCESSTYPE_INITIALIZEONLY)
ProtoInterface59.addField(field60)
field61 = fieldObject().setType(fieldObject.TYPE_SFNODE).setName("endnode").setAccessType(fieldObject.ACCESSTYPE_INITIALIZEONLY)
ProtoInterface59.addField(field61)
field62 = fieldObject().setType(fieldObject.TYPE_SFNODE).setName("connectornode").setAccessType(fieldObject.ACCESSTYPE_INITIALIZEONLY)
ProtoInterface59.addField(field62)
field63 = fieldObject().setType(fieldObject.TYPE_SFVEC3F).setName("set_startpoint").setAccessType(fieldObject.ACCESSTYPE_INPUTONLY)
ProtoInterface59.addField(field63)
field64 = fieldObject().setType(fieldObject.TYPE_SFVEC3F).setName("set_endpoint").setAccessType(fieldObject.ACCESSTYPE_INPUTONLY)
ProtoInterface59.addField(field64)
ProtoDeclare58.setProtoInterface(ProtoInterface59)
ProtoBody65 = ProtoBodyObject()
Script66 = ScriptObject().setDEF("S1")
field67 = fieldObject().setType(fieldObject.TYPE_SFNODE).setName("startnode").setAccessType(fieldObject.ACCESSTYPE_INITIALIZEONLY)
Script66.addField(field67)
field68 = fieldObject().setType(fieldObject.TYPE_SFNODE).setName("endnode").setAccessType(fieldObject.ACCESSTYPE_INITIALIZEONLY)
Script66.addField(field68)
field69 = fieldObject().setType(fieldObject.TYPE_SFNODE).setName("connectornode").setAccessType(fieldObject.ACCESSTYPE_INITIALIZEONLY)
Script66.addField(field69)
field70 = fieldObject().setType(fieldObject.TYPE_SFVEC3F).setName("set_startpoint").setAccessType(fieldObject.ACCESSTYPE_INPUTONLY)
Script66.addField(field70)
field71 = fieldObject().setType(fieldObject.TYPE_SFVEC3F).setName("set_endpoint").setAccessType(fieldObject.ACCESSTYPE_INPUTONLY)
Script66.addField(field71)
IS72 = ISObject()
connect73 = connectObject().setNodeField("startnode").setProtoField("startnode")
IS72.addConnect(connect73)
connect74 = connectObject().setNodeField("endnode").setProtoField("endnode")
IS72.addConnect(connect74)
connect75 = connectObject().setNodeField("connectornode").setProtoField("connectornode")
IS72.addConnect(connect75)
connect76 = connectObject().setNodeField("set_startpoint").setProtoField("set_startpoint")
IS72.addConnect(connect76)
connect77 = connectObject().setNodeField("set_endpoint").setProtoField("set_endpoint")
IS72.addConnect(connect77)
Script66.setIS(IS72)

Script66.setSourceCode("ecmascript:\n"+
"            function recompute(startpoint,endpoint){\n"+
"	        if (typeof endpoint === 'undefined') {\n"+
"			return;\n"+
"		}\n"+
"                var dif = endpoint.subtract(startpoint);\n"+
"                var dist = dif.length()*.5;\n"+
"                var dif2 = dif.multiply(.5);\n"+
"                var norm = dif.normalize();\n"+
"                var trans = startpoint.add(dif2);\n"+
"                connectornode.scale = new SFVec3f(1.0,dist,1.0);\n"+
"                connectornode.translation = trans;\n"+
"                connectornode.rotation = new SFRotation(new SFVec3f(0.0,1.0,0.0),norm);\n"+
"                //Browser.print('norm='+norm.toString());\n"+
"                //Browser.print('rotation='+rotation.toString());\n"+
"            }\n"+
"            function initialize(){\n"+
"                recompute(startnode.translation,endnode.translation);\n"+
"            }\n"+
"            function set_startpoint(val,t){\n"+
"                recompute(val,endnode.translation);\n"+
"            }\n"+
"            function set_endpoint(val,t){\n"+
"                recompute(startnode.translation,val);\n"+
"            }\n"+
"")
ProtoBody65.addChild(Script66)
ProtoDeclare58.setProtoBody(ProtoBody65)
Scene12.addChild(ProtoDeclare58)
ProtoInstance78 = ProtoInstanceObject().setName("x3dconnector").setDEF("connector1")
fieldValue79 = fieldValueObject().setName("startnode")
Transform80 = TransformObject().setUSE("G1")
fieldValue79.addChild(Transform80)
ProtoInstance78.addFieldValue(fieldValue79)
fieldValue81 = fieldValueObject().setName("endnode")
Transform82 = TransformObject().setUSE("G2")
fieldValue81.addChild(Transform82)
ProtoInstance78.addFieldValue(fieldValue81)
fieldValue83 = fieldValueObject().setName("connectornode")
Transform84 = TransformObject().setUSE("C1")
fieldValue83.addChild(Transform84)
ProtoInstance78.addFieldValue(fieldValue83)
fieldValue85 = fieldValueObject().setName("set_startpoint")
ProtoInstance78.addFieldValue(fieldValue85)
fieldValue86 = fieldValueObject().setName("set_endpoint")
ProtoInstance78.addFieldValue(fieldValue86)
Scene12.addChild(ProtoInstance78)
ProtoInstance87 = ProtoInstanceObject().setName("x3dconnector").setDEF("connector2")
fieldValue88 = fieldValueObject().setName("startnode")
Transform89 = TransformObject().setUSE("G1")
fieldValue88.addChild(Transform89)
ProtoInstance87.addFieldValue(fieldValue88)
fieldValue90 = fieldValueObject().setName("endnode")
Transform91 = TransformObject().setUSE("G3")
fieldValue90.addChild(Transform91)
ProtoInstance87.addFieldValue(fieldValue90)
fieldValue92 = fieldValueObject().setName("connectornode")
Transform93 = TransformObject().setUSE("C2")
fieldValue92.addChild(Transform93)
ProtoInstance87.addFieldValue(fieldValue92)
fieldValue94 = fieldValueObject().setName("set_startpoint")
ProtoInstance87.addFieldValue(fieldValue94)
fieldValue95 = fieldValueObject().setName("set_endpoint")
ProtoInstance87.addFieldValue(fieldValue95)
Scene12.addChild(ProtoInstance87)
ProtoInstance96 = ProtoInstanceObject().setName("x3dconnector").setDEF("connector3")
fieldValue97 = fieldValueObject().setName("startnode")
Transform98 = TransformObject().setUSE("G1")
fieldValue97.addChild(Transform98)
ProtoInstance96.addFieldValue(fieldValue97)
fieldValue99 = fieldValueObject().setName("endnode")
Transform100 = TransformObject().setUSE("G4")
fieldValue99.addChild(Transform100)
ProtoInstance96.addFieldValue(fieldValue99)
fieldValue101 = fieldValueObject().setName("connectornode")
Transform102 = TransformObject().setUSE("C3")
fieldValue101.addChild(Transform102)
ProtoInstance96.addFieldValue(fieldValue101)
fieldValue103 = fieldValueObject().setName("set_startpoint")
ProtoInstance96.addFieldValue(fieldValue103)
fieldValue104 = fieldValueObject().setName("set_endpoint")
ProtoInstance96.addFieldValue(fieldValue104)
Scene12.addChild(ProtoInstance96)
ROUTE105 = ROUTEObject().setFromNode("G1").setFromField("translation_changed").setToNode("connector1").setToField("set_startpoint")
Scene12.addChild(ROUTE105)
ROUTE106 = ROUTEObject().setFromNode("G2").setFromField("translation_changed").setToNode("connector1").setToField("set_endpoint")
Scene12.addChild(ROUTE106)
ROUTE107 = ROUTEObject().setFromNode("G1").setFromField("translation_changed").setToNode("connector2").setToField("set_startpoint")
Scene12.addChild(ROUTE107)
ROUTE108 = ROUTEObject().setFromNode("G3").setFromField("translation_changed").setToNode("connector2").setToField("set_endpoint")
Scene12.addChild(ROUTE108)
ROUTE109 = ROUTEObject().setFromNode("G1").setFromField("translation_changed").setToNode("connector3").setToField("set_startpoint")
Scene12.addChild(ROUTE109)
ROUTE110 = ROUTEObject().setFromNode("G4").setFromField("translation_changed").setToNode("connector3").setToField("set_endpoint")
Scene12.addChild(ROUTE110)
X3D0.setScene(Scene12)

X3D0.toFileX3D("x3dconnectorProto.new.x3d")
