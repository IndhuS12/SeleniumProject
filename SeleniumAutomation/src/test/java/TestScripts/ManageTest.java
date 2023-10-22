package TestScripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Org.selenium.Resources.BasePage;
import Pages.LoginPage;
import Pages.ManagePage;
import Utilites.ExcelUtility;

public class ManageTest extends BasePage {
	@Test
	public void verifyWhetherTheUserCanSearchProductInTheList() {
		String usernamefield = ExcelUtility.getString(1, 0, "LoginPage");
		String passwordkey = ExcelUtility.getString(1, 1, "LoginPage");
		String Product = ExcelUtility.getString(1, 2, "ManagePage");

		LoginPage loginclasspage = new LoginPage(driver);
		ManagePage managepage = new ManagePage(driver);

		loginclasspage.enterUserNameOnTheUserNameField(usernamefield).enterPasswordOnThePasswordField(passwordkey)
				.clickOnTheSigninButton();
		managepage.clickOnTheManageTileMoreInfoButton().clickOnTheSearchButton()
				.enterTheTitlenametoSearchProduct(Product).searchTheProductfromtheTable();
		boolean Itemdisplayed = managepage.listingofelementsinthePage().contains(Product);
		assertTrue(Itemdisplayed, "The validProduct is not in the list ");

	}

	@Test
	public void verifywhethertheusercanabletosearchtheInvalidItemintheList() {
		String usernamefield = ExcelUtility.getString(1, 0, "LoginPage");
		String passwordkey = ExcelUtility.getString(1, 1, "LoginPage");
		String Product = ExcelUtility.getString(5, 2, "ManagePage");

		LoginPage loginclasspage = new LoginPage(driver);
		ManagePage managepage = new ManagePage(driver);

		loginclasspage.enterUserNameOnTheUserNameField(usernamefield).enterPasswordOnThePasswordField(passwordkey)
				.clickOnTheSigninButton();
		managepage.clickOnTheManageTileMoreInfoButton().clickOnTheSearchButton()
				.enterTheTitlenametoSearchProduct(Product).searchTheProductfromtheTable();
		boolean isItemisDisPlayed = managepage.resultNotFoundInTheTable();
		assertTrue(isItemisDisPlayed, "The user can able to search the InValiditem in the List ");

	}
}
