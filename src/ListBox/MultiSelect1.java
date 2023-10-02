package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect1
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
		
		Thread.sleep(2000);
		
		// step 1 find address of listbox
		
		WebElement element=driver.findElement(By.xpath("//select[@name='names']"));
		
		//step2: -Creat an obj of Select Class
		
		Select s1=new Select(element);
		
		//call method
		
//		s1.selectByIndex(0);
//		s1.selectByIndex(1);
//		s1.selectByIndex(2);
//		s1.selectByIndex(3);
//		s1.selectByIndex(4);
		
//		for(int i=0;i<5;i++)
//		{
//			Thread.sleep(1000);
//			s1.selectByIndex(i);		
//			
//		}
//		
		
//		s1.selectByValue("sandip");
//		s1.selectByValue("vishranti");
//		s1.selectByValue("santosh");
//		
		s1.selectByVisibleText("Sandip");
		s1.selectByVisibleText("Sheetal");
		s1.selectByVisibleText("Santosh");
		
		WebElement we= s1.getFirstSelectedOption();
		
		String str=we.getText();
		System.out.println(str);
		
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
