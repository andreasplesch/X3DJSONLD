from bs4 import BeautifulSoup
import re

class ClassPrinter:
    def __init__(self, node, metaInfo):
        self.node = node
        self.parents = []
        inhers = self.node.find_all("Inheritance")
        for inher in inhers:
            self.parents.append(inher['baseType'])

        addinhers = self.node.find_all("AdditionalInheritance")
        for addinher in addinhers:
            self.parents.append(addinher['baseType'])

        self.componentInfo = self.node.find("componentInfo")
        self.metaInfo = metaInfo

        self.printed = False


    def printClass(self):
        str = ""
        if self.printed:
            return str
        for parent in self.parents:
            try:
                str += classes[parent].printClass()
            except:
                pass
        try:
            package = self.componentInfo['name']
        except:
            package = "fields"
        package = re.sub(r"-", "", package)
        superpackage = "sai"
        if self.metaInfo == "Object":
                superpackage = "jsail"
        try:
            str += self.node['name'] + self.metaInfo + " = Java.type('org.web3d.x3d."+superpackage+"."+package+"." + self.node['name'] + self.metaInfo + "')\n"
        except:
            str += self.node['type'] + self.metaInfo + " = Java.type('org.web3d.x3d."+superpackage+"."+package+"." + self.node['type'] + self.metaInfo + "')\n"
        self.printed = True
        return str

code = ""
code += 'CommentsBlock = Java.type("org.web3d.x3d.jsail.Core.CommentsBlock")\n'

soup = BeautifulSoup(open("X3DObjectModel-3.3.xml"), "xml")

classes = {}

ants = soup.find_all("AbstractNodeType")
for ant in ants:
    classes[ant['name']] = ClassPrinter(ant, "")

aots = soup.find_all("AbstractObjectType")
for aot in aots:
    classes[aot['name']] = ClassPrinter(aot, "")

cns = soup.find_all("ConcreteNode")
for cn in cns:
    classes[cn['name']] = ClassPrinter(cn, "Object")

sts = soup.find_all("Statement")
for st in sts:
    classes[st['name']] = ClassPrinter(st, "Object")

fts = soup.find_all("FieldType")
for ft in fts:
    classes[ft['type']] = ClassPrinter(ft, "Object")

for k,v in classes.items():
    code += v.printClass()

f = open("X3Dautoclass.js", "w")
f.write(code)
f.close()
