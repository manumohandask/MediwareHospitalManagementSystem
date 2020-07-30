package helperPackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonHelper {

	public WebDriver driver;

	public ButtonHelper(WebDriver driver) {

		this.driver = driver;
	}

//For locating the button 
	public void buttonClick(By locator) {

		WebDriverWait wait = getWait();
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		WebElement element = driver.findElement(locator);
		highlighterMethod(driver, element);
		element.click();

	}

	// For highlighting the methods
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
