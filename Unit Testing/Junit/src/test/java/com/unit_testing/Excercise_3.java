package com.unit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class Excercise_3 {
    @Test
     public void testAssertions() {
        // Assert equals
        assertEquals(5, 2 + 3);
        // Assert true
        assertTrue(5 > 3);
        // Assert false
        assertFalse(5 < 3);
        // Assert null
        assertNull(null);
        // Assert not null
        assertNotNull(new Object());
    } 
}
