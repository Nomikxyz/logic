# How to run Logic programs

First ensure that you have both the JRE (Java Runtime Environment) and the SBT (Scala Build Tool) installed. Instructions on installation can be found at your OS website. 

Logic is not compatible with versions of SBT newer than 0.13x. This is due to support issues with the authors of some of the plugins used while generating jar files. It should not be an issue for simply running programs. 

If you already configured the bash aliases, great! Running a Logic program is as simple as this. 

    logic hello.logic hello

It's important to put the filename and the filename without the extension. (If you're familiar with Java/Scala, it's because we're using a .jar)

When writing in Logic, avoid using variable names that are also the names of functions. This will invariably cause problems. 

If you want to fork/change Logic, find the LogicParser.scala file. All syntax definitions are found there. Then run sbt compile && sbt assembly in the root directory to generate a new jar file. 
