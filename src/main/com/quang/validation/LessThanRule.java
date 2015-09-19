package com.quang.validation;

/**
 * Invalidate all the numbers grater than or equals to a predefined value.
 *
 */
public class LessThanRule implements Rule{
	
	private final int value;

    public LessThanRule(int value) {
        this.value = value;
    }

    @Override
    public boolean isValid(Integer number) {
        return number < value;
    }
}
