/*
 * class: CSC190
 * project: p1031a
 * date: 10/31/13
 * author: Wes Gilleland
 * purpose: This program
 */


import java.util.Scanner;

public class Runner {
	//1+2+3+4...+n
	static int getSum(int n) {
		int total = 0;

//        for (int i = 1; i <= n; i++)
//            total += i;
//      
		int i = 1;
		while (i <= n) {
			total += i;
			i++;
		}
		return total;
	}

	//if n = 12345, return 15
	//reverse n for exercise
	static int getDigitSum(int n) {
		int total = 0;

		while (n > 0) {
			total += n % 10;
			n /= 10;
		}

		return total;
	}

	//given deposit, and rate, when will the balance reach $1million?
	static int beMillionaire(double deposit, double rate) {
		double balance = deposit;
		int years = 0;

		while (balance <= 1000000) {
			years++;
			balance += balance * rate / 100;
		}
		return years;
	}

	//largest 2's power less than n
	//if n = 100, return 64
	//if n = 64, return 32
	static int getPow(int n) {
		int x = 1;
		while (x < n) {
			x *= 2;
		}
		return x / 2;
	}

	//determine if n is a 2's power
	static boolean isPow(int n) {
		while (n > 1) {
			if (n % 2 != 0)
				return false;
			n /= 2;
		}
		return true;
	}

	//largest prime less than n
	//can be done using a for loop and calling isPrime()
	//using while loop
	static int getPrime(int n) {
		int p = n - 1;
//        while(p > 2)
//        {
//            if(isPrime(p))
//                return p;
//            p--;
//        }      
		while (!isPrime(p)) {
			p--;
		}
		return p;
	}

	//determine if n is a Fibonaccii number
	boolean isFibo(int n) {
		int f1 = 1, f2 = 1, f = 1;
		while (f < n) {
			f = f1 + f2;
			f1 = f2;
			f2 = f;
		}
		return f == n;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println(getSum(100));
		System.out.println(getDigitSum(12345));
		System.out.println(beMillionaire(10, 2.74));
		System.out.println(getPow(100));
		System.out.println(getPow(64));
		if (isPow(100))
			System.out.println("You bet, buddy-pal!" );
		else
			System.out.println("Sorry bout that, skipper!" );

		if (isPow(1024))
			System.out.println("You bet, buddy-pal!" );
		else
			System.out.println("Sorry bout that, skipper!" );
	}

}
