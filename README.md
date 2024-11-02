# HexagonalArchitecture
Arquitetura Hexagonal/Ports and Adapters NA PRÁTICA

Aprenda na prática como aplicar a arquitetura hexagonal em microsserviços utilizando Java, Spring Boot, MongoDB e Kafka

https://www.udemy.com/course/arquitetura-hexagonal-ou-ports-and-adapters-na-pratica/

<h1>Technologies</h1>
<ul>
  <li>Spring Boot 2.7.5</li>
  <li>Java 17</li>
  <li>Gradle</li>
  <li>Docker</li>
  <li>MongoDB</li>
  <li>Kafka</li>
</ul> 

<h1> Start project </h1>

- Run the command ```docker-compose up -d``` in the docker-local folder
- Run wiremock: ```java -jar .\wiremock-standalone-3.9.2.jar --port 8082``` or ```run startServer.sh``` for create fake ApiAddress
- Import Postman Collections on postman folder and use
- Comand lines gradle you can use to run project: Running without tests ```./gradlew build -x test``` and Running with tests: ```./gradlew build``` e Running with spring boot: ```./gradlew bootRun```
- You can use any IDE to import and run this project, but you may encounter issues with creating mappers. I had problems with Eclipse, so I recommend using VS Code or IntelliJ instead.
  
