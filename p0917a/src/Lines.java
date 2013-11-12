/**
 * class: CSC190
 * project: p0917a
 * date: 9/17/2013
 * author: Wes Gilleland
 * purpose: This program will determine if two lines segments intersect
 */

import java.util.Scanner;

public class Lines 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        double l1p1x, l1p1y, l1p2x, l1p2y; //input of first line
        double l2p1x, l2p1y, l2p2x, l2p2y; //input of second line
        
        System.out.print("Enter l1p1x: ");
        l1p1x = in.nextDouble();
        System.out.print("Enter l1p1y: ");
        l1p1y = in.nextDouble();
        System.out.print("Enter l1p2x: ");
        l1p2x = in.nextDouble();
        System.out.print("Enter l1p2y: ");
        l1p2y = in.nextDouble();
        System.out.print("Enter l2p1x: ");
        l2p1x = in.nextDouble();
        System.out.print("Enter l2p1y: ");
        l2p1y = in.nextDouble();
        System.out.print("Enter l2p2x: ");
        l2p2x = in.nextDouble();
        System.out.print("Enter l2p2y: ");
        l2p2y = in.nextDouble();
        
        double s1 = (l1p2y-l1p1y/l1p2x-l1p2x);
        double s2 = (l2p2y-l2p1y/l2p2x-l2p2x);
        
        if ((l1p2y-l1p1y)*(l2p2x-l2p2x) == (l2p2y-l2p1y)*(l1p2x-l1p2x)) //use cross-product
            System.out.println("Lines are parallel");
        else
            System.out.println("Lines are intersecting");
    }
}
