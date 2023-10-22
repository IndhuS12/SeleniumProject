package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilites.PageUtility;

public class ManageOfferPage {
	public WebDriver driver;

	public ManageOfferPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-offercode']")
	WebElement MoreInfo;
	@FindBy(xpath = "(//a[contains(@class,'btn btn-sm btn btn-danger btncss')])[2]")
	WebElement Deleteicon;

	public ManageOfferPage clickOnTheMoreInfoButton() {
		MoreInfo.click();
		return this;
	}

	public ManageOfferPage clickOnTheDeleteButton() {
		Deleteicon.click();
		return this;
	}

	public ManageOfferPage clickOnOkButtonToDelete() {
		PageUtility.alertToClickOk(driver);
		return this;
	}

}