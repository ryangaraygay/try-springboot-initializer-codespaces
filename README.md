# try-springboot-initializer-codespaces
Want a springboot project without desktop IDE and instead use codespaces

goto https://start.spring.io/ to configure your starting template for springboot

or $ curl https://start.spring.io/starter.zip 
    -d dependencies=web -d bootVersion=3.2.5 
    -d baseDir=my-spring-boot-app -o my-spring-boot-app.zip

I needed to run 
```
mvn -N io.takari:maven:wrapper
```
