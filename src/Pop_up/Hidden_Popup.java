package Pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hidden_Popup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver();
		
		//get URL
		driver.get("https://www.flipkart.com/");
		
		
		WebElement tb=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		
		//wait
		Thread.sleep(2000);
		tb.sendKeys("9284679148");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		
		
		
		
		
		
	}

}
