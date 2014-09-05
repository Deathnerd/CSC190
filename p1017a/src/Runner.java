/*
 * class: CSC190
 * project: p1017a
 * date: 10/17/2013
 * author: Wes Gilleland
 * purpose: This program...
 */

import java.util.Scanner;

public class Runner {
	//find the nth Fibonacci number
	static long getFibo(int n) {
		long f1 = 1, f2 = 1, f3 = 1;

		for (int i = 1; i <= n - 2; i++) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
		}
		return f3;
	}

	//determine if string s is a palindrome
	static boolean isPalin(String s) {
		int n = s.length();

		for (int i = 0; i < n / 2; i++) {
			if (s.charAt(i) != s.charAt(n - 1 - i))
				return false;
		}
		return true;
	}

	//determine if a number is a prime
	static boolean isPrime(int n) {
		for (int p = 2; p <= (int) Math.sqrt(n); p++) {
			if (n % p == 0)
				return false;
		}
		return true;
	}

	//how many ways can 10 apples can be divided amongst
	//3 people?
	static void getCombination(int n) {
		for (int p1 = 0; p1 <= 10; p1++)
			for (int p2 = 0; p2 <= 10 - p1; p2++)
				System.out.println(p1 + " , " + p2 + " , " + (n - p1 - p2));
	}

	//Which option is better for 20 days salary?
	//Option 1: $400/day
	//Option 2: $.01 day 1, $.02 day 2, $.04 day 3, ...
	static void getSalary() {
		//option 1:
		System.out.println(400 * 20);
		//option2:
		double total = 0;
		double dpay = 0.01;
		for (int i = 1; i <= 20; i++) {
			total += dpay;
			dpay *= 2;
		}
		System.out.println(total);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

//        System.out.print("Input n: ");
//        int n = in.nextInt();
//        
//        System.out.println(getFibo(n));
//        
//        System.out.print("Enter s: ");
//        String s = in.next(); //if in.nextLine(), won't let you input s because it is going to output the boolean
//        if (isPalin(s))
//            System.out.println("Yup, that thar"+s+" palindrome.");
//        else
//            System.out.println("What's wrong with you, boy? "+s+"aint no palindrome");
//        
//        getCombination(10);
//        
		getSalary();
	}
}
