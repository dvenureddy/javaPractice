package com.techbeamers;

import org.testng.annotations.Test;

/**
 * @author vendolla
 *
 */
public class DefaultPriority {
	
	
	@Test
	public void PrintMethod() {
		System.out.println("Print Method");
	}
	
	@Test
	public void displayMethod() {
		System.out.println("Display Method");
	}
	
	@Test
	public void $Method() {
		System.out.println("Dollar Method");
	}
	
	@Test
	public void _Method() {
		System.out.println("UnderScore Method");
	}

}
