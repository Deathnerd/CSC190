/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * class: CSC190
 * project: p0827b
 * date: 08/27/2013
 * author: Wes Gilleland
 * purpose: This program shows the difference between different number types
 */

import java.util.Scanner;

public class NumberTypes {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int ni; //4 byte
		long nl; //longer version of integer bytes

		int two = 2;
		float nf1, nf2;
		double nd; //longer version of float

		ni = 2147483647; //limit of an int type. Range of -2147483647 to 2147483647
		nl = 2147483648L;

		nd = 3.141592653589793; //double more accurate than float
		nf1 = 3.141592653589793F; //float not as accurate as float. This out of scope of float's accuracy. Add F to end to treat as float
		nf2 = (float) 3.14; //treats this as double type by default. Add (float) to coerce (cast) to float type

		System.out.println(ni); //print 2147483647
		System.out.println(nl); //print 2147483648
		System.out.println(nd); //print 3.141592653589793
		System.out.println(nf1); //print 3.1415927, only 7 decimal digits
		System.out.println(nf2); //print 3.14
	}
}
