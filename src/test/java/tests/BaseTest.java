package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import tools.WebDriverProvider;

public class BaseTest {
	
  
    @BeforeClass
    public void before()  {
    	WebDriverProvider.getInstance().manage().window().maximize();
    	WebDriverProvider.getInstance().get("http://www.github.com");
    }      
        @AfterClass
        public void after() {
        	WebDriverProvider.getInstance().quit();
        }

}
