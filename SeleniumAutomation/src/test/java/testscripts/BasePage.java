package testscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Utilites.GeneralUtility;
import Utilites.ScreenShotUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	public Properties prop;
	public FileInputStream fs;
	public WebDriver driver;
	
@BeforeMethod(alwaysRun=true)
@Parameters("browser")
	public void InitializeBrowser(String browser) throws Throwable {
	try 
	{
	prop = new Properties();
	fs = new FileInputStream(GeneralUtility.CONFIGFILE);
	prop.load(fs);
	} 
	catch (FileNotFoundException e) 
	{
	e.printStackTrace();
	}
	if(browser.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox"))
	{
		driver = WebDriverManager.firefoxdriver().create();
	}
	else if(browser.equalsIgnoreCase("edge"))
	{
		driver = WebDriverManager.edgedriver().create();
	}
	else
	{
		throw new Exception("browser is not correct");
	}
		//driver = WebDriverManager.chromedriver(options).create();
		driver.get("https://groceryapp.uniqassosiates.com/admin");
		driver.manage().window().maximize();
	}


@AfterMethod
public void BrowserClose(ITestResult iTestResult) throws IOException
{
if (iTestResult.getStatus() == ITestResult.FAILURE)

{

	ScreenShotUtility scrshot = new ScreenShotUtility();

	scrshot.getScreenShot(driver, iTestResult.getName());

}

		driver.quit();
	}



}

