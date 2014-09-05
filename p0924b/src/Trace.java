/**
 * class: CSC190
 * project: p0924b
 * date: 09/24/2013
 * author: Wes Gilleland
 * purpose: This program
 */

public class Trace {
	public static void main(String[] args) {
		int x, y, z;
		//example 1
		x = 1;
		y = 0;
		z = 0;
		if (x == 0)
			y = 1;
		z = 1;

		System.out.println(z); //output 1

		//example 2
		x = 0;
		y = 0;
		z = 0;
		if (x == 1) {
			y = 1;
			z = 1;
		}

		System.out.println(z); //output 0

		//example 3
		x = 0;
		y = 0;
		z = 0;
		if (x == 1) //skips entire block because the conditionals are misleading
			if (y == 1)
				z = 1;
			else if (y == 1)
				z = 2;
			else
				z = 3;

		System.out.println(z); //output 0
	}
}
