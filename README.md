# AppGameKit For Java & Kotlin
Now you can utilize the power of App Game Kit with the flexibility of Java or Kotlin.  Java/Kotlin offer the perfect alternative to Tier 1 due to the simple yet very powerful and versatile syntax.

Here a just a few of the **Benefits**
	**Object Oriented Programming**
		Java & Kotlin are built around OOP using modern and well known concepts such as Classes, Interfaces, Inheritance, etc. These allow for clean, elegant, and organized code that is both reusable and extensible
	**Vast Libraries**
		Java & Kotlin have a wide range of both 1st party and 3rd party libraries that can add lots of functionality from basic Data Structures (Queues, Linked Lists, HashMaps, etc) all the way to libraries for Gesture Recognition, Digital Signal Processing, etc.
	**User Interface**
		Want to make a desktop tool in AGK? Kotlin & Java have plenty of different libraries for UI like JavaFX, AWT, or Java Swing which will work alongside AGK.

## Supported Platforms
Windows
Linux

## Future Platforms
Mac OSX
Android

## Getting Started
To use AGK for Java or Kotlin you will need the following:
		**Java Development Kit**
			The latest version of the JDK can be downloaded here: http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
		**Your Favorite Java IDE**
			Java & Kotlin have tons of Integrated Development Environment (IDEs) avaliable and you can use whichever one you want
			
			Below are two recommendations
				Netbeans (Simple and full-featured Java IDE): https://netbeans.org/downloads/

				Intellij (Best for Kotlin, works for Java too): https://www.jetbrains.com/idea/download/

Once you have downloaded and installed the JDK and your IDE of choice you can download the ZIP file attached to this post. The ZIP file contains mainly 3 things: 
AGK for Java Examples 
AGK for Java Template
AGK for Kotlin Template


## Using The Templates
Once you have unzipped the provided ZIP file, there will be two folders: NetBeansProjects and IntelliJ projects (If you are using a different Java IDE then converting the templates should be simple). Each of these folders contain a "JavaTemplate" (the IntelliJ folder also includes "KotlinTemplate").

Open the JavaTemplate in either NetBeans or IntelliJ. Inside of the "src/main" folder you will find "AGKMain.java" This is where your code will go (ignore the "com/thegamecreators/agk" folder).

You should see the following methods:

**public void begin()** 

This is where all the code to setup your app should go. Things like Loading images, creating sprites, sounds, resolution, etc

**public void loop() **

This is your main loop. Every frame, AGK Java will call this loop() method and execute the code inside of it (which is why the template has AGKLib.Sync() in here).

**public void complete()**

This will be called when the application has been asked to close (user clicks the X on the window or maybe the OS asks the application to close). This is where you should cleanup all of your resources.

## How to Call AGK Functions
Calling AGK functions is simple take any AGK Function and prepend "AGKLib." to the front. For example *AGKLib.CreateSprite(5)* or *AGKLib.LoadImage("Test.png")* or *AGKLib.CreateSprite(AGKLib.LoadImage(AGKLib.toAGKPath("Test.png")))*  the only thing to note is that the case of the AGK function does matter and must match the casing in the AGK Documentation (https://www.appgamekit.com/documentation/search.html). Trying something like AGKLib.**createsprite** will not work.

The only caveat is when loading a resource file such as an image, sound, etc. You must call *AGKLib.toAGKPath("myFile.png")* first to convert the file path to one that will work with AGK. For example:

*AGKLib.LoadImage(AGKLib.toAGKPath("Test.png"))*

or 

*AGKLib.LoadSound(AGKLib.toAGKPath("chirp.wav"))*
 

## Testing the Template

Inside of the "loop()" method if you add: *AGKLib.Print("Hello World")* then go to the top of your IDE and hit "Run > Run Project" the project should run and you should see your "Hello World" message on the screen along with the "Screen FPS"
