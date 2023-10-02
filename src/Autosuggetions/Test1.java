package Autosuggetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		
		//url
		driver.get("https://www.google.com/");
		
		//wait
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("skybags");
		
		//wait
		Thread.sleep(2000);
		//highlight all options
		
		List<WebElement> AllOptions=driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]//li"));
		
		//wait
		Thread.sleep(2000);
		
		for(WebElement op:AllOptions)
		{
			String text=op.getText();
			if(text.equals("skybags backpack"))
			{
				op.click();
				break;
			}
		}
	}

}
