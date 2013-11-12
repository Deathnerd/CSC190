/*
 * class: CSC190
 * project: p1010a
 * date: 10/10/2013
 * author: Wes Gilleland
 * purpose: This program
 */

import java.util.Scanner;

class Mtable
{
    /* print the multiplication table
    * 1*1=1
    * 1*2=2
    * .
    * .
    * .
    * 9*9 = 81
    */
    void printM()
    {
      for (int i = 1; i<=9; i++)
          for (int j = 1; j<=9; j++)
          System.out.println(i+"*"+j+"="+i*j);
    }
    /*if n=5, print
     * *
     * **
     * ***
     * ****
     * *****
     */
    void printT(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
public class Runner 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        Mtable myTable = new Mtable();
        
        myTable.printM();
        
        myTable.printT(7);
    }
}
