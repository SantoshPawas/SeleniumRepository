package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test5 
{
	@Test                          //Test Method/case
	public void TC1() 
	{
		String S1="Hi";
		
		String S2="Hello";
		
		String S3="Good Morning";

		
	Assert.assertNotEquals(S2,S1);  //Actual(Hello)  Expected(Hi)-->Pass
		
	Assert.assertEquals(S2,S1); //Actual(Hello)  Expected(Hi)-->Fail
		
	Assert.assertEquals(S3,S1);  //Actual(Good Morning)  Expected(Hi)-->Fail
		
	Assert.assertNotEquals(S1,S3); //Actual(Hi)  Expected(Good Morning)--> Pass
		
	}


}
