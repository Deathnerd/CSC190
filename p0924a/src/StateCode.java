/**
 * class: CSC190
 * project: p0924a
 * date: 09/24/2013
 * author: Wes Gilleland
 * purpose: This program
 */

import java.util.Scanner;
public class StateCode 
{
    public static String getName(String code) 
    {
        code = code.toUpperCase();
        switch(code.charAt(0))
        {
            case 'A':
                switch(code.charAt(1)){
                    case 'K':
                        return "Alaska";
                    case 'L':
                        return "Alabama";
                    case 'R':
                        return "Arkansas";
                    case 'Z':
                        return "Arizona";
                    default:
                        return "Invalid code!";
                }
            case 'C':
                switch(code.charAt(1)){
                    case 'A':
                        return "California";
                    case 'O':
                        return "Colorado";
                    case 'T':
                        return "Connecticut";
                    default:
                        return "Invalid code!";
                }
            case 'D':
                switch(code.charAt(1)){
                    case 'E':
                        return "Delaware";
                    default:
                        return "Invalid code!";
                }
                
            default:
                return "Invalid code!";
        }
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        String code; //input
        String name; //output
        
        System.out.print("Enter a state code(KY): ");
        code = in.next();
        
        System.out.println(getName(code));
    }
}
