@echo off
setlocal
cd /d "%~dp0"
gradlew.bat -PskipHandbook=1
gradlew.bat jar -PskipHandbook=1
endlocal
exit /b 0
