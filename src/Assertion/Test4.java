package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test4 
{
	@Test
	public void TC4()
	{
		String name=null;
		//Assert.assertNull(name);
		Assert.assertNotNull(name);
	}

}
