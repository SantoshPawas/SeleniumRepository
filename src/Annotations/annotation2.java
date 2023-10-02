package Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation2 
{
	@Test
	public void Testcase1()
	{
		System.out.println("runningtest case1");
	}
	@BeforeMethod
	public void t1()
	{
		System.out.println("Running @Before Method of class annotation2");
	}
	@AfterMethod
	public void t2()
	{
		System.out.println("Running After Method of class annotation2");
	}
}
