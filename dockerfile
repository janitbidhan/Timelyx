FROM openjdk

COPY backend.jar .

EXPOSE 8080

CMD ["java", "-jar", "backend.jar"]