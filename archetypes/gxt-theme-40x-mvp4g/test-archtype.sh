#!/bin/sh
# Test import archetype

mvn clean
mkdir target
mkdir target/test
cd target/test

mvn archetype:generate -DarchetypeGroupId=com.sencha.gxt.archetypes \
-DarchetypeRepository=https://oss.sonatype.org/content/repositories/snapshots \
-DarchetypeArtifactId=gxt-theme-40x-mvp4g-archetype \
-DarchetypeVersion=1.0-SNAPSHOT \
-DgroupId=com.projectname.project \
-DartifactId=new-project-name \
-Dmodule=Project \
-DinteractiveMode=false
