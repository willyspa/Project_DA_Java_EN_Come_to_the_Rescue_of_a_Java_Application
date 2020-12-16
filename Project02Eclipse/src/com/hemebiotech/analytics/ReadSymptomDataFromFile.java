package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReadSymptomDataFromFile  {
	
	private String line="";
	
	public String read (String filepath) {
		
		if(filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				this.line = reader.readLine();								
				} catch (IOException e) {		
					e.printStackTrace();					
				}			
		}
		else {
			System.out.println("filpath est 'null'");
		}
		return this.line;				
			
	}

	
}
