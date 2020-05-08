package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class employees {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		Library lb = new Library();
		lb.OpenApp("http://183.82.100.55/ranford2/home.aspx");
	lb.AdminLogin("Admin", "M1ndq");
	
	
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
		
		
		String res = lb.EmployeeCreation(EmployerName, LoginPassword, Role, Branch);
				System.out.println(res);
		wc4.setCellValue(res);
	}
	

FileOutputStream fos = new FileOutputStream("E:\\TLP27\\E-Banking\\src\\com\\ebanking\\results\\Employees_Res.xlsx");
wb.write(fos);
wb.close();

}

	
	
	}


