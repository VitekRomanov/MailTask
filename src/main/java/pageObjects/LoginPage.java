package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tools.WebDriverProvider;

public class LoginPage {
	
	 WebDriver driver = WebDriverProvider.getWebDriver();
	 
	
	@FindBy(name="login")
	WebElement loginFild;
	
	@FindBy(name="passwd")
	WebElement passwordFild;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public String loginAs(String login, String password){
		loginFild.click();
		loginFild.sendKeys(login);
		
		passwordFild.click();
		passwordFild.sendKeys(password);
		passwordFild.submit();
		
		return WebDriverProvider.getWebDriver().getTitle();
		
	}

}
