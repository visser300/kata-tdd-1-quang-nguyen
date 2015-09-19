package com.quang.service;

import java.util.List;

/**
 * Abstract class to define the basic functions of a Number Searcher 
 * @author Mr Quang
 */
public abstract class NumberSearcher {

	abstract void search(List<Integer> numbers) throws Exception;
}
