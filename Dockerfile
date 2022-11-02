FROM openjdk:17-ea-11-jdk-slim
VOLUME /tmp
RUN mkdir keystore
RUN cp /home/ec2-user/keystore/config-encryption-key.jks keystore/config-encryption-key.jks
COPY build/libs/config-service-1.0.jar config-service.jar
ENTRYPOINT ["java", "-jar", "config-service.jar"]