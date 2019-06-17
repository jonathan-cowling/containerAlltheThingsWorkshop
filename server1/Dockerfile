FROM openjdk:8-jre
RUN useradd --create-home --shell /bin/bash app
USER app
WORKDIR /app
COPY *.jar /app/main.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "/app/main.jar" ]