package com.techbeamers;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Interface Test Method
 * @author vendolla
 *
 */
public interface InterfaceTestNGMethods {
	
	//TestNG annotated methods in Interface
	//An interface can have abstract methods, default methods and static methods.
	@BeforeTest
	public void beforeTestMethod();
	
	@Test
	public void testMethod();
	
	
	@AfterTest
	public void afterTestMethod();
	
}