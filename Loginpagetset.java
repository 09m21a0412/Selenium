package com.amazon.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amazon.qa.base.Testbase;
import com.amazon.qa.pages.Loginpage;
//import com.amazon.qa.pages.Todaysdeal;

public class Loginpagetset extends Testbase{
	
	Loginpage loginpage;
	public Loginpagetset()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
	initilization();
	loginpage = new Loginpage();
		
	}
	
	
  //*@Test
	//public void validateloginpage()
	//{
	//String title =	loginpage.validateloginpage();
	//Assert.assertEquals(title,  "Your Amazon.in");
	//} 
	
	@Test(priority=1)
	public void logintest() 
	{
		
		loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
	//loginpage.login(prop.getProperty("password"));
	}
	/*
	@Test(priority=1)
	public void Starthere() 
	{
		
		loginpage.clickonsigninpage();
	//loginpage.login(prop.getProperty("password"));
	}*/
	
	/*@DataProvider
	public void getTestData()
	{
		
		
	}*/
	
	/*@Test(priority=2)
	public void filinddatatest() 
	{
		
		loginpage.filingdatapage();
	//loginpage.login(prop.getProperty("password"));
	}
	*/
	
	
	
/*	@Test(priority=2)
	
	public void tdeal()
	{
		
		Todaysdeal.clickonTdydeal();
	}*/
	
//	@Test(priority=2)
	//public void logintest1()
	//{
	//loginpage.login1(prop.getProperty("password"));
	//}
	
		
	
	@AfterMethod
	
	public void tearDown()
	{
		driver.close();
	}
	
	
	
}
