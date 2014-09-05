/**
 * class: CSC190
 * project: hw3
 * date: 9/12/2013
 * author: Wes Gilleland
 * purpose: This program will take the coordinates and measurements of a rectangle
 * and a circle and determine if the circle lies completely inside the rectangle
 */

import java.util.Scanner;

public class lab4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double cx, cy, r, p1x, p1y, p2x, p2y; //Input
		double width, height, rx, ry; //temps

		System.out.print("Enter cx: " );
		cx = in.nextDouble();
		System.out.print("Enter cy: " );
		cy = in.nextDouble();
		System.out.print("Enter r: " );
		r = in.nextDouble();
		System.out.print("Enter p1x: " );
		p1x = in.nextDouble();
		System.out.print("Enter p1y: " );
		p1y = in.nextDouble();
		System.out.print("Enter p2x: " );
		p2x = in.nextDouble();
		System.out.print("Enter p2y: " );
		p2y = in.nextDouble();

		rx = Math.min(p1x, p2x); //get the position of the left-most side of the rectangle
		ry = Math.min(p1y, p2y); //get the position of the bottom-most side of the rectangle
		width = Math.max(p1x, p2x) - rx; //get the width of the rectangle
		height = Math.max(p1y, p2y) - ry; //get the height of the rectangle

        /*check to see if the circle is inside the rectangle. Returns true if so
         * rx<=cx-r checks if the x position of the circle is outside the rectangle
         * ry<=cy-r does the same thing as above, except for the y position
         * cx+r<=rx+width checks to see if the circle is inside the right-most part of the rectangle
         * cy+r<=ry+height does the same as above, except for the top of the rectangle
         */
		if (rx <= cx - r && ry <= cy - r && cx + r <= rx + width && cy + r <= ry + height)
			System.out.println("The circle lies completely inside the rectangle" );
		else
			System.out.println("The circle does not lie completely inside the rectangle" );
	}
}
