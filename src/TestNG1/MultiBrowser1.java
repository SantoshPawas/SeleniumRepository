package TestNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class MultiBrowser1 
{
	@Parameters("browserName")
	@Test
	public void TC1(String browserName) throws InterruptedException
	{
		WebDriver driver=null;
		if(browserName.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Velocity");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("U1YP1G");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		String ExpectedUsername="Velocity!";
		String s1=driver.findElement(By.xpath("//input[@name='username_show']")).getAttribute("value");
		
		String A1[]=s1.split(" ");
		String ActualUsername=A1[1];
		
		if(ExpectedUsername.equals(ActualUsername))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		//driver.quit();
		
		
	}
}

