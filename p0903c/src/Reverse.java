/**
 * class: CSC190
 * project: p0903c
 * date: 09/03/2013
 * author: Wes Gilleland
 * purpose: This program...
 */

import java.util.Scanner;

public class Reverse 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        int n; //input
        int r=0; //output
        
        System.out.print("Enter n (five digit integer): ");
        n = in.nextInt();
        
        while (n != 0){
            r = (r*10)+(n%10);
            n = n/10;
        }
        
//        //reverse digits. If n = 12345, then r = 54321
//        r = n%10; //r = 5
//        n = n/10; //n = 1234
//        r = (r*10)+(n%10); //r = 54
//        n = n/10; //n = 123
//        r = (r*10)+(n%10); //r = 543
//        n = n/10; //n = 12
//        r = (r*10)+(n%10); //r = 5432
//        n = n/10; //n = 1
//        r = (r*10)+(n); //r = 54321
//        
          System.out.println(r);
    }
}
