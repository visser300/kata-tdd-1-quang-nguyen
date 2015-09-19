package com.quang.service;

import java.util.LinkedList;
import java.util.List;

/**
 * Implement of Number Searcher for negative number
 * @author Mr Quang
 */
public class LessThanZeroNumberSearcher extends NumberSearcher {

	/**
	 * Look for negative numbers in an input array. Group them all and throw an exception
	 */
	@Override
	public void search(List<Integer> numbers) throws Exception {
		
		// look and group negative numbers
		List<Integer> negativeNumbers = new LinkedList<Integer>();
        for (Integer num : numbers) {
            if (num < 0) {
                negativeNumbers.add(num);
            }
        }
        
        // show all negative numbers in Exception Message
        if (negativeNumbers.size() > 0) {
            throw new Exception("Negatives not allowed: " + negativeNumbers.toString());
        }
	}

}
