package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;

public class SymptomsList implements ISymptomReader{
	
	private List<String> symptoms;
	
	public SymptomsList() {
		
		symptoms = new ArrayList<String>();
		
	}

	public List<String> getSymptoms(String line) {
		
		while (line != null && line !="") {

			symptoms.add(line);

		}
				
		return symptoms;
	}

}

