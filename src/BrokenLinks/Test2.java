package BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 
{
	public static void main(String[] args) throws MalformedURLException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		
		for(WebElement list:alllinks)
		{
			String url=list.getAttribute("href");
		
			if(url==null||url.isEmpty())
			{
				System.out.println("url is empty");
				continue;
			}
			try
			{
				HttpURLConnection huc=(HttpURLConnection)(new URL(url).openConnection());
				
				huc.connect();
				if(huc.getResponseCode()>=400)
				{
					System.out.println(url+" is broken");
				}
				else
				{
					System.out.println(url+" is valid");
				}
			}
			catch(IOException e)
			{
				
			}
			catch (ClassCastException e)
			{
				// TODO: handle exception
			}
				
			
		}
		
		
		
	}
	

}
