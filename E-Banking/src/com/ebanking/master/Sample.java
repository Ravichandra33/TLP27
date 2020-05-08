package com.ebanking.master;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {

	@BeforeMethod
	public void xyz() {
	
	Assert.assertEquals("Selenium", "Selenium");
	}
	
	@Test
	public void abc() {
		
		Assert.assertEquals("Testnfg", "Testnfg");	
	}
	@Test
	public void adc() {
		
		Assert.assertEquals("Testng", "Testng");	
	}
	@AfterMethod
	public void pqr() {
		Assert.assertEquals("Testing", "Testing");	
	}
	
	
}
