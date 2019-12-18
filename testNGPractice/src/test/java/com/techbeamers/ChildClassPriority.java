package com.techbeamers;

import org.testng.annotations.Test;

public class ChildClassPriority extends ParentClassPriority {

	@Test
	public void PrintMethod() {
		System.out.println("Child Class Capital Print Method");
	}
	
	@Test
	public void printMethod() {
		System.out.println("Child Class Small Print Method");
	}
	
	@Test
	public void displayMethod() {
		System.out.println("Child Class Display Method");
	}
	
	@Test
	public void $Method() {
		System.out.println("Child Class Dollar Method");
	}
	
	@Test
	public void _Method() {
		System.out.println("Child Class UnderScore Method");
	}
	
}