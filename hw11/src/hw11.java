/**
 * class: CSC190
 * project: hw11
 * date: 11/20/2013
 * author: Wes Gilleland
 * purpose: This program will take a string, compress the string, and decompress
 * the compressed string
 */

import java.util.Scanner;
class Compress
{
    Scanner in = new Scanner(System.in);
    String plainText;
    String compressedText;
    /*
        Constructor - Set inputs to null strings
    */
    Compress(){
        plainText = "";
        compressedText = "";
    }
    
    void setPlainText(){
        System.out.println("Input plainText (lowercase alphabetic and blank characters only): ");
        plainText = in.nextLine();
        if(plainText == ""){
            System.out.println("plainText cannot be null!");
            setPlainText();
        }
    }
    
    void setCompressedText(){
        System.out.println("Input plainText (lowercase alphabetic and blank characters only): ");
        compressedText = in.nextLine();
        if(plainText == ""){
            System.out.println("compressedText cannot be null!");
            setCompressedText();
        }
    }
    
    void compress()
    {
        int count = 1;
        int i = 1;
        while(i < plainText.length())
        {
            if (plainText.charAt(i-1) == plainText.charAt(i))
            {
                System.out.println(count);
                count++;
            }
            else
            {
                if (count > 2)
                {
                    compressedText += plainText.charAt(i-1);
                    compressedText += count;
                    System.out.println(compressedText);
                }
                else
                {
                    int j=1;
                    while(j <= count)
                    {
                        compressedText += plainText.charAt(i);
                        j++;
                    }
                }
                count = 1;
            }
            i++;
        }
    }
    
    void decompress()
    {
        
    }
    
    void printPlainText()
    {
        System.out.println("plainText = "+plainText);
    }
    
    void printCompressedText()
    {
        System.out.println("compressedText = "+compressedText);
    }
    
    
}
public class hw11 
{
    /*
        Main Loop
    */
    public static void run(){
        boolean running = true;
        int choice = 0;
        Scanner in = new Scanner(System.in);
        Compress compression = new Compress();
        
        while(running){
            /*
                Print Menu
            */
            System.out.println("Select from the following options");
            System.out.println("1. Read plainText");
            System.out.println("2. Read compressedText");
            System.out.println("3. Compress");
            System.out.println("4. Decompress");
            System.out.println("5. Print plainText");
            System.out.println("6. Print compressedText");
            System.out.println("7. quit");
            System.out.println("Enter choice: ");
            choice = in.nextInt();
            
            /*
                Check the choice
            */
            switch (choice){
                case 1:
                    //input plain text
                    compression.setPlainText();
                    break;
                case 2:
                    //input compressedText
                    compression.setCompressedText();
                    break;
                case 3:
                    //compress plainText;
                    compression.compress();
                    break;
                case 4:
                    //decompress compressedText
                    compression.decompress();
                    break;
                case 5:
                    //print plainText
                    compression.printPlainText();
                    break;
                case 6:
                    //print compressedText
                    compression.printCompressedText();
                    break;
                case 7:
                    //quit
                    return;
            }
        }
    }
    public static void main(String[] args) 
    {
        run();
    }
    
}
