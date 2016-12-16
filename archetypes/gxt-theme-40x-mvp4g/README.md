#GXT Basic with with MVP4G Theme
This is a very basic GXT with custom theme and MVP4G Archetype. 

##Maven Archetype Usage

1. Goto directory you want the project.
2. Rename parameter below `com.projectname.project` to a package naming scheme you like.
3. Rename parameter `new-project-name` to a project title you like.
4. Run the mvn archetype generator below.

* This project Project.gwt.xml module name is hard coded and will will not be changed from the parameters below at this time.


### Using nix

```
mvn archetype:generate -DarchetypeGroupId=com.sencha.gxt.archetypes \
-DarchetypeRepository=https://oss.sonatype.org/content/repositories/snapshots \
-DarchetypeArtifactId=gxt-theme-40x-mvp4g-archetype \
-DarchetypeVersion=1.0.0-SNAPSHOT \
-DgroupId=com.projectname.project \
-DartifactId=new-project-name \
-Dmodule=Project
```

### Using Windows

```
mvn archetype:generate -DarchetypeGroupId=com.sencha.gxt.archetypes ^
-DarchetypeRepository=https://oss.sonatype.org/content/repositories/snapshots ^
-DarchetypeArtifactId=gxt-theme-40x-mvp4g-archetype ^
-DarchetypeVersion=1.0.0-SNAPSHOT ^
-DgroupId=com.projectname.project ^
-DartifactId=new-project-name ^
-Dmodule=Project
```
