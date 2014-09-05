/*
 * class: CSC190
 * project: lab10
 * date: 10/25/13
 * author: Wes Gilleland
 * purpose: This program will take a number and find the pythagorean triples, quadruples,
 * and quintuples up to that number
 */


import java.util.Scanner;

class Pythagorean {
	void getTriples(int n) {
		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n; b++) {
				for (int c = 1; c <= n; c++) {
					if (((a * a) + (b * b) == (c * c)) && ((a <= b) && (b <= c)))
						System.out.println(a + ", " + b + ", " + c);
				}
			}
		}
	}

	void getQuadruples(int n) {
		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n; b++) {
				for (int c = 1; c <= n; c++) {
					for (int d = 1; d <= n; d++) {
						if (((a * a) + (b * b) + (c * c) == (d * d)) && ((a <= b) && (b <= c) && (c <= d)))
							System.out.println(a + ", " + b + ", " + c);
					}
				}
			}
		}
	}

	void getQuintuples(int n) {
		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n; b++) {
				for (int c = 1; c <= n; c++) {
					for (int d = 1; d <= n; d++) {
						for (int e = 1; e <= n; e++) {
							if (((a * a) + (b * b) + (c * c) + (d * d) == (e * e)) && ((a <= b) && (b <= c) && (c <= d) && (d <= e)))
								System.out.println(a + ", " + b + ", " + c + ", " + d + ", " + e);
						}
					}
				}
			}
		}
	}
}

public class lab10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Pythagorean myP = new Pythagorean();

		System.out.print("Enter n: " );
		int n = in.nextInt();

		System.out.println("\nTriples:\n" );
		myP.getTriples(n);

		System.out.println("\nQuadruples:\n" );
		myP.getQuadruples(n);

		System.out.println("\nQuintuples:\n" );
		myP.getQuintuples(n);
	}
}
