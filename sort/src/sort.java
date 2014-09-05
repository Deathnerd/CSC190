/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * class: CSC190
 * project: p0829a
 * date: 08/29/2013
 * author: Wes Gilleland
 * purpose: This program
 */

import java.util.Scanner;

public class sort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n1, n2, n3, n4;

		System.out.println("Input n1: " );
		n1 = in.nextInt();
		System.out.println("Input n2: " );
		n2 = in.nextInt();
		System.out.println("Input n3: " );
		n3 = in.nextInt();
		System.out.println("Input n4: " );
		n4 = in.nextInt();

		if (n1 > n2) {
			int t = n1; //local variable
			n1 = n2;
			n2 = t;
		}
		if (n2 > n3) {
			int t = n2; //local variable
			n2 = n3;
			n3 = t;
		}
		if (n3 > n4) {
			int t = n3; //local variable
			n3 = n4;
			n4 = t;
		}
		if (n2 > n3) {
			int t = n2; //local variable
			n2 = n3;
			n3 = t;
		}
		if (n1 > n2) {
			int t = n1; //local variable
			n1 = n2;
			n2 = t;
		}

		System.out.println(n1 + "," + n2 + "," + n3 + "," + n4);
	}


}
