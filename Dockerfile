FROM eclipse-temurin:17-jdk-focal
EXPOSE 2008
ADD target/crudoperations-cicd.jar crudoperations-cicd.jar
ENTRYPOINT ["java","-jar","/crudoperations-cicd.jar"]