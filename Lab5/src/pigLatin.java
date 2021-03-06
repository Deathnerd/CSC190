/**
 * class: CSC190
 * project: Lab 5
 * date: 09/20/2013
 * author: Wes Gilleland
 * purpose: This program will take a capital word and translate it into pig latin
 */

import java.util.Scanner;

public class pigLatin {
	//takes a word and converts the first character to uppercase
	public static String capitalize(String word) {
		String upCase;

		//get the first character and convert to uppercase
		upCase = word.substring(0, 1);
		upCase = upCase.toUpperCase();

		//return the capitalized word
		return upCase + word.substring(1, word.length());
	}

	//takes in a word, ensures it is lowercase, and translates it into pig latin
	public static String pigLatin(String word) {
		//find the first letter and put it into lowercase for easier processing later
		String letter = word.substring(0, 1).toLowerCase();

		//check if it begins with a vowel. If so, end it with "way"
		if (letter.equals("a" ) || letter.equals("e" ) || letter.equals("i" ) || letter.equals("o" ) || letter.equals("u" ))
			word = word + "way";

			//if it begins with a consonant, move the consonant to the end and add "ay" to it
		else {
			letter = letter + "ay"; //add "ay" to the end of the letter
			word = word.substring(1, word.length()); //take off the first letter of the word
			word = word + letter; //and add the first letter + "ay" to the end
		}

		//return the pig latin
		return word;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String word; //input

		System.out.print("Input the word: " );
		word = in.nextLine();

		//print and capitalize the new word
		System.out.println(capitalize(pigLatin(word)));


	}
}
