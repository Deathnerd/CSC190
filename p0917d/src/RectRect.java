/**
 * class: CSC190
 * project: p0917d
 * date: 9/17/2013
 * author: Wes Gilleland
 * purpose: This program will determine 
 */

import java.util.Scanner;

public class RectRect 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        double r1p1x, r1p1y, r1p2x, r1p2y; //input of first rectangle
        double r2p1x, r2p1y, r2p2x, r2p2y; //input of second rectangle
        
        System.out.print("Enter r1p1x");
        r1p1x = in.nextDouble();
        System.out.print("Enter r1p1y");
        r1p1y = in.nextDouble();
        System.out.print("Enter r1p2x");
        r1p2x = in.nextDouble();
        System.out.print("Enter r1p2y");
        r1p2y = in.nextDouble();
        System.out.print("Enter r2p1x");
        r2p1x = in.nextDouble();
        System.out.print("Enter r1p1y");
        r2p1y = in.nextDouble();
        System.out.print("Enter r1p2x");
        r2p2x = in.nextDouble();
        System.out.print("Enter r1p2y");
        r2p2y = in.nextDouble();
        
        //determine if the rectangles are disjointed, r1 inside r2, r2 inside r1,
        //or overlapping
        
        double r1minx = Math.min(r1p1x, r1p2x);
        double r1maxx = Math.max(r1p1x, r1p2x);
        double r1miny = Math.min(r1p1y, r1p2y);
        double r1maxy = Math.max(r1p1y, r1p2y);
        double r2minx = Math.min(r2p1x, r2p2x);
        double r2maxx = Math.max(r2p1x, r2p2x);
        double r2miny = Math.min(r2p1y, r2p2y);
        double r2maxy = Math.max(r2p1y, r2p2y);
        
        
        
    }
}
