/**
 * class: CSC190
 * project: lab1
 * date: 08/23/2013
 * author: Wes Gilleland
 * purpose: This program 
 */

import java.util.Scanner;

public class lab1 {

	public static double distance(double x1, double y1, double x2, double y2) //calculate distance
	{
		double d = 0;
		d = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		return d;
	}

	public static double heronsFormula(double a, double b, double c) //calculate area
	{
		double f = 0;

		f = .25 * Math.sqrt((a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c));
		return f;

	}

	public static void main(String[] args) {
		// TODO code application logic here

		Scanner in = new Scanner(System.in);

		double p1x, p1y, p2x, p2y, p3x, p3y;
		double area, perimeter;
		double d12, d23, d13; //distance between d1&d2, d2&d3, d1&d3 respectively

		System.out.println("Enter p1x:" );
		p1x = in.nextDouble(); //to read an integer from the keyboard
		System.out.println("Enter p1y:" );
		p1y = in.nextDouble();
		System.out.println("Enter p2x:" );
		p2x = in.nextDouble(); //to read an integer from the keyboard
		System.out.println("Enter p2y:" );
		p2y = in.nextDouble();
		System.out.println("Enter p3x:" );
		p3x = in.nextDouble(); //to read an integer from the keyboard
		System.out.println("Enter p3y:" );
		p3y = in.nextDouble();

		//calculation for area and perimeter and distance
		d12 = distance(p1x, p1y, p2x, p2y); //calculate the distance
		d23 = distance(p2x, p2y, p3x, p3y);
		d13 = distance(p1x, p1y, p3x, p3y);
		perimeter = d12 + d23 + d13; //calculate the perimeter
		area = heronsFormula(d12, d23, d13); //calculate the area

		System.out.println("Perimeter = " + perimeter);
		System.out.println("Area = " + area);
		System.out.println("Distance between (p1x,p1y) and (p2x, p2y)" + d12);
		System.out.println("Distance between (p2x,p2y) and (p3x, p3y)" + d23);
		System.out.println("Distance between (p1x,p1y) and (p3x, p3y)" + d13);
	}
}