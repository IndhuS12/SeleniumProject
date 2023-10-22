package Pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilites.FileUploadUtility;
import Utilites.GeneralUtility;

public class CategoryPage {
	public WebDriver driver;

	public CategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/list-category')])[2]")
	WebElement MoreInfo;
	@FindBy(xpath = "(//a[contains(@class,'btn btn-sm btn btn-primary btncss')])[1]")
	WebElement Editbutton;
	@FindBy(xpath = "//input[@id='main_img']")
	WebElement ChooseFiletoUpload;
	@FindBy(xpath = "//button[@name='update']")
	WebElement UpdateButton;

	public CategoryPage clickOnTheMoreInfoButton() {
		MoreInfo.click();
		return this;
	}

	public CategoryPage clickOnTheEditButton() {
		Editbutton.click();
		return this;
	}

	public CategoryPage clickOnChooseOptionToUpload() throws AWTException {
		String path = GeneralUtility.IMAGE1;
		FileUploadUtility fileuploadutility = new FileUploadUtility();
		fileuploadutility.fileUploadUsingSendKeys(ChooseFiletoUpload, path);
		return this;
	}

	public CategoryPage clickOnTheUpdateButton() {
		UpdateButton.click();
		return this;
	}

}
