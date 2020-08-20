package com.eventoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.eventoapp.controllers"})
@EntityScan(basePackages= {"com.eventoapp.models"})
public class EventosappApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventosappApplication.class, args);
	}

}
