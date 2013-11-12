/**
 * class: CSC190
 * project: lab12
 * date: 11/08/2013
 * author: Wes Gilleland
 * purpose: This program will play a random number guessing game
 */
import java.util.Scanner;
import java.util.Random;

class NumberGuessing
{
    int secret;
     void setSecret(int n)
     {
         //generate a positive integer <= n
         Random random = new Random();
         secret = random.nextInt(n)+1;
     }
     
     void play() 
     {
         Scanner in = new Scanner(System.in);
         int playCounter = 1;
         int guess = 0;
         
         while (playCounter <= 10)
         {
             System.out.println("Enter a guess: ");
             guess = in.nextInt();
             if (guess < secret)
                 System.out.println("You're too low!");
             else if (guess > secret)
                 System.out.println("You're too high!");
             else
             {
                 System.out.println("Congratulations! You won the game! You got it in "+playCounter+" tries!");
                 return;
             }
             playCounter++;
         }
         System.out.println("Sorry, you lost the game! The answer should be "+secret);
     }
}
public class lab12 
{    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        NumberGuessing myGame = new NumberGuessing();
        
        System.out.print("Enter n (0 or a negative number to quit): ");
        int n = in.nextInt();
        
        while (n > 1)
        {
            myGame.setSecret(n);
            myGame.play();
            
            System.out.print("Enter n(0 or a negative number to quit): ");
            n = in.nextInt();
        }
        
    }
    
}
