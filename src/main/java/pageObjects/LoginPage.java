package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import tools.WebDriverProvider;

public class LoginPage {

	private static final Logger logger = Logger.getLogger(LoginPage.class);
	
	 WebDriver driver = WebDriverProvider.getWebDriver();
	 WebDriverWait wait = new WebDriverWait(WebDriverProvider.getWebDriver(), 10);
	 
	
	@FindBy(name="login")
	WebElement loginFild;
	
	@FindBy(name="passwd")
	WebElement passwordFild;
	
	@FindBy(xpath="//div[@class='mail-User-Picture js-user-picture']")
	WebElement usersetting;
	
	@FindBy(linkText="Выход")
	WebElement exit;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void loginAs(String login, String password){
		loginFild.click();
		loginFild.sendKeys(login);
		
		passwordFild.click();
		passwordFild.sendKeys(password);
		passwordFild.submit();
		
		logger.info("Log in with login: "+login+" password: "+ password);
		}
	public boolean isLogIn(){
        boolean islogin;		
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='error-msg']")));
			WebDriverProvider.getWebDriver().findElement(By.xpath("//div[@class='error-msg']"));
			islogin = false;
		} catch (TimeoutException e) {
			islogin = true;
		}
		logger.info("Is login and password correct " + islogin);
		return islogin;
	}
	
	public void logOut(){
		usersetting.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Выход")));
		exit.click();
		logger.info("Signout");
	}

}
