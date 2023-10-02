package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameID 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		//wait
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//switch to frame
		driver.switchTo().frame("iframeResult");
		
		//click on click me to see date & time
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		
		

	}
	
	

}
