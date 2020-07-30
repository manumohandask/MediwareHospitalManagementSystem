package testScenario_SelectpatientScenario;
/*
 * author:Manu Mohan
 */
import org.testng.annotations.Test;

import businessPackage.MediwareSelectPatient;
import clientPackage.AutomationClient;
//Testcase for MediwareSelectPatient
public class SelectPatientScenario {
	
	
	@Test()
	public void MediwareSucessfullPatientSearch() throws Exception {
		
		AutomationClient client = new AutomationClient();
		
		client.medLogin.loginToMediware("opuser", "123");
        client.medAppoinment.ApplicationSelectionInMediware();
        client.medAppoinment.AppoinmentSelectionInMediware();
        client.medAppoinment.AppoinmentTimeSelectInMediware(); 
        client.medAppoinment.NewAppoinmentInMediware("NH0000125");
        client.medPatient.SearchPatientInMediware();
        client.medPatient.SelectPatientInMediware();
        client.medPatient.SavePatientInMediware();
      	
	}

}
