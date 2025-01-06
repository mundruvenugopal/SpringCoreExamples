package com.example.demo;

import org.springframework.boot.SpringApplication;

public class TestSpringCoreExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringCoreExamplesApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
