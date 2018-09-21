# Week3-Activity 1 - Activity 1: First Custom Tag Lib
Using the Custom Tag references in the syllabus and the following instructions create your first custom tag library. The four major steps are:

Create a first hello world custom tag handler.
Write the TLD.
Package the tag and tld into a jar.
Test the tag in a simple test application.
Create the hello world custom tag handler.
Create a new plain old java project. You can use the maven archetype: "maven-archetype-quickstart" which will package your code into a jar.

maven-archetype-quickstart

Notice that the pom.xml's packaging type is jar.

maven-archetype-quickstart

Add the jUnit 5 dependencies. You can find these in your week 2 exercise.

Notice the src and test directories have been created for you along with some starter classes. You can delete those starter classes as we do not need them.

Create a new class to hold the java code for the HelloWorldTag. Make sure the class extends SimpleTagSupport.

Notice that we need some of the javax.servlet packages. Add the appropriate dependency to your pom.xml to provide these packages. HINT: we've been using this dependency in almost every other exercise/activity this semester.

Override the doTag() method with your own code.

Did you know the Generate... dialog can do some of this work for you? Right click inside your class and choose Generate...
generate dialog

Next choose to generate Override Methods...
generate override

Finally, select the method/s to override. The doTag() method in this case.
overriding

Add code to the doTag() to print out a message. Your project should look something like this: tag code

Write the Tag Lib Descriptor (TLD).
Create a resources directory and mark it as resources.
Add a META-INF directory inside resources.
Add a new .tld file to META-INF. For example, custom.tld.
Add the tag configuration details to the tld file.
Your project should look something like this:

tld

Package the tag class and META-INF directory into a jar.
Run the Maven install task to build the jar.

jar

Create a simple web application to test the tag.
Create a new Web project.

Add the custom tag jar to your project. You can do this with a maven dependency! Use the groupId and artifactId from the pom.xml used in the Hello World Tag project above.

Grab the group id and artifact id from your Hello World Tag Project pom.xml:

hello world tag pom.xml

And add that group id and artifact id into a dependency tag in your Web Application pom.xml.

hello world tag pom.xml

Create a jsp to test out the new tag.

web app using tag

Build and deploy the application. Here's an example of the tag working:

web app using tag
Activity 1: First Custom Tag Lib
Using the Custom Tag references in the syllabus and the following instructions create your first custom tag library. The four major steps are:

Create a first hello world custom tag handler.
Write the TLD.
Package the tag and tld into a jar.
Test the tag in a simple test application.
Create the hello world custom tag handler.
Create a new plain old java project. You can use the maven archetype: "maven-archetype-quickstart" which will package your code into a jar.

maven-archetype-quickstart

Notice that the pom.xml's packaging type is jar.

maven-archetype-quickstart

Add the jUnit 5 dependencies. You can find these in your week 2 exercise.

Notice the src and test directories have been created for you along with some starter classes. You can delete those starter classes as we do not need them.

Create a new class to hold the java code for the HelloWorldTag. Make sure the class extends SimpleTagSupport.

Notice that we need some of the javax.servlet packages. Add the appropriate dependency to your pom.xml to provide these packages. HINT: we've been using this dependency in almost every other exercise/activity this semester.

Override the doTag() method with your own code.

Did you know the Generate... dialog can do some of this work for you? Right click inside your class and choose Generate...
generate dialog

Next choose to generate Override Methods...
generate override

Finally, select the method/s to override. The doTag() method in this case.
overriding

Add code to the doTag() to print out a message. Your project should look something like this: tag code

Write the Tag Lib Descriptor (TLD).
Create a resources directory and mark it as resources.
Add a META-INF directory inside resources.
Add a new .tld file to META-INF. For example, custom.tld.
Add the tag configuration details to the tld file.
Your project should look something like this:

tld

Package the tag class and META-INF directory into a jar.
Run the Maven install task to build the jar.

jar

Create a simple web application to test the tag.
Create a new Web project.

Add the custom tag jar to your project. You can do this with a maven dependency! Use the groupId and artifactId from the pom.xml used in the Hello World Tag project above.

Grab the group id and artifact id from your Hello World Tag Project pom.xml:

hello world tag pom.xml

And add that group id and artifact id into a dependency tag in your Web Application pom.xml.

hello world tag pom.xml

Create a jsp to test out the new tag.

web app using tag

Build and deploy the application. Here's an example of the tag working:

web app using tag
