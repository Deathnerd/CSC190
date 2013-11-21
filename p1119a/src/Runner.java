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
    }
    
    void printA()
    {
        for (int i = 0; i < n; i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
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
            System.out.println("2 - ");
            System.out.println("3 - Print Array");
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
                    break;
                case '3':
                    obj.printA();
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
