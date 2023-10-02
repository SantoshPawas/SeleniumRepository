package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameindex 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//switchto frame
		
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		//switch to parent frame
		
		
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
		Thread.sleep(2000);
		driver.close();
		
		
	}
	

}
