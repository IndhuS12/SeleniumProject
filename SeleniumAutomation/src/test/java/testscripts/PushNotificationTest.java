package testscripts;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;


import Pages.LoginPage;
import Pages.PushNotificationPage;
import Utilites.ExcelUtility;

public class PushNotificationTest extends BasePage {
	@Test(groups= {"smoke"},description="Verify whether user can  able to send on the push notification")

	public void verifyTheUSerCanAbleToSendOnThePushNotification() {

		String usernamefield = ExcelUtility.getString(1, 0, "LoginPage");
		String passwordkey = ExcelUtility.getString(1, 1, "LoginPage");
		String TitleText = ExcelUtility.getString(1, 0, "PageNotificationPage");
		String DescriptionText = ExcelUtility.getString(3, 0, "PageNotificationPage");
		
		LoginPage loginclasspage = new LoginPage(driver);
		PushNotificationPage pushnotificationpage = new PushNotificationPage(driver);

		loginclasspage.enterUserNameOnTheUserNameField(usernamefield).enterPasswordOnThePasswordField(passwordkey)
				.clickOnTheSigninButton();
		pushnotificationpage.clickOnThePushNotification().enterTitleOnThePage(TitleText)
				.enterDescriptionOnThePage(DescriptionText).clickOnTheSendButton();
		pushnotificationpage.alertsDisplayed();
		boolean NotificationSendSuccessfully = pushnotificationpage.alertsDisplayed();
		assertTrue(NotificationSendSuccessfully, "The PushNotification is not send succesfully ");

	}
}
