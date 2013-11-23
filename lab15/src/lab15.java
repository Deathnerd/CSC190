
/*
 * class: CSC190
 * project: p1107a
 * date: 11/07/13
 * author: Wes Gilleland
 * purpose: This program will take a binary number and be able to increment it by one
 * or/and print out all permutations of a binary number n times, where n is a positive integer
 */

import java.util.Scanner;
class Binary
{
    Binary()
    {
    }
    
    String incrementBinary(String input) {
        
        String binary = "";
        int length = input.length();
        
        if (input=="") //if the string is null, return a 0
            return "0";
        
        /*
            check to see if all the characters are ones
        */
        int i = 0;
        if (input.charAt(0)=='1') { //if the first character is a one
            while (i < length) { //count the number of ones
                if(input.charAt(i)!='1') {
                    break;
                }
                i++;
            }
            if (i == length){ //if so, appennd "1"+length number of zeros and return
                int j = 0;
                while (j < length) {
                    binary = binary+0;
                    j++;
                }
                return 1+binary;
            }
        }
        else if (input.charAt(0)=='0')
            return "1";
        
        /*
            main addition
        */
        i = length-1;
        while (i >= 0) {
            if (input.charAt(i)=='0') {
                return input.substring(0,i)+"1"+binary;
            }
            binary = "0" + binary;
            i--;
        }
        
        if (binary.length() < input.length())
            binary = binary + "0";
        
        if (binary.charAt(0)=='0')
            return "1" + binary;
        
        return binary;
    }
    
    
    void printBinary(int number)
    {
        Binary binary = new Binary();
        String temp = "0";
        String line = "";
        
        if (number == 0) //if the number entered is 0, then we only print 0
        {
            System.out.println("0");
            return;
        }
        
        //first number
        line = 0+", ";
        
        int i = 1;
        while (i <= number)
        {
            temp = binary.incrementBinary(temp);
            i++;
            line += temp+", ";
        }
        int length = line.length();
        System.out.println(line.substring(0, length-2));
    }
}

public class lab15 {

    /*
        Main Loop
    */
    public static void run(){
        boolean running = true;
        int choice = 0;
        Scanner in = new Scanner(System.in);
        Binary binary = new Binary();
        while(running){
            /*
                Print Menu
            */
            System.out.println("Select from the following options");
            System.out.println("1. Increase binary");
            System.out.println("2. Print binary");
            System.out.println("0. Quit");
            System.out.print("Enter choice: ");
            choice = in.nextInt();
            System.out.println();
            
            /*
                Check the choice
            */
            switch (choice){
                case 1:
                    System.out.print("Enter a binary string: ");
                    String b = in.next();
                    System.out.println(b+" + 1 = "+binary.incrementBinary(b));
                    break;
                case 2:
                    System.out.print("Enter an integer: ");
                    int n = in.nextInt();
                    binary.printBinary(n);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid selection! \n");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        run();
    }
    
}
