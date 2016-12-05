package tools;

import java.util.ResourceBundle;


public class PropertiesReader {
    private static final String BROWSER_TYPE;
    private static final String URL;
    private static final String BROWSER_WEY;
    private static ResourceBundle bundle = ResourceBundle.getBundle("selenium") ;

    static {
        BROWSER_TYPE = bundle.getString("browser");
        URL = bundle.getString("url");
        BROWSER_WEY = bundle.getString("chromedriver");
    }

    public static String getBrowserType(){
        return BROWSER_TYPE;
    }

    public static String getUrl(){
        return URL;
    }
    public static String getBrowserWey(){
        return BROWSER_WEY;
    }

}
