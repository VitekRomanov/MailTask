package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import tools.WebDriverProvider;

public class BaseTest {
	
  
    @BeforeClass
    public void before()  {
    	WebDriverProvider.getWebDriver().get("https://mail.yandex.by");
    	WebDriverProvider.getWebDriver().manage().window().maximize();
    }      
     @AfterClass
     public void after() {
     WebDriverProvider.getWebDriver();
     }

}
