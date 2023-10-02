package DatePicker;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.booking.com/");
		
		Thread.sleep(2000);
		//maximize
		driver.manage().window().maximize();
		//close hidden popup
		driver.findElement(By.xpath("//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e f4552b6561']")).click();
		//wait
		Thread.sleep(2000);
		//click on Check in date  calender
		
		driver.findElement(By.xpath("(//button[@class='d47738b911 e246f833f7 fe211c0731'])[1]")).click();
		
		String Expected_Month_Year="October 2023";
		String Expected_Date="31";
		
		while(true)
		{
			WebElement element=driver.findElement(By.xpath("(//h3[@class='e1eebb6a1e ee7ec6b631'])[1]"));
			String Value=element.getText();
			if(Expected_Month_Year.equals(Value))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 f671049264 deab83296e f4552b6561 dc72a8413c f073249358']")).click();
				
			}
		}
		
		List<WebElement>alldate=driver.findElements(By.xpath("(//table[@class='eb03f3f27f'])[1]/tbody/tr/td"));
		for(WebElement date:alldate)
		{
			String Actual_Date=date.getText();
			if(Expected_Date.equals(Actual_Date))
			{
				date.click();
				break;
			}
			
		}
				
	}
}
