/**
 * class: CSC190
 * project: p0917b
 * date: 9/17/2013
 * author: Wes Gilleland
 * purpose: This program...
 */

import java.util.Scanner;

public class CirclePoint
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        double cx, cy, r; //input
        double px, py; //input
        
        System.out.print("Enter cx: ");
        cx = in.nextDouble();
        System.out.print("Enter cy: ");
        cy = in.nextDouble();
        System.out.print("Enter r: ");
        r = in.nextDouble();
        System.out.print("Enter px: ");
        px = in.nextDouble();
        System.out.print("Enter py: ");
        py = in.nextDouble();
        
        //determine if the point lies inside, on, or outside the circle
            //check if the distance of the point is less than or equal to the radius
        
        double d = Math.sqrt((px-cx)*(px-cx)-(py-cy)*(py-cy));
        
        if (d < r)
            System.out.println("Point is inside the circle");
        else if (d == r)
            System.out.println("Point is on the circle");
        else
            System.out.println("Point is outside the circle");
        
    }
}
