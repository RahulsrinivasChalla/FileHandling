package com.jfs.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) throws IOException {
		CreateFile cf = new CreateFile();
		cf.writeInFile();
		System.out.println("Image created in the below location");
	}

	public void writeInFile() throws IOException {
		// Provide the FilePath which we need to read.
		File file = new File(
				"C:\\Users\\x0135734\\OneDrive - Applied Materials\\Desktop\\Image creation\\FileCreating.png");
		/// Provide the FilePath & Name where we need to Write the file.
		File file2 = new File("C:\\Users\\x0135734\\OneDrive - Applied Materials\\Desktop\\Image creation\\JAVA.png");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(file2);
			int temp;
			while ((temp = fis.read()) != -1) {
				fos.write(temp);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			fis.close();
			fos.close();
		}
	}
}
