#!/bin/sh
cd out && jar --create --file bn.jar -e bn.Main $(find . -name *.class)