package TestNG_Suite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 
{
	@Test
	public void TC5()
	{
		Reporter.log("Running method TC5",true);
	}
	@Test
	public void TC6()
	{
		Assert.fail();
		Reporter.log("Running TC6",true);
	}

}
