package BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.cert.Certificate;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException
	{
		
		ChromeOptions CO=new ChromeOptions();
		CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		 WebDriver  driver=new ChromeDriver(CO); 
		
		//To enter URL/Open an Application
		driver.get("http://www.deadlinkcity.com/");
				
		 //Wait
		Thread.sleep(2000);
		//identify all links
		List<WebElement> alllink=driver.findElements(By.tagName("a"));
		
		for(WebElement link:alllink)
		{
			String url=link.getAttribute("href");
			
			if(url==null||url.isEmpty())
			{
				System.out.println(url+" is empty");
				continue;
			}
			
			HttpURLConnection huc=(HttpURLConnection)(new URL(url).openConnection());
			huc.connect();
			try
			
			{
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
			catch(ClassCastException x)
			{
				
			}
			
		}
				
	}

		
	

}
