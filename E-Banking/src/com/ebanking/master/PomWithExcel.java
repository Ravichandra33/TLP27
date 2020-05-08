package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PomWithExcel {
	WebDriver driver;
	AdminHp AHP; 
	
	@BeforeTest
	public void Login() throws InterruptedException
	{
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("http://183.82.100.55/ranford2");
		
		
		 RanfordHp RHP=PageFactory.initElements(driver,RanfordHp.class);
		  RHP.login();
	}
	@Test(priority=1)
	public void BranchcrExcel() throws InterruptedException, IOException {

		FileInputStream fis = new FileInputStream("E:\\TLP27\\E-Banking\\src\\com\\ebanking\\testdata\\RanfordBank.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet ws = wb.getSheet("Sheet2");
		
		int rowcnt = ws.getLastRowNum();
		
		System.out.println(rowcnt);
		
		
		for (int i = 1; i <= rowcnt; i++) {
			
			XSSFRow wr = ws.getRow(i);
			
			XSSFCell wc = wr.getCell(0);
			XSSFCell wc1 = wr.getCell(1);
			XSSFCell wc2 = wr.getCell(2);
			XSSFCell wc3 = wr.getCell(3);
			XSSFCell wc4 = wr.getCell(4);
			XSSFCell wc5 = wr.getCell(5);
			XSSFCell wc6 = wr.createCell(6);
			
			String BranchName = wc.getStringCellValue();
			String Address1 = wc1.getStringCellValue();
			String ZipCode = wc2.getStringCellValue();		
			String Country = wc3.getStringCellValue();
			String State = wc4.getStringCellValue();
			String City = wc5.getStringCellValue();
			
			
			 AHP=PageFactory.initElements(driver,AdminHp.class);
			  AHP.Br();
			  
		
			  Branchcreation1 Br = PageFactory.initElements(driver, Branchcreation1.class);
			  Br.newbr();
			  
			  branchcreation2 Brhme = PageFactory.initElements(driver, branchcreation2.class);
			  Brhme.Brcr2(BranchName, Address1, ZipCode, Country, State, City);
			  
			  //Alert
			  driver.switchTo().alert().accept();
			  
			  //hme
			  Br.hme();
			  
			  
	}}
	   @Test(priority=2)
		public void RoleForExcel() throws InterruptedException, IOException {
		//to get excel data file
				FileInputStream Fis = new FileInputStream("E:\\TLP27\\E-Banking\\src\\com\\ebanking\\testdata\\RanfordBank.xlsx");
				
				//workbook
				XSSFWorkbook wb = new XSSFWorkbook(Fis);
				//sheet
				XSSFSheet ws = wb.getSheet("Sheet1");
				
				//rowcount
				int Rcount=ws.getLastRowNum();
				System.out.println(Rcount);
				
				
				//Multiple Iterations
				
				for (int i = 1; i <=Rcount; i++) {
					
					//row
					XSSFRow wr = ws.getRow(i);
					//cell
					XSSFCell wc = wr.getCell(0);
					XSSFCell wc1 = wr.getCell(1);
					
					XSSFCell wc2 = wr.createCell(2);
					
					//cell values
					
					String Rname = wc.getStringCellValue();
					String Rtyp = wc1.getStringCellValue();

					Thread.sleep(2000);
					 AHP=PageFactory.initElements(driver,AdminHp.class);
					  AHP.rle();
					  Thread.sleep(2000);
					  newrolecreation rolle=PageFactory.initElements(driver,newrolecreation.class);
					  rolle.newrol();
					  Thread.sleep(2000);
					  rolecrea2 cret =PageFactory.initElements(driver,rolecrea2.class);
					  cret.rlenme(Rname, Rtyp);
					  
					  //Alert
					  driver.switchTo().alert().accept();
					  
					  //hme
					  rolle.hmerole();
				}
	
				}
		         @Test(priority=3)
				public void EmployeeForExcel() throws InterruptedException, IOException {
				FileInputStream fis = new FileInputStream("E:\\TLP27\\E-Banking\\src\\com\\ebanking\\testdata\\RanfordBank.xlsx");
				
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				
				XSSFSheet ws = wb.getSheet("Sheet3");
				
				int rowcnt = ws.getLastRowNum();
				System.out.println(rowcnt);
				
				

				for (int i = 1; i <= rowcnt; i++) {
					
					XSSFRow wr = ws.getRow(i);
					
					XSSFCell wc = wr.getCell(0);
					XSSFCell wc1 = wr.getCell(1);
					XSSFCell wc2 = wr.getCell(2);
					XSSFCell wc3 = wr.getCell(3);
					XSSFCell wc4 = wr.createCell(4);
					
					String EmployerName = wc.getStringCellValue();
					String LoginPassword = wc1.getStringCellValue();
					String Role = wc2.getStringCellValue();		
					String Branch = wc3.getStringCellValue();
					
					 AHP=PageFactory.initElements(driver,AdminHp.class);
					  AHP.emp();
					  
					  Emppomnew empnew=PageFactory.initElements(driver,Emppomnew.class);
					  empnew.nemp();
					  
					  PomEmpCreation empcr =PageFactory.initElements(driver,PomEmpCreation.class);
					  empcr.Empcre(EmployerName, LoginPassword, Role, Branch);
					  
					  //Alert
					  driver.switchTo().alert().accept();
					  
					  //hme
					  empnew.hmeemp();
				  
	
				}
				
				}
	
@AfterTest
public void Logout() throws InterruptedException {
	
	AHP.loutgghf();
	driver.close();
	
}
}

