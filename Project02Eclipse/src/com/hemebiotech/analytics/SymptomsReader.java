package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class SymptomsReader extends SymptomsCounting{
	
	private ReadSymptomDataFromFile readSymptoms;
	
	public SymptomsReader() {
		
		readSymptoms = new ReadSymptomDataFromFile();
		
	}	
	/**
	 * 
	 * a sorted list of symptoms with their count from data; 
	 */
	public void sortAndCount(String p) throws IOException {
		
		readSymptoms.readAndList(p);
		this.mapFromList(readSymptoms.getSymptoms());		
	}	
	/**
	 * 
	 *  Display the Symptoms with their count from a map
	 */
	public void displaySymptoms() {
		
		System.out.println("************************");
		System.out.println("The symptoms list");
		System.out.println("************************");
		this.displayCount();
	}
	/**
	 * 
	 *create a file on the resources folder with the symptoms data
	 */
	public void createFile() {
	
	    try {
	        FileWriter myWriter = new FileWriter("result.out");
	        
	        
	        for (Map.Entry<String,Integer> entry : this.symptomsMap.entrySet()) {

	        	  myWriter.write(entry.getKey()+" : "+entry.getValue().toString()+"\n");
	        	  
	       }	        	        	        
	        myWriter.close();
	        System.out.println("Successfully wrote to the file.");
	        
	      } catch (IOException e) {
	    	  
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	    

	}
	
	
	
}
