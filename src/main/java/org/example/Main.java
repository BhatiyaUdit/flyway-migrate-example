package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // org.flywaydb:flyway-maven-plugin:8.0.0:migrate -Dflyway.configFiles=flywayConfig.conf -f pom.xml
    // mvn flyway:migrate   -Dflyway.user=$(flyway.username)
    //                      -Dflyway.password=$(flyway.password)
    //                      -Dflyway.url=$(flyway.url)
    //                      -Dflyway.schemas=$(flyway.schema)
    //
    // mvn flyway:migrate -Dflyway.configFiles=flywayConfig.conf

    // mvn flyway:migrate -Dflyway.user=udit -Dflyway.password=udit1234 -Dflyway.url=jdbc:postgresql://localhost:5433/udit-flyway -Dflyway.schemas=testFlyWay
}