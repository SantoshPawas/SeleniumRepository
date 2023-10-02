package Assertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 
{
	@Test
	public void TC3()
	{
		String name=null;
		Assert.assertNull(name);
		Assert.assertNotNull(name);
	}
	


}
