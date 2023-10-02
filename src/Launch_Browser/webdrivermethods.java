package Launch_Browser;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class webdrivermethods
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		driver.get("http://facebook.com");
		
		//wait
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.manage().window().minimize();
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		
		
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		System.out.println(driver.manage().window().getSize());
		
//		Dimension d1=new Dimension(200,200);
//		
//		driver.manage().window().setSize(d1);
		
		
		System.out.println(driver.manage().window().getPosition());
		
//		Point p1=new Point(100,200);
//		
//		driver.manage().window().setPosition(p1);
		
		//driver.close();
		driver.quit();
		
	}
	

}
