package tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


	public final class ConfigReader {
	    private static String BROWSER_TYPE;
	    private static String BROWSER_WAY;
	    private static String URL;
	    
//	    private ConfigReader(){
//	    	
//	    }


	    public static String getBROWSER_TYPE() {
			return BROWSER_TYPE;
		}


		public static String getBROWSER_WAY() {
			return BROWSER_WAY;
		}


		public static String getURL() {
			return URL;
		}


		public String readBrowserType() throws IOException
	    {
	        Properties props = new Properties();

	        try{
	            props.load(new FileInputStream(new File("src\\main\\java\\tools\\config.properties").getAbsolutePath()));

	            BROWSER_TYPE = props.getProperty("browser");
	            System.out.println(BROWSER_TYPE);

	        }
	        catch(IOException e) {
	            System.out.println("IOException");
	        }
	        return BROWSER_TYPE;
	    }


	    public String readUrl() throws IOException {
	        Properties props = new Properties();
	        try{
	            props.load(new FileInputStream(new File("src\\main\\java\\tools\\config.properties").getAbsolutePath()));

	            URL = props.getProperty("urlMainPage");

	        }
	        catch (IOException e){
	            System.out.println("IOException");
	        }

	        return URL;
	    }
	    public String readChromeWay() throws IOException {
	        Properties props = new Properties();
	        try{
	            props.load(new FileInputStream(new File("src\\main\\java\\tools\\config.properties").getAbsolutePath()));

	            BROWSER_WAY = props.getProperty("chromedriver");

	        }
	        catch (IOException e){
	            System.out.println("IOException");
	        }

	        return BROWSER_WAY;
	    }
}
