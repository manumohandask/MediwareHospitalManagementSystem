package testScenarios;


import org.testng.annotations.Test;

import businessPackage.MediwareAppoinment;
/*
 * author :Manu Mohan
 */
public class AppoinmentScenario {

	MediwareAppoinment appoinments =

			new MediwareAppoinment();
//Testcase for Mediware Appoinment
	@Test(priority = 2)
	public void MediwareSucessfullApplicationSelection() throws Exception {
		appoinments.ApplicationSelectionInMediware();
		appoinments.AppoinmentSelectionInMediware();
		appoinments.AppoinmentTimeSelectInMediware();
		appoinments.NewAppoinmentInMediware("NH0000125");

	}
	

}
