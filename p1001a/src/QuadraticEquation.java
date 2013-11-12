/*
 * class: CSC190
 * project: p1001a
 * date: 10/01/2013
 * author: Wes Gilleland
 * purpose: This program
 */

import java.util.Scanner;
public class QuadraticEquation 
{    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        double a, b, c; //input
        
        System.out.print("Enter a: ");
        a = in.nextDouble();
        System.out.print("Enter b: ");
        b = in.nextDouble();
        System.out.print("Enter c: ");
        c = in.nextDouble();
        
        if (a==0)
            if (b == 0)
               System.out.println("Input is invalid, y'all");
            else //b != 0. x=-c/b
                System.out.println("Linear, x = "+-c/b);
        else 
        {
            double dis = b*b-4*a*c;
            if (dis < 0)
                System.out.println("Imaginary Solutions!");
            else if (dis == 0)
                System.out.println("Repeated Root, x = "+-b/2*a);
            else {
                System.out.println("x1 = "+(-b+Math.sqrt(dis))/(2*a));
                System.out.println("x2 = "+(-b-Math.sqrt(dis))/(2*a));
            }
        }
    }
}
