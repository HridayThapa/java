package com.wipro.java.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	private final Calculator calculator=new Calculator();
	
	@Test
    public void testAdd() {
        int result = calculator.add(7, 3);
        assertEquals(10, result);
    }
	
	@Test
    public void testSub() {
        int result = calculator.sub(10, 4);
        assertEquals(6, result);
    }
}
