import org.apache.commons.math3.analysis.function.Max;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstAutoDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://adactinhotelapp.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Velocity");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("U1YP1G");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		String ActualResult=driver.findElement(By.xpath("//input[@class='input_show']")).getText();
		System.out.println("Result="+ActualResult);
		
		
	}

}
