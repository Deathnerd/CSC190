/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * class: CSC190
 * project: p0827a
 * date: 08/27/2013
 * author: Wes Gilleland
 * purpose: This program 
 */

import java.util.Scanner;
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("CSC");
        System.out.println("CSC190");
        System.out.println(190); //output = int 190
        System.out.println("CSC"+"190"); //Will concatenate into 'CSC190'
        System.out.println("CSC"+190); //convert 190 integer into string
        System.out.println(190+"CSC"); //convert and concatenate 190 into string output = '190CSC'
        System.out.println("CSC"+190+191); //output = 'CSC190191'
        System.out.println(190+"CSC"+191); //output = '190CSC191'
        System.out.println(190+191+"CSC"); //output = '381CSC'
    }
}
