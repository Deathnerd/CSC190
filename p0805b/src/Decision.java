/**
 * class: CSC190
 * project: p0905b
 * date: 09/05/2013
 * author: Wes Gilleland
 * purpose: This program...
 */

import java.util.Scanner;

public class Decision 
{
    public static void main(String[] args) 
    {
        
        Scanner in = new Scanner(System.in);
        
        int n1, n2, n3, n4, n5; //input
        int max2, max3, max4, max5; //output
        
        //larger of n1 and n2
        System.out.print("Enter n1: ");
        n1 = in.nextInt();
        System.out.print("Enter n2: ");
        n2 = in.nextInt();
        
        if (n1 > n2)//two way if
            max2 = n1;
        else
            max2 = n2;
        
        //or
        max2 = n1;
        if (n2> max2)
            max2 = n2;
        
        System.out.println("Max2: "+max2);
        
        //largest of n1, n2, n3
        System.out.print("Enter n3: ");
        n3 = in.nextInt();
        
        max3 = n1;
        if (n2 > max3)//one-way if
            max3 = n2;
            
        if (n3 > max3)
            max3 = n3;
        
        System.out.println("max 3: "+max3);
    }    
}

