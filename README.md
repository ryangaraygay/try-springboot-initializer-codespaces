# try-springboot-initializer-codespaces
I wanted a springboot project without desktop IDE and instead just use codespaces.

Here's one way I found to do it.

Get spring initialization template/files
1) goto https://start.spring.io/ to configure your starting template for springboot
2) or $ curl https://start.spring.io/starter.zip 
    -d dependencies=web -d bootVersion=3.2.5 
    -d baseDir=my-spring-boot-app -o my-spring-boot-app.zip

Run
```
./mvnw spring-boot:run
```

Got some error and I needed to run 
```
mvn -N io.takari:maven:wrapper
```

Then running again. Got some error because JDK version in environment and project does not match.
At this day and age, errors are still cryptic. You can figure it out by (1) you've seen it before or at least familiar (2) you recognize that 22 when you were picking the settings in the sprint initializer (3) as ChatGPT or CoPilot what that might be
```
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.11.0:compile (default-compile) on project springboot-demo: Fatal error compiling: error: release version 22 not supported -> [Help 1]
```

So, codespaces comes with JDK11 which is too outdated it's not even in the list of spring initializer page (options) above.
To configure your codespaces environment (including which Java version) see https://docs.github.com/en/codespaces/setting-up-your-project-for-codespaces/adding-a-dev-container-configuration/setting-up-your-java-project-for-codespaces.
I just wanted to quickly see how I could get started with spring projects without a desktop IDE and just codespaces. So I wouldn't do that (TL;DR)
For this example I will just install manually using sdkman which luckily is already in codespaces.
List the available versions, pick the one I need and install
```
sdk list java
sdk install java 22-amzn
java --version
```

Run
```
./mvnw spring-boot:run
```

Finally... It has nothing in it but at least it ran.
