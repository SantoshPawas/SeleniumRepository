package Data_Drivern_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Welcome_HomePage 
{
	//POM Class-II
	//step1 data members/variable should be declared globally with access level private using FindBy annotation
	@FindBy(xpath="//input[@name='username_show']")private WebElement User_Show;
	@FindBy(xpath="//a[text()='Logout']")private WebElement Logout_Btn;
	
	//step2 initialize within a constructor with access level public using PageFactory class
	public Adactin_Welcome_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//step3 declare nonstatic public method
	public void getUsername()
	{
		String ExpectedUsername="Velocity!1";
		String str=User_Show.getAttribute("value");
		System.out.println(str);
		
		String[] s1=str.split(" ");
		String ActualUsername=s1[1];
		if(ExpectedUsername.equals(ActualUsername))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
	}
	public void clickLogout()
	{
		Logout_Btn.click();
	}

}
