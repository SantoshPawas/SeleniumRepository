package MockEx;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo1 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://dash.gallery/dash-tsne/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//xpath for first sleder
		List<WebElement> optionslider1=driver.findElements(By.xpath("(//*[@class='rc-slider-step'])[1]/span"));
		
		for(WebElement element:optionslider1)
		{
			Thread.sleep(1000);
			element.click();
		}
		
		
		//for second slider
		
		List<WebElement> optionsslider2=driver.findElements(By.xpath("//*[@class='rc-slider-step'])[2]/span"));
		
		for(WebElement d1:optionsslider2)
		{
			Thread.sleep(1000);
			d1.click();
		}
		
	}

}
