package com.techbeamers;

import org.testng.annotations.Test;

public class ParentClassPriority {

	@Test
	public void PrintMethod() {
		System.out.println("Parent Capital Print Method");
	}
	
	@Test
	public void printMethod() {
		System.out.println("Parent Small Print Method");
	}
	
	@Test
	public void displayMethod() {
		System.out.println("Parent Display Method");
	}
	
	@Test
	public void $Method() {
		System.out.println("Parent Dollar Method");
	}
	
	@Test
	public void _Method() {
		System.out.println("Parent UnderScore Method");
	}
}