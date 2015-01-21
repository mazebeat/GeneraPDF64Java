@echo off
cls

rem Declare LOG file
set logFile="C:\Users\Maze\Desktop\base64PDF.log"

rem Declare global variables
set JavaDir=C:\Users\Maze\Desktop
set JarName=ArchivoPDF64.jar

rem Declare parameters
set base64=%1
set srcFile=%2

rem Call java
echo Start Create Excel Attachment date: %date%, time: %time% >> %logFile%
echo. >> %logFile%
echo Params: %base64% - %srcFile% >> %logFile%
echo. >> %logFile%
call java -jar "%JavaDir%\%JarName%" %base64% %srcFile% >> %logFile%
echo. >> %logFile%
echo Log file in %logFile% >> %logFile%
echo. >> %logFile%
echo =========================================================== >> %logFile%

pause
exit