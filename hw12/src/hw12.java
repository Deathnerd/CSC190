/**
 * class: CSC190 project: p1119a date: 11/19/2013 author: Wes Gilleland purpose:
 * This program will make an array of n size and have functions to insert
 * integers, delete integers, and print the array
 */

import java.util.Scanner;
class OrderedArray {

	int A[];
	int globalSize;
	int n = 0;
	int currentSize = 0;
	int B[];

	OrderedArray(int size) {
		A = new int[size]; //main array
		globalSize = size;
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

	void insert(int key) {
		if (currentSize == globalSize) {
			System.out.println("Array full! Cannot add key");
			return;
		} else {
			currentSize++;
			A[currentSize - 1] = key;
			n = currentSize;
		}
		if (currentSize > 1) {
			selectionSort();
		}
	}

	void delete(int key) {
		int i = 0;
		//count the number of occurences of the key
		while (i<A.length){
			if (A[i]==key){
				A[i]=0;
			}
			i++;
		}
		currentSize--;
	}

	void printA() {
		System.out.println();
		System.out.print("Array is: ");
		for (int i = 0; i < A.length; i++) {
			if(A[i] == 0)
				continue;
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}
}

public class hw12 {
	static void run(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a size for the array: ");
		int key;
		int size = in.nextInt();
		OrderedArray array = new OrderedArray(size);
		System.out.println();
		System.out.println();
		
		String resume;
        do {
            //menu
            System.out.println("1 - Insert into Array");
            System.out.println("2 - Delete from Array");
            System.out.println("3 - Print Array");
            System.out.println("x - Exit");
            System.out.print("Choice: ");
            
            resume = in.next();
			
			switch(resume){
				case "1":
					System.out.println();
					System.out.print("Enter a value to insert: ");
					key = in.nextInt();
					array.insert(key);
					System.out.println();
					break;

				case "2":
					System.out.println();
					System.out.print("Enter a value to delete: ");
					key = in.nextInt();
					array.delete(key);
					System.out.println();
					break;

				case "3":
					array.printA();
					break;
					
				case "x":
					return;
					
				default:
					System.out.println();
					System.out.println("Invalid input!");
					System.out.println();
			}
		} while(resume!="x");
	}

	public static void main(String[] args) {
		run();
		System.out.println();
	}
}
