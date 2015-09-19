package com.quang.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ParseNumberServiceTest {

	private ParseNumberService parseNumberService;
	
	@Before
    public void setUp() {
		parseNumberService = new ParseNumberService();
    }

    @Test
    public void shouldReturnACollectionWithTheNumbersExtracted() {
        List<Integer> result = parseNumberService.extract("1,2,3");
        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(1);
        expectedResult.add(2);
        expectedResult.add(3);
        
        assertEquals(expectedResult, result);
    }
}
