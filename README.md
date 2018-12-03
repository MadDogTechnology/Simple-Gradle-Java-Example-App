# Simple-Gradle-Java-Example-App
**Owner(s):** 

# Repo is archived

Simple Gradle Java Example
==========================


This is an unrealistically simple gradle/java project.  All it does is print `Hello, world!`

It exists to use for experiments with CI, builds, etc.

[SubmoduleA](SubModuleA/README.md)

Build & Test
============

    ./gradlew build

Running the app
===============

The easiest way is to just run it with gradle:

    ./gradlew run


Guidelines
==========

Changes that form a good usage example should be merged into master.

Changes that comprise expirements should be kept on a branch.


Set up in Eclipse
=================


    ./gradlew eclipse

Then use Eclipse to import existing Eclipse project, which should prompt you to import the following projects:
  * simpleGradleJavaProject
  * SubModuleA

