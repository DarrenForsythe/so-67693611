#!/bin/sh
mvn install -DskipTests=true \
&& java -jar target/so-67693611-0.0.1-SNAPSHOT.jar \
&& open http://localhost:9004/testing
