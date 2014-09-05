/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * class: CSC190
 * project: hw1
 * date: 08/23/2013
 * author: Wes Gilleland
 * purpose: This program will convert miles, yards, feet, and inches into kilometers, meters, centimeters, and millimeters
 */
//purpose: This program reads a length in (mile, yard, foot, inch) and //converts it to (km, m, cm, mm).

//1 mile = 1760 yards
//1 yard = 3 feet
//1 foot = 12 inches
//1 inch = 2.54 cm
//1 km = 1000m
//1 m = 100 cm
//1 cm = 10 mm


import java.util.Scanner;

public class hw1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int mile, yard, foot, inch;
		double km, m, cm, mm;
		int ikm, im, icm, imm;
		float fkm, fm, fcm, fmm;

		System.out.print("How many miles?:" );
		mile = in.nextInt();
		System.out.print("How many yards?:" );
		yard = in.nextInt();
		System.out.print("How many feet?:" );
		foot = in.nextInt();
		System.out.print("How many inches?:" );
		inch = in.nextInt();

		//steps for conversion
		mm = ((((mile * 1760 + yard) * 3 + foot) * 12 + inch) * 25.4); //casting: converts the resulting double into an int
		cm = mm / 10; //converts to cm. Really feel like an idiot for over-thinking this
		m = cm / 100;
		km = m / 1000;

		imm = (int) mm;
		icm = (int) cm;
		im = (int) m;
		ikm = (int) km;

		fmm = (float) mm;
		fcm = (float) cm;
		fm = (float) m;
		fkm = (float) km;

		System.out.println("(" + mile + " miles, " + yard + " yards, " + foot + " feet, " + inch + " inches)" );
		System.out.println("Integer values: (" + ikm + " km, " + im + " m, " + icm + " cm, " + imm + " mm)" );
		System.out.println("Float Precision values: (" + fkm + " km, " + fm + " m, " + fcm + " cm, " + fmm + " mm)" );
		System.out.println("Double Precision values: (" + km + " km, " + m + " m, " + cm + " cm, " + mm + " mm)" );

	}
}
