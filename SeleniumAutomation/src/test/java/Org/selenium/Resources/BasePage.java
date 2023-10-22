package Org.selenium.Resources;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utilites.ScreenShotUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	public WebDriver driver;
@BeforeMethod
	public void InitializeBrowser() {
	driver=new ChromeDriver();
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

