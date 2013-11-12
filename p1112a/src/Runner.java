/*
 * class: CSC190
 * project: p1112a
 * date: 11/12/13
 * author: Wes Gilleland
 * purpose: This program 
 */
import java.util.Scanner;
public class Runner 
{
    //check if s is a palindrome, ignoring all blanks
    static boolean isPalindrome2(String s){
        int b = 0, e = s.length()-1;
        while(b < e){
            if (s.charAt(b)== ' ')
            {
                b++;
                continue; //go to next iteration
            }
            if (s.charAt(e)== ' ')
            {
                e--;
                continue; //go to next iteration
            }
            if (s.charAt(b)!= s.charAt(e))
                return false;
        }
        
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
    }
}
