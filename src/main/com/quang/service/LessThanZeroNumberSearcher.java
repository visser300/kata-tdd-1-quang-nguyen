package com.quang.service;

import java.util.LinkedList;
import java.util.List;

public class LessThanZeroNumberSearcher extends NumberSearcher {

	@Override
	public void search(List<Integer> numbers) throws Exception {
		
		List<Integer> negativeNumbers = new LinkedList<Integer>();
        for (Integer num : numbers) {
            if (num < 0) {
                negativeNumbers.add(num);
            }
        }
        
        if (negativeNumbers.size() > 0) {
            throw new Exception("Negatives not allowed: " + negativeNumbers.toString());
        }
	}

}
