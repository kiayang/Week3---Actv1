# Week3-Activity 1 - Activity 1: First Custom Tag Lib
Using the Custom Tag references in the syllabus and the following instructions create your first custom tag library. 

1. ***Do the following 3 steps to create the custom tag (this is in the taglib directory /project above)***
   1. ***Create a first hello world custom tag handler.***
   2. ***Write the TLD.*** (xml)
   3. ***Package the tag and tld into a jar.*** (using MAVEN)
2. ***Now write a simple 'hello world' web application (this is in the tagtest directory/project above) to test the custom tag***
   1. ***Test the tag in a simple test application.***



***Create the hello world custom tag handler.***

1. Create a new plain old java project. You can use the maven archetype: "**maven-archetype-quickstart**" which will package your code into a jar.
2. Notice that the pom.xml's packaging type is **jar**.
3. Add the jUnit 5 dependencies. You can find these in your week 2 exercise.
4. Notice the src and test directories have been created for you along with some starter classes(i.e.. app/apptest classes). You can delete those starter classes as we do not need them.
5. Create a new class to hold the java code for the HelloWorldTag. Make sure the class extends SimpleTagSupport.
6. Notice that we need some of the javax.servlet packages. Add the appropriate dependency to your pom.xml to provide these packages. HINT: we've been using this dependency in almost every other exercise/activity this semester.
7. Override the doTag() method with your own code.
   1. Did you know the Generate... dialog can do some of this work for you? Right click inside your class and choose Generate...
      generate dialog
   2. Next choose to generate Override Methods...
      generate override
   3. Finally, select the method/s to override. The doTag() method in this case.
      overriding
   4. Add code to the doTag() to print out a message. Your project should look something like this: tag code

***Write the Tag Lib Descriptor (TLD).***

1. Create a resources directory and mark it as resources.
2. Add a META-INF directory inside resources.
3. Add a new .tld file to META-INF. For example, custom.tld.
4. Add the tag configuration details to the tld file.

Your project should look something like this:

​	***tld

***Package the tag class and META-INF directory into a jar.***

1. Run the Maven install task to build the jar.

​	***jar

***Create a simple web application to test the tag.***

1. Create a new Web project.

2. Add the custom tag jar to your project. You can do this with a maven dependency! Use the groupId and artifactId from the pom.xml used in the Hello World Tag project above.

   ​	Grab the group id and artifact id from your Hello World Tag Project pom.xml:

   ​		***hello world tag pom.xml

   ​	And add that group id and artifact id into a dependency tag in your Web Application pom.xml.

   ​		***hello world tag pom.xml

3. Create a jsp to test out the new tag.

   ​		***web app using tag

4. Build and deploy the application. Here's an example of the tag working:

   ​		***web app using tag
