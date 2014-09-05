/**
 * class: CSC190
 * project: p0829b
 * date: 08/29/2013
 * author: Wes Gilleland
 * purpose: This program
 */

import java.util.Scanner;

public class Fraction {

	public static void main(String[] args) {

		int num, den;
		int whole;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter num: " );
		num = in.nextInt();
		System.out.println("Enter den: " );
		den = in.nextInt();

		whole = num / den; //give the whole number
		num = num % den; //give the remainder

		System.out.println("Whole Number is: " + whole + " " + num + "/" + den);
	}
}
