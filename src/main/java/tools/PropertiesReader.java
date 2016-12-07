package tools;

import java.util.ResourceBundle;


public class PropertiesReader {
    private static final String BROWSER_TYPE;
    private static final String URL;
    private static final String CHROME_BROWSER_WEY;
    private static final String FIREFOX_BROWSER_WEY;
    private static ResourceBundle bundle = ResourceBundle.getBundle("selenium") ;

    static {
        BROWSER_TYPE = bundle.getString("browser");
        URL = bundle.getString("url");
        CHROME_BROWSER_WEY = bundle.getString("chromedriver");
        FIREFOX_BROWSER_WEY = bundle.getString("firefoxdriver");    
    }

    public static String getBrowserType(){
        return BROWSER_TYPE;
    }

    public static String getUrl(){
        return URL;
    }
    public static String getChromeBrowserWey(){
        return CHROME_BROWSER_WEY;
    }
    public static String getFirefoxBrowserWey(){
        return FIREFOX_BROWSER_WEY;
    }
    

    public static void main (String [] args){
    	
    	System.out.println(PropertiesReader.getBrowserType());
    	System.out.println(PropertiesReader.getChromeBrowserWey());
    	System.out.println(PropertiesReader.getUrl());
    	System.out.println(PropertiesReader.getFirefoxBrowserWey());
    	
    }
    
}
