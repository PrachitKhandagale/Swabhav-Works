package com.techlabs.compositepattern.test;

import com.techlabs.compositepattern.File;
import com.techlabs.compositepattern.Folder;

public class TestDiskItems {
	public static StringBuffer compositeBuilder = new StringBuffer();

	public static void main(String[] args) {
		Folder movie = new Folder("Movie");
		File abc = new File("ABC", ".avi", 700);

		movie.addItem(abc);

		Folder hindiMovie = new Folder("Hindi Movies");
		File xyz = new File("XYZ", ".avi", 650);

		hindiMovie.addItem(xyz);

		Folder comedy = new Folder("Comedy");
		File pqr = new File("PQR", ".mp4", 1000);

		Folder english = new Folder("English");
		File lmn = new File("LMN", ".mp3", 20);
		english.addItem(lmn);

		comedy.addItem(pqr);
		comedy.addItem(english);

		movie.addItem(hindiMovie);
		movie.addItem(comedy);
		// movie.addItem(english);

		movie.display();
	}

}
