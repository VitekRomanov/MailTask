package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import tools.WebDriverProvider;

public class SendMailPage {

	private static final Logger logger = Logger.getLogger(SendMailPage.class);

	WebDriver driver = WebDriverProvider.getWebDriver();

	@FindBy(xpath="//span[text()='Написать']")
	WebElement writeLatter;
	
	@FindBy(xpath="//span[text()='Проверить']")
	WebElement refrash;

	@FindBy(xpath="//div[@name='to']")
	WebElement address;

	@FindBy(name="subj")
	WebElement tema;

	@FindBy(xpath="//div[@role='textbox']")
	WebElement letter;

	@FindBy(xpath="//button[@type='submit']")
	WebElement sendButton;
	
	@FindBy(xpath="//button[@data-action='save']")
	WebElement sevebutton;

	public SendMailPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}


	public void writeTheLetter(String adres,String temaOfLatter,String emailLatter){
		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//span[text()='Написать']"))));
		writeLatter.click();
        wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//span[text()='Отправить']"))));
		address.sendKeys(adres);
		tema.sendKeys(temaOfLatter);
		letter.sendKeys(emailLatter);
		sendButton.click();
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//span[text()='Проверить']"))));
		
		logger.info("Send mail.Address: "+ adres+ " subject: "+ temaOfLatter + " letter: "+emailLatter);
	
	}
	
	public boolean isMailSend(){
        boolean issend;
		try {
			WebDriverProvider.getWebDriver().findElement(By.xpath("//div[@data-key='view=compose-field-to-error']"));
		    issend = false;
		} catch (NoSuchElementException e) {
			issend = true;
		}
		logger.info("letter was sent "+ issend);
		return issend;
		
	}
}
