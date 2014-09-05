/**
 * class: CSC190
 * project: p0912c
 * date: 09/12/2013
 * author: Wes Gilleland
 * purpose: This program
 */

import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n1, n2, n3; //input
		int max; //output

		System.out.print("Enter n1: " );
		n1 = in.nextInt();
		System.out.print("Enter n2: " );
		n2 = in.nextInt();
		System.out.print("Enter n3: " );
		n3 = in.nextInt();

		//method 1
		max = n1;
		if (n2 > max)
			max = n2;
		if (n3 > max)
			max = n3;

		//method 2
		if (n1 > n2) //nested if
			if (n1 > n3)
				max = n1;
			else
				max = n3;
		else if (n2 > n3)
			max = n2;
		else
			max = n3;

		//method 3
		if (n1 > n2 && n1 > n3) //and statement
			max = n1;
		if (n2 > n1 && n2 > n3) //and statement
			max = n2;
		if (n3 > n1 && n3 > n2) //and statement
			max = n3;

		System.out.println("Max is: " + max);
	}
}
