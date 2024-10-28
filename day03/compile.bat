@echo off
set /p fname =class name:
javac -encoding utf8 -d dist %fname%.java
cd dist
cls
java %fname%
cd ..

