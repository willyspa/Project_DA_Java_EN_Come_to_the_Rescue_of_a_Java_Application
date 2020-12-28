package com.hemebiotech.analytics;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SingletonProperties {

	    private static SingletonProperties single_instance = null;
		private static final Properties prop = new Properties();
		private static InputStream input = null;
		private static String PropPath = "Project02Eclipse\\src\\main\\resources\\application.properties";

	    private SingletonProperties(){ 

	    } 
	  
	    public static SingletonProperties getInstance(){ 
	        if (single_instance == null) 
	            single_instance = new SingletonProperties(); 
	  
	        return single_instance; 
	    } 
	    
	    public static String getPath(){
	    	
			
			try {

				input = new FileInputStream(PropPath);

				// load a properties file
				prop.load(input);

				// get the property value and print it out
				return prop.getProperty("symptoms.path");
				
				

			} catch (final IOException ex) {
				ex.printStackTrace();
			} finally {
				if (input != null) {
					try {
						input.close();
					} catch (final IOException e) {
						e.printStackTrace();
					}
				}
			}
			return "error";
	    }

}
