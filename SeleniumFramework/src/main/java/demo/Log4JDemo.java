package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JDemo {
	
	private static Logger logger = LogManager.getLogger(Log4JDemo.class);

	public static void main(String[] args) {
	

		System.out.println("\n HELLO WORLD.....!    \n");
		
		logger.info("This is information Message");
		logger.error("This is an error Message");
		logger.warn("This is a warning Message");
		logger.fatal("This is a fatal message");
		
		System.out.println("\n Completed");
	}

}
