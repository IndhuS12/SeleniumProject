package TestScripts;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Org.selenium.Resources.BasePage;
import Pages.LoginPage;
import Pages.ManageProductPage;
import Utilites.ExcelUtility;

public class ManageProductTest extends BasePage {
	@Test
	public void verifyTheUSerCanEditTheManageProduct() throws InterruptedException, AWTException {

		String usernamefield = ExcelUtility.getString(1, 0, "LoginPage");
		String passwordkey = ExcelUtility.getString(1, 1, "LoginPage");

		String Title="AdminUSer";
		String weight="1000";
		String Unit="ml";
		String Litrevalue="200";
		String LitrePricevalue="4000";
		String CategoryValue="Select";
		String CategorySubOption="Atta & Flours";
		String Stockvalue="3000";
		
		LoginPage loginclasspage=new LoginPage(driver);
		ManageProductPage manageproductpage=new ManageProductPage(driver);

		loginclasspage.enterUserNameOnTheUserNameField(usernamefield).enterPasswordOnThePasswordField(passwordkey)
				.clickOnTheSigninButton();
		manageproductpage.clickOnTheMoreInfoButton().clickOnTheEditIcon().enterTheTitle(Title);
		
		manageproductpage.selectTheProductType().selectTheCategory(CategoryValue).selectTheCategorySubValue(CategorySubOption).selectThePriceType();
		manageproductpage.enterTheStockAvailability(Stockvalue);
		manageproductpage.scrollThePageDown();
		manageproductpage.enterTheLitre(weight);
		manageproductpage.selectLitreType(Unit);
		manageproductpage.enterTheStockAvailability(Stockvalue);
		manageproductpage.enterTheMaximumQuantityValue(Litrevalue);
		manageproductpage.clickOnChooseOptionToUpload();
		manageproductpage.clickOnTheUpdateButton();
		manageproductpage.alertsDisplayed();
		boolean isAlertsDisplayed=manageproductpage.alertsDisplayed();
		assertTrue(isAlertsDisplayed,"The user cannot able to edit the product");
		


	}



}
