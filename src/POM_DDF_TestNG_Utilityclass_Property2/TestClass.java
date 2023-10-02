package POM_DDF_TestNG_Utilityclass_Property2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.IResultListener;

public class TestClass extends BaseClass 
{
	Adactin_Home Home;
	Adactin_Login Login;
	String TestCaseID;
	@BeforeClass
	public void openBrowser()
	{
		initializeBrowser();
		
		//create an obj POM1
		Login=new Adactin_Login(driver);
		
		
		//create an obj of POM2
		Home=new Adactin_Home(driver);
	}
	@BeforeMethod
	public void loginToApp() throws IOException
	{
		Login.enterUsername(UtilityClass.getDataFromPropFile("Username"));
		
		Login.enterPassword(UtilityClass.getDataFromPropFile("Password"));
		
		Login.clickLoginBtn();
	}
	@Test(priority=1)
	public void verifyUser() throws EncryptedDocumentException, IOException
	{
		TestCaseID="TC100";
		String ActualUsername=Home.getUsername();
		String ExpectedUsername=UtilityClass.getDataFromExcelSheet(0, 0);
		
		Assert.assertEquals(ActualUsername, ExpectedUsername);
		
	}
	@Test(priority=2)
	public void verifyTitle() throws EncryptedDocumentException, IOException
	{
		TestCaseID="TC101";
		String ActualTitle=driver.getTitle();
		String ExpectedTitle=UtilityClass.getDataFromExcelSheet(1, 0);
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	@AfterMethod
	public void LogoutFromApp(ITestResult Result) throws IOException
	{
		if(Result.getStatus()==ITestResult.FAILURE)
		{
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File Dest=new File("D:\\Screenshots\\"+TestCaseID+".jpg");
			
			FileHandler.copy(source, Dest);
		}
		
		Home.clickLogoutBtn();
		
		Home.clickloginAgain();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}

}
