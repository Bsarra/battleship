#!/bin/bash


rm -rf out
mkdir out
#javac -d out -target 8 src/**/*.java
javac -d out --release 8 $(find -name *.java)