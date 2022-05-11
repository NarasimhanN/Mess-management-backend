FROM openjdk:8
ADD target/messManagement-0.0.1-SNAPSHOT.jar ./
EXPOSE 8087
ENTRYPOINT ["java","-jar","messManagement-0.0.1-SNAPSHOT.jar"]

