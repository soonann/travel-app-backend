# Travel App Backend
A Dockerised Spring Boot MVC API Server with AWS Cognito API


## Overview
This application is a backend service built for the <a href="https://github.com/AustenLeow/travel-app">Travel App</a>, some of the technologies/frameworks used in this project are: 
* Spring Boot MVC
* Postgresql
* AWS Cognito API
* Docker
* Docker Compose 


## System Design

### Solution Architecture
<img src="" />

### Database Entity Relation Diagram
<img src="https://cloud.potatovault.com/s/travel-app-erd/preview" />


## Installation
Take note that the <a href="https://github.com/soonann/travel-app-backend">main</a> branch is an installation of the local version of the project, where the database resides locally in your development environment as a docker container.

Furthermore, the main branch does not have the AWS Cognito API implemented, this is to facilitate faster testing of the endpoints locally.

To see a version with the AWS Cognito API implemented, you can refer to the <a href="https://github.com/soonann/travel-app-backend/tree/production">production</a> branch. 

### Prerequisites
To be able to run this project, you will need to install:
- <a href="https://www.docker.com/products/docker-desktop/">Docker Desktop</a>


After installing, open up your command line of choice and type in the follow commands to check if docker has been installed properly:
```bash
$ docker --version 
Docker version 20.10.16
```
If you encounter any issues, you can refer to the <a href="#troubleshooting">Troubleshooting</a> Section
### Configurations
Before you are able to start the project, you will need to rename the `docker-compose-local-example.env` file to `docker-compose-local.env` and fill up the variables.

Take note that the environment file's values will determine the naming of the database and connection credentials.


```bash
# docker-compose-local.env
DATABASE_HOST=heap-travel-app-db
DATABASE_SCHEMA=public
DATABASE_PORT=5432
POSTGRES_DB=travel-app-db
POSTGRES_USER=travel-app-user
POSTGRES_PASSWORD=travel-app-password
```

## Usage
To start the project:
```bash
# change working directory to project folder
$ cd travel-app-backend
# start project with docker compose
$ docker compose up
```

To stop the project:
```bash
# <Ctrl + C> to exit the running project
$ docker compose down 
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

## Roadmap

- [x] Implement Data JPA Models
- [x] Create Controller, Service & Repository Layers
- [ ] Implement robust validation
- [x] Integration with AWS RDS
- [x] Integration with AWS Cognito API
- [x] Dockerise the Application
- [x] Deployment to AWS ECS
- [x] Configuration of GH Actions for CI/CD to AWS ECS


Further development for this project has stopped as it has outran its purpose. Feel free to clone/fork the project and build ontop of it as your own.

## Contributors
* <a href='https://github.com/soonann'>Soon Ann</a>
* <a href='https://github.com/yaolongt'>Yao Long</a>

## Contact 
If you encounter any issues, feel free to raise an <a href="https://github.com/soonann/travel-app-backend/issues">issue</a> or email me at <a href="mailto:soonann.dev@gmail.com">soonann.dev@gmail.com</a>

## Coffee > Food ☕
If this project has helped you in anyway, feel free to buy me a coffee!

<a href='https://ko-fi.com/soonann' target='_blank'><img height='40' style='border:0px;' src='https://az743702.vo.msecnd.net/cdn/kofi3.png?v=0' border='0' alt='Buy Me a Kopi O at ko-fi.com' />
