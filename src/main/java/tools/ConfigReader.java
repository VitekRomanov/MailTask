package tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


	public class ConfigReader {
	    private static String BROWSER_TYPE;
	    private static String URL;


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
	
}
