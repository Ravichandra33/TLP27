package com.ebanking.master;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewGrid {
	DesiredCapabilities se = null;
	@Test
	public void gd() throws MalformedURLException, InterruptedException {
		se=new DesiredCapabilities();
		se.setBrowserName("firefox");
		se.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.43.32:4444/wd/hub"),se); 
		
		driver.get("http://183.82.100.55/ranford2");
		 RanfordHp RHP=PageFactory.initElements(driver,RanfordHp.class);
		  RHP.login();
		Thread.sleep(2000);
		AdminHp AHP=PageFactory.initElements(driver,AdminHp.class);
		  AHP.rle();
		  Thread.sleep(2000);
		  newrolecreation rolle=PageFactory.initElements(driver,newrolecreation.class);
		  rolle.newrol();
		  Thread.sleep(2000);
		  rolecrea2 cret =PageFactory.initElements(driver,rolecrea2.class);
		  cret.rlenme("Tellerbankclerk", "E");
		  
		  //Alert
		  driver.switchTo().alert().accept();
		  
		  //hme
		  rolle.hmerole();


		
	}

}