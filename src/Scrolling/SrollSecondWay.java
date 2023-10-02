package Scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SrollSecondWay
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(2000);
		
		WebElement s1=driver.findElement(By.xpath("//*[text()='Pinterest']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",s1);
		Thread.sleep(2000);
		
		WebElement s2=driver.findElement(By.xpath("//i[@class='icon-linux']"));
		
		((JavascriptExecutor)driver).executeAsyncScript("arguments[0].scrollIntoView()",s2);
	
		
		
	}

}
