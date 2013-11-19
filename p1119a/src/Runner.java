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
    final int MAXSIZE = 20;
    int A[];
    int n;
    
    MyArray() 
    {
        A = new int[MAXSIZE];
        n = 0;
    }
    
    void readA()
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int key = in.nextInt();
        while (key > 0)
        {
            A[n++] = key;
            
            System.out.print("Enter a positive integer: ");
            key = in.nextInt();
        }
    }
}
public class Runner 
{
    public static void main(String[] args) 
    {
        
    }
    
}
