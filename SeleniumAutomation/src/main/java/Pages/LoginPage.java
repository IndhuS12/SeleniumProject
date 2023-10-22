package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement usernamefield;
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordfield;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement siginbutton;
	@FindBy(xpath = "//div[@class='inner']//p[text()='Manage Pages']")
	WebElement ManagePagesTile;
	@FindBy(xpath = "//div[contains(@class,'alert alert-danger alert-dismissible')]")
	WebElement AlertDisplayed;

	public LoginPage enterUserNameOnTheUserNameField(String username) {
		usernamefield.sendKeys(username);
		return this;
	}

	public LoginPage enterPasswordOnThePasswordField(String password) {
		passwordfield.sendKeys(password);
		return this;
	}

	public LoginPage clickOnTheSigninButton() {
		siginbutton.click();
		return this;
	}

	public boolean isHomePageDisplayed() {
		return ManagePagesTile.isDisplayed();
	}

	public boolean alertIsDisplayed() {

		return AlertDisplayed.isDisplayed();

	}
}
