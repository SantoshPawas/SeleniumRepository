package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sncy3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//*[@name='sex'])[2]")).click();
		
//		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(3));
//		
//		WebElement x=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='sex'])[2]")));
//		
//		x.click();
//		
		
		
		
	}

}
