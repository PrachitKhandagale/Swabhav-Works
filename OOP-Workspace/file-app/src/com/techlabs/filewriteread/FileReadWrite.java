package com.techlabs.filewriteread;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite {
	public static void writeFile() {
		try {
			FileWriter fw = new FileWriter("ReaderWriter.txt", true);
			fw.write("Hello Java ");
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void readFile() {
		try {
			FileReader fis = new FileReader("ReaderWriter.txt");
			int i = 0;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
