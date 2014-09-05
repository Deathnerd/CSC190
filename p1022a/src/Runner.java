/*
 * class: CSC190
 * project: hw10
 * date: 10/22/2013
 * author: Wes Gilleland
 * purpose: This program will evaluate an expression given as a string. However, 
 * the author is spinning his wheels, so it will only currently evaluate expressions with 
 * one operation
 */

import java.util.Scanner;

class Expressions {
	String e;

	void setExpressions(String exp) {
		e = exp;
	}

	int evaluate1() {
		//e has +, - only, single digit numbers
		int result = e.charAt(0) - '0';
		for (int i = 1; i <= e.length() - 2; i += 2) {
			//e.charAt(i-1)-'0': '0' has an ASCII value of 48, 1 49, 2 50, etc.
			//subtracting '0' from the character converts it to the its int value
			if (e.charAt(i) == '+')
				result += (e.charAt(i + 1) - '0');
			else
				result -= (e.charAt(i + 1) - '0');
		}
		return result;
	}

	//evaluate any expression
	int evalE() {
		int r = 0;
		int n = 0;
		char op = '*';

		for (int i = 0; i < e.length(); i++) {
			//if multiplication or division
			if (e.charAt(i) == '*' || e.charAt(i) == '/') {
				//if op is a multiplication sign, multiply r by n
				if (op == '*')
					r += evaluateMD(n, i);
					//else if a division sign,  divide r by n
				else if (op == '/')
					r += evaluateMD(n, i);
				n = 0; //blank the n
				op = e.charAt(i); //set the operation type
			}
			if (e.charAt(i) == '+' || e.charAt(i) == '-') {
				//if op is a plus sign, copy n to r
				if (e.charAt(i) == '+')
					r += evaluateAS(n, i);
					//else if a minus sign, subtract n from r (if r is zero, this makes a negative)
				else
					r += evaluateAS(n, i);
				n = 0; //blank the n
				op = e.charAt(i); //set the operation type
			} else if (e.charAt(i) >= '0' && e.charAt(i) <= '9') //digits. Add the digit to the int n
			{
				n = n * 10 + (e.charAt(i) - '0');
			}
		}
		return r;
	}

	int evaluateAS(int r, int position) {
		//this avoids divide/multiply by 0
		int n = 0;
		//set op to a multiplication sign in accordance with order of operations (PEMDAS)
		char op = e.charAt(position);

		//e has *, / only, multiple digit numbers
		for (int i = position; i < e.length(); i++) {
			//check for operators * or /
			if (e.charAt(i) == '+' || e.charAt(i) == '-') {
				//if op is a multiplication sign, multiply r by n
				//do this first to be in accordance to PEMDAS
				if (position == '+') {
					int k = i + 1;
					while (e.charAt(k) >= '0' && e.charAt(k) <= '9') {
						//add the digit to the int n
						n = n * 10 + (e.charAt(k) - '0');
						k++;
					}
					return r += n;

				}
				//else if the position is a subtraction sign
				else if (position == '-') {
					int k = i + 1;
					while (e.charAt(k) >= '0' && e.charAt(k) <= '9') {
						n = n * 10 + (e.charAt(k) - '0');
						k++;
					}
					return r -= n;
				}
			} else //digits. Add the digit to the int n
			{
				n = n * 10 + (e.charAt(i) - '0');
			}
		}
		//last operation
		if (op == '+')
			r += n;
		else
			r -= n;

		return r;
	}

	//position is the position of the string we were at in evaluate()
	//r is the number we had before we encoutered the operator in evaluate()
	int evaluateMD(int r, int position) {
		int n = 0;
		//set op to a multiplication sign in accordance with order of operations (PEMDAS)
		char op = e.charAt(position);

		//e has *, / only, multiple digit numbers
		for (int i = position; i < e.length(); i++) {
			//check for operators * or /
			if (e.charAt(i) == '*' || e.charAt(i) == '/') {
				//if op is a multiplication sign, multiply r by n
				//do this first to be in accordance to PEMDAS
				if (e.charAt(position) == '*') {
					int k = i + 1;
					while (k < e.length() && e.charAt(k) >= '0' && e.charAt(k) <= '9') {
						//add the digit to the int n
						n = n * 10 + (e.charAt(k) - '0');
						k++;
					}
					return r *= n;

				}
				//else if the position is a division sign
				else if (e.charAt(position) == '/') {
					int k = i + 1;
					while (k < e.length() && e.charAt(k) >= '0' && e.charAt(k) <= '9') {
						n = n * 10 + (e.charAt(k) - '0');
						k++;
					}
					return r /= n;
				}

			} else //digits. Add the digit to the int n
			{
				n = n * 10 + (e.charAt(i) - '0');
			}
		}
		return r;
	}
}

public class Runner {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Expressions myE = new Expressions();

		String resume, e;
		do {
			//menu
			System.out.println("1 - Evaluate an expression" );
			System.out.println("x - Exit" );
			System.out.print("Choice: " );

			resume = in.next();

			//switch block to check input
			switch (resume.charAt(0)) {
				case '1':
					System.out.print("Enter the expression: " );
					e = in.next();
					myE.setExpressions(e);
					System.out.println("Solution for " + e + " = " + myE.evalE());
					break;
				case 'x':
				case 'X':
					System.out.println("Bye!" );
					break;
				default:
					System.out.println("Invalid input!" );
			}
		} while (resume.charAt(0) != 'x' && resume.charAt(0) != 'X');
	}
}
