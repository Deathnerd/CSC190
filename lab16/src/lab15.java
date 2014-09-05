/**
 * class: CSC190 
 * project: lab15 
 * date: 12/06/2013 
 * author: Wes Gilleland 
 * purpose: This program will take an integer and find all primes between 1
 * and the integer by using the Sieve of Erasthones
 */

import java.util.Scanner;

class SieveOfErasthones {

	final int MAXSIZE = 100;
	boolean P[];
	int n;

	SieveOfErasthones() {
		P = new boolean[MAXSIZE];
		n = 0;
	}

	void setP(int nn) {
		if (nn > 99)
			nn = 99;
		n = nn;
		P[0] = false;
		P[1] = false;
		for (int i = 2; i <= n; i++)
			P[i] = true;
	}

	void sieve() {
		//loop through the array, starting at 2
		//if the value is true, then sift all multiples of i
		for (int i = 2; i <= n; i++)
			if (P[i])
				for (int j = i + i; j <= n; j += i)  //Ah ha! jump by i!
					if (j % i == 0)
						P[j] = false;
	}

	void printP() {
		for (int i = 2; i <= n; i++)
			if (P[i])
				System.out.print(i + " " );
		System.out.println();
	}
}

public class lab15 {

	public static void main(String[] args) {
		SieveOfErasthones myPrimes = new SieveOfErasthones();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number (1 or less to stop): " );
		int n = in.nextInt();

		while (n > 1) {
			myPrimes.setP(n);
			myPrimes.sieve();
			myPrimes.printP();

			System.out.print("Enter a number (1 or less to stop): " );
			n = in.nextInt();
		}
	}

}
