package com.bl.junitMood.FindMaxGeneric;

public class FindMaximum {
	public boolean printWelcomeMsg() {
		System.out.println("Welcome to the find maximum using generics problem.");
		return true;
	}

	// find the max integer out of three given integers
	public Integer findMaxInteger(Integer firstInt, Integer secondInt, Integer thirdInt) {
		Integer maxNum = firstInt;
		if (maxNum.compareTo(secondInt) < 0)
			maxNum = secondInt;
		if (maxNum.compareTo(thirdInt) < 0)
			maxNum = thirdInt;
		return maxNum;
	}
	
	// find the max float number out of three given float number
	public Float findMaxFloat(Float firstFloat, Float secondFloat, Float thirdFloat) {
		Float maxNum = firstFloat;
		if (maxNum.compareTo(secondFloat) < 0)
			maxNum = secondFloat;
		if (maxNum.compareTo(thirdFloat) < 0)
			maxNum = thirdFloat;
		return maxNum;
	}
}
