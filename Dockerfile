FROM openjdk:8-jdk-alpine
RUN mkdir -p /usr/local/redenvelopes
ADD ./target/red-envelopes-0.0.1-SNAPSHOT.jar /usr/local/redenvelopes/red-envelopes-mysql.jar
EXPOSE 8090
CMD ["java", "-jar", "/usr/local/redenvelopesmysql/red-envelopes-mysql.jar", "--server.port=8090"]