FROM hub.c.163.com/library/java:8-jre
ADD target/*.jar app.jar
EXPOSE 9002
ENTRYPOINT ["java","-jar","app.jar"]