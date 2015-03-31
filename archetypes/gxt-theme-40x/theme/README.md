#GXT Theme Archetype
Build a GXT project with custom theme. 

##Building
First run `mvn install` on the entire project. 

##Building theme.
Run `mvn install` in theme module to build theme.  

##IDE
This will generate the theme into a target source directory. 
This directory will be included into the IDE's classpath.
SDM will pick up the changes after a theme builder has built the theme.  

###Eclipse
The Eclipse default source classpath path for the generated theme directory will Exclude ** all the files. 
Find the generated directory path by checking the </resources> in the pom.xml
This has to be removed in order to use the Css3 files.    
