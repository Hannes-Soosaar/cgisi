-setup project setup in IntelliJ from source on a new machine (4h figuring out how to get the project running)

-Opening a project from source in IntelliJ make sure that the project opens has no source folders marked if the project was meant to run as a single project.<br>
    commands that were used with no effect. 
1) ./gradlew.bat build
2) ./gradlew clean
3) ./gradlew clean build --refresh-dependencies
4) ./gradlew --stop
   - Include *.jar files in GitHub when the project is ready to be shared.

- Docker installation and setup ( approx. 30h )
  - took way longer than I anticipated, and What I was hoping to achieve remained out of reach ( development within a docker container)
  - the concept of coping file to and from a docker container is rather straight forward, but can become quite difficult
  - lots of hard work in terms of standard configurations has been done by the communities 
  - docker compose is awesome! 
  - 
-PostgresSql (approx. 5h excluding getting an instance running on Docker.)
  - pgAdmin tool is quite handy for troubleshooting.
  -  https://dbdiagram.io/ was invaluable in getting the schema up and running 
  - SQL scripts to initialize the DB takes a rather long time.
  - When you initialize a DB with demo data  it is better to build all tables and after add dependencies.(1h)
-Spring Boot backend ( 4h and counting)
  - I should have stayed with the  DDD  (Domain-Driven Design)architecture type I had done a project with, might have been easier.
  - The MVC (Model View Controller) architecture is rather straight forward and makes sense, but I can see how large project can become complex 
  - 
-Setting up the FE for API (4h and counting )
  - an API request requires that a CORS is enabled.By default, CORS is not enabled in the vite server. the following must be added to the vite.config.js file under the server: section to enable CORS globally
  -