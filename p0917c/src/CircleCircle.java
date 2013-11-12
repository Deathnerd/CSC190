/**
 * class: CSC190
 * project: p0917c
 * date: 9/17/2013
 * author: Wes Gilleland
 * purpose: This program will determine if two circles overlap, touch, 
 * or one resides in another
 */

import java.util.Scanner;

public class CircleCircle 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        double c1x, c1y, r1, c2x, c2y, r2; //input
        
        System.out.print("Enter c1x: ");
        c1x = in.nextDouble();
        System.out.print("Enter c1y: ");
        c1y = in.nextDouble();
        System.out.print("Enter r1: ");
        r1 = in.nextDouble();
        System.out.print("Enter c2x: ");
        c2x = in.nextDouble();
        System.out.print("Enter c2y: ");
        c2y = in.nextDouble();
        System.out.print("Enter r2: ");
        r2 = in.nextDouble();
        
        //determine if the circles are disjoint, one is inside the other
        //or overlapping
        
        //if separate, then r1+r2 > distance
        
        double distance = Math.sqrt((c1x-c2x)*(c1x-c2x)+(c1y-c2y)*(c1y-c2y));
        
        if (distance > r1+r2)
            System.out.println("The circles are disjointed");
        else if (distance+r1 <= r2)
            System.out.println("C1 is inside c2");
        else if (distance+r2 <= r1)
            System.out.println("C2 is inside c1");
        else
            System.out.println("The circles overlap");
        
    }
}
