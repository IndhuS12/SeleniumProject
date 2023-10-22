package TestScripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Org.selenium.Resources.BasePage;
import Pages.LoginPage;
import Utilites.ExcelUtility;

public class LoginTest extends BasePage {

	LoginPage loginclasspage = new LoginPage(driver);

	@Test

	public void verifyWhetherTheUserCanAbleToLoginWithvalidUserNameAndPassword() {
		String usernamefield = ExcelUtility.getString(1, 0, "LoginPage");
		String passwordkey = ExcelUtility.getString(1, 1, "LoginPage");

		loginclasspage.enterUserNameOnTheUserNameField(usernamefield).enterPasswordOnThePasswordField(passwordkey)
				.clickOnTheSigninButton();
		boolean ManagePageisavailable = loginclasspage.isHomePageDisplayed();
		assertTrue(ManagePageisavailable, "The user is unable to login with valid username and password");

	}

	@Test
	public void verifyWhetherTheUserCanAbleToLoginWithInvalidUserNameAndPassword() {
		String usernamefield = ExcelUtility.getString(4, 0, "LoginPage");
		String passwordkey = ExcelUtility.getString(4, 1, "LoginPage");

		loginclasspage.enterUserNameOnTheUserNameField(usernamefield).enterPasswordOnThePasswordField(passwordkey)
				.clickOnTheSigninButton();
		boolean AlertDisplayed = loginclasspage.alertIsDisplayed();
		assertTrue(AlertDisplayed, "The user is able to login with invalid username and validpassword");

	}

	@Test
	public void verifyWhetherTheUserCanAbleToLoginWithValidUserNameAndInvalidPassword() {
		String usernamefield = ExcelUtility.getString(7, 0, "LoginPage");
		String passwordkey = ExcelUtility.getString(7, 1, "LoginPage");

		loginclasspage.enterUserNameOnTheUserNameField(usernamefield).enterPasswordOnThePasswordField(passwordkey)
				.clickOnTheSigninButton();
		boolean AlertDisplayed = loginclasspage.alertIsDisplayed();
		assertTrue(AlertDisplayed, "The user is able to login with invalid username and validpassword");
	}

	@Test
	public void verifyWhetherTheUserCanAbleToLoginWithInvalidUserNameAndInvalidPassword() {
		String usernamefield = ExcelUtility.getString(10, 0, "LoginPage");
		String passwordkey = ExcelUtility.getString(10, 1, "LoginPage");

		loginclasspage.enterUserNameOnTheUserNameField(usernamefield).enterPasswordOnThePasswordField(passwordkey)
				.clickOnTheSigninButton();
		boolean AlertDisplayed = loginclasspage.alertIsDisplayed();
		assertTrue(AlertDisplayed, "The user is able to login with invalid username and validpassword");
	}
}
