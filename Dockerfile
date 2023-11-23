FROM openjdk:17
EXPOSE 9002
COPY target/spring-docker-2.jar spring-docker-2.jar
ENTRYPOINT ["java","-jar","/spring-docker-2.jar"]