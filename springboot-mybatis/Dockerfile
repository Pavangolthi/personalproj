FROM openjdk:8-jdk-alpine
ADD target/mybatis-demo.jar mybatis-demo.jar
EXPOSE 9095
ENTRYPOINT ["java", "-jar", "mybatis-demo.jar"]