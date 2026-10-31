@echo off
chcp 65001 >nul
if not exist build mkdir build
javac -encoding UTF-8 -d build src\calculadora\Calculadora.java src\calculadora\Main.java test\calculadora\TesteCalculadora.java
if errorlevel 1 (echo ERRO DE COMPILACAO & pause & exit /b 1)
java -cp build calculadora.TesteCalculadora
pause
