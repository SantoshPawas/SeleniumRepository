package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Deselect 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-errors=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		
		//url
		driver.get("file:///C:/Users/shree/Desktop/multselect.html");
		//wait
		Thread.sleep(2000);
		
		//maximise
		
		driver.manage().window().maximize();
		
		WebElement we=driver.findElement(By.xpath("//select[@name='names']"));
		
		Select s1=new Select(we);
		
		s1.selectByIndex(0);
		s1.selectByValue("vishranti");
		s1.selectByVisibleText("Sheetal");
		
		Thread.sleep(2000);
		
		//s1.deselectAll();
		
		s1.deselectByIndex(0);
		
	}

}
