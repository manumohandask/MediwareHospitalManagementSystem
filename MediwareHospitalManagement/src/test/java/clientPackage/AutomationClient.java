package clientPackage;

import businessPackage.MediwareAppoinment;
import businessPackage.MediwareLogin;
import businessPackage.MediwareSelectPatient;

/*
 * author :Manu Mohan
 */
public class AutomationClient {
	
	public MediwareLogin medLogin;
	public MediwareAppoinment medAppoinment;
	public MediwareSelectPatient medPatient;
	//For accessing  the classes of businesspackage
	public AutomationClient() {
		
		this.medLogin = new MediwareLogin();
		this.medAppoinment = new MediwareAppoinment();
		this.medPatient = new MediwareSelectPatient();
		
		
	}
	

}
