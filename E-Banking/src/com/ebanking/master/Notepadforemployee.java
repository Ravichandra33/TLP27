package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepadforemployee {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		Library lib = new Library();


		lib.OpenApp("http://183.82.100.55/ranford2/home.aspx");
		lib.AdminLogin("Admin", "M1ndq");
		  
		 String fpath = "E:\\TLP27\\E-Banking\\src\\com\\ebanking\\testdata\\EMployees.txt";
		String rcpath = "E:\\TLP27\\E-Banking\\src\\com\\ebanking\\results\\employess_Res.txt";
		String SD;
		
		FileReader fr = new FileReader(fpath);
		BufferedReader br = new BufferedReader(fr);
		String Sread =  br.readLine();
		System.out.println(Sread);
		
		FileWriter fw = new FileWriter(rcpath);
		BufferedWriter bw =new BufferedWriter(fw);
		bw.write(Sread);
		bw.newLine();
		
		while ((SD=br.readLine())!=null) {
			
			System.out.println(SD);
			
			String sr[]= SD.split("###");
			
			String  EmployerName =  sr[0];
			String  LoginPassword =  sr[1];
			String  Role =  sr[2];
			String  Branch =  sr[3];
			
			
			String Res = lib.EmployeeCreation(EmployerName, LoginPassword, Role, Branch);
			System.out.println(Res);
			
			bw.write(SD+"&&&&"+Res);
			 bw.newLine();
			 
		}
		bw.close();
		br.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
