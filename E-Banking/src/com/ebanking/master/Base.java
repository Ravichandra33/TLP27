package com.ebanking.master;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import org.testng.annotations.AfterSuite;

public class Base {
 
	Library lb = new Library();
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  lb.AdminLogin("Admin", "M1ndq");
	  
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  lb.Logout();
  
  }

  @BeforeSuite
  public void beforeSuite() throws IOException {
	lb.OpenApp("http://183.82.100.55/ranford2/home.aspx");  
  }

  @AfterSuite
  public void afterSuite() {
	  lb.Closeapp();
  }

}
