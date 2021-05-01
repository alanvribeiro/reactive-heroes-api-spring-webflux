#  API de gerenciamento de heróis utilizando Spring WebFlux

Este projeto consiste de uma API reativa de gerenciamento de heróis utilizando Spring WebFlux com testes unitários simples.

## Stack utilizada

* Java 11
* Spring WebFlux
* Maven
* DynamoDb
* Lombok
* Reactor
* JUnit
* Sl4j
* IntelliJ IDEA

## Informações adicionais

Para executar o Dynamo (na pasta em que o jar está baixado)

```
java -Djava.library.path=./DynamoDBLocal_lib -jar DynamoDBLocal.jar -sharedDb
```

Para listar as tabelas criadas

```
aws dynamodb list-tables --endpoint-url http://localhost:8000
```

Para acessar a documentação da API

```
http://localhost:8080/swagger-ui-heroes-reactive-api.html
```
