package com.quang.calculator;

import java.util.List;

import com.quang.service.ParseNumberService;

/**
 * @author Quang Nguyen
 */
public class PlainTextCalculator {

    private ParseNumberService numberService;    
    
    public PlainTextCalculator() {
        
        this.numberService = new ParseNumberService();
    }

    public int add(final String numbers) throws Exception {
        List<Integer> numbersList = numberService.extract(numbers);
        
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