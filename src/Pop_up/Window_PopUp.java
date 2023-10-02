package Pop_up;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Window_PopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		
		//get url
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(2000);
		//click new button
		WebElement element=driver.findElement(By.xpath("//input[@name='NewTab']"));
		element.click();
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[@class='menu-item-text']")); not working
		
		//getting ids of all id
		Set<String> AllID=driver.getWindowHandles();
		
		//copy ids set into arraylist 
		ArrayList<String> al=new ArrayList<String>(AllID);
		//getting id of perticuler window by get()
		String mainid=al.get(0);
		String childid=al.get(1);
		
		System.out.println(mainid+"\n"+childid);
		
		driver.switchTo().window(childid);
		
		//wait
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		//wait
		Thread.sleep(2000);
		
		//perform click action 
		driver.findElement(By.xpath("//span[text()='Training']")).click();
		
		
		
		
	}

}
