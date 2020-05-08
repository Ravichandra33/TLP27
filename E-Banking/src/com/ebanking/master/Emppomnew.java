package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Emppomnew {
	
	@FindBy(xpath="//*[@id=\"BtnNew\"]")
   WebElement newemp;
	
	@FindBy(xpath="/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
    WebElement hmeemp;
	
	public void nemp()
	{
		newemp.click();
		
		
	}
		
		public void hmeemp()
		{
			hmeemp.click();
		}
		
		
	}
	
	


