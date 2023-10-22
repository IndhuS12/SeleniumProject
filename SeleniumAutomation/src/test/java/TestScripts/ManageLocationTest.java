package TestScripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Org.selenium.Resources.BasePage;
import Pages.LoginPage;
import Pages.ManageLocationPage;
import Utilites.ExcelUtility;

public class ManageLocationTest extends BasePage {

	@Test
	public void verifyWhetherTheUserCanAddNewLocation() {
		String Username = ExcelUtility.getString(1, 0, "LoginPage");
		String Password = ExcelUtility.getString(1, 1, "LoginPage");
		String Country = ExcelUtility.getString(1, 0, "ManageLocationPage");
		String State = ExcelUtility.getString(3, 0, "ManageLocationPage");
		String location = ExcelUtility.getString(5, 0, "ManageLocationPage");
		String amountdeliveryCharge = ExcelUtility.getNumeric(7, 0, "ManageLocationPage");

		LoginPage loginPage = new LoginPage(driver);
		ManageLocationPage managelocationpage = new ManageLocationPage(driver);

		loginPage.enterUserNameOnTheUserNameField(Username).enterPasswordOnThePasswordField(Password)
				.clickOnTheSigninButton();
		managelocationpage.clickontheMoreInfoIntheManageLocation().clickOnTheNewButton()
				.selectCountryFromTheDropdown(Country).selectStateFromTheDropdown(State).enterTheLocation(location)
				.enterTheChargeInTheDeliveryChargeTextField(amountdeliveryCharge).clickOnTheSaveButton();
		boolean alertDisplayedAfterSaving = managelocationpage.alertsDisplayed();
		assertTrue(alertDisplayedAfterSaving, "The user cannot able to add new location");

	}
}
