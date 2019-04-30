# Java Platform Module System - Demo Project

### Description

A sample project that demonstrates various features from the Java Platform Module System (JPMS). Some of the demonstrated features are:

* Executing a module that has dependencies on other modules (e.g. Service Provider)
* Forcefully opening a module to another module
* Addition of an automatic module to the module path
* Deriving automatic modules
* Split package problem

The project is written in Java 11 and uses Apache Maven as build and dependency management tool.

### Building the project

There is a single main class that demonstrates some features of the JPMS, such as reflective access to class from other modules, obtaining a service
instance via a service provider, etc. The project doesn't contain any unit tests, as most of the demonstrated features are implemented and documented
in the ``module-info.java`` files.
<br/><br/>
The Maven module ``build`` uses the ``maven-assembly-plugin`` to create a Fat JAR with all dependent modules. The Fat JAR can be generated with the
following command executed at top level:

```
mvn clean package
```

The command above will generate the JAR file ``build-1.0-SNAPSHOT-jar-with-modules.jar`` in the ``target`` directory of the ``build`` module.
