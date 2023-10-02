package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class SectionScreenShot 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://www.flipkart.com/tyy/4io/~cs-vxo2sm8jwu/pr?sid=tyy%2C4io&collection-tab-name=realme+c53&param=1789&otracker=hp_bannerads_1_2.bannerAdCard.BANNERADS_Cat_Mob_HPW_Realme%2BC53-Sale%2Bis%2BOn_U80HKY4U18P6");
		
		driver.manage().window().maximize();
		
		WebElement section=driver.findElement(By.xpath("//div[@class='_2kHMtA']"));
		
		File Source=section.getScreenshotAs(OutputType.FILE);
		
		File Destination=new File("D:\\Screenshots\\section01.jpg");
		
		FileHandler.copy(Source, Destination);
	//	System.out.println("Section Screenshots takes successfully");
		
		
		
		
		
		//wait
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
