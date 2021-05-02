package com.digitalinnovation;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDynamoDBRepositories
public class ReactiveHeroesApiSpringWebfluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveHeroesApiSpringWebfluxApplication.class, args);
		System.out.println("Reactive hero management API with WebFlux has been successfully initialized!");
	}

}
