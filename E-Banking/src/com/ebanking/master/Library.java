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

public class Library {
	public static WebDriver driver;
	public static String Expectvalue,Actval;
	public static FileInputStream Fis;
	public static Properties pr;
	
	public String OpenApp(String Url) throws IOException {
		Fis= new FileInputStream("E:\\TLP27\\E-Banking\\src\\com\\ebanking\\properties\\PropertiesFile.txt");
		pr=new Properties();
		pr.load(Fis);
		
		Expectvalue = "Ranford Bank";
		//launch Webdriver
		System.setProperty("WebDriver.gecko.driver", "‪C:\\Users\\abc\\Desktop\\geckodriver.exe");
		    driver=new FirefoxDriver();
		// driver=new ChromeDriver();
			
			//Launch Url
		driver.get(Url);
		
		
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
		
		
		return "Pass";
	}
    public void AdminLogin(String Usrn,String pswd) throws InterruptedException {
    	 Expectvalue = "Welcome to Admin";
    		
    	 Thread.sleep(3000);
    	driver.findElement(By.id(pr.getProperty("Uname"))).sendKeys(Usrn);
    	driver.findElement(By.id(pr.getProperty("pswd"))).sendKeys(pswd);
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
    public String Branchcreation(String Bn,String ad,String Zc,String cty,String ste,String citys) throws InterruptedException {
    	Expectvalue="Sucessfully";
   	 Thread.sleep(4000);
   	 
   			driver.findElement(By.xpath(pr.getProperty("branch"))).click();
   			driver.findElement(By.id(pr.getProperty("new"))).click();
   			
   			
   			
   			
   			
   			//branchname
   			driver.findElement(By.id(pr.getProperty("name"))).sendKeys(Bn);
   		
   			//Add 1
   			driver.findElement(By.xpath(pr.getProperty("add12"))).sendKeys(ad);
   		    //Zipcode
   			driver.findElement(By.id(pr.getProperty("zipp"))).sendKeys(Zc);
   			//dropdown
   			
   			Select Ctry=new Select(driver.findElement(By.id(pr.getProperty("cttyy"))));
   			Ctry.selectByVisibleText(cty);
   			
   			//State
   			Select state=new Select(driver.findElement(By.id(pr.getProperty("stty"))));
   			state.selectByVisibleText(ste);
   			
   			  
   			//city/
   			Select city=new Select(driver.findElement(By.id(pr.getProperty("cyty"))));
   			city.selectByVisibleText(citys);
   			
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
	return Actval;
   			
   			
	
   }
    
    public void Homebutton() {
    	
    	
    	driver.findElement(By.xpath(pr.getProperty("hme"))).click();		
    }
    
    
    public String RoleCreation(String rle,String tp) throws InterruptedException {
    	Expectvalue = "Sucessfully";
    
    	driver.findElement(By.xpath(pr.getProperty("rllle"))).click();		
    	
    	driver.findElement(By.xpath(pr.getProperty("link"))).click();
    	
    	driver.findElement(By.id(pr.getProperty("nme"))).sendKeys(rle);
    	
    	Select RoleType=new Select(driver.findElement(By.id(pr.getProperty("tpe"))));
    	
    	RoleType.selectByVisibleText(tp);
    	
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
		return Actval;
		
    	   
    			
    	
    	
	
	
   }
    public String EmployeeCreation(String emp,String psw,String re,String brnc) throws InterruptedException {
	
    	Expectvalue="Successfully";
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath(pr.getProperty("emp"))).click();
    	
    	driver.findElement(By.xpath(pr.getProperty("neemp"))).click();
    	Thread.sleep(4000);

    	driver.findElement(By.id(pr.getProperty("emppme"))).sendKeys(emp);
    	
    	driver.findElement(By.id(pr.getProperty("emppswdd"))).sendKeys(psw);
    	
    	Select Role=new Select(driver.findElement(By.id(pr.getProperty("rllenme"))));
    	Role.selectByVisibleText(re);
    	
    	Select Branch=new Select(driver.findElement(By.xpath(pr.getProperty("brnc"))));
    	Branch.selectByVisibleText(brnc);
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
			return Actval;		
    		
   }
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
    public void Closeapp() {
    	driver.quit();
    	
	
  }

}
