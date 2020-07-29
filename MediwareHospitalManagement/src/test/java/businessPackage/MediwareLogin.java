package businessPackage;

import org.openqa.selenium.By;

import basePackage.Base;
import dataPackages.ExcelDataReader;
import helperPackages.TextBoxHelper;
import helperPackages.ButtonHelper;
/*
 * author:Manu Mohan
 */

public class MediwareLogin extends Base {

	// Locaters for the Login Page
	By opUser = By.id("btnLogin");
	By usrName = By.id("txtUsername");
	By passWord = By.id("txtPassword");

	// For Login to Mediware Hospital Management System
	public void loginToMediware(String userName, String Password) throws Exception {

		driver = BaseClass();
		ButtonHelper btnHelper = new ButtonHelper(driver);
		TextBoxHelper txtHelper = new TextBoxHelper(driver);

		txtHelper.SendText(usrName, userName);
		txtHelper.SendText(passWord, Password);
		btnHelper.buttonClick(opUser);

		String val = ExcelDataReader.getMapData("username");
		System.out.println("Value of the Key in Execl is :" + val);

	}

}
