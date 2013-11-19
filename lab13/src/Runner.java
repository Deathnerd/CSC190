/**
 * class: CSC190
 * project: lab13
 * date: 11/15/2013
 * author: Wes Gilleland
 * purpose: This program will find the square root of a given number
 */
import java.util.Scanner;
import java.lang.Math;
public class Runner 
{
    static double getSqrt(double s){
        double a = s;
        int n = 0;
        int seed = 0;
        
        /*
            Seed Approximation
        */
        if (s == 0)
            return 0;
        
        if (s >= 100){
            //divide
            while(a>=100){
                    a /= 100;
                    n++;
            }
        }
        else {
            //multiply
            while (a < 1){
                    a*=100;
                    n--;
            }
        }
        
        //2*10^n
        if (a < 10){
            int k = 10;
            for (int i = 0; i<=n; i++){
                k*=10;
            }
            seed = 2*k;
        }
        //6*10^n
        else if (a >= 10){
            int k = 10;
            for (int i = 0; i<=n; i++){
                k*=10;
            }
            seed = 6*k;
        }
        
//        System.out.println(a);
//        System.out.println(n);
//        System.out.println(seed);
        
        
        
        /*
            Babylonian Method
        */
        //xn+1 = 1/2(xn+(s/xn))
        double precision = .0000000001; //set the precision
        double x1 = .5*(seed+(s/seed)); //x0 calculation
        double x2;
        double diff=1;
        
        //x1+ calculations
        //while the difference between the x's is greater than the difference
        while (Math.abs(diff)>precision){
            x2=.5*(x1+(s/x1));
            diff = x2-x1;
            x1=x2;
        }
        return x1;
    }
    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number (a negative number to quit): ");
        double n = in.nextDouble();
        
        while (n > 0)
        {
            System.out.println("The square root of "+n+" is: "+getSqrt(n));
            System.out.print("Enter n(a negative number to quit): ");
            n = in.nextDouble();
        }
    }
    
}
