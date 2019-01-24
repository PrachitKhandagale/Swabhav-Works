package com.techlabs.filegenerate;

import java.io.FileWriter;
import java.util.Map;
import java.util.TreeMap;

public class GenerateCSVFile {
	String csvFile="StateCapital.csv";
	String csvSplit=", ";
	String csvNextLine=" \n";
	Map<String,String> stateMap=new TreeMap<String,String>();
	
	public void generateFile() {
		
		try {
			FileWriter fileWriter = new FileWriter(csvFile, true);
			for (Map.Entry<String, String> entry : stateMap.entrySet()) {
				fileWriter.append(String.valueOf(entry.getKey()));
				fileWriter.append(csvSplit);
				fileWriter.append(String.valueOf(entry.getValue()));
				fileWriter.append(csvNextLine);
				
			}
			fileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void addData(String state,String capital) {
		stateMap.put(state.trim(),capital.trim());
	}
}
