package com.cognizant.spring_learn;

import com.cognizant.spring_learn.model.Country;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@RestController
@ImportResource("classpath:india.xml") // This loads india.xml at startup
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private ApplicationContext context;

    @GetMapping("/country")
    public List<Country> getCountryIndia() {
        LOGGER.info("START getCountryIndia");
        Map<String, Country> countryMap = context.getBeansOfType(Country.class);
        List<Country> countries = new ArrayList<>(countryMap.values());

        LOGGER.info("END getAllCountries");
        return countries;

    }

    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code) {
        LOGGER.info("Fetching country with code: {}", code);
        try {
            return (Country) context.getBean(code.toUpperCase());
        } catch (Exception e) {
            LOGGER.error("Country not found for code: {}", code);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Country not found");
        }
    }
}
