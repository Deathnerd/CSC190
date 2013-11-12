/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * class: CSC190
 * project: p0822b
 * date: 08/22/2013
 * author: Wes Gilleland
 * purpose: This program shows how input operators work
 */
import java.util.Scanner; //import the scanner library for input operations
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        if (args.length < 1) {
//            System.out.println("Need some args, matey!");
//        }
//        else {
//            for (String s: args){
//                System.out.println(s);
//            }
//        }
        Scanner in = new Scanner(System.in);
        
        int n1, n2;
        double d1, d2;
        
        System.out.println("Enter n1:");
        n1 = in.nextInt(); //to read an integer from the keyboard
        System.out.println("Enter n2:");
        n2 = in.nextInt();
        
        System.out.println(n1+n2);
        System.out.println(n1-n2);
        System.out.println(n1*n2);
        System.out.println(n1/n2);
        System.out.println(n1%n2);
        
        System.out.println("Enter d1:");
        d1 = in.nextDouble(); //to read a double from the keyboard
        System.out.println("Enter d2:");
        d2 = in.nextDouble();
        
        System.out.println(d1+d2);
        System.out.println(d1-d2);
        System.out.println(d1*d2);
        System.out.println(d1/d2);
    }
}
