package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;


import Pages.LoginPage;
import Pages.MobileSliderPage;
import Utilites.ExcelUtility;

public class MobileSliderTest extends BasePage {
	@Test(groups= {"smoke"},description="Verify whether user can edit the mobile slider")

	public void verifyWhetherTheUserCanEditTheMobileSlider() {
		String usernamefield = ExcelUtility.getString(1, 0, "LoginPage");
		String passwordkey = ExcelUtility.getString(1, 1, "LoginPage");
		String Text = ExcelUtility.getString(1, 0, "MobileSliderPage");
		LoginPage loginpage = new LoginPage(driver);
		MobileSliderPage mobilesliderpage = new MobileSliderPage(driver);

		loginpage.enterUserNameOnTheUserNameField(usernamefield).enterPasswordOnThePasswordField(passwordkey)
				.clickOnTheSigninButton();
		mobilesliderpage.clickOnTheMoreInfo().clickOnTheEditButton().selectFromTheDropdown(Text).clickOnChooseFile()
				.clickOnTheUpdateButton().alertsDisplayed();
		boolean MobilesliderisUpdated = mobilesliderpage.alertsDisplayed();
		assertTrue(MobilesliderisUpdated, "The mobileslider is not updated");

	}
}
