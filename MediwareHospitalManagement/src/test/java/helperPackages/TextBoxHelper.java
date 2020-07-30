package helperPackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxHelper {

	public WebDriver driver;
	WebElement element;

	public TextBoxHelper(WebDriver driver) {
		this.driver = driver;
	}

//For locating the text box
	public void SendText(By locator, String value) {

		WebDriverWait wait = getWait();
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		element = driver.findElement(locator);
		highlighterMethod(driver, element);
		element.sendKeys(value);

	}

	public void highlighterMethod(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String bgColor = element.getCssValue("backgroundColor");
		js.executeScript("arguments[0].setAttribute('style', 'background: " + bgColor + "; border: 2px solid red;');",
				element);

	}

	@SuppressWarnings("deprecation")

	public WebDriverWait getWait() {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.pollingEvery(250, TimeUnit.MILLISECONDS);
		wait.ignoring(NoSuchElementException.class);
		return wait;

	}

}
