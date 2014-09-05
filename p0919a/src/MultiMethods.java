/**
 * class: CSC190
 * project: p0919a
 * date: 09/19/2013
 * author: Wes Gilleland
 * purpose: This program
 */

import java.util.Scanner;

public class MultiMethods {
	public static double getAvg(double m, double fi, double hw) {
		// more efficient this way: return m*0.2 + fi/2.0*0.4 + hw/0.8*0.4;
		double avg;
		avg = m * 0.2 + fi / 2.0 * 0.4 + hw / 0.8 * 0.4;
		return avg;
	}

	public static char getGrade(double avg) {
		char g;
		if (avg >= 90.0) //order of conditionals makes this work
			g = 'A';
		else if (avg >= 80.0)
			g = 'B';
		else if (avg >= 70.0)
			g = 'C';
		else if (avg >= 60.0)
			g = 'D';
		else
			g = 'F';

		return g;
	}

	public static char getGrade2(double avg) {
		switch ((int) avg / 10) {
			case 9:
			case 10:
				return 'A';
			case 8:
				return 'B';
			case 7:
				return 'C';
			case 6:
				return 'D';
			default:
				return 'F';
		}
	}

	public static String getResult(char g) {
		switch (g) //only int and char go here
		{
			case 'A':
			case 'B':
			case 'C':
				return "You have passed!";
			default:
				return "You have failed!";
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double mid, fi, hw; //input
		double avg; //input
		char g; //output

		System.out.println("Enter mid (0-100): " );
		mid = in.nextDouble();
		System.out.println("Enter fi (0-100): " );
		fi = in.nextDouble();
		System.out.println("Enter hw (0-100): " );
		hw = in.nextDouble();

		avg = getAvg(mid, fi, hw);

		g = getGrade(avg);

		System.out.println("Grade: " + g);
		System.out.println("More efficient! Grade: " + getGrade(getAvg(mid, fi, hw)));

	}
}
