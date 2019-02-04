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
import java.util.ArrayList;
import java.util.List;

import com.techlabs.business.Bookmark;

public class BookmarkManager {

	private static String filePath = "Data\\Bookmark.csv";
	private static String backupFilePath = "Data\\Bookmark-bkp.csv";

	private static void writeFile(Bookmark bookmark) {
		try {
			FileWriter fw = new FileWriter(filePath, true);
			// fw.write(" <a href=\"" + bookmark.getUrl() + "\">" + bookmark.getName() +
			// "</a><br>\n");
			fw.write(bookmark.getName() + "," + bookmark.getUrl());
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void createBackup() throws IOException {
		// System.out.println("Inside Create backup");
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

	public static void fileChanged(List<Bookmark> bList) {
		writeFile(bList);
		System.out.println("File Changed Successfully.");
	}

	public static void writeFile(List<Bookmark> bList) {
		try {
			FileWriter fw = new FileWriter(filePath, true);
			for (Bookmark bookmark : bList)
				// fw.write(" <a href=\"" + bookmark.getUrl() + "\">" + bookmark.getName() +
				// "</a><br>\n");
				fw.write(bookmark.getName() + "," + bookmark.getUrl());
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void addSingleEntryToFile(Bookmark bookmark) {
		try {
			FileOutputStream fos = new FileOutputStream(filePath, true);
			PrintStream ps = new PrintStream(fos);
			// fw.write(" <a href=\"" + bookmark.getUrl() + "\">" + bookmark.getName() +
			// "</a><br>\n");
			ps.println(bookmark.getName() + "," + bookmark.getUrl());
			ps.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static List<String> readFile() {
		List<String> listString = new ArrayList<String>();
		try {

			InputStream is = new FileInputStream(filePath);
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			String str;
			while ((str = br.readLine()) != null) {
				listString.add(str);
			}
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listString;
	}
}
