/**
 * class: CSC190
 * project: hw5
 * date: 09/24/2013
 * author: Wes Gilleland
 * purpose: This program will take a string up to 8 characters in length and 
 * determine if it is a palindrome
 */

import java.util.Scanner;

public class hw5 {
	public static String palindrome_check(String input) {
		input = input.toLowerCase();

        /* 
         * The following if will check, in order starting at 2, the length of the 
         * string and then do the appropriate comparisons of each letter
         */
		if ((input.length() == 1) ||
				(input.length() == 2) && (input.charAt(0) == input.charAt(1)) ||
				(input.length() == 3) && (input.charAt(0) == input.charAt(2)) ||
				(input.length() == 4) && (input.charAt(0) == input.charAt(3)) && (input.charAt(1) == input.charAt(2)) ||
				(input.length() == 5) && (input.charAt(0) == input.charAt(4)) && (input.charAt(1) == input.charAt(3)) ||
				(input.length() == 6) && (input.charAt(0) == input.charAt(5)) && (input.charAt(1) == input.charAt(4)) && (input.charAt(2) == input.charAt(3)) ||
				(input.length() == 7) && (input.charAt(0) == input.charAt(6)) && (input.charAt(1) == input.charAt(5)) && (input.charAt(2) == input.charAt(4)) ||
				(input.length() == 8) && (input.charAt(0) == input.charAt(7)) && (input.charAt(1) == input.charAt(6)) && (input.charAt(2) == input.charAt(5)) && (input.charAt(3) == input.charAt(4)))
			return "The string is a palindrome";

		return "The string not palindrome";
	}

	public static Boolean isPalindrome(String input) {
		return isPalindrome(input, 0, input.length() - 1);
	}

	public static Boolean isPalindrome(String input, int first_character_position, int last_character_position) {
		if (first_character_position > last_character_position || first_character_position == last_character_position)
			return true;
		if (input.charAt(first_character_position) == input.charAt(last_character_position)) {
			return isPalindrome(input, first_character_position + 1, last_character_position - 1);
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input; //input string

		System.out.print("Type in a string: " );
		// read the string, make it lowercase, strip the whitespace, and strip the punctuation
		input = in.nextLine().toLowerCase().replaceAll("\\s+", "" ).replaceAll("[^a-zA-Z ]", "" );

		if (isPalindrome(input)) {
			System.out.println("It's a palindrome!" );
		} else {
			System.out.println("It's not a palindrome!" );
		}
	}
}
