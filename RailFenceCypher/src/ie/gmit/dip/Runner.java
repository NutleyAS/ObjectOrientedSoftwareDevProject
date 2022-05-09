/* GMIT HDip Software Development
 * Object Oriented Software Development
 * Main Assignment
 * Student No: G00388055
 * All references are given in full in "README.txt"
 */

package ie.gmit.dip;

import java.io.BufferedReader; //Ref 01
import java.io.FileInputStream; //Ref 02
import java.io.FileReader; //Ref 03
import java.io.IOException; //Ref 04

import java.util.Scanner;

public class Runner {
	private static Scanner s;
	private static BufferedReader br;

	public static void main(String[] args) {
		DisplayMenus m = new DisplayMenus();
		m.start();

	}

	public static void encryptDirectInput() {
		s = new Scanner(System.in);

		System.out.println("Please input text that you want to Encrypt: ");
		String str = s.nextLine();

		System.out.println("Please enter the Rail Fence Key: ");
		int key = s.nextInt();
		System.out.println("Encrypting Please Wait.....");

		String txt = str.toUpperCase(); // This converts all the characters of the string to upper case.
										// This makes it more difficult for someone to figure out the Rail Key.
		char[][] M = new char[key][txt.length()];

		Encryption.createMatrix(txt, key, M);
		String encypredTxt = Encryption.generateEncryptedTxt(M, key, txt.length());

		int choice = DisplayMenus.encryptionMenu();

		do {

			switch (choice) {
			case 1: // Displays the encrypted text
				System.out.println(encypredTxt);
				pressEnter();
				choice = DisplayMenus.encryptionMenu();
				break;
			case 2: // Saves the result to a file
				saveToFile(encypredTxt);
				pressEnter();
				choice = DisplayMenus.encryptionMenu();
				break;
			case 3: // Display the Matrix for the encryption
				Encryption.displayMatrix(M, key, txt.length());
				pressEnter();
				choice = DisplayMenus.encryptionMenu();
				break;
			case 4: // Returns to main menu
				DisplayMenus.mainMenu();
				break;
			}
		} while (choice != 4);
		System.out.println("Returning to Main Menu.....");
	}

	public static void decryptDirectInput() {
		s = new Scanner(System.in);

		System.out.println("Please input text that you want to Decrypt: ");
		String str = s.nextLine();

		System.out.println("Please enter the Rail Fence Key:");
		int key = s.nextInt();
		System.out.println("Decrypting Please Wait.....");

		String txt = str.toUpperCase(); // This converts all the characters of the string to upper case.
										// This makes it more difficult for someone to figure out the Rail Key.
		char[][] M = new char[key][txt.length()];

		Decryption.regenerateMatrix(txt, key, M);
		String decypredTxt = Decryption.generateOriginalTxt(M, key, txt.length());

		int choice = DisplayMenus.decryptionMenu();

		do {

			switch (choice) {
			case 1: // Displays the decrypted text
				System.out.println(decypredTxt);
				pressEnter();
				choice = DisplayMenus.decryptionMenu();
				break;
			case 2: // Saves the result to a file
				saveToFile(decypredTxt);
				pressEnter();
				choice = DisplayMenus.decryptionMenu();
				break;
			case 3: // Displays the Matrix for the decryption
				Decryption.displayMatrix(M, key, txt.length());
				pressEnter();
				choice = DisplayMenus.decryptionMenu();
				break;
			case 4: // Returns to main menu
				DisplayMenus.mainMenu();
				break;
			}
		} while (choice != 4);
		System.out.println("Returning to Main Menu.....");
		{

		}
	}

	public static void encryptFromFile() {
		s = new Scanner(System.in);
		String fn = null;
		String fullText = "";
		FileInputStream fis;

		do {
			System.out.println("Please input the file name that is to be Encrypted: ");
			fn = s.next();
			fis = FileManagement.openFile(fn);
		} while (fis == null);

		System.out.println("Please enter the Rail Fence Key:");
		int key = s.nextInt();
		System.out.println("Encrypting Please Wait.....");

		try {
			br = new BufferedReader(new FileReader(fn));
			String line = br.readLine();
			while (line != null) {
				String txt = line.toUpperCase(); // This converts all the characters of the string to upper case.
													// This makes it more difficult for someone to figure out the Rail
													// Key.
				char[][] M = new char[key][txt.length()];
				Encryption.createMatrix(txt, key, M);
				String encypredTxt = Encryption.generateEncryptedTxt(M, key, txt.length());
				if (fullText.length() == 0) {
					fullText = encypredTxt;
				} else {
					fullText = fullText + "\n" + encypredTxt;
				}
				line = br.readLine();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		int choice = DisplayMenus.encryptionFileMenu();

		do {

			switch (choice) {
			case 1: // Display result to screen
				System.out.println(fullText);
				pressEnter();
				choice = DisplayMenus.encryptionFileMenu();
				break;
			case 2: // Save to file
				saveToFile(fullText);
				pressEnter();
				choice = DisplayMenus.encryptionFileMenu();
				break;
			case 3: // Return to main menu
				DisplayMenus.mainMenu();
				break;
			}
		} while (choice != 3);
		System.out.println("Returning to Main Menu.....");

	}

	public static void decryptFromFile() {
		s = new Scanner(System.in);
		String fn = null;
		String fullText = "";
		FileInputStream test;
		do {
			System.out.println("Please input the file name that is to be Decrypted: ");
			fn = s.next();
			test = FileManagement.openFile(fn);
		} while (test == null);

		System.out.println("Please enter the Rail Fence Key:");
		int key = s.nextInt();
		System.out.println("Decrypting Please Wait.....");

		try {
			br = new BufferedReader(new FileReader(fn));
			String line;
			while ((line = br.readLine()) != null) {
				String txt = line.toUpperCase(); // This converts all the characters of the string to upper case.
													// This makes it more difficult for someone to figure out the Rail
													// Key.
				char[][] M = new char[key][txt.length()];
				Decryption.regenerateMatrix(txt, key, M);
				String decypredTxt = Decryption.generateOriginalTxt(M, key, txt.length());
				if (fullText.length() == 0) {
					fullText = decypredTxt;
				} else {
					fullText = fullText + "\n" + decypredTxt;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		int choice = DisplayMenus.decryptionFileMenu();

		do {

			switch (choice) {
			case 1: // Display result to screen
				System.out.println(fullText);
				pressEnter();
				choice = DisplayMenus.decryptionFileMenu();
				break;
			case 2: // Save result to file
				saveToFile(fullText);
				pressEnter();
				choice = DisplayMenus.decryptionFileMenu();
				break;
			case 3: // Return to main menu
				DisplayMenus.mainMenu();
				break;
			}
		} while (choice != 3);
		System.out.println("Returning to Main Menu.....");

	}

	public static void saveToFile(String txt) {
		s = new Scanner(System.in);
		String fn;
		System.out.println("Please enter a file name: ");
		fn = s.next();
		System.out.println("Saving.....");
		FileManagement.saveToFile(fn, txt);

	}

	public static void pressEnter() {
		System.out.println("\nPress Enter to continue...");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
			// This method waits until the user presses enter on the keyboard. Doesn't
			// account for text inputed into the console Solution was found using Ref 06

		}
	}
}
