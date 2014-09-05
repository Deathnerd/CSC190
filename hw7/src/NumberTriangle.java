/*
 * class: CSC190
 * project: lab8
 * date: 10/11/2013
 * author: Wes Gilleland
 * purpose: This program will take a numerical input from 1 to 13
 * and print a number triangle with x amount of lines, where x is the number that
 * was input by the user
 */

import java.util.Scanner;

public class NumberTriangle {
	public static void triangle1(int n) {
		//check the input and return an error message if erronous input
		if (n < 1) {
			System.out.println("Please enter a value greater than or equal to 1." );
			return;
		}

		int val = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%3d", val);
				val++;
			}
			System.out.println();
		}
	}

	public static void triangle2(int n) {
		//check the input and return an error message if erronous input
		if (n < 1) {
			System.out.println("Please enter a value greater than or equal to 1." );
			return;
		}

		int val2, val1 = 1, m;

		for (int i = 1; i <= n; i++) {
			System.out.printf("%3d", val1);
			val2 = val1;
			m = 1;
			for (int j = 1; j < i; j++) {
				val2 = val2 + (n - m);
				System.out.printf("%3d", val2);
				m++;
			}
			System.out.println();
			val1++;
		}
	}

	public static void triangle3(int n) {
		//check the input and return an error message if erronous input
		if (n < 1) {
			System.out.println("Please enter a value greater than or equal to 1." );
			return;
		}

		int val1 = n;
		for (int i = 1; i <= n; i++) {
			for (int k = n - i; k > 0; k--)
				System.out.print("   " );

			System.out.printf("%3d", val1);

			int val2 = val1;
			int m = 0;

			for (int j = 1; j < i; j++) {
				val2 = val2 + (n - m);
				System.out.printf("%3d", val2);
				m++;
			}
			System.out.println();
			val1--;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input;

		System.out.println("Input the size of the triangle you want: " );
		input = in.nextInt();

//        triangle1(input);
//        System.out.println();
//        triangle2(input);
//        System.out.println();
		triangle3(input);
		System.out.println();

	}
}
