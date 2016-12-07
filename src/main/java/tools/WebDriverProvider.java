package tools;

	import org.openqa.selenium.WebDriver;

	public final class WebDriverProvider {

		private static  WebDriver driverInstance;

//		static{
//			driverInstance = BrowserType.valueOf(PropertiesReader.getBrowserType()).getInstance();
//		}

		public static  WebDriver getWebDriver() {			
		if (driverInstance==null){
			initialise();
		}
			return driverInstance;

		}
		private static void initialise() {
			driverInstance=BrowserType.valueOf(PropertiesReader.getBrowserType()).getInstance();
			
		}
		public static void stopDriver(){
			driverInstance.quit();
			driverInstance = null;
		}
}