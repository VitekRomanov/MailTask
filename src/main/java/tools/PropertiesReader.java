package tools;

import java.util.ResourceBundle;

/**
 * Class for working with property-files
 */
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

    public static void main(String[] args){
        System.out.println(getBrowserType());
        System.out.println(getUrl());
        System.out.println(getBrowserWey());
    }
}
