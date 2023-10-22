package TestScripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Org.selenium.Resources.BasePage;
import Pages.AdminUserPage;
import Pages.LoginPage;
import Pages.ManagePage;
import Utilites.ExcelUtility;

public class AdminUserTest extends BasePage {
	@Test
	public void verifyWhetherUserCanAbleToSearchUsersFromTheList() throws InterruptedException {
		String Username = ExcelUtility.getString(1, 0, "LoginPage");
		String Password = ExcelUtility.getString(1, 1, "LoginPage");
		String name = ExcelUtility.getString(1, 0, "AdminUserPage");
		String Text = ExcelUtility.getString(3, 0, "AdminUserPage");

		LoginPage loginPage = new LoginPage(driver);
		AdminUserPage adminuserPage = new AdminUserPage(driver);
		ManagePage managePage = new ManagePage(driver);

		loginPage.enterUserNameOnTheUserNameField(Username).enterPasswordOnThePasswordField(Password)
				.clickOnTheSigninButton();
		adminuserPage.clickOnTheMoreInfoButtonintheAdminUSerTile();
		managePage.clickOnTheSearchButton();
		adminuserPage.entertheUsernameInTheField(name).selectTheUSerTypeFromTheDropDown(Text);
		managePage.searchTheProductfromtheTable();
		boolean checkGivenUSerNAmeIsInTheList = adminuserPage.listingofUsersinthePage().contains(name);
		assertTrue(checkGivenUSerNAmeIsInTheList, "The given name is not Listed in the List");

	}

}
