package tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


enum BrowserType {
	 firefox {
	 @Override
	 protected WebDriver getInstance()
	 {	 
		 WebDriver driver;
		 System.setProperty("webdriver.gecko.driver", PropertiesReader.getFirefoxBrowserWey());
		 driver = new FirefoxDriver();
		 return driver;
	 	}
	 },
	 chrome {
	@Override
	 protected WebDriver getInstance()
	 {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", PropertiesReader.getChromeBrowserWey());
		driver = new ChromeDriver();
		 return driver;
	 	}
	 };

	 protected abstract WebDriver getInstance();
 
}
		


