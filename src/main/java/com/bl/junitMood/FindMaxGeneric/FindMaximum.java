package com.bl.junitMood.FindMaxGeneric;

public class FindMaximum <E extends Comparable<E>> {
	E firstObj, secondObj, thirdObj;
	
	// constructor with parameters
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
	@SafeVarargs
	public static <E extends Comparable<E>> E findMaximum(E ...items) {
		E maximum = items[0];
		for (E iter : items) {
			if (maximum.compareTo(iter) < 0)
				maximum = iter;
		}
		printMax(maximum, items);
		return maximum;
	}
	
	// print maximum method
	@SafeVarargs
	public static <E> void printMax(E max, E ...items) {
		System.out.println("Find max of: ");
		for (E iter : items) {
			System.out.println(iter);
		}
		System.out.println("Maximum is - " + max);
		System.out.println(" ---------- ");
	}
	

	public E findMaximum() {
		return findMaximum(this.firstObj, this.secondObj, this.thirdObj);
	}
}
