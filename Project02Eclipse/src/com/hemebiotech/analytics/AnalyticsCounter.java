package com.hemebiotech.analytics;

public class AnalyticsCounter {

	
	public static void main(String args[]) throws Exception {
			
		SymptomsReader symptomsReader = new SymptomsReader();			
		symptomsReader.sortAndCount(SingletonProperties.getPath());
		symptomsReader.displaySymptoms();				
		symptomsReader.createFile();		
		
	}
}
