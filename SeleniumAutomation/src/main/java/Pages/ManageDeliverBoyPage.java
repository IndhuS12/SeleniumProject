package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilites.WaitUtility;

public class ManageDeliverBoyPage {
	public WebDriver driver;

	public ManageDeliverBoyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-deliveryboy'])[2]")
	WebElement MoreInfo;
	@FindBy(xpath = "(//a[contains(@title,'Show Details')])[1]")
	WebElement Passwordfield;
	@FindBy(xpath = "(//div[contains(text(),' Password :')]//span[text()='123456'])[1]")
	WebElement PasswordDisplayed;

	public ManageDeliverBoyPage clickOnMoreInfoButton() {
		MoreInfo.click();
		return this;
	}

	public void waitForTheElement() {
		WaitUtility.elementToBeSelected(driver, Passwordfield);
	}

	public ManageDeliverBoyPage clickOnThePasswordIcon() {
		Passwordfield.click();
		return this;
	}

	public boolean checkPasswordIsDisplayed() {

		return PasswordDisplayed.isDisplayed();
	}

}
