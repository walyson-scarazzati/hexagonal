# HexagonalArchitecture
Course: Arquitetura Hexagonal/Ports and Adapters NA PRÁTICA  https://www.udemy.com/course/arquitetura-hexagonal-ou-ports-and-adapters-na-pratica/

Course: Learn hands-on how to apply hexagonal architecture in microservices using Java, Spring Boot, MongoDB, and Kafka.

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
- Command lines gradle you can use to run project: Running without tests ```./gradlew build -x test``` and Running with tests: ```./gradlew build``` e Running with spring boot: ```./gradlew bootRun```
- You can use any IDE to import and run this project, but you may encounter issues with creating mappers. I had problems with Eclipse, so I recommend using VS Code or IntelliJ instead you running project.
![image](https://github.com/user-attachments/assets/9619f7d3-e925-4da0-8ac5-3837c13bb818)
- Using IDE Intellij you can use plugin kafkalytic for simulate Kafka:
<img src="https://github.com/user-attachments/assets/82721fdc-5041-4394-a243-92494b886776" width="500" height="400" />

- Add this configuration for Kafka:
<img src="https://github.com/user-attachments/assets/45722d53-39fe-4a77-a9b1-0a9102b174fe" width="500" height="400" />

- MongoDB Compass configuration:
<img src="https://github.com/user-attachments/assets/0a1df7f2-0cfc-484c-90a5-07d8fd43e9c0" width="500" height="400" />



