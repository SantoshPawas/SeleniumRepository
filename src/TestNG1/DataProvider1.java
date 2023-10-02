package TestNG1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 
{
	@Test(dataProvider="m1")
	public void Login(String UN,String PSW)
	{
		System.out.println("Username:"+UN);
		System.out.println("Password:"+PSW);
	}
	@DataProvider
	public Object[][] m1()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="Rohit";
		data[0][1]="123";
		
		data[1][0]="Virat";
		data[1][1]="456";
		
		data[2][0]="KL";
		data[2][1]="789";
		
		return data;
	}
	
	

}
