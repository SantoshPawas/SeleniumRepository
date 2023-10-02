package Annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class One 
{
	@Test
	public void TC1()
	{
		Reporter.log("Running method TC1 of class 1",true);
	}

}
