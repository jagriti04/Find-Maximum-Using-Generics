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
}
