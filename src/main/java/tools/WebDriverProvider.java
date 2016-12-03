package tools;

	import org.openqa.selenium.WebDriver;

	public final class WebDriverProvider {

		private static  WebDriver driverInstance;

		static{
			driverInstance = BrowserType.valueOf(PropertiesReader.getBrowserType()).getInstance();
		}

		public static  WebDriver getWebDriver() {
			return driverInstance;

		}
		public static void stopDriver(){
			driverInstance.quit();
		}
}