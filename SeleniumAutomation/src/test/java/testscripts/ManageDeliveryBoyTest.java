package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;


import Pages.LoginPage;
import Pages.ManageDeliverBoyPage;
import Utilites.ExcelUtility;

public class ManageDeliveryBoyTest extends BasePage {
	@Test(groups= {"smoke"},description="Verify whether user is able to view the password")
	public void verifyWhetherTheUserCanAbleToViewThePassword() throws InterruptedException {
		String usernamefield = ExcelUtility.getString(1, 0, "LoginPage");
		String passwordkey = ExcelUtility.getString(1, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		ManageDeliverBoyPage managedeliveryboypage = new ManageDeliverBoyPage(driver);

		loginpage.enterUserNameOnTheUserNameField(usernamefield).enterPasswordOnThePasswordField(passwordkey)
				.clickOnTheSigninButton();
		managedeliveryboypage.clickOnMoreInfoButton().clickOnThePasswordIcon();
		boolean usercanviewthepassword = managedeliveryboypage.checkPasswordIsDisplayed();
		assertTrue(usercanviewthepassword, "the user cannot able to view the password");
	}
}
