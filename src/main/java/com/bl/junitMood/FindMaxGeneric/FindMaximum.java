package com.bl.junitMood.FindMaxGeneric;

public class FindMaximum <E extends Comparable<E>> {
	E firstObj, secondObj, thirdObj;
	
	public FindMaximum (E first, E second, E third) {
		this.firstObj = first;
		this.secondObj = second;
		this.thirdObj = third;
	}
	
	public static boolean printWelcomeMsg() {
		System.out.println("Welcome to the find maximum using generics problem.");
		return true;
	}

	// single method to calculate maximum for Integer, Float or String
	public static <E extends Comparable<E>> E findMaximum(E firstItem, E secondItem, E thirdItem) {
		System.out.println("Find max of: " + firstItem + " " + secondItem + " " + thirdItem);
		E maximum = firstItem;
		if (maximum.compareTo(secondItem) < 0)
			maximum = secondItem;
		if (maximum.compareTo(thirdItem) < 0)
			maximum = thirdItem;
		return maximum;
	}
	
	public E findMaximum() {
		return findMaximum(this.firstObj, this.secondObj, this.thirdObj);
	}
}
