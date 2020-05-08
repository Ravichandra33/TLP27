package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelforBranches {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		Library Lb = new Library();
		Lb.OpenApp("http://183.82.100.55/ranford2/home.aspx");
        Lb.AdminLogin("Admin", "M1ndq"); 
        
		
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
			
			String res = Lb.Branchcreation(BranchName, Address1, ZipCode, Country, State, City);
			
			System.out.println(res);
			wc6.setCellValue(res);
		}
		
	
	FileOutputStream fos = new FileOutputStream("E:\\TLP27\\E-Banking\\src\\com\\ebanking\\results\\branch_Res.xlsx");
	wb.write(fos);
	wb.close();
	
	}

}
