package com.techbeamers;

import org.testng.annotations.Test;

public class ChildClassOver extends ParentClassOver{
	
	@Test
	public void singleMethod() {
		System.out.println("Child Single Method Overriden Method");
	}
	
	@Test
	public void multipleMethod() {
		System.out.println("Multiple Methods");
	}

}
