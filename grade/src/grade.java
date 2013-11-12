/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * class: CSC190
 * project: p0912a
 * date: 09/12/2013
 * author: Wes Gilleland
 * purpose: This program
 */

import java.util.Scanner;
public class grade 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        double avg; //input
        char g; //output
        
        System.out.println("Enter average (0-100): ");
        avg = in.nextDouble();
        
        if (avg >= 90.0) //order of conditionals makes this work
            g = 'A';
        else if (avg >= 80.0)
            g = 'B';
        else if (avg >= 70.0)
            g = 'C';
        else if (avg >= 60.0)
            g = 'D';
        else
            g = 'F';
        
        System.out.println("Grade: "+g);

    }
}
