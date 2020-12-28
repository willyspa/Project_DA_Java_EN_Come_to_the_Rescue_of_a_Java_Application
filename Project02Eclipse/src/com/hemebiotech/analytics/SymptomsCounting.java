package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeMap;

public class SymptomsCounting {
	
	protected TreeMap<String, Integer> symptomsMap;
	
	public SymptomsCounting(){
		
		symptomsMap = new TreeMap<String,Integer>();
		
	}
	/**
	 * 
	 * @return return a sorted list of symptoms with count from a list
	 */
	public TreeMap<String, Integer> mapFromList(List<String> symptoms) {
				
		if(symptoms.size() == 1 && symptoms.get(0).length() == 0) {
			
			System.out.println("La list est vide");
			return this.symptomsMap;			
		}
		
		for(String symptom:symptoms) {
			
			
			if(symptomsMap.get(symptom) == null) { 
				
				this.symptomsMap.put(symptom,1);
			}
			else 
				
				this.symptomsMap.put(symptom,symptomsMap.get(symptom)+1);
			}
		return this.symptomsMap;
			
	}
	
	public TreeMap<String,Integer> getSymptomsMap(){	
		
		return this.symptomsMap;
	}
	
	/**
	 * 
	 * @return Display the Symptoms with their count from a map
	 */
	public void displayCount() {
		
		   for(Map.Entry<String,Integer> symptom:this.symptomsMap.entrySet()) {
			   System.out.println(symptom.getKey()+": "+symptom.getValue());
		   }
	}
}
