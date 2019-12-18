package com.techbeamers;

import org.testng.annotations.Test;

/**
 * @author vendolla
 *
 */
public class PrioritySet {

	// We can pass priority as negative value.
	@Test(priority = -1)
	public void NegativeP() {
		System.out.println("Negative Prioirty");
	}

	// We can pass priority as default value zero.
	@Test(priority = 0)
	public void ZerothP() {
		System.out.println("Zeroth Priority");
	}

	@Test(priority = 1)
	public void PositiveP() {
		System.out.println("Positive Priority");
	}

	// It is not mandatory to pass priority in a order
	@Test(priority = 100)
	public void SkippedP() {
		System.out.println("Skipped Priority");
	}
}
