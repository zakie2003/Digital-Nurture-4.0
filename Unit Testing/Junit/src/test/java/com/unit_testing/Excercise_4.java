package com.unit_testing;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;


public class Excercise_4 {
    private Calculator calculator;
    @Before
    public void setUp(){
        calculator = new Calculator();
        System.out.println("Setting up the Instance");
    }

    @After
    public void cleanUp(){
        System.out.println("Cleaning up the Instance");
        calculator = null;
    }

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should equal 1");
    }
    
}
