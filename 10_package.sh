#!/bin/sh
cd out && jar --create --file bn.jar -e bn.Main $(find . -name *.class)


#set -x
#cd out; jar -cf bn.jar -e bn.Main $(find . -name *.class)