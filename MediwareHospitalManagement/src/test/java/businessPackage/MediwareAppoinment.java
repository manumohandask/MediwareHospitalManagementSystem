package businessPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import basePackage.Base;
import helperPackages.TextBoxHelper;
import helperPackages.ButtonHelper;
/*
 * Author:Manu Mohan
 */

public class MediwareAppoinment extends Base {

//Locaters of  Appoinment Page
	By applicationSelection = By.xpath("//img[@id=\"imgApp\"]");
	By appoinmentButton = By.xpath("//a[contains(@href,'AppointmentView.aspx')]");
	By timeSelect = By.xpath("//div[@id='DocDiv1']//div[@class='AppNewSlot gray WCPer  NewEvent NewRegistration']");
	By PatientId = By.xpath("//input[@id=\"txtSearchPatientID\"]");

	// For clicking the Application Selector button
	public void ApplicationSelectionInMediware() throws Exception {
		ButtonHelper applicationSelectionButtonHelper = new ButtonHelper(driver);
		applicationSelectionButtonHelper.buttonClick(applicationSelection);

	}

//For clicking the Appoinment button
	public void AppoinmentSelectionInMediware() {
		driver.switchTo().frame("CallingPageDiv");
		ButtonHelper appoinmentButtonHelper = new ButtonHelper(driver);
		appoinmentButtonHelper.buttonClick(appoinmentButton);

	}

//For selecting time to take appoinment
	public void AppoinmentTimeSelectInMediware() throws InterruptedException {

		Thread.sleep(3000);
		List<WebElement> timeselect = driver.findElements(timeSelect);
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("arguments[0].scrollIntoView();", timeselect.get(0));
		timeselect.get(0).click();

	}

//For entering the patientid in the new Appoinment Page
	public void NewAppoinmentInMediware(String patientId) {
		driver.switchTo().frame("AppointmentDiv");
		TextBoxHelper patientIdTextBoxHelper = new TextBoxHelper(driver);
		patientIdTextBoxHelper.SendText(PatientId, patientId);
	}

}