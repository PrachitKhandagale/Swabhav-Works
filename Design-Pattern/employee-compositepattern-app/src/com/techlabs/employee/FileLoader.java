package com.techlabs.employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileLoader {
	private String fileName;

	public FileLoader(String newFilename) {
		this.fileName = newFilename;
	}

	private ArrayList<String> list = new ArrayList<String>();

	public ArrayList<String> loadFile() throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(
				fileName));
		String line;
		while ((line = br.readLine()) != null) {
			list.add(line);
		}
		br.close();
		return list;
	}

	public String getFileName() {
		return fileName;
	}

	public ArrayList<String> getList() {
		return list;
	}

}
