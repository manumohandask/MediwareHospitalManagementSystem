package businessPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import basePackage.Base;
import helperPackages.ButtonHelper;

/*
 * author :Manu Mohan
 */
public class MediwareSelectPatient extends Base {

	// Locaters for Select patient Page
	By SearchPatient = By.xpath("//button[@id='btnSearch']");
	By SelectPatient = By.id("grdPatients_imgEdit_0");
	By SavePatient = By.xpath("//button[@id='btnSaveAppointment']");

	

	// For searching the patient after entering the patientid
	public void SearchPatientInMediware() {

		ButtonHelper timeSelectButtonHelper = new ButtonHelper(driver);
		timeSelectButtonHelper.buttonClick(SearchPatient);

	}

//For selecting the patient form the search result
	public void SelectPatientInMediware() {
		ButtonHelper SelectPatientButtonHelper = new ButtonHelper(driver);
		SelectPatientButtonHelper.buttonClick(SelectPatient);

	}

//For saving the patient details to take appoinment
	public void SavePatientInMediware() {
		ButtonHelper SavePatientButtonHelper = new ButtonHelper(driver);
		SavePatientButtonHelper.buttonClick(SavePatient);
		

	}

}
