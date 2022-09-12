javac -d bin ./src/*
jar -cmf manifest.mf myApplication.jar -C bin .
java -jar myApplication.jar
pause