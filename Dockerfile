FROM eclipse-temurin
LABEL maintainer="javaking@gmail.com"

WORKDIR /app

COPY target/docker-0.0.1-SNAPSHOT.jar    /app/docker-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","docker-0.0.1-SNAPSHOT.jar"]