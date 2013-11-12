/*
 * class: CSC190
 * project: p1105b
 * date: 11/05/13
 * author: Wes Gilleland
 * purpose: This program
 */


import java.util.Scanner;
public class Runner 
{
    //calculate greatest common divisor
    static int gcd(int n1, int n2)
    {
        while (n2 > 0)
        {
            int r = n1%n2;
            n1 = n2;
            n2 = r;
        }
        return n1;
    }
    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        //repeated input using a sentinel
//            System.out.print("Enter n1(0 or negative number to stop): ");
//            int n1 = in.nextInt();
//            System.out.print("Enter n2:");
//            int n2 = in.nextInt();
//        while (n1 > 0){
//            System.out.println(gcd(n1,n2));
//            
//            System.out.print("Enter n(0 or negative number to stop): ");
//            n1 = in.nextInt();
//            System.out.print("Enter n2:");
//            n2 = in.nextInt();
//        }
        
        //repeated input using a separate check
        String res;
        do 
        {
            System.out.print("Enter n1:");
            int n1 = in.nextInt();
            System.out.print("Enter n2:");
            int n2 = in.nextInt();
            System.out.println(gcd(n1,n2));
            
            System.out.print("Would you like to continue? (y, Y)");
            res = in.next();
        } while(res.charAt(0) == 'y' || res.charAt(0) == 'Y');
    }
    
}
