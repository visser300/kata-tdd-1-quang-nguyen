package com.quang.calculator;

import java.util.ArrayList;
import java.util.List;

import com.quang.service.LessThanZeroNumberSearcher;
import com.quang.service.ParseNumberService;
import com.quang.validation.LessThanRule;
import com.quang.validation.NumberValidation;
import com.quang.validation.Rule;

/**
 * Main class to parse the string numbers and sum them up
 * @author Quang Nguyen
 */
public class PlainTextCalculator {

    private ParseNumberService numberService;
    private LessThanZeroNumberSearcher numberSearcher;
    private NumberValidation numberValidation;

    private final Rule lessThanRule = new LessThanRule(1000);
    
    /**
     * Constructor
     */
    public PlainTextCalculator() {
        
        this.numberService = new ParseNumberService();
        this.numberSearcher = new LessThanZeroNumberSearcher();

        List<Rule> rules = new ArrayList<Rule>();
        rules.add(lessThanRule);
        this.numberValidation = new NumberValidation(rules);
    }

    /**
     * 1st step: Parse the string to an array of number
     * 2nd step: Check any negative number exists to throw exception
     * 3rd step: remove any number that is >= 1000 
     */
    public int add(final String numbers) throws Exception {
    	
    	// first step
        List<Integer> numbersList = numberService.extract(numbers);
        
        // second step
        numberSearcher.search(numbersList);
        
        // last step
        numbersList = numberValidation.removeNotValidNumbers(numbersList);
        
        // sum up the numbers in the array
        return sumNumbers(numbersList);
    }

    // method to sum up all the numbers in an array
    private int sumNumbers(List<Integer> numberList) {
    	
        int sum = 0;
        
        for (Integer num : numberList) {
            sum += num;
        }
        
        return sum;
    }
}