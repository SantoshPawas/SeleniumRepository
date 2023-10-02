package handlingmultmethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class findelement_findElements 
{
	public static void main(String[] args) 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver();
		
		//get URL
		driver.get("https://www.facebook.com/");
		
		List<WebElement> lw=driver.findElements(By.xpath("//a"));
		
		String str;
		for(WebElement ele:lw)
		{
			str=ele.getText();
			System.out.println(str);
		}
		
		
	}
	

}
