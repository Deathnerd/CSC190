/*
 * class: CSC190
 * project: hw9
 * date: 10/29/13
 * author: Wes Gilleland
 * purpose: This program will take two strings. It will find if the second string 
 * resides in the first and the position where it resides at
 */


import java.util.Scanner;

class MyStrings {
	//the string we're searching through
	String S = "";

	MyStrings(String Sn) {
		S = Sn;
	}

	//index out of range error when S = abcabccab and S1 = abbc. Should return -1
	//S1 is the substring we're looking for
	int find(String S1) {
		int count = 0;

		//loop through the string we're searching through
		for (int i = 0; i <= S.length(); i++) {
			//check for index out of range
			//this happens when the substring is not in the string and the loop
			//searches through more than the string is long
			if (S1.length() + i > S.length())
				return -1;

			//loop through the substring and find a match
			for (int j = 0; j <= S1.length() - 1; j++) {
				if (S.charAt(i + j) == S1.charAt(j)) {
					count++;
				}
			}
			//if all the characters are equal, then return the position of the substring
			if (count == S1.length())
				return i;
			//reset the count for the next go-round
			count = 0;
		}
		//fallback return if substring not found
		return -1;
	}
}

public class Runner {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String stringToSearch;
		String substring;

		System.out.print("Enter the string to search through: " );
		stringToSearch = in.next();

		System.out.print("Enter the substring to search for: " );
		substring = in.next();

		MyStrings string = new MyStrings(stringToSearch);

		int found = string.find(substring);

		if (found == -1)
			System.out.println("Substring not found. Returned: " + found);
		else
			System.out.println("The position of the substring is: " + found);
	}

}
