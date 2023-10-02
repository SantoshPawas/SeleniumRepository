package TestNG_Keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InnovacationCount 
{
	@Test(invocationCount=5)
	public void TC1()
	{
		Reporter.log("Running method TC1",true);
	}

}
