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

public class ElementScreenshot 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://www.flipkart.com/tyy/4io/~cs-vxo2sm8jwu/pr?sid=tyy%2C4io&collection-tab-name=realme+c53&param=1789&otracker=hp_bannerads_1_2.bannerAdCard.BANNERADS_Cat_Mob_HPW_Realme%2BC53-Sale%2Bis%2BOn_U80HKY4U18P6");
		
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.xpath("//img[@loading='eager']"));
		
		File Source=element.getScreenshotAs(OutputType.FILE);
		
		File Dest=new File("D:\\Screenshots\\element1.jpg");
		
		FileHandler.copy(Source, Dest);
		
		//wait
		Thread.sleep(2000);
		
		driver.close();
		
	}
		
	
	
	
	
	

}
