package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Branches extends Base 

{
	@Test(dataProvider="Rdata")
	public void Brcre(String brname, String add1, String zipcode, String cntry,String State,String cty) throws InterruptedException {
		lb.Branchcreation(brname, add1, zipcode, cntry, State, cty);
	
	
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
}