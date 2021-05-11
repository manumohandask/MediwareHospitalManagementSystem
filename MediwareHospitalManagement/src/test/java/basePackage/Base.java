package basePackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.assertEquals;


/*
 * Author:Manu Mohan
 * Here the Chromedriver is initialized and the URL is given. An assertion is
 * given for checking the title of the login page .
 */
public class Base {
	public static WebDriver driver;
	static String title;
	//demo comment

	@BeforeClass
	public static WebDriver BaseClass() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mediwarecloud.com/MediwareQC/login.aspx");
		title = "Mediware Hospital Information System";
		assertEquals(driver.getTitle(), title);
		return driver;

	}

}
