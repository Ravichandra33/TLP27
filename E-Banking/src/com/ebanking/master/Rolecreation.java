package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Rolecreation extends Base
{
@Test(dataProvider="Rdata")
	public void rolec(String Rlename, String RLetpe) throws InterruptedException 
{
		
		lb.RoleCreation(Rlename, RLetpe);
	}


@DataProvider

public Object [][] Rdata()
{

 Object[][] Obj = new Object[3][2];
Obj[0][0]="gfgfggfh";
Obj[0] [1] = "E";

Obj[1][0] = "gfhgfhgfhgf";
Obj[1][1] = "E";

Obj[2][0] = "hghfghfghf";
Obj[2][1] = "E";

return Obj;

}
}
