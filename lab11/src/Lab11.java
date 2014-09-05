/*
 * class: CSC190
 * project: lab11
 * date: 11/01/13
 * author: Wes Gilleland
 * purpose: This program will take a string, encode it with a numerical key, 
 * and decode it with the same key
 */


import java.util.Scanner;

class MyCipher {
	//We'll be manipulating ASCII values, so you'll need a table
	//constants
	final int MAX = 122;
	final int SPACE = 32;
	final int SPACE_MODIFIED = 96;
	final int RANGE = 27; //all characters including the space
	//globals
	String plainText, cipherText;
	int key;

	MyCipher() {
		plainText = "";
		cipherText = "";
		key = 0;
	}

	void setKey(int k) {
		key = k;
	}

	void setPlainText(String p) {
		plainText = p;
	}

	String encode() {
		//if the key is greater than the range, then get the remainder
		if (key > RANGE)
			key %= RANGE;

		for (int i = 0; i < plainText.length(); i++) {
			int character = plainText.charAt(i);

			//if the regular character is a space, then put it in the lower bound
			//and encode it
			if (character == SPACE)
				cipherText += (char) (SPACE_MODIFIED + key);

				//if the encoded character is out of the upper range
			else if (key + character > MAX) {
				//if the encoded character turns out to be a space,
				//then turn it into one
				if ((SPACE_MODIFIED - 1) + ((key + character) % MAX) == SPACE_MODIFIED)
					cipherText += (char) SPACE;
					//loop around to the bottom of the range and encode the character
				else
					cipherText += (char) ((SPACE_MODIFIED - 1) + ((key + character) % MAX));
			}
			//fallback; encode the character
			else
				cipherText += (char) (character + key);
		}
		return cipherText;
	}

	void encode2() {
		cipherText = "";
		int index;
		for (int i = 0; i < plainText.length(); i++) {
			//this block converts everything from space to z to range 0 to 26
			if (plainText.charAt(i) == ' ')
				index = 0;
			else
				index = plainText.charAt(i) - 'a' + 1;
			index = (index + key) % 27;

			//this encodes the string
			if (index == 0)
				cipherText += ' ';
			else
				cipherText += (char) (index + 'a' - 1);
		}
	}

	String decode() {
		plainText = "";

		for (int i = 0; i < cipherText.length(); i++) {
			int character = cipherText.charAt(i); //store the current character

			//check to see if the decoded character is supposed to be a case
			if (character - key == SPACE_MODIFIED)
				plainText += (char) SPACE;
				//check if the decoded character is out of the lower range
			else if ((character - key) < SPACE_MODIFIED) {
				//loop back to the top and find our decoded character
				plainText += (char) ((MAX + 1) - (SPACE_MODIFIED - (character - key)));
			}
			//fallback; just decode it
			else
				plainText += (char) (character - key);
		}
		return plainText;
	}

	String decode2() {
		plainText = "";
		int index;
		for (int i = 0; i < cipherText.length(); i++) {
			//this block converts everything from space to z to range 0 to 26
			if (cipherText.charAt(i) == ' ')
				index = 0;
			else
				index = cipherText.charAt(i) - 'a' + 1;
			index = (index + (27 - key)) % 27;

			//this decodes the string
			if (index == 0)
				plainText += ' ';
			else
				plainText += (char) (index + 'a' - 1);
		}
		return plainText;
	}

	String getPlainText() {
		return plainText;
	}

	String getCipher() {
		return cipherText;
	}
}

public class Lab11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		MyCipher cipher = new MyCipher();

		System.out.print("Enter a plain text: " );
		String text = in.nextLine();
		cipher.setPlainText(text);
		System.out.println("Enter a key as a positive integer: " );
		int key = in.nextInt();
		cipher.setKey(key);
		cipher.encode();
		System.out.println("The encoded text is: " + cipher.getCipher());
		cipher.decode();
		System.out.println("The decoded text is: " + cipher.getPlainText());

		System.out.println(1 + "!" );
	}
}
