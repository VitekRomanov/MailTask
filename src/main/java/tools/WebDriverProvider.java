package tools;

	import tools.ConfigReader;
	import org.openqa.selenium.chrome.ChromeDriver;

	public final class WebDriverProvider {
		private static ChromeDriver driver = null;

		private WebDriverProvider() {}

		public static synchronized ChromeDriver getInstance() {
			if (driver == null)
				//ConfigReader.getBROWSER_TYPE();
			BrowserType.valueOf(ConfigReader.getBROWSER_TYPE());
			System.setProperty("webdriver.chrome.driver", BrowserType.getInstance());
			driver = new ChromeDriver();      
      
			return driver;
		}
		public ChromeDriver getWebDriver(){
			return driver;
		}
}