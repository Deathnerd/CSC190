/*
 * class: CSC190
 * project: p1105a
 * date: 11/05/13
 * author: Wes Gilleland
 * purpose: This program
 */


import java.util.Scanner;
public class Runner 
{
    //for n = 600, return 2*2*2*3*5*5
    static String getFactor(int n )
    {
        //exercise: print 2^3*3*5^2
        String factor = "";
        int p = 2; //first prime factor
        if(n == 1)
            return "1";
        while(n > 1)
        {
            if (n%p == 0)
            {
                factor += p+"*";
                n /= p;
            }
            else
                p++;
        }
        return factor.substring(0, factor.length()-1);
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        //repeated input using a sentinel
            System.out.print("Enter n(0 or negative number to stop): ");
            int n = in.nextInt();
        while (n > 0){
            System.out.println(getFactor(n));
            
            System.out.print("Enter n(0 or negative number to stop): ");
            n = in.nextInt();
        }
        
    }
    
}
