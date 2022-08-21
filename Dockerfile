FROM openjdk:18
EXPOSE 8080
ADD target/spring-boot-students.jar spring-boot-students.jar
ENTRYPOINT ["java","-jar","/spring-boot-students.jar"]