/*
 * class: CSC190
 * project: p1008a
 * date: 10/08/2013
 * author: Wes Gilleland
 * purpose: This program
 */

import java.util.Scanner;

class Triangle {
	double p1x, p1y, p2x, p2y, p3x, p3y;    //variables are global to the class

	void setTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		//these variables are global to the class
		p1x = x1;
		p1y = y1;
		p2x = x2;
		p2y = y2;
		p3x = x3;
		p3y = y3;
	}

	double getPerimeter() {
		double d12 = Math.sqrt((p2x - p1x) * (p2x - p1x) + (p2y - p1y) * (p2y - p1y));
		double d23 = Math.sqrt((p3x - p2x) * (p3x - p2x) + (p3y - p2y) * (p3y - p2y));
		double d31 = Math.sqrt((p3x - p1x) * (p3x - p1x) + (p3y - p1y) * (p3y - p1y));

		return d12 + d23 + d31;
	}

	double getArea() {
		double d12 = Math.sqrt((p2x - p1x) * (p2x - p1x) + (p2y - p1y) * (p2y - p1y));
		double d23 = Math.sqrt((p3x - p2x) * (p3x - p2x) + (p3y - p2y) * (p3y - p2y));
		double d31 = Math.sqrt((p3x - p1x) * (p3x - p1x) + (p3y - p1y) * (p3y - p1y));
		double s = (d12 + d23 + d31) / 2;

		return Math.sqrt(s * (s - d12) * (s - d23) * (s - d31));
	}

	void plot() {
		System.out.println("!!!Under Construction!!!" );
	}
}

class Circle {
	double cx, cy, r;

	void setCircle(double cx, double cy, double r) {
		//the keyword "this" points to the global class variables
		this.cx = cx;
		this.cy = cy;
		this.r = r;
	}

	double getCircumference() {
		return 2 * Math.PI * r;
	}

	double getArea() {
		return Math.PI * (r * r);
	}

	void plot() {
		System.out.println("!!!Under Construction!!!" );
	}
}

public class Runner {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double p1x, p1y, p2x, p2y, p3x, p3y;

		double a, b, c; //input

		System.out.print("Enter p1x:" );
		p1x = in.nextDouble();
		System.out.print("Enter p1y:" );
		p1y = in.nextDouble();
		System.out.print("Enter p2x:" );
		p2x = in.nextDouble();
		System.out.print("Enter p2y:" );
		p2y = in.nextDouble();
		System.out.print("Enter p3x:" );
		p3x = in.nextDouble();
		System.out.print("Enter p3y:" );
		p3y = in.nextDouble();

		Triangle myTriangle = new Triangle();

		myTriangle.setTriangle(p1x, p1y, p2x, p2y, p3x, p3y);
		System.out.println("Perimeter = " + myTriangle.getPerimeter());
		System.out.println("Area = " + myTriangle.getArea());
		myTriangle.plot();

		double cx, cy, r;

		System.out.println("\nEnter cx: " );
		cx = in.nextDouble();
		System.out.println("Enter cy: " );
		cy = in.nextDouble();
		System.out.println("Enter r: " );
		r = in.nextDouble();

		Circle myCircle = new Circle();

		myCircle.setCircle(cx, cy, r);
		System.out.println("Circumference = " + myCircle.getCircumference());
		System.out.println("Area = " + myCircle.getArea());
		myCircle.plot();

		Circle myCircle1 = new Circle();
		myCircle1.setCircle(1, 1, 10);
		System.out.println("\nCicumference = " + myCircle1.getCircumference());
		System.out.println("\nArea = " + myCircle1.getArea());
		myCircle1.plot();
	}
}
