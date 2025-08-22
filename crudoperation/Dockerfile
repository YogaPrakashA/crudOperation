FROM openjdk:20-ea-1-jdk-slim
WORKDIR /app
COPY target/crudOperation.jar crudOperation.jar
EXPOSE 8090
CMD [ "java", "-jar","crudOperation.jar" ]