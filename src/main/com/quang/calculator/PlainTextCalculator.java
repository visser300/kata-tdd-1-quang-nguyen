package com.quang.calculator;

import java.util.List;

import com.quang.service.LessThanZeroNumberSearcher;
import com.quang.service.ParseNumberService;

/**
 * @author Quang Nguyen
 */
public class PlainTextCalculator {

    private ParseNumberService numberService;
    private LessThanZeroNumberSearcher numberSearcher;

    public PlainTextCalculator() {
        
        this.numberService = new ParseNumberService();
        this.numberSearcher = new LessThanZeroNumberSearcher();
    }

    public int add(final String numbers) throws Exception {
    	
        List<Integer> numbersList = numberService.extract(numbers);
        numberSearcher.search(numbersList);
        
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