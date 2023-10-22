package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilites.PageUtility;
import Utilites.WaitUtility;

public class AdminUserPage {
	public WebDriver driver;

	public AdminUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/list-admin')])[2]")
	WebElement MoreInfo;
	@FindBy(xpath = "//input[@id='un']")
	WebElement Username;
	@FindBy(xpath = "//select[@id='ut']")
	WebElement UserType;
	@FindAll(@FindBy(xpath = "//table[contains(@class,'table table-bordered')]//tbody//tr//td[1]"))
	List<WebElement> listOfUsers;

	public AdminUserPage clickOnTheMoreInfoButtonintheAdminUSerTile() {
		MoreInfo.click();
		return this;
	}

	public AdminUserPage entertheUsernameInTheField(String name) {
		Username.sendKeys(name);
		return this;
	}

	public AdminUserPage selectTheUSerTypeFromTheDropDown(String Text) {

		PageUtility.selectDropDownUsingVisibleText(UserType, Text);
		return this;
	}

	public List<String> listingofUsersinthePage() {
		List<String> listofUsersinthetable = new ArrayList<>();
		for (WebElement Listing : listOfUsers) {
			String Userlist = Listing.getText();
			listofUsersinthetable.add(Userlist);
		}

		return listofUsersinthetable;

	}

	public void waitInTheCode() {
		WaitUtility.elementToBeSelected(driver, MoreInfo);
	}
}
