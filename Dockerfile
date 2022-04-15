FROM openjdk:8
COPY ./target/CalculatorDevOpsSPE-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "CalculatorDevOpsSPE-1.0-SNAPSHOT-jar-with-dependencies.jar"]