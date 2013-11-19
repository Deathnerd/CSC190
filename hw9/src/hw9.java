/*
 * class: CSC190
 * project: hw9
 * date: 10/29/13
 * author: Wes Gilleland
 * purpose: This program will take two strings. It will find if the second string 
 * resides in the first and the position where it resides at
 */

import java.util.Scanner;
public class hw9 
{
    static int find(String s1, String s2)
    {
        for (int b = 0; b < s1.length()-s2.length(); b++)
        {
            boolean found = true;
            for (int i = 0; i < s2.length(); i++)
            {
                if (s1.charAt(b+i)!= s2.charAt(i))
                {
                    found = false;
                    break;
                }
            }
            if (found)
            {
                return b;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) 
    {
        
    }
}
