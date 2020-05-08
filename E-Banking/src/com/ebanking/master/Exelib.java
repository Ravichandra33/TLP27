package com.ebanking.master;

import java.io.IOException;

public class Exelib {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		Library lib = new Library();
		String Rval=lib.OpenApp("http://183.82.100.55/ranford2/home.aspx");
		System.out.println(Rval);
		lib.AdminLogin("Admin","M1ndq");
		lib.Branchcreation("jkdjkdfjdfjfjfkdjjkd","Mindqsys@123ddfdfdf","34234","INDIA","Andhra Pradesh","Hyderabad");
		lib.Homebutton();
		lib.RoleCreation("fnmnmgnmfnmfnmgnmnnddf","E");
		lib.EmployeeCreation("CHANDRASHjdjjdfjEETYcddfdf","chandra123@","fnmnmgnmfnmfnmgnmnnddf","jkdjkdfjdfjfjfkdjjkd");
		lib.Logout();
		lib.Closeapp();
		
		
		
	}

}

