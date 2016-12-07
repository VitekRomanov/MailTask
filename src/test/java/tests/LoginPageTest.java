package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import pageObjects.LoginPage;
import tools.WebDriverProvider;


public class LoginPageTest extends BaseTest{
		
	
	@Test
	public void isCorrectLogPass() {
        LoginPage login = new LoginPage(WebDriverProvider.getWebDriver());
        login.loginAs("testuser2710", "2710user");
		assertTrue("Login or password is incorrect",login.isLogIn());
		login.logOut();
	}
	
	@Test
	public void isIncorrectLogPass() throws InterruptedException {
        LoginPage login = new LoginPage(WebDriverProvider.getWebDriver());
        login.loginAs("testuser", "2710user");
        assertFalse("Login and password are correct",login.isLogIn());
        
	}

}
