package helperPackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonHelper {

	public WebDriver driver;

	public ButtonHelper(WebDriver driver) {

		this.driver = driver;
	}

	public void buttonClick(By locator) {

		WebDriverWait wait = getWait();
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		driver.findElement(locator).click();

	}

	@SuppressWarnings("deprecation")

	public WebDriverWait getWait() {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.pollingEvery(250, TimeUnit.MILLISECONDS);
		wait.ignoring(NoSuchElementException.class);
		return wait;

	}

}
