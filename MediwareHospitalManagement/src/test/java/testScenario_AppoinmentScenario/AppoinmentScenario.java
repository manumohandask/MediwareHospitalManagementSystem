package testScenario_AppoinmentScenario;

import org.testng.annotations.Test;

import businessPackage.MediwareAppoinment;
import clientPackage.AutomationClient;

/*
 * author :Manu Mohan
 */
public class AppoinmentScenario {
//Testcases of Mediware Appoinment

	@Test
	public void MediwareSucessfullApplicationSelection() throws Exception {

		AutomationClient client = new AutomationClient();

		client.medLogin.loginToMediware("opuser", "123");
		client.medAppoinment.ApplicationSelectionInMediware();
		client.medAppoinment.AppoinmentSelectionInMediware();
		client.medAppoinment.AppoinmentTimeSelectInMediware();
		client.medAppoinment.NewAppoinmentInMediware("NH0000125");
		client.medAppoinment.CloseMediwareAppoinemt();
		client.medLogin.logOutFromMediware();

	}

}
