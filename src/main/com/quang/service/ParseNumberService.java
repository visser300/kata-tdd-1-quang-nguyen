package com.quang.service;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Receive a string with numeric value inside and will parse it to a collection.
 * 
 * @author Quang Nguyen
 */
public class ParseNumberService {

    private Pattern pattern;

    public ParseNumberService() {
    	pattern = Pattern.compile("-?\\d+");
    }
    
    public List<Integer> extract(final String stringToAnalyze) {
    	
        if (stringToAnalyze != null)
        	if (!stringToAnalyze.isEmpty())
        		return getNumbersUsingRegEx(stringToAnalyze);
        
        return new LinkedList<Integer>();
    }

    private List<Integer> getNumbersUsingRegEx(String string) {
    	
    	List<Integer> result = extractNumbersFromMatcher(pattern.matcher(string));
    	return result;
    }

    private List<Integer> extractNumbersFromMatcher(Matcher matcher) {
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        while (matcher.find()) {
            int number = Integer.parseInt(matcher.group());
            numbers.add(number);
        }
        return numbers;
    }

}