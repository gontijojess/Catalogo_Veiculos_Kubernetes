FROM openjdk:17-jdk-slim

VOLUME /tmp

COPY target/CatalogoVeiculos-0.0.1-SNAPSHOT.jar catalogo-veiculos.jar

ENTRYPOINT ["java", "-jar", "/catalogo-veiculos.jar"]
