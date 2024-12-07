FROM eclipse-temurin:17-jdk
ENV JAVA_OPTS ""
RUN addgroup spring
RUN useradd -g spring spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /opt/app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar /opt/app.jar