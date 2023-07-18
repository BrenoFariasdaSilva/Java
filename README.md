<div align="center">
  
# Java. <img src="https://github.com/devicons/devicon/blob/master/icons/java/java-original.svg"  width="3%" height="3%">

</div>

<div align="center">
  
---

This repo is made with the objective of showing the Java related codes i have written. \
Feel free to contribute and send suggestions.
  
---

</div>

<p align="center">
  <img src="https://wakatime.com/badge/github/BrenoFariasdaSilva/Java.svg" alt="wakatime" />
</p>

<div align="center">
  
![RepoBeats Statistics](https://repobeats.axiom.co/api/embed/798e367e16b0f48471dc3fcf7a22880eb15631e6.svg "Repobeats analytics image")

</div>

## Installation:
* Zip and Unzip Tools: Zip and Unzip might be some necessary tools to install SDKMAN
	```bash
	# Unzip:
	sudo apt-get install unzip -y

	# Zip:
	sudo apt-get install zip -y
	```

* SDKMAN Tool: SDKMAN is a tool for managing parallel versions of multiple Software Development Kits on most Unix based systems. It provides a convenient Command Line Interface (CLI) and API for installing, switching, removing and listing Candidates.
  
	```bash
	# SDKMAN:
	curl -s "https://get.sdkman.io" | bash
	source "$HOME/.sdkman/bin/sdkman-init.sh"
	sdk version
	```
* Java Language via SDKMAN:
	```bash
	# Java:
	sdk install java
	java -version
	```

## Run Java code:
```bash
# Compile the application using the Java compiler (JVM):
javac ./{ProgramName}.java
# Example: javac ./main.java 

# Run the application.
java ./{ProgramName without extension}
# Example: javac ./main
```

## IDE - IntelliJ IDEA:
Download and install the JetBrains Toolbox App [here](https://www.jetbrains.com/help/idea/installation-guide.html#toolbox) install it via Snap. \
Honestly, i hate to use the Snap version of anything, but it's irrefutable that it's the easiest way to install lots of apps. \
Also, fell free to use any other Text Editor or IDE!
 * A few examples of alternative IDEs: Eclipse, NetBeans, BlueJ, JDeveloper, etc.
 * A few examples of alternative Text Editor: Visual Studio Code, Vim, Atom, Sublime Text, etc.

* Install Snap: 
```bash
# Install Snap Commands:
sudo apt install snapd -y
sudo snap install core -y
```

* Install Intellij Community via Snap: 
```bash
# Intellij Community - Free Version:
sudo snap install intellij-idea-community --classic
```

## Contributing
Code improvement recommendations are very welcome, but keep in mind that many exercises will be very simple, with a lot of room for improvement, after all here is all the history of my learning progress.

## License
[MIT](https://choosealicense.com/licenses/mit/)
