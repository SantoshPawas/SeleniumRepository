package TestNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Class_Ex 
{
//	public static void main(String[] args) 
//	{
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com");
//	}
		@Test
		public void TC1()		//test method/case 1
		{
			Reporter.log("Rennuing TC1",true);
		}
	

}
