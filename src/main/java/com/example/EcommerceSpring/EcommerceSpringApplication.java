package com.example.EcommerceSpring;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceSpringApplication {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.configure().load(); //load environment variables from .env file
		dotenv.entries().forEach(entry->System.setProperty(entry.getKey(),entry.getValue())); //get system properties fom environment variables and set them

		SpringApplication.run(EcommerceSpringApplication.class, args);

	}

}
