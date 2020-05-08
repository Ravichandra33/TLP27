package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Branchcreation1 {
	
	
	
	
	@FindBy(id="BtnNewBR")
   WebElement newbr;
	
	@FindBy(xpath="/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
    WebElement hme;
	
	public void newbr() throws InterruptedException
	{
		
		Thread.sleep(2000);
		newbr.click();
		
		
	}
		
		public void hme()
		{
			hme.click();
		}
		
		
	}
	
	  