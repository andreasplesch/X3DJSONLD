from jnius import autoclass
from X3Dautoclass import *
X3D0 =  X3DObject().setProfile("Interchange").setVersion("3.3")
head1 = headObject()
meta2 = metaObject().setName("title").setContent("Table5_18PixelTexture")
head1.addMeta(meta2)
meta3 = metaObject().setName("description").setContent("PixelTexture example for Table 5.18")
head1.addMeta(meta3)
meta4 = metaObject().setName("creator").setContent("Leonard Daly and Don Brutzman")
head1.addMeta(meta4)
meta5 = metaObject().setName("created").setContent("18 December 2006")
head1.addMeta(meta5)
meta6 = metaObject().setName("modified").setContent("2 April 2017")
head1.addMeta(meta6)
meta7 = metaObject().setName("reference").setContent("http://X3dGraphics.com")
head1.addMeta(meta7)
meta8 = metaObject().setName("reference").setContent("http://www.web3d.org/x3d/content/examples/X3dResources.html")
head1.addMeta(meta8)
meta9 = metaObject().setName("rights").setContent("Copyright 2006, Daly Realism and Don Brutzman")
head1.addMeta(meta9)
meta10 = metaObject().setName("subject").setContent("X3D, PixelTexture")
head1.addMeta(meta10)
meta11 = metaObject().setName("identifier").setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/Table5_18PixelTexture")
head1.addMeta(meta11)
meta12 = metaObject().setName("generator").setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit")
head1.addMeta(meta12)
meta13 = metaObject().setName("license").setContent("../license.html")
head1.addMeta(meta13)
meta14 = metaObject().setName("translated").setContent("14 May 2017")
head1.addMeta(meta14)
meta15 = metaObject().setName("generator").setContent("X3dToJson.xslt, http://www.web3d.org/x3d/stylesheets/X3dToJson.html")
head1.addMeta(meta15)
meta16 = metaObject().setName("reference").setContent("X3D JSON encoding: http://www.web3d.org/wiki/index.php/X3D_JSON_Encoding")
head1.addMeta(meta16)
meta17 = metaObject().setName("translated").setContent("15 May 2017")
head1.addMeta(meta17)
meta18 = metaObject().setName("generator").setContent("X3DJSONLD: https://github.com/coderextreme/X3DJSONLD")
head1.addMeta(meta18)
X3D0.setHead(head1)
Scene19 = SceneObject()
Background20 = BackgroundObject().setSkyColor([0,0,1])
Scene19.addChild(Background20)
Transform21 = TransformObject().setDEF("Checkerboard").setTranslation([0,0,-10])
Shape22 = ShapeObject()
Appearance23 = AppearanceObject()
TextureTransform24 = TextureTransformObject().setScale([500,500])
Appearance23.setTextureTransform(TextureTransform24)
PixelTexture25 = PixelTextureObject().setImage([2,2,3,15119869,16767927,16767927,15119869])
Appearance23.setTexture(PixelTexture25)
Shape22.setAppearance(Appearance23)
Box26 = BoxObject().setSize([1000,1000,0.01])
Shape22.setGeometry(Box26)
Transform21.addChild(Shape22)
Scene19.addChild(Transform21)
Viewpoint27 = ViewpointObject().setDescription("View All").setPosition([0,0,20])
Scene19.addChild(Viewpoint27)
Viewpoint28 = ViewpointObject().setDescription("Empty Image").setPosition([0,5,5])
Scene19.addChild(Viewpoint28)
Transform29 = TransformObject().setDEF("EmptyImage").setRotation([1,1,0,1]).setTranslation([0,5,0])
Shape30 = ShapeObject()
Appearance31 = AppearanceObject()
PixelTexture32 = PixelTextureObject()
Appearance31.setTexture(PixelTexture32)
Shape30.setAppearance(Appearance31)
Box33 = BoxObject().setDEF("StandardBox")
Shape30.setGeometry(Box33)
Transform29.addChild(Shape30)
Scene19.addChild(Transform29)
Viewpoint34 = ViewpointObject().setDescription("Black and white PixelTexture").setPosition([-5,0,5])
Scene19.addChild(Viewpoint34)
Transform35 = TransformObject().setDEF("BW").setRotation([1,1,0,1]).setTranslation([-5,0,0])
Shape36 = ShapeObject()
Appearance37 = AppearanceObject()
PixelTexture38 = PixelTextureObject().setImage([1,2,1,255,0])
Appearance37.setTexture(PixelTexture38)
Shape36.setAppearance(Appearance37)
Box39 = BoxObject().setUSE("StandardBox")
Shape36.setGeometry(Box39)
Transform35.addChild(Shape36)
Scene19.addChild(Transform35)
Viewpoint40 = ViewpointObject().setDescription("Black and white with Alpha PixelTexture").setPosition([5,0,5])
Scene19.addChild(Viewpoint40)
Transform41 = TransformObject().setDEF("AlphaBW").setRotation([1,1,0,1]).setTranslation([5,0,0])
Shape42 = ShapeObject()
Appearance43 = AppearanceObject()
PixelTexture44 = PixelTextureObject().setImage([2,1,2,52479,8823])
Appearance43.setTexture(PixelTexture44)
Shape42.setAppearance(Appearance43)
Box45 = BoxObject().setUSE("StandardBox")
Shape42.setGeometry(Box45)
Transform41.addChild(Shape42)
Scene19.addChild(Transform41)
Viewpoint46 = ViewpointObject().setDescription("RGB PixelTexture").setPosition([-5,-5,5])
Scene19.addChild(Viewpoint46)
Transform47 = TransformObject().setDEF("RGB").setRotation([1,1,0,1]).setTranslation([-5,-5,0])
Shape48 = ShapeObject()
Appearance49 = AppearanceObject()
PixelTexture50 = PixelTextureObject().setImage([2,4,3,16711680,65280,0,0,0,0,16777215,16776960])
Appearance49.setTexture(PixelTexture50)
Shape48.setAppearance(Appearance49)
Box51 = BoxObject().setUSE("StandardBox")
Shape48.setGeometry(Box51)
Transform47.addChild(Shape48)
Scene19.addChild(Transform47)
Viewpoint52 = ViewpointObject().setDescription("RGB with Alpha PixelTexture").setPosition([5,-5,5])
Scene19.addChild(Viewpoint52)
Transform53 = TransformObject().setDEF("AlphaRGB").setRotation([1,1,0,1]).setTranslation([5,-5,0])
Shape54 = ShapeObject()
Appearance55 = AppearanceObject()
PixelTexture56 = PixelTextureObject().setImage([3,2,4,4278190335,16711935,65535,4278190207,16711807,65407])
Appearance55.setTexture(PixelTexture56)
Shape54.setAppearance(Appearance55)
Box57 = BoxObject().setUSE("StandardBox")
Shape54.setGeometry(Box57)
Transform53.addChild(Shape54)
Scene19.addChild(Transform53)
X3D0.setScene(Scene19)

X3D0.toFileX3D("Table5_18PixelTexture.new.x3d")
