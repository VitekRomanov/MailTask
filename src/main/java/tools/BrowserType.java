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
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ConfigReader.getBROWSER_WAY());
		driver = new ChromeDriver();
		 return driver;
	 	}
	 };

	 protected abstract WebDriver getInstance();
 
}
		


