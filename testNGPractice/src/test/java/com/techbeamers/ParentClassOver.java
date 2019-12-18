package com.techbeamers;

import org.testng.annotations.Test;

public class ParentClassOver {

	@Test
	public void singleMethod() {
		System.out.println("Parent Single Method");
	}
	
	public void stringMethod() {
		System.out.println("Parent String Method");
	}
}
