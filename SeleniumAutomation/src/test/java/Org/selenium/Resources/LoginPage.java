package Org.selenium.Resources;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage  extends BasePage{
	
	@Test
	
	public void verifywhethertheusercanabletologinwithvalidusernameandPassword()
	{
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	    password.sendKeys("admin");
	    WebElement signin=driver.findElement(By.xpath("//button[text()='Sign In']"));
	    signin.click();
	    WebElement homepage=driver.findElement(By.xpath("//div[@class='inner']//p[text()='Manage Pages']"));
	    boolean loginsuccessfully=homepage.isDisplayed();
	  assertTrue(loginsuccessfully,"The login is not successfullwith valid username and password");
		
	}
	@Test
	public void verifywhethertheusercanabletologinwithinvalidusernameandValidPassword()
	{
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("admins");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	    password.sendKeys("admin");
	    WebElement signin=driver.findElement(By.xpath("//button[text()='Sign In']"));
	    signin.click();
	    WebElement alertmessage=driver.findElement(By.xpath("//div[contains(@class,'alert alert-danger alert-dismissible')]"));
	    boolean alertmessagedisplayedwithinvalidusername=alertmessage.isDisplayed();
	    assertTrue(alertmessagedisplayedwithinvalidusername,"The login is successfull with invalid username and valid password");	
	
}

@Test
public void verifywhethertheusercanabletologinwithvalidusernameandInValidPassword()
{
	WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys("admin");
	WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
    password.sendKeys("admin123");
    WebElement signin=driver.findElement(By.xpath("//button[text()='Sign In']"));
    signin.click();
    WebElement alertmessage=driver.findElement(By.xpath("//div[contains(@class,'alert alert-danger alert-dismissible')]"));
    boolean alertmessagedisplayedwithinvalidPassword=alertmessage.isDisplayed();
    assertTrue(alertmessagedisplayedwithinvalidPassword,"The login is successfull with valid username and invalid password");	

}
@Test
public void verifywhethertheusercanabletologinwithInvalidusernameandInValidPassword()
{
	WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys("admins");
	WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
    password.sendKeys("admin123");
    WebElement signin=driver.findElement(By.xpath("//button[text()='Sign In']"));
    signin.click();
    WebElement alertmessage=driver.findElement(By.xpath("//div[contains(@class,'alert alert-danger alert-dismissible')]"));
    boolean alertmessagedisplayedwithInvalidUsernameinvalidPassword=alertmessage.isDisplayed();
    assertTrue(alertmessagedisplayedwithInvalidUsernameinvalidPassword,"The login is successfull with invalid username and invalid password");	}

}

