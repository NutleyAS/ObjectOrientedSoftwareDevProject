//See Runner Package for overall description
package ie.gmit.dip;

import java.io.FileInputStream; //Ref 02
import java.io.IOException; //Ref 04
import java.io.FileOutputStream; 
import java.io.FileNotFoundException;

public class FileManagement {

	public static FileInputStream openFile(String fileName) { // This will opens a file if it exists. Returns null if it
																// cannot locate URL.

		FileInputStream result;

		try {
			result = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			return null;
		}

		return result;
	}

	public static void saveToFile(String fileName, String txt) { // This method saves the string txt into the file
																	// (filename)
		try {
			FileOutputStream file = new FileOutputStream(fileName);

			for (int i = 0; i < txt.length(); i++) {
				char c = txt.charAt(i);
				file.write(c);
			}
			file.close();

		} catch (IOException e) {
			System.out.println("Unable to save to file : " + fileName);
		}
	}
}

