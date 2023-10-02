package TestNG_Keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethod 
{
	@Test
	public void Login()
	{
		Reporter.log("Running method Login",true);
	}
	@Test(dependsOnMethods= {"Login"})
	public void Logout()
	{
		Reporter.log("Running method Logout",true);
	}

}
