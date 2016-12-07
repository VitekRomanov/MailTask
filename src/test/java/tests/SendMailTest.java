package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import pageObjects.SendMailPage;
import tools.WebDriverProvider;

public class SendMailTest extends BeforeLogIN{

	@Test
	public void sendMail() {		
		SendMailPage sendmail = new SendMailPage(WebDriverProvider.getWebDriver());
		sendmail.writeTheLetter("testuser0612@yandex.ru", "some subject", "massage of happy");
		assertTrue("Email was send",sendmail.isMailSend());
	}	
	
	@Test
	public void sendToIncorrectEmail() {
		SendMailPage sendmail = new SendMailPage(WebDriverProvider.getWebDriver());
		sendmail.writeTheLetter("somemx.ruu", "some subject", "massage of error");
        assertFalse("Email address incorrect",sendmail.isMailSend());	
	}

}
