package TestNG_Keyword;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class dependsOnMethods 
{
	@Test
	public void Login()
	{
		Assert.fail();
		Reporter.log("Running method Login",true);
	}
	@Test(dependsOnMethods= {"Login"})
	public void Logout()
	{
		Reporter.log("Running method Logout",true);
	}

}
