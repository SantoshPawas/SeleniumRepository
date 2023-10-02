package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_DDF
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		//enter URL
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		//wait
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Enter username
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Velocity");
		//enter password
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("U1YP1G");
		Thread.sleep(2000);

		//click on login button
		driver.findElement(By.xpath("//input[@name='login']")).click();
		//Testcase- verify username
		String ExpectedUsername="Velocity!";
		//get login name		//helloVelocity1
		String s1=driver.findElement(By.xpath("//input[@name='username_show']")).getAttribute("value");
		
		String a1[]=s1.split(" ");
		String ActualUsername=a1[1];
		if(ExpectedUsername.equals(ActualUsername))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
		
				
	}

}
