package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilites.FileUploadUtility;
import Utilites.GeneralUtility;
import Utilites.PageUtility;

public class MobileSliderPage {
	public WebDriver driver;

	public MobileSliderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-mobileslider'])[2]")
	WebElement moreInfo;
	@FindBy(xpath = "(//a[contains(@class,'btn btn-sm btn btn-primary btncss')])[1]")
	WebElement Editbutton;
	@FindBy(xpath = "//select[@id='cat_id']")
	WebElement Category;
	@FindBy(xpath = "//input[@id='main_img']")
	WebElement Choosefile;
	@FindBy(xpath = "//button[@name='update']")
	WebElement UpdateButton;
	@FindBy(xpath = "//h5[contains(text(),' Alert!')]")
	WebElement Alerts;

	public MobileSliderPage clickOnTheMoreInfo() {
		moreInfo.click();
		return this;
	}

	public MobileSliderPage clickOnTheEditButton() {
		Editbutton.click();
		return this;
	}

	public MobileSliderPage selectFromTheDropdown(String Text) {
		PageUtility.selectDropDownUsingVisibleText(Category, Text);
		return this;
	}

	public MobileSliderPage clickOnChooseFile() {
		String path = GeneralUtility.IMAGE3;
		FileUploadUtility fileuploadutility = new FileUploadUtility();
		fileuploadutility.fileUploadUsingSendKeys(Choosefile, path);
		return this;

	}

	public MobileSliderPage clickOnTheUpdateButton() {
		UpdateButton.click();
		return this;
	}

	public boolean alertsDisplayed()

	{
		return Alerts.isDisplayed();
	}

}