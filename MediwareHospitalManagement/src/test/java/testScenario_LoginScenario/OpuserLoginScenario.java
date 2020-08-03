package testScenario_LoginScenario;
import org.testng.annotations.Test;

import businessPackage.MediwareLogin;
import clientPackage.AutomationClient;
import dataPackages.HashMapDataReader;

//TestCase for MediwareLogin
public class OpuserLoginScenario {
	public String Opusercredentials;
	public String userinfo[];


	@Test
	public void MediwaresuccessfullLogin() throws Exception {
	
	    AutomationClient client = new AutomationClient();  
		Opusercredentials = HashMapDataReader.getUserinfo().get("Outpatient");
		userinfo = Opusercredentials.split("_");
	    client.medLogin.loginToMediware(userinfo[0],userinfo[1]);
	    client.medLogin.logOutFromMediware();
	    

	}
	
	
	

	
}
