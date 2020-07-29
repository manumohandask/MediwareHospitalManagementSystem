package testScenarios;

/*
 * author:Manu Mohan
 */
import org.testng.annotations.Test;

import businessPackage.MediwareLogin;
//TestCase for MediwareLogin
public class LoginScenario {

	MediwareLogin sign=new MediwareLogin();
	

	@Test(priority = 1)
	public void MediwaresuccessfullLogin() throws Exception {

		sign.loginToMediware("opuser", "123");

	}

}
