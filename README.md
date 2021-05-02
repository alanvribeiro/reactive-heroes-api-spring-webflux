#  API de gerenciamento de heróis utilizando Spring WebFlux

Projeto Spring WebFlux para validação de uma API reativa de gerenciamento de heróis da Marvel/DC, utilizando DynamoDb e testes unitários simples.

## Stack utilizada

* Java 11
* Spring WebFlux
* DynamoDb
* Reactor
* Sl4j
* Lombok
* MapStruct
* Maven
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
http://localhost:8080/swagger-ui.html
```
