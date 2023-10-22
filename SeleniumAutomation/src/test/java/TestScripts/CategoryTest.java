package TestScripts;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Org.selenium.Resources.BasePage;
import Pages.CategoryPage;
import Pages.LoginPage;
import Pages.ManageLocationPage;
import Utilites.ExcelUtility;

public class CategoryTest extends BasePage {
	@Test
	public void verifyTheUserCanAddTheEditTheCategoryPageByFileUpload() throws AWTException {
		String Username = ExcelUtility.getString(1, 0, "LoginPage");
		String Password = ExcelUtility.getString(1, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		CategoryPage categorypage = new CategoryPage(driver);
		ManageLocationPage managelocationpage = new ManageLocationPage(driver);

		loginpage.enterUserNameOnTheUserNameField(Username).enterPasswordOnThePasswordField(Password)
				.clickOnTheSigninButton();
		categorypage.clickOnTheMoreInfoButton().clickOnTheEditButton().clickOnChooseOptionToUpload()
				.clickOnTheUpdateButton();
		managelocationpage.alertsDisplayed();
		boolean isCategoryIsUpdatedSuccesfully = managelocationpage.alertsDisplayed();
		assertTrue(isCategoryIsUpdatedSuccesfully, "The user cannot edit the category page by Fileupload");

	}

}
