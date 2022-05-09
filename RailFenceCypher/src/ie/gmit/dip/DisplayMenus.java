//See Runner Package for overall description
package ie.gmit.dip;

import java.util.*;

public class DisplayMenus {

	private static Scanner s;
	private boolean keepRunning = true; // Application will not terminate until boolean value is false

	public DisplayMenus() {
		s = new Scanner(System.in);
	}

	public void start() {

		while (keepRunning) { // Main menu will not terminate until keepRunning = false
			mainMenu();
			int choice = Integer.parseInt(s.next()); // Flow of control blocked at next and waits for input to evaluate
														// choice
			if (choice == 1) {
				directInputEncrypt();
			} else if (choice == 2) {
				directInputDecrypt();
			} else if (choice == 3) {
				fileInputEncrypt();
			} else if (choice == 4) {
				fileInputDecrypt();
			} else if (choice == 5) {
				System.out.println("[INFO] Shutting down...please wait...");
				keepRunning = false;
			} else {
				System.out.println("[ERROR] Invalid input please select an option [1-5].");
				// Main menu structure influenced by Student Manager App Ref 08
			}
		}
	}

	private void directInputEncrypt() {
		Runner.encryptDirectInput();
	}

	private void directInputDecrypt() {
		Runner.decryptDirectInput();
	}

	private void fileInputEncrypt() {
		Runner.encryptFromFile();
	}

	private void fileInputDecrypt() {
		Runner.decryptFromFile();
	}

	public static void mainMenu() {
		System.out.println("####################################################");
		System.out.println("#             Rail Fence Cypher 1.0                #");
		System.out.println("#                   Main Menu                      #");
		System.out.println("####################################################");
		System.out.println("1 - User Input Encryption");
		System.out.println("2 - User Input Decryption");
		System.out.println("3 - File Input Encryption");
		System.out.println("4 - File Input Decryption");
		System.out.println("5 - Exit Application");
		System.out.println("####################################################");
		System.out.println("\n");
		System.out.println("Select an option [1-5]");
	}

	public static int encryptionMenu() {
		int choice;
		s = new Scanner(System.in);
		System.out.println("####################################################");
		System.out.println("#                Encryption Menu                   #");
		System.out.println("####################################################");
		System.out.println("Please select one of the following options:");
		System.out.println("1 - Display results on the screen");
		System.out.println("2 - Save results to a file");
		System.out.println("3 - Display the encryption matrix");
		System.out.println("4 - Return to the main Menu");
		System.out.println("####################################################");

		do {
			System.out.println("\n");
			System.out.println("Please select an option [1-4]");
			choice = s.nextInt();
		} while (choice < 1 || choice > 4);

		return choice;
	}

	public static int decryptionMenu() {
		int choice;
		s = new Scanner(System.in);
		System.out.println("####################################################");
		System.out.println("#                   Decryption Menu                #");
		System.out.println("####################################################");
		System.out.println("Please select one of the following options:");
		System.out.println("1 - Display results on the screen");
		System.out.println("2 - Save results to a file");
		System.out.println("3 - Display the decryption matrix");
		System.out.println("4 - Return to the main Menu");
		System.out.println("####################################################");

		do {
			System.out.println("\n");
			System.out.println("Please select an option [1-4]");
			choice = s.nextInt();
		} while (choice < 1 || choice > 4);

		return choice;
	}

	public static int encryptionFileMenu() {
		int options;
		s = new Scanner(System.in);
		System.out.println("####################################################");
		System.out.println("#            File Encryption Menu                  #");
		System.out.println("####################################################");
		System.out.println("Please select one of the following options:");
		System.out.println("1 - Display results on the screen");
		System.out.println("2 - Save results to a file");
		System.out.println("3 - Return to the main Menu");
		System.out.println("####################################################");

		do {
			System.out.println("\n");
			System.out.println("Please select an option [1-3]");
			options = s.nextInt();
		} while (options < 1 || options > 3);

		return options;
	}

	public static int decryptionFileMenu() {
		int options;
		s = new Scanner(System.in);
		System.out.println("####################################################");
		System.out.println("#                File Decryption Menu              #");
		System.out.println("####################################################");
		System.out.println("Please select one of the following options:");
		System.out.println("1 - Display results on the screen");
		System.out.println("2 - Save results to a file");
		System.out.println("3 - Return to the main Menu");
		System.out.println("####################################################");

		do {
			System.out.println("\n");
			System.out.println("Please select an option [1-3]");
			options = s.nextInt();
		} while (options < 1 || options > 3);

		return options;

	}
}
