package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotationdemo2
{
	@BeforeSuite
	public void TC5()
	{
		System.out.println("Running Before Suite annotation");
	}
	@BeforeClass
	public void TC1()
	{
		System.out.println("Running Befor class annotation");
	}
	
	@BeforeMethod
	public void TC2()
	{
		System.out.println("Running  before method annotation");
	}
	@Test
	public void Testcase2()
	{
		System.out.println("runningtest case2");
	}
	
	@AfterMethod
	public void TC3()
	{
		System.out.println("Running  after method annotation");
	}
	
	@AfterClass
	public void TC4()
	{
		System.out.println("Running  After class annotation");
	}
	
	@AfterSuite
	public void TC6()
	{
		System.out.println("Running After Suite annotation");
	}
}
