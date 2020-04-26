package com.myjava.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.myjava.*")
@EnableJpaRepositories(basePackages = {"com.myjava.repository"})
@EntityScan("com.myjava.modals")   
public class JwtinspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtinspringbootApplication.class, args);
	}
	
}