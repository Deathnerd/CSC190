/**
 * class: CSC190
 * project: hw4
 * date: 9/17/2013
 * author: Wes Gilleland
 * purpose: This program will determine if a point lies on a given line
 */

import java.util.Scanner;

public class Decision 
{

    public static void main(String[] args) 
    {
        /* 
         * TODO: Check for divide undefined or 0 lines
         */
        Scanner in = new Scanner(System.in);
        
        float lx1, ly1, lx2, ly2, px, py;//inputs
        float slope, b; //temps
        float decision; //output
        
        System.out.print("Enter the first x endpoint coordinate: ");
        lx1 = in.nextFloat();
        System.out.print("Enter the first y endpoint coordinate: ");
        ly1 = in.nextFloat();
        System.out.print("Enter the second x endpoint coordinate: ");
        lx2 = in.nextFloat();
        System.out.print("Enter the second y endpoint coordinate: ");
        ly2 = in.nextFloat();
        System.out.print("Enter the x coordinate of the point: ");
        px = in.nextFloat();
        System.out.print("Enter the y coordinate of the point: ");
        py = in.nextFloat();
        
        //find the slope
        slope = (ly1-ly2)/(lx1-lx2);
        //find b
        b = (slope*lx1-ly1)/-1;
        
        /*
         * Check for slopes of zero and if the point is on it: 
         * ((lx1 == lx2) && (px == lx1))
         * 
         * Check for undefined slopes and if the point is on it:
         * ((ly1 == ly2) && (py1 == ly1))
         * 
         * Check if the point lies on a sloped line:
         * (py == Math.ceil(slope*px+b)) **INCORRECT**
         * ((py-ly1)*(lx2-lx1)==(ly2-ly1)*(px-lx1)) **CORRECT**
         */
        if (((lx1 == lx2) && (px == lx1)) || ((ly1 == ly2) && (py == ly1)) || ((py-ly1)*(lx2-lx1)==(ly2-ly1)*(px-lx1)))
            System.out.println("The point is on the line");
        else
            System.out.println("The point is not on the line");
    }
}
