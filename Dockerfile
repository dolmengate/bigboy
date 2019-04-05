# image base
FROM openjdk:8 
ARG JAR_FILE
# only envvars are saved in the image, not build args
ENV THE_JAR=$JAR_FILE
WORKDIR /app
COPY target/$JAR_FILE /app
EXPOSE 8080
CMD java -jar $THE_JAR
