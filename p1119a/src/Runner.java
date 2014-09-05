/**
 * class: CSC190 project: p1119a date: 11/19/2013 author: Wes Gilleland purpose:
 * Arrays
 */

import java.util.Random;
import java.util.Scanner;

class MyArray {

	final int MAXSIZE = 5;
	int A[];
	int n;
	boolean sorted = false;

	//constructor
	MyArray() {
		A = new int[MAXSIZE];
		n = 0;
	}

	//read a value and input it into the array
	void readA() {
		n = 0;
		sorted = false;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a positive integer: " );
		int key = in.nextInt();
		while (key > 0) {
			A[n++] = key;
			if (n >= MAXSIZE) {
				break;
			}
			System.out.print("Enter a positive integer: " );
			key = in.nextInt();
		}
		System.out.println("N = " + n);
	}

	//print the array
	void printA() {
		for (int i = 0; i < n; i++) {
			System.out.print(A[i] + " " );
		}
		System.out.println();
	}

	//generate elements in the array
	void generateA() {
		sorted = false;
		Random random = new Random();
		n = random.nextInt(MAXSIZE) + 1;
		for (int i = 0; i < n; i++) {
			A[i] = random.nextInt(100);
		}
	}

	//find the maximum value in the array
	int maxA() {
		int max = A[0];
		for (int i = 1; i < n; i++) {
			if (A[i] > max) {
				max = A[i];
			}
		}
		return max;
	}

	//reverse an array
	void reverseA() {
		for (int i = 0; i < n / 2; i++) {
			//swap A[i] and A[n-i-1]
			int temp = A[i];
			A[i] = A[n - i - 1];
			A[n - i - 1] = temp;
		}
	}

	//rotate an array to the left
	void rotateL() {
		int temp = A[0];
		for (int i = 1; i < n; i++) {
			A[i - 1] = A[i];
		}
		A[n - 1] = temp;
	}

	//rotate an array to the right
	void rotateR() {
		int temp = A[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			A[i + 1] = A[i];
		}
		A[0] = temp;
	}

	void rotateA() {
		Scanner in = new Scanner(System.in);
		String choice;

		do {
			System.out.println("L - Rotate to left" );
			System.out.println("R - Rotate to right" );
			System.out.println("Q - Quit to main menu" );

			choice = in.next();

			switch (choice.charAt(0)) {
				case 'L':
					rotateL();
					break;
				case 'R':
					rotateR();
					break;
				case 'Q':
					return;
				default:
					System.out.println("Invalid input!" );
			}
		} while (choice != "Q" );
	}

	//final
	void bubbleSort() {
		for (int stage = n - 2; stage >= 0; stage--) {
			for (int i = 0; i <= stage; i++) {
				if (A[i] > A[i + 1]) {
					int temp = A[i]; //copy left value into temp variable
					//swap
					A[i] = A[i + 1];
					A[i + 1] = temp;
				}
			}
		}
	}

	//final
	void insertionSort() {
		for (int i = 1; i < n; i++) {
			int t = A[i];
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (A[j] > t)
					A[j + 1] = A[j];
				else
					break;
			}
			A[j + 1] = t;
		}
	}

	int maxInd(int n) {
		int max = 0;
		for (int i = 1; i < n; i++) {
			if (A[i] > A[max]) {
				max = i;
			}
		}
		return max;
	}

	void selectionSort() {
		for (int stage = n; stage >= 2; stage--) {
			int m = maxInd(stage);
			//swap
			int temp = A[m];
			A[m] = A[stage - 1];
			A[stage - 1] = temp;
		}
	}

	void sortA() {
		Scanner in = new Scanner(System.in);
		String choice;

		do {
			System.out.println("B - Bubble Sort" );
			System.out.println("I - Insertion Sort" );
			System.out.println("S - Selection Sort" );
			System.out.println("M - Return to Main Menu" );

			choice = in.next();

			switch (choice.charAt(0)) {
				case 'B':
					bubbleSort();
					sorted = true;
					break;
				case 'I':
					insertionSort();
					sorted = true;
					break;
				case 'S':
					selectionSort();
					sorted = true;
					return;
				default:
					System.out.println("Invalid input!" );
			}
		} while (choice.charAt(0) != 'M');
	}

	void searchA() {
		Scanner in = new Scanner(System.in);
		String choice;
		int key, location;

		do {
			System.out.println("S - Sequential(serial) Search" );
			System.out.println("B - Binary Search" );
			System.out.println("M - Return to Main Menu" );

			choice = in.next();

			switch (choice.charAt(0)) {
				case 'S':
					System.out.print("Enter a key: " );
					key = in.nextInt();
					//location = serialSearch(key);
//					if (location == -1)
//						System.out.println("Key not found");
//					else
//						System.out.println("Key found at position: "+location);
					break;

				case 'B':
					if (sorted) {
						System.out.print("Enter a key: " );
						key = in.nextInt();
						location = binarySearch(key);
						if (location == -1)
							System.out.println("Key not found" );
						else
							System.out.println("Key found at position: " + location);
					} else
						System.out.println("Array is not sorted; please sort first." );
					break;

				case 'M':
					return;

				default:
					System.out.println("Invalid input!" );
			}
		} while (choice.charAt(0) != 'M');
	}

	int sequentialSearch(int key) {
		for (int i = 1; i < n; i++)
			if (key == A[i])
				return i;
		return -1;
	}

	int binarySearch(int key) {
		int left = 0, right = n - 1;
		while (left <= right) {
			int middle = (left + right) / 2;
			if (key == A[middle])
				return middle;
			if (key < A[middle])
				right = middle - 1;
			else
				left = middle + 1;
		}
		return -1;
	}
}

public class Runner {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		MyArray obj = new MyArray();
		//repeated input using a separate check
		String resume;
		do {
			//menu
			System.out.println("1 - Read Array" );
			System.out.println("2 - Generate Array" );
			System.out.println("3 - Print Array" );
			System.out.println("4 - Find Max" );
			System.out.println("5 - Reverse Array" );
			System.out.println("6 - Rotate Array" );
			System.out.println("7 - Sort Array" );
			System.out.println("8 - Search Array" );
			System.out.println("x - Exit" );
			System.out.print("Choice: " );

			resume = in.next();

			//switch block to check input
			switch (resume.charAt(0)) {
				case '1':
					obj.readA();
					break;
				case '2':
					obj.generateA();
					break;
				case '3':
					obj.printA();
					break;
				case '4':
					System.out.println("Max = " + obj.maxA());
					break;
				case '5':
					obj.reverseA();
					break;
				case '6':
					obj.rotateA();
					break;
				case '7':
					obj.sortA();
					break;
				case '8':
					obj.searchA();
					break;
				case 'x':
				case 'X':
					System.out.println("Buh-bye!" );
					break;
				default:
					System.out.println("Invalid input!" );
			}
		} while (resume.charAt(0) != 'x' && resume.charAt(0) != 'X');
	}
}
