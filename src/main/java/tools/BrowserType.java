package tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import tools.ConfigReader;

enum BrowserType {
	 FIREFOX {
	 @Override
	 protected WebDriver getInstance()
	 {	 
		 return new FirefoxDriver();
	 	}
	 },
	 CHROME {
	@Override
	 protected WebDriver getInstance()
	 {
		System.setProperty("webdriver.chrome.driver", ConfigReader.getBROWSER_WAY());
		 
		 return new ChromeDriver();
	 	}
	 };

	 protected abstract WebDriver getInstance();
 
}
		


