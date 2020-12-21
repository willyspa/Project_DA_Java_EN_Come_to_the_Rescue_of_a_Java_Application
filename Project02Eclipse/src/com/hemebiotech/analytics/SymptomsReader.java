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
	private List<String> symptoms;
	
	public SymptomsReader() {
		
		readSymptoms = new ReadSymptomDataFromFile();
		symptoms = new ArrayList<String>();
		
	}
			
	public void sortAndCount(String p) throws IOException {
		
		this.symptoms = readSymptoms.readAndList(p);
		this.mapFromList(this.symptoms);
		
	}
	
	public void displaySymptoms() {
		this.displayCount();
	}
	
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
