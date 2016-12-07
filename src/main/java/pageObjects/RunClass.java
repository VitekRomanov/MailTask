package pageObjects;

import tools.PropertiesReader;
import tools.WebDriverProvider;

public class RunClass {

	public static void main(String[] args) {
		WebDriverProvider.getWebDriver().get(PropertiesReader.getUrl());
    	WebDriverProvider.getWebDriver().manage().window().maximize();   
        LoginPage login = new LoginPage(WebDriverProvider.getWebDriver());
        login.loginAs("testuser2710", "2710user");
        
        
	}
}
