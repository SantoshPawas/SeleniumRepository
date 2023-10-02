package TestNG_Keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority2 
{
	@Test(priority=2)
	public void TC1()
	{
		Reporter.log("Running method TC!",true);
	}
	@Test(priority=1)
	public void TC2()
	{
		Reporter.log("Running method TC2",true);
	}
	@Test
	public void TC3()
	{
		Reporter.log("Running method TC3",true);
	}


}
