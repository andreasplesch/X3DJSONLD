#!/bin/sh

# accepts files with .x3d extension

. ./classpath

javac RunSaxon.java
python classes.py

(ls "$@" | grep -v intermediate | grep -v new) | xargs -P $PROCESSORS java RunSaxon
(ls "$@" | grep -v intermediate | grep -v new) | sed 's/\.x3d$/.json/' | xargs -P $PROCESSORS node json2all.js
(ls "$@" | grep -v intermediate | grep -v new) | sed 's/\.x3d$/.java/' | sed 's/\/c\/x3d-code\/www.web3d.org/www_web3d_org/' | xargs -L 1 -P $PROCESSORS javac -J-Xss16m -J-Xmx4096M
(ls "$@" | grep -v intermediate | grep -v new) | sed 's/\.x3d$//' | sed 's/^\.*\///' | sed 's/c\/x3d-code\/www.web3d.org/www_web3d_org/' | xargs -L 1 -P $PROCESSORS java -d64 -Xss16m -Xmx4096M
for NEW in `(ls "$@" | grep -v intermediate | grep -v new) | sed 's/\.x3d$/.new.json/'| sed 's/\/c\/x3d-code\/www.web3d.org/www_web3d_org/'`
do
	JSON=`dirname $NEW | sed 's/www_web3d_org/\/c\/x3d-code\/www.web3d.org/' `/`basename $NEW .new.json`.json
	if [ -n "`node jsondiff.js $JSON $NEW`" ]
	then
		echo ================================================================================
		echo node jsondiff.js $JSON $NEW
		node jsondiff.js $JSON $NEW
	fi
done

(ls "$@" | grep -v intermediate | grep -v new) | sed "s/\.x3d$/.sail.js/" | sed 's/\/c\/x3d-code\/www.web3d.org/www_web3d_org/' | xargs -L 1 -P $PROCESSORS jjs -Dnashorn.args="-classpath ${CLASSPATH}"

for i in `(ls "$@" | grep -v intermediate | grep -v new) | sed 's/\.x3d$/.new.x3d/'| sed 's/\/c\/x3d-code\/www.web3d.org/www_web3d_org/'`
do
	X3D=`dirname $i | sed 's/www_web3d_org/\/c\/x3d-code\/www.web3d.org/' `/`basename $i .new.x3d`.X3d
	if [ -n "`node xmldiff.js $X3D $i`" ]
	then
		echo ================================================================================
		echo node xmldiff.js $X3D $i
		node xmldiff.js $X3D $i
	fi
done
