package com.hemebiotech.analytics;

import java.util.Scanner;

public class AnalyticsCounter {

	
	public static void main(String args[]) throws Exception {
		
		SymptomsReader symptomsReader = new SymptomsReader();
		Scanner sc = new Scanner(System.in);
		char response =' ';
		
		do {
			
				System.out.println("********************************************");	
				System.out.println("Give the path of the symptoms file");
				System.out.println("********************************************");
				
				String userPath = sc.nextLine();
				
				symptomsReader.sortAndCount(userPath);
				symptomsReader.displaySymptoms();
				
				symptomsReader.createFile();
				System.out.println("////////////////////////////////////////////");	
				System.out.println("Creation of the file");
				System.out.println("////////////////////////////////////////////");
				
				
				do{
					
					System.out.println("********************************************");
					System.out.println("Read an other file ? (y/n)");
					System.out.println("********************************************");
					
					response = sc.nextLine().charAt(0);
					
				}while(Character.toLowerCase(response) !='y' && Character.toLowerCase(response) != 'n');
				
		symptomsReader = new SymptomsReader();
		
		}while(response=='y');
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*		
		
		
		
		String path = "C:\\Users\\armed\\git\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\src\\com\\hemebiotech\\analytics\\symptoms.txt";
		String path2 = "C:\\Users\\armed\\git\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\src\\com\\hemebiotech\\analytics\\symptoms2.txt";
		String path3 = "C:\\Users\\armed\\git\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\src\\com\\hemebiotech\\analytics\\symptoms3.txt";
				
		SymptomsReader symptomsReader2 = new SymptomsReader();
		SymptomsReader symptomsReader3 = new SymptomsReader();

		
		symptomsReader.sortAndCount(path);
		symptomsReader.displaySymptoms();
		
		System.out.println("********************************************");
				
		symptomsReader2.sortAndCount(path2);
		symptomsReader2.displaySymptoms();
		
		System.out.println("********************************************");
		
		symptomsReader3.sortAndCount(path3);
		symptomsReader3.displaySymptoms();
		

		
		
		
		
		
		// first get input

		BufferedReader reader = new BufferedReader (new FileReader("C:\\Users\\armed\\git\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\src\\com\\hemebiotech\\analytics\\symptoms.txt"));
		String line = reader.readLine();

		List<String> symptoms = new ArrayList<String>();
		SortedMap<String,Integer> symptomsMap = new TreeMap<String,Integer>();

		String key;
		
		while (line != null) {

			symptoms.add(line);
			line = reader.readLine();	// get another symptom
		}
		
		
		///////////////////////////////////
		for(String symptom:symptoms) {
			
			if(symptomsMap.get(symptom) == null) 
				symptomsMap.put(symptom,1);
			
			else 
				symptomsMap.put(symptom,symptomsMap.get(symptom)+1);
			}

	    ////////////////////////////////////
	    		
	   for(Map.Entry<String,Integer> symptom:symptomsMap.entrySet()) {
		   System.out.println(symptom.getKey()+": "+symptom.getValue());
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
