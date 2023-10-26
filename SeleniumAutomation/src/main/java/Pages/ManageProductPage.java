package Pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilites.FileUploadUtility;
import Utilites.GeneralUtility;
import Utilites.PageUtility;

public class ManageProductPage {
	public WebDriver driver;

	public ManageProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/list-product')])[2]")WebElement MoreInfo;
	@FindBy(xpath="(//a[contains(@class,'btn btn-sm btn btn-primary btncss')])[1]")WebElement EditIcon;
	@FindBy(xpath="//input[@id='title']")WebElement titleField;
	@FindBy(xpath="//input[@value='Nonveg']")WebElement ProductType;
	@FindBy(xpath="//input[@value='litre']")WebElement PriceType;
	@FindBy(xpath="//input[@id='l_minimum']")WebElement litre;
	@FindBy(xpath="//select[@id='l_unit']")WebElement litreUnit;
	@FindBy(xpath="//input[@id='l_max']")WebElement MaximumQuantity;
	@FindBy(xpath="//input[@id='l_price']")WebElement litrePrice;
	@FindBy(xpath="//select[@id='cat_id']")WebElement Category;
	@FindBy(xpath="//select[@id='sub_id']")WebElement CategorySubValue;
	@FindBy(xpath="//input[@id='w_stock']")WebElement stockavailablity;
	@FindBy(xpath="//input[@id='main_img']")WebElement UploadImage;
	@FindBy(xpath="//button[@name='update']")WebElement UpdateButton;
	@FindBy(xpath = "//h5[contains(text(),' Alert!')]")
	WebElement Alerts;

	public ManageProductPage clickOnTheMoreInfoButton()
	{
		MoreInfo.click();
		return this;
	}
	public ManageProductPage clickOnTheEditIcon()
	{
		EditIcon.click();
		return this;
	}
	public ManageProductPage enterTheTitle(String Title)
	{
		titleField.clear();
		titleField.sendKeys(Title);
		return this;
	}
	public ManageProductPage selectTheProductType()
	{
		ProductType.click();
		return this;
	}
	public ManageProductPage selectThePriceType()
	{
		PriceType.click();
		return this;
	}
	public void scrollThePageDown() {
		PageUtility.executeAnyScript(driver, litre);
	}
	
	public ManageProductPage enterTheLitre(String weight)
	{
		
		litre.sendKeys(weight);
		return this;
	}
	public ManageProductPage selectLitreType(String Unit)
	{
		PageUtility.selectDropDownUsingVisibleText(litreUnit, Unit);
		return this;
	}
 public ManageProductPage enterTheMaximumQuantityValue(String Litrevalue)
 {
	 MaximumQuantity.sendKeys(Litrevalue);
	 return this;
	 
 }
 public ManageProductPage enterTheLitrePrice(String LitrePricevalue)
 {
	litrePrice.sendKeys(LitrePricevalue);
	 return this;
	 
 }
 public ManageProductPage selectTheCategory(String CategoryValue)
 {
	PageUtility.selectDropDownUsingVisibleText(Category,CategoryValue );
	return this;
	 
 }
 public ManageProductPage selectTheCategorySubValue(String CategorySubOption)
 {
	CategorySubValue.click();
	PageUtility.selectDropDownUsingVisibleText(CategorySubValue,CategorySubOption );
	return this;
 

}
 public ManageProductPage enterTheStockAvailability(String Stockvalue)
 {
	 stockavailablity.sendKeys(Stockvalue);
	 return this;
	 
 }
 public  ManageProductPage clickOnChooseOptionToUpload() throws AWTException {
		String path = GeneralUtility.IMAGE2;
		FileUploadUtility fileuploadutility = new FileUploadUtility();
		fileuploadutility.fileUploadUsingSendKeys(UploadImage, path);
		return this;
}
 public ManageProductPage clickOnTheUpdateButton()
 {
	 UpdateButton.click();
	 return this;
	 
 }
 public boolean alertsDisplayed()

	{
		return Alerts.isDisplayed();
	}

}
