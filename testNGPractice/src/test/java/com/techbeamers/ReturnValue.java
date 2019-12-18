package com.techbeamers;

import org.testng.annotations.Test;

/**
 * @author vendolla
 *
 */
public class ReturnValue {

	// A @Test method which is returning a value will be ignored by TestNG
	@Test
	public String returnMethod() {
		System.out.println("Returning Method");
		return "SeleniumTesting";
	}

	@Test
	public void normalMethod() {
		System.out.println("Normal Method");
		//System.out.println(returnMethod());
	}

}
