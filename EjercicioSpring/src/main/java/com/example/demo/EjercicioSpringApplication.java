package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjercicioSpringApplication {
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(EjercicioSpringApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EjercicioSpringApplication.class, args);
		LOGGER.info("Mensaje de info!");
		LOGGER.warn("Mensaje de warn!");
		LOGGER.error("Mensaje de error!");
		LOGGER.debug("Mensaje de debug!");
		LOGGER.trace("Mensaje de trace!");
		
	}

}
