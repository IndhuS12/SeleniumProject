package Utilites;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	public static final long IMPLICIT_WAIT = 10;

	public static final long PAGE_LOAD_WAIT = 20;

	public static final long EXPLICIT_WAIT = 50;



	public static void waitForElement(WebDriver driver, WebElement target)

	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));

		wait.until(ExpectedConditions.visibilityOf(target));


	}
	public static void elementSelectionStateToBe(WebDriver driver, WebElement target)

	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));

		wait.until(ExpectedConditions.elementSelectionStateToBe(target, false));


	}
	public static void elementToBeClickable(WebDriver driver, WebElement target)

	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));

		wait.until(ExpectedConditions.elementToBeClickable(target));


	}
	public static void elementToBeSelected(WebDriver driver, WebElement target)

	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));

		wait.until(ExpectedConditions.elementToBeSelected(target));


	}

	public static void invisibilityOf(WebDriver driver, WebElement target)

	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));

		wait.until(ExpectedConditions.invisibilityOf(target));


	}
	public static  void textToBePresentInElement(WebDriver driver, WebElement target,String Text)

	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));

		wait.until(ExpectedConditions.textToBePresentInElement(target, Text));


	}
	public static void alertIsPresent(WebDriver driver, WebElement target)

	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));

		wait.until(ExpectedConditions.alertIsPresent());


	}
	public static void titleContains(WebDriver driver, WebElement target,String Title)

	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));

		wait.until(ExpectedConditions.titleContains(Title));


	}
	public static void numberOfWindowsToBe(WebDriver driver, WebElement target,String Title,int windows)

	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));

		wait.until(ExpectedConditions.numberOfWindowsToBe(windows));


	}





}
