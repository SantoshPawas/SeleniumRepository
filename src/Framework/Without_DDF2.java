package Framework;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Without_DDF2 
{
	public static void main(String[] args) throws InterruptedException, IOException 
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
		String ExpectedUsername="Velo!city";
		String s1=driver.findElement(By.xpath("//input[@name='username_show']")).getAttribute("value");
		
		boolean status=s1.contains(ExpectedUsername);
		if(status==true)
		{
			System.out.println("Test case is Pass");
		}
		else
		{
			System.out.println("Test case is Fail");
			//take screenshots
			WebElement element=driver.findElement(By.xpath("(//td[@class='welcome_menu'])[2]"));
			
			File source=element.getScreenshotAs(OutputType.FILE);
			
			File dest=new File("D:\\Screenshots\\test1.jpg");
			FileHandler.copy(source, dest);
			
			System.out.println("Screen Shot Taken Successfully");
			
		}
		Thread.sleep(2000);
		
		
		driver.quit();
	}
}
