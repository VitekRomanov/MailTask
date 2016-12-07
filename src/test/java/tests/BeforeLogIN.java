package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

import pageObjects.LoginPage;
import tools.PropertiesReader;
import tools.WebDriverProvider;

public class BeforeLogIN extends BaseTest{
	
    @BeforeClass
    public static void before()  {
    	WebDriverProvider.getWebDriver().get(PropertiesReader.getUrl());
    	WebDriverProvider.getWebDriver().manage().window().maximize();   
        LoginPage login = new LoginPage(WebDriverProvider.getWebDriver());
        login.loginAs("testuser2710", "2710user");
	}
    
	 @Before
	 public void setUp() throws Exception {
	 }
	 
	@After
	public void tearDown() throws Exception {
		 WebDriverProvider.getWebDriver().get(PropertiesReader.getUrl());
	}
    
}
