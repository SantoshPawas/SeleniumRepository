package FileUpload_download;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload 
{
	public static void main(String[] args) throws AWTException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		
		driver.manage().window().maximize();
		//wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		//click "select Pdf file"
		
		driver.findElement(By.xpath("//*[@id='pickfiles']")).click();
		
		//step 1 copy pdf file (ctrl+c) copy to clipboard
		
		StringSelection s1=new StringSelection("D:\\15th April Morning - External_Mock_Group (1).pdf");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
		
		//step2 press control key +v key
		
		Robot r1=new Robot();
		
		r1.delay(2000);
		
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_V);
		
		//release ctrl + v key
		
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_V);
		
		//step3 press eenter key
		
		r1.keyPress(KeyEvent.VK_ENTER);

		r1.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
