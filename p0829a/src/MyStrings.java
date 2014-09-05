/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * class: CSC190
 * project: p0829a
 * date: 08/29/2013
 * author: Wes Gilleland
 * purpose: This program
 */

import java.util.Scanner;

public class MyStrings {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String name;
		String fname, lname;
		int p;

		name = "abcdefghd";

		System.out.println(name.length()); //print out the length of the name
		System.out.println(name.charAt(0)); //print out the first character
		System.out.println(name.charAt(1)); //print out the second character
		System.out.println(name.charAt(name.length() - 1)); //last character
		System.out.println(name.substring(1, 3)); //bc
		System.out.println(name.substring(3, 3)); //nothing!

		System.out.println(name.indexOf("d" )); //3
		System.out.println(name.indexOf("cde" )); //2
		System.out.println(name.indexOf("fe" )); //-1, not found
		System.out.println(name.indexOf("d", 4)); //8

		System.out.print("Enter your name (First Last): " );
		//name = in.next(); //read only the first word
		name = in.nextLine(); //read entire line

		p = name.indexOf(" " ); //find the position of the space
		fname = name.substring(0, p); //grab the first word
		lname = name.substring(p + 1); //grab the second word
		System.out.println(lname + ", " + fname);
	}
}
