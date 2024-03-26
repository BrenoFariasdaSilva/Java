<div align="center">
  
# [Java.](https://github.com/BrenoFariasdaSilva/Java) <img src="https://github.com/devicons/devicon/blob/master/icons/java/java-original.svg"  width="3%" height="3%">

</div>

<div align="center">
  
---

This repo is made with the objective of showing the Java related codes i have written. \
Feel free to contribute and send suggestions.
  
---

</div>

<div align="center">

![GitHub Code Size in Bytes](https://img.shields.io/github/languages/code-size/BrenoFariasdaSilva/Java)
![GitHub Last Commit](https://img.shields.io/github/last-commit/BrenoFariasdaSilva/Java)
![GitHub](https://img.shields.io/github/license/BrenoFariasdaSilva/Java)
![wakatime](https://wakatime.com/badge/github/BrenoFariasdaSilva/Java.svg)

</div>

<div align="center">
  
![RepoBeats Statistics](https://repobeats.axiom.co/api/embed/798e367e16b0f48471dc3fcf7a22880eb15631e6.svg "Repobeats analytics image")

</div>

## Table of Contents
- [Java. ](#java-)
	- [Table of Contents](#table-of-contents)
	- [Installation:](#installation)
	- [Run Java code:](#run-java-code)
	- [IDE - IntelliJ IDEA:](#ide---intellij-idea)
	- [Contributing](#contributing)
	- [License](#license)


## Installation:
* Zip and Unzip Tools: Zip and Unzip might be some necessary tools to install SDKMAN
	```bash
	# Unzip:
	sudo apt install unzip -y

	# Zip:
	sudo apt install zip -y
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

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**. If you have suggestions for improving the code, your insights will be highly welcome.
In order to contribute to this project, please follow the guidelines below or read the [CONTRIBUTING.md](CONTRIBUTING.md) file for more details on how to contribute to this project, as it contains information about the commit standards and the entire pull request process.
Please follow these guidelines to make your contributions smooth and effective:

1. **Set Up Your Environment**: Ensure you've followed the setup instructions in the [Setup](#setup) section to prepare your development environment.

2. **Make Your Changes**:
   - **Create a Branch**: `git checkout -b feature/YourFeatureName`
   - **Implement Your Changes**: Make sure to test your changes thoroughly.
   - **Commit Your Changes**: Use clear commit messages, for example:
     - For new features: `git commit -m "FEAT: Add some AmazingFeature"`
     - For bug fixes: `git commit -m "FIX: Resolve Issue #123"`
     - For documentation: `git commit -m "DOCS: Update README with new instructions"`
     - For refactors: `git commit -m "REFACTOR: Enhance component for better aspect"`
     - For snapshots: `git commit -m "SNAPSHOT: Temporary commit to save the current state for later reference"`
   - See more about crafting commit messages in the [CONTRIBUTING.md](CONTRIBUTING.md) file.

3. **Submit Your Contribution**:
   - **Push Your Changes**: `git push origin feature/YourFeatureName`
   - **Open a Pull Request (PR)**: Navigate to the repository on GitHub and open a PR with a detailed description of your changes.

4. **Stay Engaged**: Respond to any feedback from the project maintainers and make necessary adjustments to your PR.

5. **Celebrate**: Once your PR is merged, celebrate your contribution to the project!

## License
[MIT](https://choosealicense.com/licenses/mit/)
