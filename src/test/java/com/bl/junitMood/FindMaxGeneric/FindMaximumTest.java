package com.bl.junitMood.FindMaxGeneric;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindMaximumTest {

	FindMaximum findMax = null;

	@Before
	public void initialize() {
		findMax = new FindMaximum();
	}

	@Test
	public void whenCallWelcomeMethod_shouldReturnTrue() {
		boolean welcomeReturns = findMax.printWelcomeMsg();
		Assert.assertEquals(true, welcomeReturns);
	}

	// UC1- TC1 finds max Integer when max Integer is at first position
	@Test
	public void whenMaxIntegerAtFirstPlace_returnMaxNumber() {
		Integer maxNum = findMax.findMaximum(25, 4, 16);
		Assert.assertEquals((Integer) 25, maxNum);
	}

	// UC1- TC2 finds max Integer when max Integer is at second position
	@Test
	public void whenMaxIntegerAtSecondPlace_returnMaxNumber() {
		Integer maxNum = findMax.findMaximum(25, 84, 16);
		Assert.assertEquals((Integer) 84, maxNum);
	}

	// UC1- TC3 finds max Integer when max Integer is at third position
	@Test
	public void whenMaxIntegerAtThirdPlace_returnMaxNumber() {
		Integer maxNum = findMax.findMaximum(25, 84, 116);
		Assert.assertEquals((Integer) 116, maxNum);
	}

	// UC2- TC1 finds max float when max float is at first position
	@Test
	public void whenMaxFloatAtFirstPlace_returnMaxNumber() {
		Float maxNum = findMax.findMaximum(25.3f, 12.12f, 16.8f);
		Assert.assertEquals((Float) 25.3f, maxNum);
	}

	// UC2- TC2 finds max float when max float is at second position
	@Test
	public void whenMaxFloatAtSecondPlace_returnMaxNumber() {
		Float maxNum = findMax.findMaximum(25.3f, 32.12f, 16.8f);
		Assert.assertEquals((Float) 32.12f, maxNum);
	}

	// UC2- TC3 finds max float when max float is at third position
	@Test
	public void whenMaxFloatAtThirdPlace_returnMaxNumber() {
		Float maxNum = findMax.findMaximum(25.3f, 32.12f, 86.8f);
		Assert.assertEquals((Float) 86.8f, maxNum);
	}

	// UC3- TC1 finds max String when max String is at first position
	@Test
	public void whenMaxStringAtFirstPlace_returnMaxString() {
		String maxString = findMax.findMaximum("Peach", "Banana", "Apple");
		Assert.assertEquals("Peach", maxString);
	}

	// UC3- TC2 finds max String when max String is at second position
	@Test
	public void whenMaxStringAtSecondPlace_returnMaxString() {
		String maxString = findMax.findMaximum("Banana", "Peach", "Apple");
		Assert.assertEquals("Peach", maxString);
	}

	// UC3- TC3 finds max String when max String is at third position
	@Test
	public void whenMaxStringAtThirdPlace_returnMaxString() {
		String maxString = findMax.findMaximum("Banana", "Apple", "Peach");
		Assert.assertEquals("Peach", maxString);
	}
}
