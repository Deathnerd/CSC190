/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * class: CSC190
 * project: p0827d
 * date: 08/27/2013
 * author: Wes Gilleland
 * purpose: This program reads mid1, mid2, final, hw,
 * lab grades and finds the overall course average
 * hw:   30%
 * lab:  20%
 * mid1: 10%
 * mid2: 15%
 * fi:   25%
 */
import java.util.Scanner;
public class Grade {

    public static void main(String[] args) {
        
        double m1, m2, fi, hw, lab; //inputs
        double avg; //output
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter mid1(0-100): ");
        m1 = in. nextDouble();
        System.out.print("Enter mid2(0-100): ");
        m2 = in. nextDouble();
        System.out.print("Enter final(0-200): ");
        fi = in. nextDouble();
        System.out.print("Enter hw(0-150): ");
        hw = in. nextDouble();
        System.out.print("Enter lab(0-80): ");
        lab = in. nextDouble();
        
        avg = (m1*0.1)+(m2*0.15)+((fi/2)*0.25)+((hw/1.5)*0.3)+((lab/.8)*0.2);
        
        System.out.println("Average= "+avg);
        
    }
}
