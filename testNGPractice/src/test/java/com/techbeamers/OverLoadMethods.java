package com.techbeamers;

import org.testng.annotations.Test;

public class OverLoadMethods {
	
	@Test
	public void NoParameters()
	{
		System.out.println("Normal Method");
	}
	
	// Overloaded Method
	@Test
	public void StringParameter(String s)
	{
		System.out.println("Overloaded Method");
	}

}
