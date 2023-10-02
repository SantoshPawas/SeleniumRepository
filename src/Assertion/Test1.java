package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 
{
	@Test
	public void TC1()
	{
		String ExpectedResult="Forgotten Password?";
		String ActualResult="Forgotten Password?";
		Assert.assertEquals(ActualResult, ExpectedResult);
	}

	@Test
	public void TC2()
	{
		String ExpectedResult="Forgotten Password?";
		String ActualResult="Forgotten Password?";
		Assert.assertNotEquals(ActualResult, ExpectedResult);
	}
	@Test
	public void TC3()
	{
		Boolean status=true;
		Assert.assertTrue(status);
	}
	@Test
	public void TC4()
	{
		Boolean status=true;
		Assert.assertFalse(status);
	}
}
