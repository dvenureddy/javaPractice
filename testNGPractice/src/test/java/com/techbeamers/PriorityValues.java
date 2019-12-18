package com.techbeamers;

import org.testng.annotations.Test;

public class PriorityValues {

	static int val = 10;

	@Test(priority = 1)
	public void testB1() {
		System.out.println("testB1 from " + getClass().getSimpleName() + " class and value is : " + val++);
	}

	@Test(priority = 2)
	public void testB2() {
		System.out.println("testB2 from " + getClass().getSimpleName() + " class and value is : " + val++);
	}

	@Test(priority = 3)
	public void testB3() {
		System.out.println("testB3 from " + getClass().getSimpleName() + " class and value is : " + val++);
	}

}
