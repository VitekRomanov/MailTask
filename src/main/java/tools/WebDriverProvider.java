package tools;

	import org.openqa.selenium.WebDriver;

	public final class WebDriverProvider {

		private static final WebDriver driverInstance;

		static{
			driverInstance = BrowserType.valueOf("chrome").getInstance();
		}

		public static  WebDriver getWebDriver() {
			return driverInstance;

		}
		public static void stopDriver(){
			driverInstance.quit();
		}
}