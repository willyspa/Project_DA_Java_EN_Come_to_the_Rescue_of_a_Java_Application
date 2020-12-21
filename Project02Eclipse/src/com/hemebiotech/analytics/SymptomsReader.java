package com.hemebiotech.analytics;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class SymptomsReader extends SymptomsCounting{
	
	private ReadSymptomDataFromFile readSymptoms;
	
	public SymptomsReader() {
		
		readSymptoms = new ReadSymptomDataFromFile();
		
	}
	
	/**
	 * 
	 * @return a sorted list of symptoms with their count from data; 
	 */
	public void sortAndCount(String p) throws IOException {
		
		readSymptoms.readAndList(p);
		this.mapFromList(readSymptoms.getSymptoms());

		
	}
	
	/**
	 * 
	 * @return Display the Symptoms with their count from a map
	 */
	public void displaySymptoms() {
		System.out.println("************************");
		System.out.println("The symptoms list");
		System.out.println("************************");
		this.displayCount();
	}
	/**
	 * 
	 * @return create a file on the root folder with the symptoms data
	 */
	public void createFile() {
		
	    Properties prop = new Properties();
	    OutputStream output = null;

	    try {

	        output = new FileOutputStream("Symptoms Number2.txt");

	       //set the properties value
	       for(Map.Entry<String,Integer> symptom:this.symptomsMap.entrySet()) {
			   prop.setProperty(symptom.getKey(),symptom.getValue().toString());
		   }	        
	        
	       //save properties to project root folder
	        prop.store(output, null);

	    } catch (IOException io) {
	        io.printStackTrace();
	    } finally {
	        if (output != null) {
	            try {
	                output.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }

	    }

	}
	
	
	
}
