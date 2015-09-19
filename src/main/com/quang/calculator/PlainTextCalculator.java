package com.quang.calculator;

import java.util.ArrayList;
import java.util.List;

import com.quang.service.LessThanZeroNumberSearcher;
import com.quang.service.ParseNumberService;
import com.quang.validation.LessThanRule;
import com.quang.validation.NumberValidation;
import com.quang.validation.Rule;

/**
 * @author Quang Nguyen
 */
public class PlainTextCalculator {

    private ParseNumberService numberService;
    private LessThanZeroNumberSearcher numberSearcher;
    private NumberValidation numberValidation;

    private final Rule lessThanRule = new LessThanRule(1000);
    
    
    public PlainTextCalculator() {
        
        this.numberService = new ParseNumberService();
        this.numberSearcher = new LessThanZeroNumberSearcher();

        List<Rule> rules = new ArrayList<Rule>();
        rules.add(lessThanRule);
        this.numberValidation = new NumberValidation(rules);
    }

    public int add(final String numbers) throws Exception {
        List<Integer> numbersList = numberService.extract(numbers);
        numberSearcher.search(numbersList);
        numbersList = numberValidation.removeNotValidNumbers(numbersList);
        
        return sumNumbers(numbersList);
    }

    private int sumNumbers(List<Integer> numberList) {
    	
        int sum = 0;
        
        for (Integer num : numberList) {
            sum += num;
        }
        
        return sum;
    }
}