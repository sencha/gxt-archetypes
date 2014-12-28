#GXT Basic with Integration Testing
This is a very basic GXT with integration testing Archetype. 

##Maven Archetype Usage

1. Goto directory you want the project.
2. Rename parameter below `com.projectname.project` to a package naming scheme you like.
3. Rename parameter `new-project-name` to a project title you like.
4. Run the mvn archetype generator below.

* This project Project.gwt.xml module name is hard coded and will will not be changed from the parameters below at this time.

```
mvn archetype:generate \
-DarchetypeRepository=https://oss.sonatype.org/content/repositories/snapshots \
-DarchetypeGroupId=com.sencha.gxt.archetypes \
-DarchetypeArtifactId=gxt-testing-31x-archetype \
-DarchetypeVersion=1.0.0-SNAPSHOT \
-DgroupId=com.projectname.project \
-DartifactId=new-project-name \
-Dmodule=Project
```
