//See Runner Package for  overall description
// Information for Method used for decryption was sourced from Ref 09, Ref 10 and Ref 11
package ie.gmit.dip;

public class Decryption {

	public static void regenerateMatrix(String txt, int key, char[][] M) { // This method creates the matrix for decrypted text
		int step = (key - 1) * 2;
		int k = 0;

		for (int i = 0; i < key; i++) {
			for (int j = i; j < txt.length() && k < txt.length(); j += step) {
				int pos2 = j + (step - i * 2);
				M[i][j] = txt.charAt(k);
				k++;
				if (i != 0 && i != key - 1 && pos2 < txt.length()) {
					M[i][pos2] = txt.charAt(k);
					k++;
				}
			}
		}
	}

	public static String generateOriginalTxt(char[][] M, int x, int y) {
		String result = "";
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				if (M[j][i] != '\0') { // "\0" is the space between characters
					result = result + M[j][i];
				}
			}
		}
		return result;

	}

	public static void displayMatrix(char[][] M, int x, int y) { // This method displays the matrix of the Decrypted text
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (M[i][j] == '\0') {
					System.out.print("-");

				} else {
					System.out.print(M[i][j]);
				}
			}
			System.out.println();
		}

	}
}