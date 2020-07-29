package extentReportListner;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

import dataPackages.HashMapDataReader;
/*
 * author Manu Mohan
 * For sending the ExtentReport through Email
 */
public class ExtentReportEmailer {

	static int port;
	static String smtphostname;
	static String username, password, emailto;

	public static void emailsend() throws EmailException {
		port = HashMapDataReader.SendEmail().get("PORT");
		smtphostname = HashMapDataReader.Emailcredentials().get("hostname");
		username = HashMapDataReader.Emailcredentials().get("username");
		password = HashMapDataReader.Emailcredentials().get("password");
		emailto = HashMapDataReader.Emailcredentials().get("emailto");

		MultiPartEmail email = new MultiPartEmail();
		email.setHostName(smtphostname);
		email.setSmtpPort(port);
		email.setAuthenticator(new DefaultAuthenticator(username, password));
		email.setSSLOnConnect(true);
		email.setFrom(username);
		email.setSubject("ExtentReport of Mediware");
		email.setMsg("Extent report of Mediware Hospital Management System ");
		email.addTo(emailto);

		EmailAttachment attachment = new EmailAttachment();
		attachment.setPath("F:\\Mediware\\ExtentReport\\MediwareExtentReport.html");
		attachment.setDisposition(EmailAttachment.ATTACHMENT);
		attachment.setDescription("ExtentReport of Mediware Automation");
		attachment.setName("ExtentReport");
		email.attach(attachment);
		email.send();
		System.out.println("------emailsend--------");

	}

}
