package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PushNotificationPage {
	public WebDriver driver;
	public PushNotificationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
@FindBy(xpath="//p[text()='Push Notifications']")WebElement pushnotifications;
@FindBy(xpath="//input[@id='title']")WebElement Title;
@FindBy(xpath="//input[@id='description']")WebElement Description;
@FindBy(xpath="//button[@name='create']")WebElement SendButton;
@FindBy(xpath = "//h5[contains(text(),' Alert!')]")
WebElement Alerts;



public  PushNotificationPage clickOnThePushNotification()
{
	pushnotifications.click();
	return this;
}
public  PushNotificationPage enterTitleOnThePage(String TitleText)
{
	Title.sendKeys(TitleText);
	return this;
}
public  PushNotificationPage enterDescriptionOnThePage(String DescriptionText)
{
	Description.sendKeys(DescriptionText);
	return this;
}
public  PushNotificationPage clickOnTheSendButton()
{
	SendButton.click();
	return this;
}
public boolean alertsDisplayed()

{
	return Alerts.isDisplayed();
}

}
