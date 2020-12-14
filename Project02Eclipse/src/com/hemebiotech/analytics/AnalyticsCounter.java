package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Enumeration;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {

	
	public static void main(String args[]) throws Exception {
		// first get input
		BufferedReader reader = new BufferedReader (new FileReader("C:\\Users\\armed\\git\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\src\\com\\hemebiotech\\analytics\\symptoms.txt"));
		String line = reader.readLine();

		List<String> symptoms = new ArrayList<String>();
		SortedMap<String,Integer> symptomsMap = new TreeMap<String,Integer>();

		String key;
		
		while (line != null) {

			symptoms.add(line);
			java.util.Collections.sort(symptoms);
			line = reader.readLine();	// get another symptom
		}
		
		for(String symptom:symptoms) {
			
			System.out.println(symptom);
			symptomsMap.put(symptom,0);
		}
	

	    for(String symptom:symptoms) {
	    	symptomsMap.put(symptom,symptomsMap.get(symptom)+1);
	    }

	    
		
		
	   for(Map.Entry<String,Integer> symptom:symptomsMap.entrySet()) {
		   System.out.println(symptom.getKey()+" - "+symptom.getValue());
	   }
	    
	    

	    

	    
	
	
	 

	 
		
		
		
		
		/* next generate output
		FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
		*/
	}
}
