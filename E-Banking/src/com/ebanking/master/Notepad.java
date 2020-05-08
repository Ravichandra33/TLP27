package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepad {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		Library lib = new Library();
		lib.OpenApp("http://183.82.100.55/ranford2/home.aspx");
	    lib.AdminLogin("Admin", "M1ndq");
	      
	    //to get test data file
	    
	    String fpath = "E:\\TLP27\\E-Banking\\src\\com\\ebanking\\testdata\\Role.txt";
	
	    //to get results file path
	    String recfilepath = "E:\\TLP27\\E-Banking\\src\\com\\ebanking\\results\\Role_Res.txt";
	String SD;
	
	    //to get text data file
	    FileReader fr = new FileReader(fpath);
	    BufferedReader br = new BufferedReader(fr);
	    
	    String  Sread = br.readLine();
	
	    System.out.println(Sread);
	    
	    //write header line into results file
	    
	    FileWriter fw = new FileWriter(recfilepath);
	    BufferedWriter bw = new BufferedWriter(fw);
	    bw.write(Sread);
	    bw.newLine();
	    
	    
	    
	    
	    //whileloop
	    while ((SD=br.readLine())!=null) {
	    	System.out.println(SD);
	    	
	    	
	    	//split
	    	String SR[]  =  SD.split("###");
	    	
	    	String Rname = SR[0];
	    	String Rtype = SR[1];
	    	
	    	String 	Res = lib.RoleCreation(Rname, Rtype);
	    	System.out.println(Res);
	    	
	    	//Results
	    	bw.write(SD+"$$$$"+Res);
	    	bw.newLine();
			
		}
	
	bw.close();
	br.close();
	}

}
