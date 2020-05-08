package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		Library Lb = new Library();
		Lb.OpenApp("http://183.82.100.55/ranford2/home.aspx");
         Lb.AdminLogin("Admin", "M1ndq");  
         

		
		//to get excel data file
		FileInputStream Fis = new FileInputStream("E:\\TLP27\\E-Banking\\src\\com\\ebanking\\testdata\\Role.xlsx");
		
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
			String Res=Lb.RoleCreation(Rname, Rtyp);
			System.out.println(Res);
			
			wc2.setCellValue(Res);
		}
		
		//Results
		FileOutputStream fos = new FileOutputStream("E:\\TLP27\\E-Banking\\src\\com\\ebanking\\results\\Res_Role.xlsx");
		wb.write(fos);
		wb.close();
		
		
		}
	//
	

	
	}


