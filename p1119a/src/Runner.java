/**
 * class: CSC190
 * project: p1119a
 * date: 11/19/2013
 * author: Wes Gilleland
 * purpose: Arrays
 */

import java.util.Scanner;
import java.util.Random;

class MyArray 
{
    final int MAXSIZE = 5;
    int A[];
    int n;
    
    MyArray() 
    {
        A = new int[MAXSIZE];
        n = 0;
    }
    
    void readA()
    {
        n = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int key = in.nextInt();
        while (key > 0)
        {
            A[n++] = key;
            if (n >= MAXSIZE)
                break;
            System.out.print("Enter a positive integer: ");
            key = in.nextInt();
        }
        System.out.println("N = "+n);
    }
    
    void printA()
    {
        for (int i = 0; i < n; i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    
        void generateA()
        {
            Random random = new Random();
            n = random.nextInt(MAXSIZE)+1;
            for (int i = 0; i < n; i++)
            {
                A[i] = random.nextInt(100);
            }
        }
        
        int maxA()
        {
            int max = A[0];
            for (int i = 1; i < n; i++)
            {
                if (A[i] > max)
                    max = A[i];
            }
            return max;
        }
        
        void reverseA()
        {
            for (int i = 0; i < n/2; i++)
            {
                //swap A[i] and A[n-i-1]
                int temp = A[i];
                A[i] = A[n-i-1];
                A[n-i-1] = temp;
            }
        }
        
        void rotateL()
        {
            int temp = A[0];
            for (int i = 1; i < n; i++)
            {
                A[i-1] = A[i];
            }
            A[n-1] = temp;
        }
        
        void rotateR()
        {
            int temp = A[n-1];
            
            for (int i = n-2; i >= 0; i--)
            {
                A[i+1] = A[i];
            }
            A[0] = temp;
        }
        
        void rotateA()
        {
            Scanner in = new Scanner(System.in);
            String choice;
            
            do
            {
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
}
public class Runner 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        MyArray obj = new MyArray();
        //repeated input using a separate check
        String resume;
        do 
        {
            //menu
            System.out.println("1 - Read Array");
            System.out.println("2 - Generate Array");
            System.out.println("3 - Print Array");
            System.out.println("4 - Find Max");
            System.out.println("5 - Reverse Array");
            System.out.println("6 - Rotate Array");
            System.out.println("x - Exit");
            System.out.print("Choice: ");
            
            resume = in.next();
            
            //switch block to check input
            switch (resume.charAt(0))
            {
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
                case 'x': case 'X':
                    System.out.println("Buh-bye!");
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        } while(resume.charAt(0) != 'x' && resume.charAt(0) != 'X');
    }
    
}
