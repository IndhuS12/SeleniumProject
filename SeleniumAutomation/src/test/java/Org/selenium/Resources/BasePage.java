package Org.selenium.Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage {
	public WebDriver driver;
@BeforeMethod
	public void InitializeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Superadmin\\eclipse-workspace\\SeleniumAutomation\\src\\main\\java\\org\\obsquare\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin");
		driver.manage().window().maximize();
	}
	
@AfterMethod
	public void driverClose() {
		driver.quit();
	}

	public static void main(String args[]) {
	     BasePage basepage = new BasePage();
		basepage.InitializeBrowser();
		basepage.driverClose();
	}

}

