/**
 * class: CSC190
 * project: hw3
 * date: 9/12/2013
 * author: Wes Gilleland
 * purpose: This program will take in a string and print all the permutations of 
 * words in that string
 */

import java.util.Scanner;

public class Permutations {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String sentence; //input
		String word1, word2, word3, word4; //output

		System.out.print("Please enter a sentence: " );
		sentence = in.nextLine();

		word1 = sentence.substring(0, sentence.indexOf(' ')); //grab the first word
		sentence = sentence.substring(word1.length() + 1); //remove the first word from the sentence

		word2 = sentence.substring(0, sentence.indexOf(' ')); //grab the second word
		sentence = sentence.substring(word2.length() + 1); //remove the second word from the sentence

		word3 = sentence.substring(0, sentence.indexOf(' ')); //grab third word

		//Remove the third word from the sentence and set it as the fourth
		//(and final) word
		word4 = sentence.substring(word3.length() + 1);

		//Permutations

		//set 1
		System.out.println(word1 + " " + word2 + " " + word3 + " " + word4);
		System.out.println(word1 + " " + word2 + " " + word4 + " " + word3);
		System.out.println(word1 + " " + word3 + " " + word2 + " " + word4);
		System.out.println(word1 + " " + word3 + " " + word4 + " " + word2);
		System.out.println(word1 + " " + word4 + " " + word2 + " " + word3);
		System.out.println(word1 + " " + word4 + " " + word3 + " " + word2);

		//set 2
		System.out.println(word2 + " " + word1 + " " + word3 + " " + word4);
		System.out.println(word2 + " " + word1 + " " + word4 + " " + word3);
		System.out.println(word2 + " " + word3 + " " + word1 + " " + word4);
		System.out.println(word2 + " " + word3 + " " + word4 + " " + word1);
		System.out.println(word2 + " " + word4 + " " + word1 + " " + word3);
		System.out.println(word2 + " " + word4 + " " + word3 + " " + word1);

		//set3
		System.out.println(word3 + " " + word1 + " " + word2 + " " + word4);
		System.out.println(word3 + " " + word1 + " " + word4 + " " + word2);
		System.out.println(word3 + " " + word2 + " " + word1 + " " + word4);
		System.out.println(word3 + " " + word2 + " " + word4 + " " + word1);
		System.out.println(word3 + " " + word4 + " " + word1 + " " + word2);
		System.out.println(word3 + " " + word4 + " " + word2 + " " + word1);

		//set 4
		System.out.println(word4 + " " + word1 + " " + word2 + " " + word3);
		System.out.println(word4 + " " + word1 + " " + word3 + " " + word2);
		System.out.println(word4 + " " + word2 + " " + word1 + " " + word3);
		System.out.println(word4 + " " + word2 + " " + word3 + " " + word1);
		System.out.println(word4 + " " + word3 + " " + word1 + " " + word2);
		System.out.println(word4 + " " + word3 + " " + word2 + " " + word1);


	}
}
