package businessPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import basePackage.Base;
import dataPackages.ExcelDataReader;
import helperPackages.TextBoxHelper;
import helperPackages.ButtonHelper;
/*
 * author:Manu Mohan
 */

public class MediwareLogin extends Base {

	public ButtonHelper btnHelper;
	public TextBoxHelper txtHelper;

	// Locaters for the Login Page
	By opUser = By.id("btnLogin");
	By usrName = By.id("txtUsername");
	By passWord = By.id("txtPassword");
	By logOut = By.id("mnuLogOut");
	By mediwareLogo = By.xpath("//img[@src='img/logo.png']");

	// For Login to Mediware Hospital Management System

	public void loginToMediware(String userName, String Password) throws Exception {

		driver = BaseClass();
		btnHelper = new ButtonHelper(driver);
		txtHelper = new TextBoxHelper(driver);

		txtHelper.SendText(usrName, userName);
		txtHelper.SendText(passWord, Password);
		btnHelper.buttonClick(opUser);
		System.out.println(driver.getTitle());

		String val = ExcelDataReader.getMapData("username");
		System.out.println("Value of the Key in Execl is :" + val);

	}

	// For logout from mediware
	public void logOutFromMediware() {
		btnHelper.buttonClick(logOut);
		SoftAssert mediLogo = new SoftAssert();
		WebElement mediIcon = driver.findElement(mediwareLogo);
		mediLogo.assertEquals(true, mediIcon.isDisplayed());

		if (driver != null)
			driver.quit();

	}

}
