/**
 * class: CSC190
 * project: hw2
 * date: 08/30/2013
 * author: Wes Gilleland
 * purpose: This program will find the smallest circle that will hold a given
 * rectangle
 */

import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		float x1, y1, x2, y2; //input variables
		float cx, cy, length, height; //output and calculation variables
		double radius, diagonal; //output and calculation variables

		//Grab the individual numbers and put them into corresponding varibles
		System.out.println("Enter the first x coordinate of the rectangle: " );
		x1 = in.nextInt();
		System.out.println("Enter the first y coordinate of the rectangle:  " );
		y1 = in.nextInt();
		System.out.println("Enter the second x coordinate of the rectangle: " );
		x2 = in.nextInt();
		System.out.println("Enter the second y coordinate of the rectangle: " );
		y2 = in.nextInt();

		//Calculate the needed quantities
		length = Math.abs(x2 - x1); //length of the rectangle
		height = Math.abs(y2 - y1); //height of the rectangle
		diagonal = Math.sqrt((length * length) + (height * height)); //the diagonal of the rectangle
		cx = (length / 2) + x1;//x position of the circle center
		cy = (height / 2) + y1; //y position of the circle center
		radius = diagonal / 2; //radius of the circle

		//print the circle coordinate and the radius
		System.out.println("Circle Position, Radius: (" + cx + "," + cy + ") (" + radius + ")" );

	}
}
