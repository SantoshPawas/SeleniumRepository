package TestNG_Suite;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingTset 
{
	
	
	@Test(groups="Login")
	public void TC1()
	{
		Reporter.log("Running metyhod TC1",true);
	}
	@Test(groups="Login")
	public  void TC2()
	{
		Reporter.log("Running method TC2",true);
	}
	@Test(groups="Registration")
	public void TC3()
	{
		Reporter.log("Running method TC3",true);
	}
	@Test(groups="Registration")
	public void TC4()
	{
		Reporter.log("Running method TC4",true);
	}
	@Test(groups="SearrchHotels")
	public void TC5()
	{
		Reporter.log("Running method TC5",true);
	}
	@Test(groups="ChangePassword")
	public void TC6()
	{
		Reporter.log("Running method TC6",true);
	}
	@Test(groups="ChangePassword")
	public void TC7()
	{
		Reporter.log("Running method TC7",true);
	}
	
	

}
