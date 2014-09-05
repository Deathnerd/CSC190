/**
 * class: CSC190
 * project: lab3
 * date: 09/06/2013
 * author: Wes Gilleland
 * purpose: This program will take a 5-digit integer and increment all digits by
 * one, with 9 being replaced by 0
 */

import java.util.Scanner;

public class lab3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n; //input digit
		int r; //output digit

		System.out.print("Enter a 5 digit number: " );
		n = in.nextInt();

		r = ((n / 10000) + 1) % 10;//catch and increment the first number

		n = n % 10000;
		r = r * 10 + ((n / 1000) + 1) % 10; //catch and increment the second number

		n = n % 1000;
		r = r * 10 + ((n / 100) + 1) % 10; //catch and increment the third number

		n = n % 100;
		r = r * 10 + ((n / 10) + 1) % 10;//catch and increment the fourth number

		n = n % 10;
		r = r * 10 + ((n / 1) + 1) % 10;//catch and increment the fifth number

		System.out.println("Result: " + r);
	}
}
