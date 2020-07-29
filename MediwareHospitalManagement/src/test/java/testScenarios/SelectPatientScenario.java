package testScenarios;
/*
 * author:Manu Mohan
 */
import org.testng.annotations.Test;

import businessPackage.MediwareSelectPatient;
//Testcase for MediwareSelectPatient
public class SelectPatientScenario {

	MediwareSelectPatient patient = new MediwareSelectPatient();

	@Test(priority = 3)

	public void MediwareSucessfullPatientSearch() {
		patient.SearchPatientInMediware();
		patient.SelectPatientInMediware();
		patient.SavePatientInMediware();
	}

}
