package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SymptomsCounting {
	
	private SortedMap<String,Integer> symptomsMap = new TreeMap<String,Integer>();
	
	public void getSymptomsList(List<String> symptoms) {
		
		for(String symptom:symptoms) {
			
			if(symptomsMap.get(symptom) == null) 
				this.symptomsMap.put(symptom,1);
			
			else 
				this.symptomsMap.put(symptom,symptomsMap.get(symptom)+1);
			}
			
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
