package com.ebanking.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class Exepom {
	WebDriver driver;
	
	@BeforeTest
	public void Login() throws InterruptedException
	{
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("http://183.82.100.55/ranford2");
		
		
		 RanfordHp RHP=PageFactory.initElements(driver,RanfordHp.class);
		  RHP.login();
	}
	@Test(dataProvider="Rdata",priority=1)
	public void branchecre(String brname, String addres, String zipcode, String cntrys,String State,String cty) throws InterruptedException 
	{
		AdminHp AHP=PageFactory.initElements(driver,AdminHp.class);
		  AHP.Br();
		  
		
		

		 
		  
		  Branchcreation1 Br = PageFactory.initElements(driver, Branchcreation1.class);
		  Br.newbr();
		  
		  branchcreation2 Brhme = PageFactory.initElements(driver, branchcreation2.class);
		  Brhme.Brcr2(brname, addres, zipcode, cntrys, State, cty);
		  
		  //Alert
		  driver.switchTo().alert().accept();
		  
		  //hme
		  Br.hme();
	}
	@Test(dataProvider="rdata1",priority=2)
	public void rolecre(String rolname, String roletype) throws InterruptedException 
	{
		
		Thread.sleep(2000);
		AdminHp AHP=PageFactory.initElements(driver,AdminHp.class);
		  AHP.rle();
		  Thread.sleep(2000);
		  newrolecreation rolle=PageFactory.initElements(driver,newrolecreation.class);
		  rolle.newrol();
		  Thread.sleep(2000);
		  rolecrea2 cret =PageFactory.initElements(driver,rolecrea2.class);
		  cret.rlenme(rolname, roletype);
		  
		  //Alert
		  driver.switchTo().alert().accept();
		  
		  //hme
		  rolle.hmerole();
	
	}
	@Test(dataProvider="Rdata2",priority=3)
	public void empcreation(String brna, String passwd, String Rle, String Brc) throws InterruptedException 
	{
		AdminHp AHP=PageFactory.initElements(driver,AdminHp.class);
		  AHP.emp();
		  
		  Emppomnew empnew=PageFactory.initElements(driver,Emppomnew.class);
		  empnew.nemp();
		  
		  PomEmpCreation empcr =PageFactory.initElements(driver,PomEmpCreation.class);
		  empcr.Empcre(brna, passwd, Rle, Brc);
		  
		  //Alert
		  driver.switchTo().alert().accept();
		  
		  //hme
		  empnew.hmeemp();
	  
	
	}
	@DataProvider
	public Object[][] Rdata() 
	{

	 Object [][] Obj = new Object[4][6];

	 
	 
	 Obj[0][0] = "gfgfgfghfhg";
	 Obj[0][1] = "kurnool@345";
	 Obj[0][2] = "34543";
	 Obj[0][3] = "INDIA";
	 Obj[0][4] = "Andhra Pradesh";
	 Obj[0][5] = "Hyderabad";
	 
	 Obj[1][0] = "hghfghfgfggfgfhgf";
	 Obj[1][1] = "kurnool@345";
	 Obj[1][2] = "34543";
	 Obj[1][3] = "INDIA";
	 Obj[1][4] = "Andhra Pradesh";
	 Obj[1][5] = "Hyderabad";
	 
	 Obj[2][0] = "gvfghfghfghfghfhgfhf";
	 Obj[2][1] = "kurnool@345";
	 Obj[2][2] = "34543";
	 Obj[2][3] = "INDIA";
	 Obj[2][4] = "Andhra Pradesh";
	 Obj[2][5] = "Hyderabad";
	 
	 Obj[3][0] = "ghgfgdgfgfhfkgkjhguyuy";
	 Obj[3][1] = "kurnool@345";
	 Obj[3][2] = "34543";
	 Obj[3][3] = "INDIA";
	 Obj[3][4] = "Andhra Pradesh";
	 Obj[3][5] = "Hyderabad";
	 
	 return Obj;  

	}
	
	//ROle
	@DataProvider
	public Object[][] rdata1()
	{
		
		
		
		
		 Object[][] Obj = new Object[3][2];
		 Obj[0][0]="Bankerlogin";
		 Obj[0] [1] = "E";

		 Obj[1][0] = "EMployeelogin";
		 Obj[1][1] = "E";

		 Obj[2][0] = "ROlecreate";
		 Obj[2][1] = "E";
		
		
		
		
		return Obj;
		
	}
	
//employee
	@DataProvider

	public Object[][] Rdata2()
	{
	Object [][] Obj = new Object[3][4];
	Obj[0][0] = "ghfghfghfgfhgfhgfgf";
	Obj[0][1] = "chandra123@";
	Obj[0][2] = "fnmnmgnmfnmfnmgnmnnddf";
	Obj[0][3] = "jkdjkdfjdfjfjfkdjjkd";

	Obj[1][0] = "uyuyutyutfgffdrfdfgd";
	Obj[1][1] = "chandra123@";
	Obj[1][2] = "fnmnmgnmfnmfnmgnmnnddf";
	Obj[1][3] = "jkdjkdfjdfjfjfkdjjkd";

	Obj[2][0] = "hgffgfghfhgfhgfhgf";
	Obj[2][1] = "chandra123@";
	Obj[2][2] = "fnmnmgnmfnmfnmgnmnnddf";
	Obj[2][3] = "jkdjkdfjdfjfjfkdjjkd";
	return Obj;

	}
	@AfterTest
public void Logout() throws InterruptedException {
		
	AdminHp AHP=PageFactory.initElements(driver,AdminHp.class);
	  AHP.loutgghf();
	  
		driver.close();
		
	}


}

	

