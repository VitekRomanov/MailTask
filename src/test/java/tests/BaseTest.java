package tests;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import tools.PropertiesReader;
import tools.WebDriverProvider;

public class BaseTest {
	
    @BeforeClass    
    public static void before()  {
    	WebDriverProvider.getWebDriver().get(PropertiesReader.getUrl());
    	WebDriverProvider.getWebDriver().manage().window().maximize();
    }      
     @AfterClass
     public static void after() {
     WebDriverProvider.stopDriver();
     }
     
	 @Before
	 public void setUp() throws Exception {
		 WebDriverProvider.getWebDriver().get(PropertiesReader.getUrl());
	 }

}
