package com.cognizant.spring_learn.model;
import org.slf4j.*;

import com.cognizant.spring_learn.SpringLearnApplication;
public class Country {
    private String code;
    private String name;
    private static final Logger LOGGER =LoggerFactory.getLogger(SpringLearnApplication.class);
    
    
    public Country() {
        LOGGER.info("Inside Country");
    }

    public String getName() {
        LOGGER.info("Get Country");
        return this.name;
    }

    public void setName(String name) {
        LOGGER.info("Set Country");
        this.name = name;
    }

    public String getCode() {
        LOGGER.info("GET Code");
        return this.code;
    }

    public void setCode(String code) {
        LOGGER.info("SET Code");
        this.code = code;
    }
    public String toString() {
        return "Country: " + this.getName() + ", Code: " + this.getCode();
    }


}
