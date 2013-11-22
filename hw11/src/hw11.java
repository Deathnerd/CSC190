/**
 * class: CSC190
 * project: hw11
 * date: 11/20/2013
 * author: Wes Gilleland
 * purpose: This program will take a string, compress the string, and decompress
 * the compressed string as well as print out both the compressed and decompressed
 * string
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
        System.out.print("Input plainText (lowercase alphabetic and blank characters only): ");
        plainText = in.next();
        if(plainText == ""){ //check for null input
            System.out.println("plainText cannot be null!");
            setPlainText();
        }
    }
    
    void setCompressedText(){
        System.out.print("Input compressedText (lowercase alphanumeric and blank characters only): ");
        compressedText = in.next();
        if(compressedText == ""){ //check for null input
            System.out.println("compressedText cannot be null!");
            setCompressedText();
        }
    }
    
    void compress()
    {
        if (plainText == ""){
            System.out.println("plainText cannot be null!");
            return;
        }
        compressedText = ""; //reset compressedText
        int count = 1;
        int i = 1;
        while(i < plainText.length()) //iterate through the compressedText
        {
            /*
                if two consecutive letters are the same, then increment the count
            */
            if (plainText.charAt(i-1) == plainText.charAt(i))
            {
                count++;
            }
            else
            {
                /*
                    if we have more than two consecutive characters that are the same,
                    then append that character plus count
                */
                if (count > 2)
                {
                    compressedText += plainText.charAt(i-1);
                    compressedText += count;
                }
                else
                {
                    /*
                        if there's two or less consecutive characters, then append 
                        count number of that character
                    */
                    int j=1;
                    while(j <= count)
                    {
                        compressedText += plainText.charAt(i-1);
                        j++;
                    }
                }
                count = 1; //reset count for next loop
            }
            /*
                this block is for the last chunk of characters
                Ex: plaintext = "aaabbcddaaa"
                this takes care of the last "aaa"
            */
            if (count > 2 && i == plainText.length()-1)
            {
                compressedText += plainText.charAt(i-1);
                compressedText += count;
            }
            else if (i == plainText.length()-1)
            {
                int j=1;
                while(j <= count)
                {
                    compressedText += plainText.charAt(i-1);
                    j++;
                }
            }
            i++;
        }
    }
    
    /*
        Decompress Method - Only works with strings with single digit integers
    */
    void decompress()
    {
        plainText = ""; //reset plainText
        if (compressedText == "")
        {
            System.out.println("compressedText cannot be null!");
            return;
        }
        int i = 1;
        while(i < compressedText.length()) //iterate through compressedText
        {
            if ((compressedText.charAt(i)-'0') <= 9) //if the character is a number
            {
                /*
                    then append the character to plainText that many times
                */
                int num = compressedText.charAt(i)-'0';
                int j = 1;
                while(j<=num)
                {
                    plainText += compressedText.charAt(i-1);
                    j++;
                }
                i += 2; //skip over comparing the number again
                
                if (i > compressedText.length()) //if we've done the last comparison (infinite loop check)
                    return;
            }
            if (compressedText.charAt(i) == compressedText.charAt(i-1)) //check if the next selection is a pair
            {
                //then add the pair to plainText
                plainText += compressedText.charAt(i);
                plainText += compressedText.charAt(i);
                i += 2; //skip over the pair for next comparison
            }
            else if (compressedText.charAt(i)-'0' > 9) //if it's not a pair and the last character is not a number
            {
                plainText += compressedText.charAt(i-1);
                i++;
            }
        }
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
            System.out.println("7. Quit");
            System.out.print("Enter choice: ");
            choice = in.nextInt();
            System.out.println();
            
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
                default:
                    System.out.println("Invalid selection! \n");
                    break;
            }
        }
    }
    public static void main(String[] args) 
    {
        run();
    }
    
}
