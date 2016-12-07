package tools;

import org.apache.log4j.LogManager;
import org.apache.log4j.xml.DOMConfigurator;

  public class Logger {
		static {
			 new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
			}
}