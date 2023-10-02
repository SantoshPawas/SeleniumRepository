package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Classname 
{
	public static void main(String[] args) 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://www.dishtv.in/pages/login.aspx");
		
		
		
		//byclassname
		
		driver.findElement(By.className("login_txt_input")).sendKeys("9545383531");
		driver.findElement(By.className("login_txt_input")).sendKeys("1234");
		
		
		
	}

}
