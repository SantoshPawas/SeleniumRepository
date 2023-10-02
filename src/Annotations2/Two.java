package Annotations2;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Two 
{
	@Test
	public void TC2()
	{
		Reporter.log("Running method TC2 of class 2",true);
	}
	@BeforeTest
	public void m1()
	{
		Reporter.log("Runnning before test of class 2",true);
	}
	@AfterTest
	public void m2()
	{
		Reporter.log("Running after test of class 2",true);
	}

}
