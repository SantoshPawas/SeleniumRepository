package Annotations2;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Four 
{
	@Test
	public void TC4()
	{
		Reporter.log("Running method TC4 of class 4",true);
	}
	@BeforeTest
	public void m3()
	{
		Reporter.log("Running before test of class 4",true);
	}
	@AfterTest
	public void m4()
	{
		Reporter.log("Running After test of class 4",true);
	}
	
}
