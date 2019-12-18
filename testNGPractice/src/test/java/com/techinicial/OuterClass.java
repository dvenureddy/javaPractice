package com.techinicial;

import org.testng.annotations.Test;

public class OuterClass {

	@Test
	public void outerMethod() {
		System.out.println("Outer");
	}

	class InnerClass {
		@Test
		public void innerMethod() {
			System.out.println("Inner");
		}
	}

}
