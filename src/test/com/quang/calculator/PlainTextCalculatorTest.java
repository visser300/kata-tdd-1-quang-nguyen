package com.quang.calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class PlainTextCalculatorTest {
	
	private PlainTextCalculator calculator;

    @Before
    public void setUp() {
    	
    	calculator = new PlainTextCalculator();
    }
    
    @Test
    public void shouldReturnTheSumOfTwoNumber() throws Exception {
        
    	int result = calculator.add("1,2");

        assertEquals(3, result);
    }

    @Test
    public void shouldReturnTheSumOfOneNumber() throws Exception {
        
    	int result = calculator.add("1");

        assertEquals(1, result);
    }

    @Test
    public void shouldReturnZeroForEmptyString() throws Exception {
        
    	int result = calculator.add("");

        assertEquals(0, result);
    }

    
    @Test
    public void shouldReturnTheSumOfUnlimitedNumber() throws Exception {
        
    	int result = calculator.add("1,2,3,4,5,6,7,8,9");

        assertEquals(45, result);
    }
}
