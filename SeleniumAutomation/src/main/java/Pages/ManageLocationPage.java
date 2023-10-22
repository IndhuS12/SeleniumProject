package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilites.PageUtility;

public class ManageLocationPage {
	public WebDriver driver;

	public ManageLocationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/list-location')])[2]")
	WebElement ManageLocationMoreInfo;
	@FindBy(xpath = "//a[contains(text(),' New')]")
	WebElement NewButton;
	@FindBy(xpath = "//select[@id='country_id']")
	WebElement countryType;
	@FindBy(xpath = "//select[@id='st_id']")
	WebElement StateType;
	@FindBy(xpath = "//input[@id='location']")
	WebElement Location;
	@FindBy(xpath = "//input[@id='delivery']")
	WebElement DeliverChargeTextfield;
	@FindBy(xpath = "//button[text()='Save']")
	WebElement Savebutton;
	@FindBy(xpath = "//h5[contains(text(),' Alert!')]")
	WebElement Alerts;

	public ManageLocationPage clickontheMoreInfoIntheManageLocation() {
		ManageLocationMoreInfo.click();
		return this;
	}

	public ManageLocationPage clickOnTheNewButton() {
		NewButton.click();
		return this;
	}

	public ManageLocationPage selectCountryFromTheDropdown(String Country) {
		PageUtility.selectDropDownUsingVisibleText(countryType, Country);
		return this;

	}

	public ManageLocationPage selectStateFromTheDropdown(String State) {
		PageUtility.selectDropDownUsingVisibleText(StateType, State);
		return this;
	}

	public ManageLocationPage enterTheLocation(String location) {
		Location.sendKeys(location);
		return this;
	}

	public ManageLocationPage enterTheChargeInTheDeliveryChargeTextField(String deliveryCharge) {

		DeliverChargeTextfield.sendKeys(deliveryCharge);
		return this;
	}

	public ManageLocationPage clickOnTheSaveButton() {
		Savebutton.click();
		return this;
	}

	public boolean alertsDisplayed()

	{
		return Alerts.isDisplayed();
	}

}
