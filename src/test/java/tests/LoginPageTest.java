package tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.LoginPage;
import tools.PropertiesReader;
import tools.WebDriverProvider;


public class LoginPageTest extends BaseTest{
	
	 @Before
	 public void setUp() throws Exception {
		 WebDriverProvider.getWebDriver().get(PropertiesReader.getUrl());
	 }
	
	
	@Test
	public void isCorrectLogPass() {
        LoginPage login = new LoginPage(WebDriverProvider.getWebDriver());
        login.loginAs("testuser2710", "2710user");
        WebDriverWait wait = new WebDriverWait(WebDriverProvider.getWebDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//span[text()='Написать']"))));
		assertNotNull(WebDriverProvider.getWebDriver().findElement(By.xpath("//span[text()='Написать']")));
	}
	
	@Test
	public void isIncorrectLogPass() {
        LoginPage login = new LoginPage(WebDriverProvider.getWebDriver());
        login.loginAs("testuser", "2710user");
        assertTrue("Login or Email don't correct",  WebDriverProvider.getWebDriver().getTitle().equals("Авторизация"));
	}

}
