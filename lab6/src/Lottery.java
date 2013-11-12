/*
 * class: CSC190
 * project: lab7
 * date: 10/05/2013
 * author: Wes Gilleland
 * purpose: This program will generate a lottery draw and determine what prize
 * the user won
 */

//import java.util.Scanner;
import java.util.Random;
public class Lottery 
{
 

    public static String generateGuess(){
        Random random = new Random();
        
        String numbers = ""; //returned variable
        int temp; //temporary holding variable
        
        //generate the numbers
        temp = random.nextInt(10);
        temp = (temp*10)+random.nextInt(10);
        temp = (temp*10)+random.nextInt(10);
        temp = (temp*10)+random.nextInt(10);
        temp = (temp*10)+random.nextInt(10);
        
        numbers = numbers+temp;
        
        return numbers;
    }
    
    public static String generateDraw(){
        Random random = new Random();
        
        String numbers = ""; //returned variable
        int temp; //temporary holding variable
        
        //generate the numbers
        temp = random.nextInt(10);
        temp = (temp*10)+random.nextInt(10);
        temp = (temp*10)+random.nextInt(10);
        temp = (temp*10)+random.nextInt(10);
        temp = (temp*10)+random.nextInt(10);
        
        numbers = numbers+temp;
        
        return numbers;
    }
    
    public static String compare(String draw, String guess){
        String result = "You did not win";
        
        //first prize check
        if (draw.equals(guess))
            return "You won first prize!";
        //second prize check
        //else if (draw.indexOf)
        
        return "";
    }
    public static void main(String[] args) 
    {
        System.out.println(generateGuess());
    }
}
