package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;

public class SymptomsList implements ISymptomReader{
	
	private List<String> symptoms = new ArrayList<String>();

	public List<String> getSymptoms(String line) {
		
		while (line != null) {

			symptoms.add(line);

		}
				
		return symptoms;
	}

}

