package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class empcrestion extends Base
{
@Test(dataProvider="Rdata")
	public void emp(String brname, String passwrd, String Role, String Brnc) throws InterruptedException {
	lb.EmployeeCreation(brname, passwrd, Role, Brnc);
}


@DataProvider

public Object[][] Rdata()
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

	}


