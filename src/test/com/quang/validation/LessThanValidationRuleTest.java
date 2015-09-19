package com.quang.validation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.quang.validation.LessThanRule;
import com.quang.validation.Rule;

public class LessThanValidationRuleTest {

    private Rule rule;
    
	 @Before
	 public void setUp() {
		 
		 rule = new LessThanRule(1000);
	 }
	 
	 @Test
	 public void shouldValidateANumberLessThanTopValue() {
		 assertTrue(rule.isValid(2));
	 }

	 @Test
	 public void shouldNotValidateANumberEqualsToTheTopValue() {
		 assertFalse(rule.isValid(1000));
	 }
}
