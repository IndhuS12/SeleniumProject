package Org.selenium.Resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example {

	public WebDriver driver;
	@BeforeMethod
		public void InitializeBrowser() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Superadmin\\eclipse-workspace\\SeleniumAutomation\\src\\main\\java\\org\\obsquare\\Resources\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
			driver.manage().window().maximize();
		}
	@Test
	public void method()
	{
		WebElement simpleform=driver.findElement(By.xpath("//a[@href='check-box-demo.php']"));
		String value=simpleform.getAttribute("href");
		System.out.println(value);
	}

	@AfterMethod
		public void driverClose() {
			driver.quit();
		}
}
