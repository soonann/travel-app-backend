# Travel App Backend
## A Dockerised API Server built in Spring Boot MVC and AWS Cognito API


## Introduction
This application is a backend service built for the <a href="https://github.com/AustenLeow/travel-app">Travel App</a>, some of the technologies/frameworks used in this project are: 
* Spring Boot MVC
* Postgresql
* AWS Cognito API
* Docker
* Docker Compose 

## System Design

#### Solution Architecture
<img src="" />

#### Database Entity Relation Diagram
<img src="" />


## Installation

To install and run this project, you will need the following tools:
1. <a href="https://code.visualstudio.com/">VSCode</a>
2. VSCode Extensions:
  a. <a href="https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack">Extension Pack for Java</a>
  b. <a href="https://marketplace.visualstudio.com/items?itemName=redhat.java">Language Support for Java(TM) by Red Hat</a>
3. <a href="https://www.oracle.com/java/technologies/downloads/#java17">Java 17</a> 

After you have installed all of them, open up your command line of choice and type in the following commands to check if they have been installed properly.

```bash
$ java --version
openjdk 17.0.3 2022-04-19

# optional as VSCode might not necessarily need to be added to PATH
$ code --version 
1.68.1
```

You will also have to clone the source code from this repository if you have not done so already
```bash
# alternatively, you can also download the project as a zip file
$ git clone https://github.com/soonann/travel-app-backend.git
```






## Starting the Server

```

```


## Installation w/ Docker (Optional)
The project has also been dockerise, this means you can either pull the image from our repository or build it from the docker compose file's specifications.

To be able to run this project with docker, you need to install docker:
- <a href="https://www.docker.com/products/docker-desktop/">Docker Desktop</a>

Open up your command line of choice and type in the follow commands to check if docker has been installed properly:

```bash
$ docker --version 
Docker version 20.10.16
```


## Troubleshooting

If you get one of the following errors (depening on your terminal) while running any of the commands, you might need to add one or more of the tools installed above to PATH: 

```bash
# cmd - windows
<command> is not recognized as an internal or external command, operable program or batch file.

# mac - zsh
zsh: command not found: <command>

# bash - linux
bash: <command>:command not found
```

## Coffee > Food ☕
If this project has helped you in anyway, feel free to buy me a coffee!

<a href='https://ko-fi.com/soonann' target='_blank'><img height='35' style='border:0px;height:46px;' src='https://az743702.vo.msecnd.net/cdn/kofi3.png?v=0' border='0' alt='Buy Me a Kopi O at ko-fi.com' />