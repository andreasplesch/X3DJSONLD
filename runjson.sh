#!/bin/sh


export X3DJSONLD=../X3DJSONLD

cd ${X3DJSONLD}

. ./classpath

export X3DJSONLD=../X3DJSONLD

export PROCESSORS=8

javac RunSaxon.java

ls *.x3d | xargs -P 8 java RunSaxon 2> /dev/null 1> /dev/null
ls *.json| grep -v new | grep -v package | xargs -P $PROCESSORS node.exe json2all.js 1> /dev/null
ls *.x3d | sed 's/\.x3d$/.py/' | xargs ls
