package com.techbeamers;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 
 * @author vendolla
 *
 */
public class Validation { 
	
	@Test
	public void validateValue() {
		int y=100; 
		Assert.assertFalse(y<0);
	}
	

}
