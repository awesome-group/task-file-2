package main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileProject2 {

	public static void main(String[] args) throws IOException {

		File countries2 = new File("D:\\countries2.txt");
		if (!countries2.exists()) {
			System.out.println("file creating...");
			countries2.createNewFile();
			System.out.println("file creating");
		}

		BufferedOutputStream bOS = new BufferedOutputStream(new FileOutputStream(countries2));
		System.out.println("Information is being written...");
		bOS.write(" Azerbaijan".getBytes());
		bOS.write("\n Turkish".getBytes());
		bOS.write("\n Russia".getBytes());
		bOS.write("\n Jermany".getBytes());
		bOS.write("\n Iran".getBytes());
		bOS.write("\n Georgia".getBytes());
		bOS.write("\n Europa".getBytes());
		bOS.write("\n U.S.A".getBytes());
		bOS.write("\n France".getBytes());
		bOS.write("\n Italy".getBytes());
		bOS.flush();
		System.out.println("Information was written");
		BufferedInputStream bIS = new BufferedInputStream(new FileInputStream(countries2));
		for (int i = 0; i <82; i++) {
			char ch = (char) bIS.read();
			System.out.print(ch);
		}

	}

}
