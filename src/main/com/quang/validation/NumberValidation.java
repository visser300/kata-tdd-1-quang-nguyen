package com.quang.validation;

import java.util.ArrayList;
import java.util.List;

public class NumberValidation {
	
	private List<Rule> rules;

    public NumberValidation(List<Rule> rules) {
        this.rules = rules;
    }

    public List<Integer> removeNotValidNumbers(List<Integer> numbers) {
    	
        List<Integer> result = new ArrayList<Integer>();
        for (Integer num : numbers)
            if (isValid(num))
                result.add(num);
        
        return result;
    }

    public boolean isValid(Integer num) {
    	
        for (Rule rule : rules)
            if (!rule.isValid(num))
            	return false;
        
        return true;
    }
}
