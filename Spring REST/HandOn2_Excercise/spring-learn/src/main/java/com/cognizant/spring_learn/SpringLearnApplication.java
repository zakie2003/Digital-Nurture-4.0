package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnApplication {
    private static final Logger LOGGER=LoggerFactory.getLogger(HelloController.class);
	public static void main(String[] args) {
		LOGGER.info("Spring Started--------------------------");
		SpringApplication.run(SpringLearnApplication.class, args);
		LOGGER.info("Spring Running---------------------------");
	}

}
