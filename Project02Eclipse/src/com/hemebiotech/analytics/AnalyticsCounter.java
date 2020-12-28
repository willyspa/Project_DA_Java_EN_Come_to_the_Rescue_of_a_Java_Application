package com.hemebiotech.analytics;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

public class AnalyticsCounter {

	
	public static void main(String args[]) throws Exception {
	
		
		SymptomsReader symptomsReader = new SymptomsReader();		
	//	String userPath = "C:\\Users\\armed\\git\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\src\\com\\hemebiotech\\analytics\\symptoms.txt";		
		symptomsReader.sortAndCount(SingletonProperties.getPath());
		symptomsReader.displaySymptoms();				
		symptomsReader.createFile();		
		
		/* next generate output
		FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
		*/
	}
}
//path=C:\\Users\\armed\\git\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\src\\src\\main\\resources\\symptoms.txt
