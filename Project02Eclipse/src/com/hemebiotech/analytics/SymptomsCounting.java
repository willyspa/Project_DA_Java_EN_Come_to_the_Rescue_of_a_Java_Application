package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SymptomsCounting {
	
	protected SortedMap<String, Integer> symptomsMap;
	
	public SymptomsCounting(){
		
		symptomsMap = new TreeMap<String,Integer>();
		
	}
	
	public SortedMap<String, Integer> mapFromList(List<String> symptoms) {
				
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
	
	public SortedMap<String,Integer> getSymptomsMap(){	
		
		return this.symptomsMap;
	}
	
	public void displayCount() {
		
		   for(Map.Entry<String,Integer> symptom:this.symptomsMap.entrySet()) {
			   System.out.println(symptom.getKey()+": "+symptom.getValue());
		   }
	}
}
