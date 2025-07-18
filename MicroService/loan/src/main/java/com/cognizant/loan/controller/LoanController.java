package com.cognizant.loan.controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class LoanController {
    @GetMapping("/loan/{number}")
    public Map<String,Object> getMethodName(@PathVariable String number) {
        return Map.of( "number",number, "type","car", "loan",400000, "emi",3258, "tenure",18);
    }
}
