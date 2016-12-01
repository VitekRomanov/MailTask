package tools;


	import org.openqa.selenium.chrome.ChromeDriver;

	public final class WebDriverProvider {
		private static ChromeDriver driver = null;

		private WebDriverProvider() {}

		public static synchronized ChromeDriver getInstance() {
			if (driver == null)
			System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();      
      
			return driver;
		}
		public ChromeDriver getWebDriver(){
			return driver;
		}
}