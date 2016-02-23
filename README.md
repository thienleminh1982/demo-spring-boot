# *demo-spring-boot*

## Description
**demo-spring-boot** is a Spring Boot web application (stand-alone JAR file)
This is a sample [hello world](http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#howto-create-a-deployable-war-file)

Build in local: 
	mvn clean package

Run in local: 
	mvn spring-boot:run
	
Submitted by: **Minh-Thien Le**

Time spent: **** hours spent in total

URL: **(http://lmt-demo-spring-boot.cfapps.io/)**

## User Stories

The following **required** functionality is complete:

The following **additional** features are implemented:

## Video Walkthrough

Here's a walkthrough of implemented user stories:

![Video Walkthrough]

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Notes
* mvn dependency:tree to see the dependency tree
* Deploy to PWS: OK
* Deploy to Heroku: OK . 
======================================================================================
## Deployment details
### PWS
Add the deploy manifest file: **manifest.yml**	
Deploy to Pivotal Webservices. 
[Instruction](http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#cloud-deployment)
	cf login
	cf push lmt-demo-spring-boot -p target/demo-0.0.1-SNAPSHOT.jar

### Heroku
Add the deploy manifest file: **Procfile**		
[Instruction](https://devcenter.heroku.com/articles/deploying-spring-boot-apps-to-heroku)	
	
	
## License

    Copyright 2015 Minh-Thien Le

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
