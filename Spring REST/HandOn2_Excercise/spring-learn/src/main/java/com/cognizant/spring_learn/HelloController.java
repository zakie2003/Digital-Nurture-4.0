package com.cognizant.spring_learn;

import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {
    private static final Logger LOGGER=LoggerFactory.getLogger(HelloController.class);
    @RequestMapping("/hello")    
    public static String sayHello(){
        LOGGER.info("Called Method");
        return "Hello World";
    }

}
