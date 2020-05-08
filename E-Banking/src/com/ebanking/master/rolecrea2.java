package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class rolecrea2 {
	
	@FindBy(id="txtRname")
	WebElement rlenme;
	
	@FindBy(id="lstRtypeN")
	WebElement rletpe;
	

	@FindBy(id="btninsert")
	WebElement subb;


public void rlenme(String rolname, String roletype) throws InterruptedException
{
 
	rlenme.sendKeys(rolname);
	rletpe.click();
	rletpe.sendKeys(roletype);
   
	subb.click();
   
}
}