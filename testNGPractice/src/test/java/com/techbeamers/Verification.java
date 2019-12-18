package com.techbeamers;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 
 * @author vendolla
 *
 */
public class Verification 
{
    @Test
    public void verifyString() {
    	String s1 = "Selenium";
    	String s2 = "Selenium Webdriver";
    	Assert.assertEquals(s1, s2);
    }
    
    @Test
    public void VerifyVariableValue() {
    	int x = 10;
    	Assert.assertTrue(x>0);
    }
}
