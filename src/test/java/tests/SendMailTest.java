package tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import pageObjects.SendMailPage;
import tools.WebDriverProvider;

public class SendMailTest extends BeforeLogIN{

	@After
	public void tearDown() throws Exception {
		WebDriverProvider.getWebDriver().get("https://mail.yandex.by");
	}
	
	
	@Test
	public void sendMail() {
		SendMailPage sendmail = new SendMailPage(WebDriverProvider.getWebDriver());
		sendmail.writeTheLetter("somemail@yandex.ru", "some subject", "massage of happy");
		System.out.println(WebDriverProvider.getWebDriver().getTitle());
		assertTrue(WebDriverProvider.getWebDriver().getTitle().equals("Яндекс.Почта"));
	}	
	@Test
	public void sendToIncorrectEmail() {
		SendMailPage sendmail = new SendMailPage(WebDriverProvider.getWebDriver());
		sendmail.writeTheLetter("somemx.ru", "some subject", "massage of happy");
        boolean present;
		try {
			WebDriverProvider.getWebDriver().findElement(By.xpath("//div[@data-key='view=compose-field-to-error']"));
		    present = true;
		} catch (NoSuchElementException e) {
		   present = false;
		}
        assertTrue("Email address incorrect",present);
	}

}
