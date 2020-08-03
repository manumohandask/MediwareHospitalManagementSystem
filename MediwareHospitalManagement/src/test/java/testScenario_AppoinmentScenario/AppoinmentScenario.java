package testScenario_AppoinmentScenario;

import org.testng.annotations.Test;

import businessPackage.MediwareAppoinment;
import clientPackage.AutomationClient;
import dataPackages.HashMapDataReader;

/*
 * author :Manu Mohan
 */
public class AppoinmentScenario {
//Testcases of Mediware Appoinment
	public String Opusercredentials;
	public String userinfo[];

	@Test
	public void MediwareSucessfullApplicationSelection() throws Exception {

		AutomationClient client = new AutomationClient();

		Opusercredentials = HashMapDataReader.getUserinfo().get("Outpatient");
		userinfo = Opusercredentials.split("_");
	    client.medLogin.loginToMediware(userinfo[0],userinfo[1]);
		client.medAppoinment.ApplicationSelectionInMediware();
		client.medAppoinment.AppoinmentSelectionInMediware();
		client.medAppoinment.AppoinmentTimeSelectInMediware();
		client.medAppoinment.NewAppoinmentInMediware("NH0000125");
		client.medAppoinment.CloseMediwareAppoinemt();
		client.medLogin.logOutFromMediware();

	}

}
