package com.techlabs.file.test;

import java.util.Map;
import java.util.TreeMap;

import com.techlabs.filegenerate.GenerateCSVFile;

public class TestGenerateCSV {

	public static void main(String[] args) throws Exception{
		//Map<String,String> addMap=new TreeMap<String,String>();
		GenerateCSVFile csvFile=new GenerateCSVFile();
		csvFile.addData("Maharashtra", "Mumbai");
		csvFile.addData("Maharashtra", " Mumbai");
		csvFile.addData("Goa", "Panji");
		csvFile.generateFile();
	}

}
