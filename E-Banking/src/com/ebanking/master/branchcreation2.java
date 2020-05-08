package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class branchcreation2 {
	
	@FindBy(id="txtbName")
	WebElement Brnam;
	
	@FindBy(xpath="//*[@id=\"txtAdd1\"]")
	WebElement add1;
	
	@FindBy(id="txtZip")
	WebElement Zpcde;
	
	@FindBy(id="lst_counrtyU")
	WebElement cntry;
	
	
	@FindBy(id="lst_stateI")
	WebElement sate;
	
	@FindBy(id="lst_cityI")
	WebElement crty;
	
	@FindBy(id="btn_insert")
	WebElement sbm;
	
	
	   
	   public void Brcr2(String brname, String addres, String zipcode, String cntrys, String State,String cty) throws InterruptedException
		{
		   Thread.sleep(2000);
		   Brnam.sendKeys(brname);
		   add1.sendKeys(addres);
		   Zpcde.sendKeys(zipcode);
		   cntry.click();
		   cntry.sendKeys(cntrys);
		   Thread.sleep(2000);
		   sate.click();
		   sate.sendKeys(State);
		   Thread.sleep(2000);
		   crty.click();
		   crty.sendKeys(cty);
		   sbm.click();
		  // String brname, String add1, String zipcode, String cntry,String State,String cty
		   
		   
		   

		}
	   
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	

