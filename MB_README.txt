Changing the JDK of a project:

CMD+; (Project Settings)

Modules
Select the project you wish to change in the center panel.
Select an appropriate JDK in the right panel under Module SDK: 
	(use the pull down menue)

Click Apply/OK


Run Configuration
-----------------
Run
Edit Configurations
+
JAR Application
 Name:02_02.jar
	Working dir: /Users/marco/IdeaProjects.colab/SeleniumEssentialTraining/src/SeleniumEssentialTraining
	JRE: 15
	Path to jar: /Users/marco/IdeaProjects/01_04/out/artifacts/01_04_jar/01_04.jar
	Before launch
	Build '01_04.jar' artifact
Application
 Name: KeyboardAndMouseInput
  Build and run
		Modify Options
	java 15 - com.example.KeyboardAndMouseInput
	working directory /Users/marco/idaProjects.colab/SeleniumEssentialTraining/src/SeleniumEssentialTraining/Ex_Files_Selenium_EssT/Exercise Files/02_02	
	/Users/marco/IdeaProjects.colab/SeleniumEssentialTraining/src/SeleniumEssentialTraining
	packages and classes to inclode in vocerage data
	[x]com.example/KeyboardAndMouseInput


Change SystemSetProperty to find the chromedriver here:
/Users/marco/IdeaProjects.colab/01_04_20210210/src/chromedriver

Top Menu, Build, Recompile TstSample.java

Build Project

Run TestSample.main()

'public class <class>' should have a the first line in the file stating with
package dir1.dir2.dir2.<class>
Problem, the package dirs can not start with a number or contain a ' '.
An '_' is ok.
This could have been avoided by renaming the directories in the zip file.

Do this last. First resolve the openqa problem. 
Changes made for 01_04 are in
/Users/marco/IdeaProjects/01_04/src/com/example/testsample

JUnit
-----

https://junit.org/junit5/

Click on Code & Issues (GitHub
https://github.com/junit-team/junit5/
https://github.com/junit-team/junit5/README.md

User Guide
https://junit.org/junit5/docs/current/user-guide/#overview-getting-started
https://junit.org/junit5/docs/current/user-guide/#dependency-metadata
https://search.maven.org/
	Remember an artifact is a *.jar file
search for junit
The newest should be on top. Click the download button
	junit-4.13.2.jar

Move the .jar file to selenoum-jar inside the 
SeleniumEssentialTraining IntelliJ IDEA project.

Before everything goes haywire, update the github repository.
Add, Commit, Push. 






