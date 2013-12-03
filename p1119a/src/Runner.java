/**
 * class: CSC190
 * project: p1119a
 * date: 11/19/2013
 * author: Wes Gilleland
 * purpose: Arrays
 */

import java.util.Scanner;
import java.util.Random;

class MyArray{
    final int MAXSIZE = 5;
    int A[];
    int n;
    
    //constructor
    MyArray(){
        A = new int[MAXSIZE];
        n = 0;
    }
    
    //read a value and input it into the array
    void readA(){
        n = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int key = in.nextInt();
        while (key > 0){
            A[n++] = key;
            if (n >= MAXSIZE)
                break;
            System.out.print("Enter a positive integer: ");
            key = in.nextInt();
        }
        System.out.println("N = "+n);
    }
    
    //print the array
    void printA(){
        for (int i = 0; i < n; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    
    //generate elements in the array
    void generateA(){
        Random random = new Random();
        n = random.nextInt(MAXSIZE)+1;
        for (int i = 0; i < n; i++){
            A[i] = random.nextInt(100);
        }
    }
    
    //find the maximum value in the array
    int maxA(){
        int max = A[0];
        for (int i = 1; i < n; i++){
            if (A[i] > max)
                max = A[i];
        }
        return max;
    }

    //reverse an array
    void reverseA(){
        for (int i = 0; i < n/2; i++){
            //swap A[i] and A[n-i-1]
            int temp = A[i];
            A[i] = A[n-i-1];
            A[n-i-1] = temp;
        }
    }
    
    //rotate an array to the left
    void rotateL(){
        int temp = A[0];
        for (int i = 1; i < n; i++){
            A[i-1] = A[i];
        }
        A[n-1] = temp;
    }
    
    //rotate an array to the right
    void rotateR(){
        int temp = A[n-1];            
        for (int i = n-2; i >= 0; i--){
            A[i+1] = A[i];
        }
        A[0] = temp;
    }

    void rotateA(){
        Scanner in = new Scanner(System.in);
        String choice;

        do{
            System.out.println("L - Rotate to left");
            System.out.println("R - Rotate to right");
            System.out.println("Q - Quit to main menu");

            choice = in.next();

            switch (choice.charAt(0)){
                case 'L':
                    rotateL();
                    break;
                case 'R':
                    rotateR();
                    break;
                case 'Q':
                    return;
                default:
                    System.out.println("Invalid input!");
            }
        }while(choice != "Q");
    }

    void bubbleSort(){
        for (int stage = n-2; stage >= 0; stage--)
            for (int i = 0; i <= stage; i++)
                if (A[i] > A[i+1]){
                    int temp = A[i]; //copy left value into temp variable
                     //swap
                    A[i] = A[i+1];
                    A[i+1] = temp;
                }
    }
    
    void insertionSort(){
        
    }
    
    int maxInd(int n){
        int max = 0;
        for (int i = 1; i < n; i++){
            if (A[i] > A[max])
                max = i;
        }
        return max;
    }
    
    void selectionSort(){
        for (int stage = n; stage >=2; stage--){
            int m = maxInd(stage);
            //swap
            int temp = A[m];
            A[m] = A[stage-1];
            A[stage-1] = temp;
        }
    }
    void sortA(){
        Scanner in = new Scanner(System.in);
        String choice;

        do{
            System.out.println("B - Bubble Sort");
            System.out.println("I - Insertion Sort");
            System.out.println("S - Selection Sort");
            System.out.println("M - Return to Main Menu");

            choice = in.next();

            switch (choice.charAt(0)){
                case 'B':
                    bubbleSort();
                    break;
                case 'I':
                    insertionSort();
                    break;
                case 'S':
                    selectionSort();
                    return;
                default:
                    System.out.println("Invalid input!");
            }
        }while(choice.charAt(0) != 'M');
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
            System.out.println("1 - Read Array");
            System.out.println("2 - Generate Array");
            System.out.println("3 - Print Array");
            System.out.println("4 - Find Max");
            System.out.println("5 - Reverse Array");
            System.out.println("6 - Rotate Array");
            System.out.println("7 - Sort Array");
            System.out.println("x - Exit");
            System.out.print("Choice: ");
            
            resume = in.next();
            
            //switch block to check input
            switch (resume.charAt(0)){
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
                    System.out.println("Max = "+obj.maxA());
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
                case 'x': case 'X':
                    System.out.println("Buh-bye!");
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        } while(resume.charAt(0) != 'x' && resume.charAt(0) != 'X');
    }
}
