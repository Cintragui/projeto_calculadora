@echo off
chcp 65001 >nul
javadoc -encoding UTF-8 -charset UTF-8 -docencoding UTF-8 -d docs src\calculadora\Calculadora.java src\calculadora\Main.java
if errorlevel 1 (echo ERRO AO GERAR JAVADOC & pause & exit /b 1)
echo Documentacao gerada em docs\index.html
pause
