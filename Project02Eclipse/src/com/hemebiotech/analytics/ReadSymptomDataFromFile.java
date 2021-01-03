package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReadSymptomDataFromFile implements ISymptomReader {
	
	BufferedReader reader;
	private List<String> symptoms = new ArrayList<String>();
	
	/**
	 * If no data is available, return an empty List
	 * 
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
	 */	
	public  List<String> readAndList (String filepath) throws IOException {
		
		reader = new BufferedReader (new FileReader(filepath));
		String line = reader.readLine();
		
		while (line != null) {
			symptoms.add(line);
			line = reader.readLine();	// get another symptom
		}
		return this.symptoms;				
			
	}
	/**	 	 
	 * @return a raw listing of all Symptoms 
	 */
	public List<String> getSymptoms() {
		return this.symptoms;
	}



	
}
