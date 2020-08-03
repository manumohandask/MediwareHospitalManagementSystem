package testScenario_SelectpatientScenario;
/*
 * author:Manu Mohan
 */
import org.testng.annotations.Test;

import businessPackage.MediwareSelectPatient;
import clientPackage.AutomationClient;
import dataPackages.HashMapDataReader;
//Testcase for MediwareSelectPatient
public class SelectPatientScenario {
	public String Opusercredentials;
	public String userinfo[];
	
	@Test()
	public void MediwareSucessfullPatientSearch() throws Exception {
		
		AutomationClient client = new AutomationClient();
		
		Opusercredentials = HashMapDataReader.getUserinfo().get("Outpatient");
		userinfo = Opusercredentials.split("_");
	    client.medLogin.loginToMediware(userinfo[0],userinfo[1]);
        client.medAppoinment.ApplicationSelectionInMediware();
        client.medAppoinment.AppoinmentSelectionInMediware();
        client.medAppoinment.AppoinmentTimeSelectInMediware(); 
        client.medAppoinment.NewAppoinmentInMediware("NH0000125");
        client.medPatient.SearchPatientInMediware();
        client.medPatient.SelectPatientInMediware();
        client.medPatient.SavePatientInMediware();
      	
	}

}
