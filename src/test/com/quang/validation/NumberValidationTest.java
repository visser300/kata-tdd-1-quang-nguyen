package com.quang.validation;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class NumberValidationTest {
	
	 private NumberValidation numberValidation;
    
	 @Before
	 public void setUp() {
		 
	     List<Rule> rules = new ArrayList<Rule>();
	     rules.add(new LessThanRule(1000));
	     this.numberValidation = new NumberValidation(rules);
	 }
	 
	 @Test
	 public void shouldNotRemoveAnyNumber() {
	     List<Integer> numbers = new ArrayList<Integer>();
	     numbers.add(1);
	     numbers.add(2);
	     numbers.add(3);
	     numbers.add(4);

	     List<Integer> result = numberValidation.removeNotValidNumbers(numbers);

	     assertEquals(numbers, result);
	}

	@Test
	public void shouldRemoveNegativeNumber() {

		List<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(1);
	    numbers.add(1000);
	    numbers.add(3);
	    numbers.add(2000);

	    numbers = numberValidation.removeNotValidNumbers(numbers);

	    List<Integer> expectedResult = new ArrayList<Integer>();
	    expectedResult.add(1);
	    expectedResult.add(3);

	    assertEquals(expectedResult, numbers);
	}
}
