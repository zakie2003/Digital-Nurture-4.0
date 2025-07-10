package com.cognizant.spring_learn;
import org.apache.catalina.core.ApplicationContext;
import org.slf4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.spring_learn.model.Country;

@SpringBootApplication
public class SpringLearnApplication {
	private static final Logger LOGGER=LoggerFactory.getLogger(SpringLearnApplication.class);
	
	public  static void displayCountry(){
		AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
		Country country=(Country) context.getBean("country",Country.class);
		LOGGER.info(country.toString());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		System.out.println("Output Started---------------------");
		LOGGER.info("Hello Spring inside Info");
		System.out.println("Output ended------------------------");
		displayCountry();
	}

}
