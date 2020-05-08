package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NotepadBranches {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
Library lib = new Library();


lib.OpenApp("http://183.82.100.55/ranford2/home.aspx");
lib.AdminLogin("Admin", "M1ndq");
  
String fpath = "E:\\TLP27\\E-Banking\\src\\com\\ebanking\\testdata\\Branch.txt";


String rcfilepath = "E:\\TLP27\\E-Banking\\src\\com\\ebanking\\results\\Branch_Res.txt";
String SD;
FileReader fr = new FileReader(fpath);
BufferedReader br = new BufferedReader(fr);
String sread = br.readLine();
System.out.println(sread);

FileWriter fw = new FileWriter(rcfilepath);
BufferedWriter bw = new BufferedWriter(fw);
bw.write(sread);
bw.newLine();


while ((SD=br.readLine())!=null) {
	
	System.out.println(SD);
	 
 String	SR[]=SD.split("###");
 
 String BranchName = SR[0];
 String Address1 = SR[1];
 String ZipCode = SR[2];
 String Country = SR[3];
 String State = SR[4];
 String City = SR[5];
 

 
 String Res = lib.Branchcreation(BranchName, Address1, ZipCode, Country, State, City);
 System.out.println(Res);
 
 bw.write(SD+"&&&&"+Res);
 bw.newLine();
 
 
 
}

bw.close();
br.close();
	}

}
