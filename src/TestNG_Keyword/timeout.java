package TestNG_Keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class timeout
{
	@Test(timeOut=5000)
	public void TC1()
	{
		Reporter.log("Running method TC1",true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("Running method TC2",true);
	}

}
