package com.techbeamers;

import org.testng.annotations.Test;

/**
 * @author vendolla
 *
 */
public class GroupRegex {

	/*
	 * Generally smoke tests are subset of regression. Smoke tests are run for high
	 * level testing of basic functionality. SO sometimes you need to run only smoke
	 * tests and sometimes regression. Regression will include more or less
	 * everything.
	 */
	@Test(groups = { "Regression_Group1", "Smoke_Group1" })
	public void Group1Method1() {
		System.out.println("Group1Method1");
	}

	@Test(groups = { "Regression_Group1" })
	public void Group1Method2() {
		System.out.println("Group1Method2");
	}

	@Test(groups = { "Regression_Group2", "Smoke_Group2" })
	public void Group2Method1() {
		System.out.println("Group2Method2");
	}

	@Test(groups = { "Regression_Group2" })
	public void Group2Method2() {
		System.out.println("Group2Method2");
	}

	@Test(groups = { "Regression_Group3", "Smoke_Group3" })
	public void Group3Method1() {
		System.out.println("Group3Method3");
	}

	@Test(groups = { "Regression_Group3" })
	public void Group3Method3() {
		System.out.println("Group3Method3");
	}

}
