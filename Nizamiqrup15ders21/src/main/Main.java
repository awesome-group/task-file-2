package main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/apple/Desktop/countries2.txt");
		checkingexist(file);
		BufferedOutputStream bOS = new BufferedOutputStream(new FileOutputStream(file));
		bOS = writing(bOS);
		System.out.println(" Countries:");
		BufferedInputStream bIS = new BufferedInputStream(new FileInputStream(file));
		consoled(bIS);
	}

	static File checkingexist(File file) throws IOException {
		if (!file.exists()) {
			file.createNewFile();
		}
		return file;
	}

	static BufferedOutputStream writing(BufferedOutputStream bOS) throws IOException {
		bOS.write(" Azerbaijan".getBytes());
		bOS.write("\n England".getBytes());
		bOS.write("\n Canada".getBytes());
		bOS.write("\n Russian".getBytes());
		bOS.write("\n America".getBytes());
		bOS.write("\n Turkey".getBytes());
		bOS.write("\n Nigeria".getBytes());
		bOS.write("\n Ukranie".getBytes());
		bOS.write("\n Kazakhistan".getBytes());
		bOS.write("\n France".getBytes());
		bOS.flush();
		return bOS;
	}

	static BufferedInputStream consoled(BufferedInputStream bIS) throws IOException {
		for (int i = 0; i < 83; i++) {
			char ch = (char) bIS.read();
			System.out.print(ch);
		}
		return bIS;
	}
}