package com.quang.validation;

import java.util.ArrayList;
import java.util.List;

/**
 * Evaluate numbers inside a list whether they are valid or not.
 *
 */
public class NumberValidation {
	
	// Rules to be call to validate members
	private List<Rule> rules;

    public NumberValidation(List<Rule> rules) {
        this.rules = rules;
    }

    /**
     * This method will validate each number inside the input array. It will remove any numbers that are not satisfied by the rules
     *
     */
    public List<Integer> removeNotValidNumbers(List<Integer> numbers) {
    	
        List<Integer> result = new ArrayList<Integer>();
        for (Integer num : numbers)
            if (isValid(num))
                result.add(num);
        
        return result;
    }

    private boolean isValid(Integer num) {
    	
        for (Rule rule : rules)
            if (!rule.isValid(num))
            	return false;
        
        return true;
    }
}
