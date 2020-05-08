package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LibraryNG {
	WebDriver driver;
	String Expectvalue,Actval;
	FileInputStream Fis;
	Properties pr;
	
	@Test(priority=1)
	public void OpenApp() throws IOException {
		Fis= new FileInputStream("E:\\TLP27\\E-Banking\\src\\com\\ebanking\\properties\\PropertiesFile.txt");
		pr=new Properties();
		pr.load(Fis);
		
		Expectvalue = "Ranford Bank";
		//launch Webdriver
		    driver=new FirefoxDriver();
		// driver=new ChromeDriver();
			
			//Launch Url
		driver.get("http://183.82.100.55/ranford2/home.aspx");
		
		
		//Maximize
		driver.manage().window().maximize();
		Actval=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		//Comparision
		
		if (Expectvalue.equalsIgnoreCase(Actval)) 
		{
		System.out.println("Ranford Application Launch Succ");	
		}
		else
		{
			System.out.println("Ranford Application Not Launch");	
		}
		
		
		//return "Pass";
	}
	@Test(priority=2)
    public void AdminLogin() throws InterruptedException {
    	 Expectvalue = "Welcome to Admin";
    		
    	 Thread.sleep(3000);
    	driver.findElement(By.id(pr.getProperty("Uname"))).sendKeys("Admin");
    	driver.findElement(By.id(pr.getProperty("pswd"))).sendKeys("M1ndq");
    	driver.findElement(By.xpath(pr.getProperty("sub"))).click();
    	
    	Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
    		
    	//Comparision
    	
    			if (Expectvalue.equalsIgnoreCase(Actval)) 
    			{
    			System.out.println("Admin Login Succ");	
    			}
    			else
    			{
    				System.out.println("Admin Login Failed");	
    			}
    			
    	
		
		
	}
	@Test(priority=3)
    public void Branchcreation() throws InterruptedException {
    	Expectvalue="Sucessfully";
   	 Thread.sleep(4000);
   	 
   			driver.findElement(By.xpath(pr.getProperty("branch"))).click();
   			driver.findElement(By.id(pr.getProperty("new"))).click();
   			
   			
   			
   			
   			
   			//branchname
   			driver.findElement(By.id(pr.getProperty("name"))).sendKeys("jkdjkdfjdfjfjfkdjjkd");
   		
   			//Add 1
   			driver.findElement(By.xpath(pr.getProperty("add12"))).sendKeys("Mindqsys@123ddfdfdf");
   		    //Zipcode
   			driver.findElement(By.id(pr.getProperty("zipp"))).sendKeys("34234");
   			//dropdown
   			
   			Select Ctry=new Select(driver.findElement(By.id(pr.getProperty("cttyy"))));
   			Ctry.selectByVisibleText("INDIA");
   			
   			//State
   			Select state=new Select(driver.findElement(By.id(pr.getProperty("stty"))));
   			state.selectByVisibleText("Andhra Pradesh");
   			
   			  
   			//city/
   			Select city=new Select(driver.findElement(By.id(pr.getProperty("cyty"))));
   			city.selectByVisibleText("Hyderabad");
   			
   			//submit
   			driver.findElement(By.id(pr.getProperty("sbbm"))).click();
   			Thread.sleep(4000);
   		  
   			//Alert
   			
   			Actval=driver.switchTo().alert().getText();
   	   driver.switchTo().alert().accept();
   	   driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
   			
   			//comparison
   	   if (Actval.contains(Expectvalue)) {
   		System.out.println("Branch created");
   	} else {
   		System.out.println("already Branch exist");
   	}
	//return Actval;
   			
   			
	
   }
    /*@Test
    public void Homebutton() {
    	
    	
    	driver.findElement(By.xpath(pr.getProperty("hme"))).click();		
   }*/
    
    @Test(priority=4)
    public void RoleCreation() throws InterruptedException {
    	Expectvalue = "Sucessfully";
    
    	driver.findElement(By.xpath(pr.getProperty("rllle"))).click();		
    	
    	driver.findElement(By.xpath(pr.getProperty("link"))).click();
    	
    	driver.findElement(By.id(pr.getProperty("nme"))).sendKeys("RolerBank");
    	
    	Select RoleType=new Select(driver.findElement(By.id(pr.getProperty("tpe"))));
    	
    	RoleType.selectByVisibleText("E");
    	
    	driver.findElement(By.id(pr.getProperty("smtt"))).click();
    	Thread.sleep(4000);
    	//Alert
    	Actval=driver.switchTo().alert().getText();
    	driver.switchTo().alert().accept();
    	//home
    	driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
    	
    	//comparison
    	   if (Actval.contains(Expectvalue)) {
    		System.out.println("Role created");
    	} 
    	   else {
    		System.out.println("already Role existed");
    	}
		//return Actval;
		
    	   
    			
    	
    	
	
	
   }
    @Test(priority=5)
    public void EmployeeCreation() throws InterruptedException {
	
    	Expectvalue="Successfully";
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath(pr.getProperty("emp"))).click();
    	
    	driver.findElement(By.xpath(pr.getProperty("neemp"))).click();
    	Thread.sleep(4000);

    	driver.findElement(By.id(pr.getProperty("emppme"))).sendKeys("CHANDRASHjdjjdfjEETYcddfdf");
    	
    	driver.findElement(By.id(pr.getProperty("emppswdd"))).sendKeys("chandra123@");
    	
    	Select Role=new Select(driver.findElement(By.id(pr.getProperty("rllenme"))));
    	Role.selectByVisibleText("fnmnmgnmfnmfnmgnmnnddf");
    	
    	Select Branch=new Select(driver.findElement(By.xpath(pr.getProperty("brnc"))));
    	Branch.selectByVisibleText("jkdjkdfjdfjfjfkdjjkd");
        //submit
    	driver.findElement(By.xpath(pr.getProperty("smm"))).click();
    	Thread.sleep(2000);
    	
    	Actval=driver.switchTo().alert().getText();
    	driver.switchTo().alert().accept();
    	Thread.sleep(2000);
    	//comparison
    	   if (Actval.contains(Expectvalue)) {
    		System.out.println("Employee created");
    	} else {
    		System.out.println("already Employee  existed");
    	}
    	
    	
    	
    	
    	
    	
    	
    		//Home button
    		driver.findElement(By.xpath(pr.getProperty("hmme"))).click();
			//return Actval;		
    		
   }
    @Test(priority=6)
    public void Logout() throws InterruptedException {
    	Thread.sleep(4000);
    	Expectvalue="Welcome to Ranford Bank - Welcome to Personalized Banking";

    	driver.findElement(By.xpath(pr.getProperty("llh"))).click();
    	
    	Actval= driver.findElement(By.xpath(pr.getProperty("llhh"))).getText();
    	//comparison
    	if (Actval.contains(Expectvalue)) {
    		System.out.println("Succesfully logged out");
    	} else {
    System.out.println("succesfully not logged out");
    	}
	
 }
    @Test(priority=7)
    public void Closeapp() {
    	driver.close();
    	
	
  }

}
