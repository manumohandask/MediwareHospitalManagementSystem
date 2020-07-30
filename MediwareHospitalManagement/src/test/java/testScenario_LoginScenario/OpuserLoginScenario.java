package testScenario_LoginScenario;
import org.testng.annotations.Test;

import businessPackage.MediwareLogin;
import clientPackage.AutomationClient;

//TestCase for MediwareLogin
public class OpuserLoginScenario {

	
	

	@Test
	public void MediwaresuccessfullLogin() throws Exception {
	
	    AutomationClient client = new AutomationClient();   
	    client.medLogin.loginToMediware("opuser", "123");
	    client.medLogin.logOutFromMediware();
	    

	}
	
	
	

	
}
