package com.quang.validation;

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
