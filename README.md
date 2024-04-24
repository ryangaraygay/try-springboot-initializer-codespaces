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

Codespaces comes with JDK11 which is too outdated and not even in the list of spring initializer page (options) above.
To configure your codespaces environment (including which Java version) see https://docs.github.com/en/codespaces/setting-up-your-project-for-codespaces/adding-a-dev-container-configuration/setting-up-your-java-project-for-codespaces.

For this example I will just install manually using sdkman which is already in codespaces. List the available versions, pick the one I need and install
```
sdk list java
sdk install java 22-amzn
java --version
```

Run
```
./mvnw spring-boot:run
```
