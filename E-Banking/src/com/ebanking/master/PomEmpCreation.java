package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PomEmpCreation {
	
		
		@FindBy(id="txtUname")
		WebElement empname;
		
		@FindBy(id="txtLpwd")
		WebElement emppwd;
		
		@FindBy(id="lst_Roles")
		WebElement Role;
		
		@FindBy(id="lst_Branch")
		WebElement bremp;
		
		
		@FindBy(id="BtnSubmit")
		WebElement empsbmt;
		
	
		
		   
		   public void Empcre(String brna, String passwd, String Rle, String Brc) throws InterruptedException
			{
			 Thread.sleep(2000);
			   empname.sendKeys(brna);
			   Thread.sleep(2000);
			   emppwd.sendKeys(passwd);
			   Role.click();
			   Role.sendKeys(Rle);
			   bremp.click();
			   bremp.sendKeys(Brc);
			   empsbmt.click();
			   
			 

			}
		   
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		




