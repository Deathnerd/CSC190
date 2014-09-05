/**
 * class: CSC190
 * project: hw8
 * date: 10/20/13
 * author: Wes Gilleland
 * purpose: This program will remove duplicate characters from a string and also
 * determine the most repeated character in the string
 */

import java.util.Scanner;

class StringMethods {
	String s;

	//constructor
	StringMethods(String input) {
		s = input;
	}

	//run to set the class global variable "s"
	void setMyStrings(String input) {
		s = input;
	}

	//remove and return duplicates
	String removeDup() {
		String holder = ""; //set holding string
		for (int i = 0; i < s.length(); i++) { //loop through entire string
			if (!holder.contains(s.substring(i, i + 1))) { //if the current character is not in the holder
				holder += s.substring(i, i + 1); //then add it to the holder
			}
		}
		return holder;
	}

	//get the mode (the most repeated character) of the string
	String getMode() {
		int currentCount = 0;
		int highestCount = 0;
		String currentChar = "";
		String mode = "";

		//loop through the entire string
		for (int i = 0; i < s.length(); i++) {
			currentChar = s.substring(i, i + 1); //set the current character
			//loop through the string, starting at the current character
			for (int j = i; j < s.length(); j++) {
				//if the current character and the character being compared are equal
				if (currentChar.equals(s.substring(j, j + 1))) {
					currentCount++; //then increase the count
				}
			}
			//determine if the current character is repeated more than previous characters
			if (currentCount > highestCount) {
				highestCount = currentCount;
				mode = currentChar;
			}
			currentCount = 0; //reset the counter for the current character
		}
		return mode;
	}
}

public class Runner {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input;

		System.out.print("Enter a string: " );
		input = in.nextLine();

		StringMethods stringMethods = new StringMethods(input);

		//print out the string with duplicates removed
		System.out.println(input + ", stripped of duplicate characters is " + stringMethods.removeDup());

		//print out the mode of the string
		System.out.println("The mode of " + input + " is \"" + stringMethods.getMode() + "\"" );

	}
}
