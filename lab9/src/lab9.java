/*
 * class: CSC190
 * project: lab9
 * date: 10/18/2013
 * author: Wes Gilleland
 * purpose: This program will take a string and print out sets of substrings
 */

import java.util.Scanner;
class Substrings 
{
    String s;
    
    void setSubstrings(String str)
    {
        s = str;
    }
    /*
     * If s = "abcd", then print:
     * "a", "ab", "abc", "abcd", "b", "bc", "bcd", "c", "cd", "d"
     */
    void printSub1()
    {
        for (int i = 0; i <= s.length(); i++)
        {
            for (int j = i; j <= s.length(); j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
    
    /*
     * If s = "abcd", then print:
     * "abcd", "bcd", "cd", "d", "abc", "bc", "c", "ab", "b", "a"
     */
    void printSub2()
    {
        for (int i = s.length(); i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.println(s.substring(j,i));
            }
        }
    }
    
    /*
     * If s = "abcd", then print:
     * "a", "b", "c", "d", "ab", "bc", "cd", "abc", "bcd", "abcd"
     */
    void printSub3()
    {
        for (int i = 0; i<s.length(); i++ ) 
        {
            int b = 0;
            for (int j = i+1; j<=s.length(); j++)
            {
                System.out.println(s.substring(b,j));
                b++;
            }
        }
    }
    
    /*
     * If s = "abcd", then print:
     * "abcd", "abc", "bcd", "ab", "bc", "cd", "a", "b", "c", "d"
     */
    void printSub4()
    {
        for (int i = s.length(); i>0; i--)
        {
            int b = 0;
            for (int j = i; j<=s.length(); j++)
            {
                System.out.println(s.substring(b,j));
                b++;
            }
                
        }
    }
}
public class lab9 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        Substrings myS = new Substrings();
        
        System.out.print("Enter a string: ");
        String s = in.next();
        
        myS.setSubstrings(s);
        myS.printSub1();
        System.out.println();
        myS.printSub2();
        System.out.println();
        myS.printSub3();
        System.out.println();
        myS.printSub4();
    }
}
