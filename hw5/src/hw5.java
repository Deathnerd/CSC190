/**
 * class: CSC190
 * project: hw5
 * date: 09/24/2013
 * author: Wes Gilleland
 * purpose: This program will take a string up to 8 characters in length and 
 * determine if it is a palindrome
 */

import java.util.Scanner;
public class hw5 
{
    public static String palindrome_check(String input)
    {   
        input = input.toLowerCase();
        
        /* 
         * The following if will check, in order starting at 2, the length of the 
         * string and then do the appropriate comparisons of each letter
         */
        if ((input.length() == 1)||
            (input.length() == 2) && (input.charAt(0) == input.charAt(1)) ||
            (input.length() == 3) && (input.charAt(0) == input.charAt(2)) ||
            (input.length() == 4) && (input.charAt(0) == input.charAt(3)) && (input.charAt(1) == input.charAt(2)) ||
            (input.length() == 5) && (input.charAt(0) == input.charAt(4)) && (input.charAt(1) == input.charAt(3)) ||
            (input.length() == 6) && (input.charAt(0) == input.charAt(5)) && (input.charAt(1) == input.charAt(4)) && (input.charAt(2) == input.charAt(3)) ||
            (input.length() == 7) && (input.charAt(0) == input.charAt(6)) && (input.charAt(1) == input.charAt(5)) && (input.charAt(2) == input.charAt(4)) ||
            (input.length() == 8) && (input.charAt(0) == input.charAt(7)) && (input.charAt(1) == input.charAt(6)) && (input.charAt(2) == input.charAt(5)) && (input.charAt(3) == input.charAt(4)))
            return "The string is a palindrome";
        
        return "The string not palindrome";
    }
    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        String input; //input string
        
        System.out.print("Type in a string of 8 characters or less: ");
        input = in.next();
        
        System.out.println(palindrome_check(input));
    }
}
