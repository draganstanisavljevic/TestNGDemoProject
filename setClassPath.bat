set ProjectPath=D:\myDemoProjects\testNG
echo %ProjectPath%
set classpath=%ProjectPath%\bin;%ProjectPath%\Lib\*
echo %classpath%
javac src/TestNGSimpleTest.java -d bin 
java org.testng.TestNG %ProjectPath%\testng.xml
