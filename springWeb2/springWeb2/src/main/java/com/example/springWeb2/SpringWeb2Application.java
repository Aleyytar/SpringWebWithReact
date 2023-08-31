package com.example.springWeb2;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringWeb2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringWeb2Application.class, args);
	}
	
	@Bean
	public ModelMapper getModeMappaer() {
		return new ModelMapper();
	}

}
