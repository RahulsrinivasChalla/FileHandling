package com.jfs.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		// Provide the FilePath which we need to read.
		File file = new File("C:\\Users\\x0135734\\OneDrive - Applied Materials\\Documents\\credentials update .txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			int temp;
			while ((temp = fis.read()) != -1) {
				System.out.print((char) temp);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			fis.close();
		}
	}
}
