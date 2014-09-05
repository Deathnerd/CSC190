/**
 * class: CSC190
 * project: p0912a
 * date: 09/12/2013
 * author: Wes Gilleland
 * purpose: This program
 *
 * qty unit   price
 * 1-100      6.00
 * 101-200    5.50
 * 201-400    5.00
 * 401-700    4.50
 * 701+       4.00
 */

import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int quantity;
		double total;

		System.out.print("Enter the quantity: " );
		quantity = in.nextInt();

		if (quantity > 700)
			total = quantity * 4.00;
		else if (quantity > 400)
			total = quantity * 4.50;
		else if (quantity > 200)
			total = quantity * 5.00;
		else if (quantity > 100)
			total = quantity * 5.50;
		else if (quantity > 0)
			total = quantity * 6.00;
		else
			total = 0.00;

		System.out.println("Total is: " + total);


	}
}
