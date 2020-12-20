package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SymptomsClassification extends SymptomsCounting{
	
	private ReadSymptomDataFromFile readSymptoms;
	private List<String> symptoms;
	
	public SymptomsClassification() {
		
		readSymptoms = new ReadSymptomDataFromFile();
		symptoms = new ArrayList<String>();
		
	}
			
	public void sortAndCount(String p) throws IOException {
		
		this.symptoms = readSymptoms.readAndList(p);
		this.mapFromList(this.symptoms);
		
	}
	
	public void displaySymptoms() {
		this.displayCount();
	}
	
	
	
}
