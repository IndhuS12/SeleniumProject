package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagePage {
	public WebDriver driver;

	public ManagePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/list-page')])[2]")
	WebElement Moreinfo;
	@FindBy(xpath = "//a[text()=' Search']")
	WebElement SearchButton;
	@FindBy(xpath = "//input[@name='un']")
	WebElement TitleSearch;
	@FindBy(xpath = "//button[@name='Search']")
	WebElement SearchProduct;
	@FindBy(xpath = "//a[text()='Reset']")
	WebElement Resetsearch;
	@FindAll(@FindBy(xpath = "//table[contains(@class,'table table-bordered table-hover table-sm')]//tbody//tr//td[1]"))
	List<WebElement> listOfElements;
	@FindBy(xpath = "//a[text()='Home']")
	WebElement HomePage;
	@FindBy(xpath = "//center[contains(text(),'RESULT')]")
	WebElement ResultNotFound;

	public ManagePage clickOnTheManageTileMoreInfoButton() {
		Moreinfo.click();
		return this;
	}

	public ManagePage clickOnTheSearchButton() {

		SearchButton.click();
		return this;
	}

	public ManagePage enterTheTitlenametoSearchProduct(String Product) {
		TitleSearch.sendKeys(Product);
		return this;
	}

	public ManagePage searchTheProductfromtheTable() {
		SearchProduct.click();
		return this;
	}

	public boolean resultNotFoundInTheTable() {
		return ResultNotFound.isDisplayed();
	}

	public ManagePage resettheTitlePageSearch() {
		Resetsearch.click();
		return this;
	}

	public ManagePage clickOnTheHomeButton() {
		HomePage.click();
		return this;
	}

	public List<String> listingofelementsinthePage() {
		List<String> listofelementsinthetable = new ArrayList<>();
		for (WebElement Listing : listOfElements) {
			String link = Listing.getText();
			listofelementsinthetable.add(link);
		}

		return listofelementsinthetable;
	}
}
