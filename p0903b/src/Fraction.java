/**
 * class: CSC190
 * project: p0903b
 * date: 09/03/2013
 * author: Wes Gilleland
 * purpose: This program...
 */

import java.util.Scanner;

public class Fraction {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int num1, den1, num2, den2; //inputs
		int numA, denA, numS, denS,
				numM, denM, numD, denD;//outputs

		System.out.print("Enter num1:" );
		num1 = in.nextInt();
		System.out.print("Enter den1:" );
		den1 = in.nextInt();
		System.out.print("Enter num2:" );
		num2 = in.nextInt();
		System.out.print("Enter den2:" );
		den2 = in.nextInt();

		//sum num1/den1 + num2/den2
		numA = (num1 * den2) + (num2 * den1);
		denA = den1 * den2;

		//sum num1/den1 - num2/den2
		numS = (num1 * den2) - (num2 * den1);
		denS = den1 * den2;

		//sum num1/den1 * num2/den2
		numM = num1 * num2;
		denM = den1 * den2;

		//sum num1/den1 * num2/den2
		numD = num1 * den2;
		denD = den1 * num2;

		System.out.println(num1 + "/" + den1 + " + " + num2 + "/" + den2 + " = " + numA + "/" + denA);
		System.out.println(num1 + "/" + den1 + " - " + num2 + "/" + den2 + " = " + numS + "/" + denS);
		System.out.println(num1 + "/" + den1 + " * " + num2 + "/" + den2 + " = " + numM + "/" + denM);
		System.out.println(num1 + "/" + den1 + " / " + num2 + "/" + den2 + " = " + numD + "/" + denD);

	}
}
