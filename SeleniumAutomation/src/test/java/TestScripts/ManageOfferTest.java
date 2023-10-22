package TestScripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Org.selenium.Resources.BasePage;
import Pages.LoginPage;
import Pages.ManageLocationPage;
import Pages.ManageOfferPage;
import Utilites.ExcelUtility;

public class ManageOfferTest extends BasePage {
	@Test
	public void verifyWhetherTheUSerCanDeleteTheOfferCodeFromTheList() throws InterruptedException

	{
		String usernamefield = ExcelUtility.getString(1, 0, "LoginPage");
		String passwordkey = ExcelUtility.getString(1, 1, "LoginPage");
		LoginPage loginclasspage = new LoginPage(driver);
		ManageOfferPage manageofferpage = new ManageOfferPage(driver);
		ManageLocationPage managelocationpage = new ManageLocationPage(driver);

		loginclasspage.enterUserNameOnTheUserNameField(usernamefield).enterPasswordOnThePasswordField(passwordkey)
				.clickOnTheSigninButton();
		manageofferpage.clickOnTheMoreInfoButton().clickOnTheDeleteButton().clickOnOkButtonToDelete();
		managelocationpage.alertsDisplayed();
		boolean isOfferCodeIsDeletedSuccesfully = managelocationpage.alertsDisplayed();
		assertTrue(isOfferCodeIsDeletedSuccesfully, "The offercode is not deleted from the list");

	}

}
