package com.unit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class test {
    @Test
    void testAdd() {
        int result = Excercise_1.add(2, 3);
        System.out.println("Add(2, 3) = " + result);
        assertEquals(5, result);
    }

    @Test
    void testSubtract() {
        int result = Excercise_1.subtract(5, 3);
        System.out.println("Subtract(2, 3) = " + result);
        assertEquals(2, result);
    }


}
