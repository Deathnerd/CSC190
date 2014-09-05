/*
 * class: CSC190
 * project: lab8
 * date: 10/11/2013
 * author: Wes Gilleland
 * purpose: This program
 */

import java.util.Scanner;

class Triangle {
	double p1x, p1y, p2x, p2y, p3x, p3y;    //variables are global to the class

	//constructor. Called when creating a new object from the class
	Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		//sets the global variables to the variables passed to the constructor
		p1x = x1;
		p1y = y1;
		p2x = x2;
		p2y = y2;
		p3x = x3;
		p3y = y3;
	}

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

class Sphere {
	//global variables
	double cx, cy, cz, r;

	//constructor. Called when creating a new object from the class
	Sphere(double cx, double cy, double cz, double r) {
		//sets the global variables to the variables passed to the constructor
		this.cx = cx;
		this.cy = cy;
		this.cz = cz;
		this.r = r;
	}

	void setSphere(double cx, double cy, double cz, double r) {
		//the keyword "this" points to the global class variables
		this.cx = cx;
		this.cy = cy;
		this.cz = cz;
		this.r = r;
	}

	double getSurfaceArea() {
		return 4 * Math.PI * (r * r);
	}

	double getVolume() {
		return (4 / 3) * Math.PI * (r * r * r);
	}

	void plot() {
		System.out.println("!!!Under Construction!!!" );
	}
}

class Cylinder {
	//global variables
	double cx, cy, cz, r, h;

	//constructor. Called when creating a new object from the class
	Cylinder(double cx, double cy, double cz, double r, double h) {
		//sets the global variables to the variables passed to the constructor
		this.cx = cx;
		this.cy = cy;
		this.cz = cz;
		this.r = r;
		this.h = h;
	}

	void setCylinder(double cx, double cy, double cz, double r, double h) {
		this.cx = cx;
		this.cy = cy;
		this.cz = cz;
		this.r = r;
		this.h = h;
	}

	double getVolume() {
		return Math.PI * (r * r) * h;
	}

	double getSurfaceArea() {
		return (2 * Math.PI * (r * r)) + (2 * Math.PI * r * h) + (2 * Math.PI * r * (r + h));
	}

	void plot() {
		System.out.println("!!!Under Construction!!!" );
	}

}

class RectangularCuboid {
	//global variables
	double length, depth, height;

	//constructor. Called when creating a new object from the class
	RectangularCuboid(double length, double depth, double height) {
		//sets the global variables to the variables passed to the constructor
		this.length = length;
		this.depth = depth;
		this.height = height;
	}

	void setRectangularCuboid(double length, double depth, double height) {
		this.length = length;
		this.depth = depth;
		this.height = height;
	}

	double getVolume() {
		return length * depth * height;
	}

	double getSurfaceArea() {
		//a = length
		//b = height
		//c = depth
		return (2 * length * height) + (2 * length * depth) + (2 * height * depth);
	}

	void plot() {
		System.out.println("!!!Under Construction!!!" );
	}

}

class RegularTetrahedron {
	double edgeLength;

	//constructor. Called when creating a new object from the class
	RegularTetrahedron(double edgeLength) {
		this.edgeLength = edgeLength;
	}

	void setRegularTetrahedron(double edgeLength) {
		this.edgeLength = edgeLength;
	}

	double getVolume() {
		return (Math.sqrt(2) / 12) * (edgeLength * edgeLength * edgeLength);
	}

	double getSurfaceArea() {
		return Math.sqrt(3) * (edgeLength * edgeLength);
	}

	void plot() {
		System.out.println("!!!Under Construction!!!" );
	}

}

public class Runner {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double p1x, p1y, p2x, p2y, p3x, p3y;

		System.out.println("Triangle\n===============" );
		System.out.println("Enter p1x:" );
		p1x = in.nextDouble();
		System.out.println("Enter p1y:" );
		p1y = in.nextDouble();
		System.out.println("Enter p2x:" );
		p2x = in.nextDouble();
		System.out.println("Enter p2y:" );
		p2y = in.nextDouble();
		System.out.println("Enter p3x:" );
		p3x = in.nextDouble();
		System.out.println("Enter p3y:" );
		p3y = in.nextDouble();

		//initialize a new Triangle object as myTriangle by calling the constructor with arguments
		Triangle myTriangle = new Triangle(p1x, p1y, p2x, p2y, p3x, p3y);

		System.out.println("Perimeter = " + myTriangle.getPerimeter());
		System.out.println("Area = " + myTriangle.getArea());

		double r; //radius for the sphere

		System.out.println("\nSphere\n===============" );
		System.out.println("Enter r:" );
		r = in.nextDouble();

		//initialize a new Sphere object as mySphere by calling the constructor with arguments
		Sphere mySphere = new Sphere(0, 0, 0, r);

		System.out.println("Surface Area: " + mySphere.getSurfaceArea());
		System.out.println("Volume: " + mySphere.getVolume());

		double h;
		System.out.println("\nCylinder\n===============" );
		System.out.println("Enter r:" );
		r = in.nextDouble();
		System.out.println("Enter h:" );
		h = in.nextDouble();

		//initialize a new Cylinder object as myCylinder by calling the constructor with arguments
		Cylinder myCylinder = new Cylinder(0, 0, 0, r, h);

		System.out.println("Surface Area: " + myCylinder.getSurfaceArea());
		System.out.println("Volume: " + myCylinder.getVolume());

		double d, l;
		System.out.println("\nRectangular Cuboid\n===============" );
		System.out.println("Enter l:" );
		l = in.nextDouble();
		System.out.println("Enter h:" );
		h = in.nextDouble();
		System.out.println("Enter d:" );
		d = in.nextDouble();

		//initialize a new RectangularCuboid object as myCuboid by calling the constructor with arguments
		RectangularCuboid myCuboid = new RectangularCuboid(l, d, h);

		System.out.println("Surface Area: " + myCuboid.getSurfaceArea());
		System.out.println("Volume: " + myCuboid.getVolume());

		System.out.println("\nRectangular Cuboid\n===============" );
		System.out.println("Enter edge length:" );
		l = in.nextDouble();

		//initialize a new RegularTetrahedron object as myTetrahedron by calling the constructor with arguments
		RegularTetrahedron myTetrahedron = new RegularTetrahedron(l);

		System.out.println("Surface Area: " + myTetrahedron.getSurfaceArea());
		System.out.println("Volume: " + myTetrahedron.getVolume());
	}
}
