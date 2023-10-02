package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementFrame 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		//wait
		Thread.sleep(2000);
		driver.manage().window().maximize();
		// find xpath for frame
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("//iframe[@id='iframeResult']")); 
		
		//switch to frame by webElement
		driver.switchTo().frame(element);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		Thread.sleep(2000);
		
		//switch to main page
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		//click on home tab
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		driver.close();
		
		
	}

}
