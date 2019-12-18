package com.techbeamers;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author vendolla
 *
 */
public class ParametersMethod {
	
	@Parameters({"name"})
	@Test
	public void SingleParameter(String name)
	{
		System.out.println("Single Parameter with String Value");
	}
	
	@Parameters({"name1","age"})
	@Test
	public void MultipleParameter(String name,int age)
	{
		System.out.println("Multiple Parametrs with String and Integer Values");
	}

}
