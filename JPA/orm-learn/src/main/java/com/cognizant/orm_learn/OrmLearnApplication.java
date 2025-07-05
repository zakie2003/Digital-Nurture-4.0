package com.cognizant.orm_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cognizant.orm_learn.service.*;
import com.cognizant.orm_learn.model.*;
import java.util.List;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class OrmLearnApplication
{
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	private static CountryService countryService;
	
	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);

        
		System.out.println("-------------------------------------My Output Start");
		System.out.println();
		LOGGER.info("Inside main");
		testGetAllCountries();
		System.out.println();
		System.out.println("-------------------------------------My Output End");
	}

	private static void testGetAllCountries()
	{
        LOGGER.info("Start");
        List<Country> countries = countryService.getAllCountries();
        LOGGER.debug("countries={}", countries);
        LOGGER.info("End");
    }
}
