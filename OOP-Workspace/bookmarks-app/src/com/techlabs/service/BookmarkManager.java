package com.techlabs.service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

import com.techlabs.business.Bookmark;

public class BookmarkManager {

	private static String filePath = "Data\\Bookmark.html";
	private static String backupFilePath = "Data\\Bookmark-bkp.html";

	private static void writeFile(Bookmark bookmark) {
		try {
			FileWriter fw = new FileWriter(filePath, true);
			fw.write(" <a href=\"" + bookmark.getUrl() + "\">" + bookmark.getName() + "</a><br>\n");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void createBackup() throws IOException {
		//System.out.println("Inside Create backup");
		InputStream is = new FileInputStream(filePath);
		BufferedReader br = new BufferedReader(new InputStreamReader(is));

		OutputStream os = new FileOutputStream(backupFilePath);
		PrintStream ps = new PrintStream(os);

		String str;
		while ((str = br.readLine()) != null) {
			ps.println(str);
		}
		ps.close();
		br.close();
	}

	public static void fileChanged(Bookmark bookmark) {
		writeFile(bookmark);
		System.out.println("File Changed Successfully.");
	}
}
