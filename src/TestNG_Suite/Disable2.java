package TestNG_Suite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disable2 
{
	@Test
	public void TC1()
	{
		Reporter.log("Running method TC1",true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("Running method TC2",true);
	}
	@Test
	public void TC3()
	{
	
		Reporter.log("Running method TC3",true);
	}
	@Test
	public void TC4()
	{
		Reporter.log("Running method TC4",true);
	}

}
