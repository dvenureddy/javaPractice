package com.techbeamers;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OverLoadedM {

	@DataProvider(name = "SingleValue")
	public static Object[][] SingleData() {
		return new Object[][] { { "Amod" } };
	}

	@DataProvider(name = "MultipleValues")
	public static Object[][] MultipleData() {
		return new Object[][] { { "Amod", 123 } };
	}

	@Test(dataProvider = "SingleValue")
	public void SignlePara(String s) {
		System.out.println("String Value");
	}

	@Test(dataProvider = "MultipleValues")
	public void MultiplePara(String s, int a) {
		System.out.println("String and Integer Values");
	}

}
