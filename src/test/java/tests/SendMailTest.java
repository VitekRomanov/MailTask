package tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.LoginPage;
import pageObjects.SendMailPage;

public class SendMailTest {
public static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();     
		driver.get("https://mail.yandex.by");
		driver.manage().window().maximize();
		LoginPage login = new LoginPage(driver);
		login.loginAs("testuser2710", "2710user");
    		System.out.println("BeforeClass");
}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass");
		//driver.quit();
}	
//	@Before
//	public void setUp() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//span[text()='Проверить']"))));
//		driver.findElement(By.xpath("//span[text()='Проверить']")).click();
//		System.out.println("Before");
//	}
	@After
	public void tearDown() throws Exception {
		driver.findElement(By.xpath("//span[text()='Проверить']")).click();
		System.out.println("After");
	}
	@Test
	public void sendMail() {
		SendMailPage sendmail = new SendMailPage(driver);
		sendmail.writeTheLetter("somemail@yandex.ru", "some subject", "massage of happy");
		assertNotNull(driver.findElement(By.xpath("//div[@class='mail-Done-Title']")));
	}	
	@Test
	public void sendToIncorrectEmail() {
		SendMailPage sendmail = new SendMailPage(driver);
		sendmail.writeTheLetter("somemx.ru", "some subject", "massage of happy");
        boolean present;
		try {
		    driver.findElement(By.xpath("//div[@data-key='view=compose-field-to-error']"));
		    present = true;
		} catch (NoSuchElementException e) {
		   present = false;
		}
        assertTrue("Email address incorrect",present);
	}

}
