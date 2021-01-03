package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 * 
 */
public interface ISymptomReader {
	public List<String> symptoms = new ArrayList<String>();
	/**
	 * If no data is available, return an empty List
	 * 
	 * @return a raw listing of all Symptoms, duplicates are possible/probable
	 */
	public List<String> getSymptoms ();
}
