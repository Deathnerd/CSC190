/*
 * class: CSC190
 * project: p1107a
 * date: 11/07/13
 * author: Wes Gilleland
 * purpose: This program 
 */
import java.util.Scanner;
class Binary {
    //convert from decimal to binary
    String decimalToBinary(int n)
    {
        String binary = "";
        while(n>0)
        {
            binary = n%2 + binary;
            n /= 2;
        }
        
        return binary;
    }
    
    //convert from binary to decimal
    int binaryToDecimal(String binary)
    {
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++)
        {
            decimal = decimal*2 + (binary.charAt(i)-'0');
        }
        return decimal;
    }
    
    String addBinary(String b1, String b2)
    {
        String b = "";
        int c = 0;
        int i1 = b1.length()-1;
        int i2 = b2.length()-1;
        
        while(i1 >= 0 && i2 >= 0)
        {
            int sum = (b1.charAt(i1)-'0')+(b2.charAt(i2)-'0')+c;
            c = sum/2;
            b = sum%2 + b;
            i1--;
            i2--;
        }
        while(i1 >=0)
        {
            int sum = (b1.charAt(i1)-'0')+c;
            c = sum/2;
            b = sum%2 + b;
            i1--;
        }
        while(i2 >= 0)
        {
            int sum = (b2.charAt(i2)-'0')+c;
            c = sum/2;
            b = sum%2 + b;
            i2--;
        }
        
        if (c > 0) //carry last bit
            b = c+b;
        return b;
    }
    
}
public class Runner 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        Binary bin = new Binary();
        //repeated input using a separate check
        String resume, binary, binary1, binary2;
        int n;
        do 
        {
            //menu
            System.out.println("1 - Decimal to Binary");
            System.out.println("2 - Binary to Decimal");
            System.out.println("3 - Add Binary");
            System.out.println("4 - Mulitiply Binary");
            System.out.println("x - Exit");
            System.out.print("Choice: ");
            
            resume = in.next();
            
            //switch block to check input
            switch (resume.charAt(0))
            {
                case '1':
                    System.out.print("Enter n: ");
                    n = in.nextInt();
                    System.out.println(n+" = "+bin.decimalToBinary(n));
                    break;
                    
                case '2':
                    System.out.print("Enter b: ");
                    binary = in.next();
                    System.out.println(binary+" = "+bin.binaryToDecimal(binary));
                    break;
                case '3':
                    System.out.print("Enter b1: ");
                    binary1 = in.next();
                    System.out.print("Enter b2: ");
                    binary2 = in.next();
                    System.out.println(bin.addBinary(binary1,binary2));
                    break;
//                case '4':
//                    System.out.print("Enter b1: ");
//                    binary1 = in.next();
//                    System.out.print("Enter b2: ");
//                    binary2 = in.next();
//                    System.out.println(bin.multiplyBinary(binary1,binary2));
//                    break;
                    
                case 'x': case 'X':
                    System.out.println("Buh-bye!");
                    break;
                default:
                    System.out.println("Invalid input!");
            }
            
//            System.out.print("Would you like to continue? (y, Y)");
//            resume = in.next();
        } while(resume.charAt(0) != 'x' && resume.charAt(0) != 'X');
    }
    
}
