@echo off
cls
echo Running ur code ...
set CLASSPATH=%CLASSPATH%;bld
java -Dto.log=true org.lotus.Launch
pause
