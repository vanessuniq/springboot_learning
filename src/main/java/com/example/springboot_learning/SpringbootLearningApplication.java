package com.example.springboot_learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(GithubProperties.class)
public class SpringbootLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLearningApplication.class, args);
	}

}
