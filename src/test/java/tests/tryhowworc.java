package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.LoginPage;
import tools.WebDriverProvider;


public class tryhowworc extends BaseTest {


	@Test
		public void isCorrectLogPass() {
	        LoginPage login = new LoginPage(WebDriverProvider.getWebDriver());
	        login.loginAs("testuser2710", "2710user");
	        WebDriverWait wait = new WebDriverWait(WebDriverProvider.getWebDriver(), 10);
			wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//span[text()='Написать']"))));
			assertNotNull(WebDriverProvider.getWebDriver().findElement(By.xpath("//span[text()='Написать']")));
	
	}

}
