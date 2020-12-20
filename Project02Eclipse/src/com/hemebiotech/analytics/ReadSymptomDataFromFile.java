package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;


public class ReadSymptomDataFromFile  {
	
	BufferedReader reader;
	List<String> symptoms = new ArrayList<String>();
	
	public  List<String> readAndList (String filepath) throws IOException {

		reader = new BufferedReader (new FileReader(filepath));
		String line = reader.readLine();
		
		while (line != null) {
			symptoms.add(line);
			line = reader.readLine();	// get another symptom
		}
		return symptoms;				
			
	}

	
}
