package com.techlabs.presentation;

import java.io.IOException;
import java.util.Scanner;

import com.techlabs.business.Bookmark;
import com.techlabs.service.BookmarkManager;

public class BookmarksTest {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		System.out.print("Enter name : ");
		String name = sc.nextLine();
		System.out.print("Enter url : ");
		String url = sc.nextLine();
		Bookmark bookmark = new Bookmark(name, url);
		BookmarkManager.fileChanged(bookmark);
		exportToFile();
	}

	private static void exportToFile() throws IOException {
		System.out.print("Do you want to export file content ?(Y/N):");
		String c = sc.nextLine();

		if (c.equals("y") || c.equals("Y")) {
			BookmarkManager.createBackup();
		}
	}
}
