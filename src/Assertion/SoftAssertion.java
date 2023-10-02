package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion 
{
	@Test
	public void TC1() 
	{
	SoftAssert soft=new SoftAssert();
		
		 String S1="Hi";
		
		String S2="Hello";
		
		String S3="Good Morning";
		

		soft.assertEquals(S2,S1);  //Actual(Hello)    //Expected(Hi)-->fail

		soft.assertNotEquals(S1,S2 );  //Actual(Hi)    //Expected(Hello)-->Pass

		soft.assertEquals(S1,S3);  //Actual(Hi)    //Expected(Good Morning)-->Fail
		
		soft.assertNotEquals(S1,S3); //Actual(Hi)    //Expected(Good Morning)-->Pass

		soft.assertAll();

	}


}
