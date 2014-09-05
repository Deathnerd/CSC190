/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * class: CSC190
 * project: p0827c
 * date: 08/27/2013
 * author: Wes Gilleland
 * purpose: This program
 */

import java.util.Scanner;

public class Circle {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		final double PI = 3.14159; //constant. Keyword 'final' sets it to constant (you can't change it
		double cx, cy, r; //input variables
		double circum, area; //output variables

		System.out.print("Enter cx: " );
		cx = in.nextDouble();
		System.out.print("Enter cy: " );
		cy = in.nextDouble();
		System.out.print("Enter r: " );
		r = in.nextDouble();

		circum = 2 * PI * r;
		area = PI * r * r;

		System.out.println("Circumference = " + circum);
		System.out.println("Area = " + area);
	}
}
