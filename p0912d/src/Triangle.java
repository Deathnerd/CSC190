/**
 * class: CSC190
 * project: p0912d
 * date: 9/12/2013
 * author: Wes Gilleland
 * purpose: This program...
 */

import java.util.Scanner;
public class Triangle 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        double s1, s2, s3; //input
        double max; //temporary variable
        //no output variables
        
        System.out.println("Enter side 1: ");
        s1 = in.nextDouble();
        System.out.println("Enter side 2: ");
        s2 = in.nextDouble();
        System.out.println("Enter side 3: ");
        s3 = in.nextDouble();
        
        max = s1;
        if (s1 > s2) {
            double t = s1;
            s1 = s2;
            s2 = t;
        }
        if (s2 > s3) {
            double t = s2;
            s2 = s3;
            s3 = t;
        }
        
        if (s1+s2+s3-max <= max)
            System.out.println("Invalid!");
        else
            if(s1*s1+s2*s2 == s3*s3) //right triangle
                System.out.println("Right Triangle");
            else if(s1*s1*s2*s2 > s3*s3) //acute
                System.out.println("Acute Triangle");
            else //obtuse
                System.out.println("Obtuse Triangle");
    }
}

