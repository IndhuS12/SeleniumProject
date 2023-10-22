package Utilites;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public static void clickAndHoldOnElement(WebElement element, WebDriver driver)

	{
		Actions actions = new Actions(driver);
		actions.clickAndHold(element).build().perform();

	}
	public static void contextClick(WebElement element,WebDriver driver)
	{
		Actions actions = new Actions(driver);
		actions.contextClick(element).build().perform();
	}

	public static void doubleClick(WebElement element,WebDriver driver)
	{
		Actions actions = new Actions(driver);
		actions.doubleClick(element).build().perform();
	}
	public static void dragAndDrop(WebElement element,WebDriver driver,WebElement Target)
	{
		Actions actions = new Actions(driver);
		actions.dragAndDrop(element, Target);
	}
	public static void moveToElement(WebElement element,WebDriver driver)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
	}
	public static void moveByOffset(WebElement element,WebDriver driver)
	{
		Actions actions = new Actions(driver);
		actions.moveByOffset(0, 0);
	}
	public static  void selectDropDownUsingIndex(WebElement element,int index)
	{
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	public static void selectDropDownUsingValue(WebElement element,String Value)
	{
		Select select=new Select(element);
		select.selectByValue(Value);
	}
	public static void selectDropDownUsingVisibleText(WebElement element,String Value)
	{
		Select select=new Select(element);
		select.selectByVisibleText(Value);
	}
	public  static void deSelectByIndex(WebElement element,int index)
	{
		Select select=new Select(element);
		select.deselectByIndex(index);
	}
	public static void deSelectByValue(WebElement element,String Value)
	{
		Select select=new Select(element);
		select.deselectByValue(Value);
	}
	public  static void deSelectByVisibilityText(WebElement element,String Value)
	{
		Select select=new Select(element);
		select.deselectByVisibleText(Value);
	}
	public  static void executeAsyncScript(WebElement element,WebDriver driver,String Script,int object)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript(Script, object);
	}
    public static void alertToClickOk(WebDriver driver) {
    	driver.switchTo().alert().accept();
    }
    public static void executeAnyScript(WebDriver driver,WebElement element) {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
    }

}

