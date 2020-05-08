package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RanfordHp {
	
	//element Properties
	@FindBy(id="txtuId")
	WebElement Uname;

	@FindBy(id="txtPword")
	WebElement pswd;
	
	@FindBy(xpath="//input[@id='login']")
	WebElement lgn;
	
	public void login() throws InterruptedException
	{
		Uname.sendKeys("Admin");
		pswd.sendKeys("M1ndq");
		lgn.click();
		Thread.sleep(2000);
	}

	//public void login() {
		// TODO Auto-generated method stub
		
	}
	
	


