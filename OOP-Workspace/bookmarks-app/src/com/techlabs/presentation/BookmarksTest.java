package com.techlabs.presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.business.Bookmark;
import com.techlabs.service.BookmarkManager;

public class BookmarksTest {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		List<Bookmark> bList = new ArrayList<>();
		//List<Bookmark> bList=new LinkedList<>();
		
		String option;
		do {
			System.out.print("Enter Bookmark name : ");
			String name = scanner.nextLine();
			System.out.print("Enter url : ");
			String url = scanner.nextLine();
			Bookmark bookmark = new Bookmark(name, url);
			//BookmarkManager.fileChanged(bookmark);
			bList.add(bookmark);
			System.out.print("Add More Entries?(Y/N):");
			option = scanner.nextLine();
		} while (!option.equals("n") && !option.equals("N"));
		BookmarkManager.fileChanged(bList);
		exportToFile();

	}

	private static void exportToFile() throws IOException {
		System.out.print("Do you want to export file content ?(Y/N):");
		String c = scanner.nextLine();

		if (c.equals("y") || c.equals("Y")) {
			BookmarkManager.createBackup();
		}
		System.out.println("Thank You For using application.");
	}
}
