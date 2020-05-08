package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHp {

	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")
	WebElement brn;
	
	@FindBy(xpath = "//img[@src='images/Roles_but.jpg']")
	WebElement rle;
	
	@FindBy(xpath = "//img[@src='images/emp_btn.jpg']")
	WebElement emp;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img")
	WebElement Logt;
	
	
	public void Br()
	{
		brn.click();
		
		
	}
	
	public void rle() throws InterruptedException {
		Thread.sleep(2000);
		rle.click();
	}
	
public void emp() throws InterruptedException {
	Thread.sleep(2000);
	emp.click();
}

public void loutgghf() throws InterruptedException {
	Thread.sleep(2000);
	Logt.click();
}
}
