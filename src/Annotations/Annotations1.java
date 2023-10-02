package Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations1 
{
	
	
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("Open Browser",true);
	}
	@AfterClass
	public void CloseBrowser()
	{
		Reporter.log("Close Browser",true);
	}
	@BeforeMethod
	public void LoginToApp()
	{
		Reporter.log("Login to app ",true);
	}
	@Test
	public void SearchHotels()
	{
		Reporter.log("Running method Search Hotel",true);
	}
	@Test
	public void changePassword()
	{
		Reporter.log("Running Change Password method",true);
	}
	@AfterMethod
	public void LogoutFromApp()
	{
		Reporter.log("Logout from App",true);
	}
	

}
