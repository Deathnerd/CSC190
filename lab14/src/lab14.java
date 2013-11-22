
/*
 * class: CSC190
 * project: p1107a
 * date: 11/07/13
 * author: Wes Gilleland
 * purpose: This program will take a binary number and be able to increment it by one
 * or/and 
 */

import java.util.Scanner;
class Binary
{
    Binary()
    {
    }
    
    String incrementBinary(String input)
    {
        String binary = "";
        int length = input.length();
        int ones = 0;
        
        if (input=="") //if the string is null, return a 0
            return "0";
        
        /*
            check to see if all the characters are ones
        */
        int i = 0;
        if (input.charAt(0)=='1') //if the first character is a one
        {
            while (i < length) //count the number of ones
            {
                if(input.charAt(i)==1)
                    ones++;
                i++;
            }
            i = 0;
            if (ones == length) //if so, appennd "1"+length number of zeros and return
            {
                while (i < length)
                {
                    binary = binary+0;
                }
                i = 0;
                return 1+binary;
            }
        }
        i = length;
        /*
            main addition
        */
        while(i > 0)
        {
            if (input.charAt(i)=='1')
                binary = 0+binary;
            else if (input.charAt(i)=='0')
            {
                return input.substring(0,i-1)+1+binary;
            }
        }
        
        return "";
    }
    
    void printBinary(int number)
    {
        System.out.println("Blah");
    }
}

public class lab14 {

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
