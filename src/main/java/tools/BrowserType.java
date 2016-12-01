package tools;

import tools.ConfigReader;

enum BrowserType {
	 FIREFOX, 
	 CHROME;

	public static String getInstance(){
		if (ConfigReader.getBROWSER_TYPE().equals("chrome")){
		return ConfigReader.getBROWSER_WAY();
		}
		else return null;
	}
	 
	 
}
		


