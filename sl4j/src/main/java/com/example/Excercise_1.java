package com.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Excercise_1 {

    private static final Logger logger = LoggerFactory.getLogger(Excercise_1.class);
    public static void main(String[] args) {
        logger.warn("This is a warning message");
        logger.error("This is an error message");
    }
}