from jnius import autoclass
from X3Dautoclass import *
X3D0 =  X3DObject().setProfile("Immersive").setVersion("3.0")
head1 = headObject()
meta2 = metaObject().setName("title").setContent("MFString.x3d")
head1.addMeta(meta2)
meta3 = metaObject().setName("created").setContent("21 April 20017")
head1.addMeta(meta3)
meta4 = metaObject().setName("translated").setContent("14 May 2017")
head1.addMeta(meta4)
meta5 = metaObject().setName("generator").setContent("X3dToJson.xslt, http://www.web3d.org/x3d/stylesheets/X3dToJson.html")
head1.addMeta(meta5)
meta6 = metaObject().setName("reference").setContent("X3D JSON encoding: http://www.web3d.org/wiki/index.php/X3D_JSON_Encoding")
head1.addMeta(meta6)
meta7 = metaObject().setName("translated").setContent("15 May 2017")
head1.addMeta(meta7)
meta8 = metaObject().setName("generator").setContent("X3DJSONLD: https://github.com/coderextreme/X3DJSONLD")
head1.addMeta(meta8)
X3D0.setHead(head1)
Scene9 = SceneObject()
Group10 = GroupObject()
Shape11 = ShapeObject()
Text12 = TextObject().setString(["Locked","FIRE!..\"\"FIRE!"])
Shape11.setGeometry(Text12)
Appearance13 = AppearanceObject()
Material14 = MaterialObject().setDiffuseColor([0,0.75,0.18])
Appearance13.setMaterial(Material14)
Shape11.setAppearance(Appearance13)
Group10.addChild(Shape11)
Scene9.addChild(Group10)
X3D0.setScene(Scene9)

X3D0.toFileX3D("MFString.new.x3d")
