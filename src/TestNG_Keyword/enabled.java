package TestNG_Keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled 
{
	@Test
	public void TC1()
	{
		Reporter.log("Running Method TC1",true);
	}
	@Test(enabled=false)
	public void TC2()
	{
		Reporter.log("Running method TC2",true);
	}
}
