package Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Three 
{
	@Test
	public void TC3()
	{
		Reporter.log("Running method TC3 of class 3",true);
	}
	@BeforeSuite
	public void x1()
	{
		Reporter.log("Running Befor suite of class 3",true);
	}
	@AfterTest
	public void x2()
	{
		Reporter.log("Running after suite of class 3",true);
	}

}
