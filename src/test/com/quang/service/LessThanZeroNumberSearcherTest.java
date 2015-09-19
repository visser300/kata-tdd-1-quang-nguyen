package com.quang.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class LessThanZeroNumberSearcherTest {

	private LessThanZeroNumberSearcher validator;

    @Before
    public void setUp() {
    	validator = new LessThanZeroNumberSearcher();
    }
    
	@Test(expected = Exception.class)
    public void shouldNotValidateNegativeNumbers() throws Exception {
		
		List<Integer> positiveNumbers = new ArrayList<Integer>();
		positiveNumbers.add(-11);
        validator.search(positiveNumbers);
    }
}
