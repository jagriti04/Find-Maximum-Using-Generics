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
	//UC1- TC1 finds max int when max int is at first position
	@Test
	public void whenMaxIntegerAtFirstPlace_returnThatNumber() {
		Integer maxNum = findMax.findMaxInteger(25, 4, 16);
		Assert.assertEquals((Integer) 25, maxNum);
	}
	//UC1- TC2 finds max int when max int is at second position
	@Test
	public void whenMaxIntegerAtSecondPlace_returnThatNumber() {
		Integer maxNum = findMax.findMaxInteger(25, 84, 16);
		Assert.assertEquals((Integer) 84, maxNum);
	}
	//UC1- TC3 finds max int when max int is at third position
	@Test
	public void whenMaxIntegerAtThirdPlace_returnThatNumber() {
		Integer maxNum = findMax.findMaxInteger(25, 84, 116);
		Assert.assertEquals((Integer) 116, maxNum);
	}
}
