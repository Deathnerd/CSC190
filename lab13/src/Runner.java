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
        int y = 0;
        int seed = 0;
        
        if (s == 0)
            return 0;
        else if (s >= 100){
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
        else if (a >= 10){
            int k = 10;
            for (int i = 0; i<=n; i++){
                k*=10;
            }
            seed = 6*k;
        }
        
        //xn+1 = 1/2(xn+(s/xn))
        double diff = .0000000001;
        double x = .5*(seed+(s/seed)); //x0 calculation
        double 
        
        //x1+ calculations
        while (){
        }
        
        System.out.println("N= "+n);
        System.out.println("A= "+a);
        System.out.println("Seed = "+seed);
        return 0;
    }
    public static void main(String[] args) 
    {
        getSqrt(9);
    }
    
}
