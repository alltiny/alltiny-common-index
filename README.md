alltiny's common-index is a Java module providing an index utility class.

## How to build?
alltiny-common-index uses [gradle] for building. To compile and publish to your local maven repository use:
```sh
cd alltiny-common-index
gradle publishToMavenLocal
```
the built module can be retrieved via:
```sh
<groupId>org.alltiny</groupId>
<artifactId>common-index</artifactId>
<version>1.0.0</version>
```

## How to set up my development environment?
Depending on whether you use IntelliJ IDEA or Eclipse, [gradle] can create the project files for you:
* for IntelliJ IDEA
```sh
cd alltiny-common-index
gradle idea
```

* for Eclipse
```sh
cd alltiny-common-index
gradle eclipse
```

---
[gradle]:http://www.gradle.org - An open source building tool, much like maven, but rather more flexible.