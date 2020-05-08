package com.ebanking.keyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Keyword {

	public static void main(String[] args) throws IOException, InterruptedException {
		lib lb= new lib();
		
		String Res=null;
		
		String Kpath="E:\\TLP27\\E-Banking\\src\\com\\ebanking\\keyword\\keyword_data.xlsx";
String Kout = "E:\\TLP27\\E-Banking\\src\\com\\ebanking\\keyword\\keyword_Res.xlsx";

FileInputStream fis = new FileInputStream(Kpath);

XSSFWorkbook wb = new XSSFWorkbook(fis);

XSSFSheet ws = wb.getSheet("TestCase");

XSSFSheet ws1 = wb.getSheet("TestSteps");


int tcrc = ws.getLastRowNum();
System.out.println(tcrc);

int tsrc = ws1.getLastRowNum();
System.out.println(tsrc);

for (int i=1; i <=tcrc; i++) {
	
	String exe = ws.getRow(i).getCell(2).getStringCellValue();
	
	if (exe.equalsIgnoreCase("Y")) {

		String tcid = ws.getRow(i).getCell(0).getStringCellValue();
		System.out.println(tcid);
		
		for (int j = 1; j <=tsrc; j++) {
			
			String tsTcid = ws1.getRow(j).getCell(0).getStringCellValue();
			
			if (tcid.equalsIgnoreCase(tsTcid)) {
				
				String Key=ws1.getRow(j).getCell(3).getStringCellValue();
				System.out.println(Key);
				
				switch (Key) {
				
				case "RLanch":
					Res=lb.OpenApp("http://183.82.100.55/ranford2/home.aspx");
					
					break;
					
				case "RLogin" :
					Res = lb.AdminLogin("Admin", "M1ndq");

					break;
					
				case "RBranch" :
				Res=lb.Branchcreation("djfkdfjkdfjggt", "jjgj@54354345", "43215", "INDIA", "Andhra Pradesh", "Hyderabad");
				break;
				case "RRole" :
					Res = lb.RoleCreation("clerkbaker", "E");

					break;
				case "REmR" :
					Res = lb.EmployeeCreation("rajputtnagar", "chdvh@j545", "fnmnmgnmfnmfnmgnmnnddf","jkdjkdfjdfjfjfkdjjkd");

					break;
				case "RLogout" :
					Res = lb.Logout();

					break;
				case "RClose" :
					Res = lb.Closeapp();

					break;
				
				default:
				System.out.println("Pass a valid Keyword");
				
					break;
				}
				ws1.getRow(j).createCell(4).setCellValue(Res);
				
				//result updation in test case sheet
				
				if (!ws1.getRow(j).getCell(4).getStringCellValue().equalsIgnoreCase("Fail"))
				{
					ws.getRow(i).createCell(3).setCellValue(Res);
				}
				else
				{
					ws.getRow(i).createCell(3).setCellValue("Fail");
				}
				
				
			}
			
			
			
		}
		
	}
	else
	{
		ws.getRow(i).createCell(3).setCellValue("BLOCKED");
	}
}
FileOutputStream fo=new FileOutputStream(Kout);
wb.write(fo);
wb.close();

}






				
				
			
		
	
	
	

















	}


