
/**
 * class: CSC190 project: p1119a date: 11/19/2013 author: Wes Gilleland purpose:
 * This program will make an array of n size and have functions to insert
 * integers, delete integers, and print the array
 */

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
		int bPosition = 0;
		int count = 0;
		//count the number of occurences of the key
		while (i<A.length){
			if (A[i]==key){
				count++;
			}
			else
				break; //A[] is always going to be sorted, so no need to loop through the whole thing if not needed
		}
		
		if (count == 0) //key does not exist, exit
			return;
		System.out.println(count);
		i=0;
		B = new int[count];
		
		while (i<A.length){
			if (A[i]==key){
				i++;
				continue;
			}
			else{
				B[i]=A[i];
				bPosition++;
			}
			i++;
		}
		A=B;
	}

	void printA() {
		n = currentSize;
		for (int i = 0; i < n; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}
}

public class hw12 {

	public static void main(String[] args) {
		OrderedArray array = new OrderedArray(5);
		
		array.printA();
		array.insert(2);
		array.insert(1);
		array.insert(23);
		array.insert(15);
		array.insert(15);
		array.insert(15);
		array.printA();
		array.delete(15);
		array.printA();
	}
}
