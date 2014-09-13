#!/bin/sh
mvn clean compile
java -cp "./BeanValidationTester-1.0-SNAPSHOT.jar:target/classes" no.nith.pg5100.ClassTester
