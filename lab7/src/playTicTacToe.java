/*
 * class: CSC190
 * project: lab7
 * date: 10/01/2013
 * author: Wes Gilleland
 * purpose: This program
 */

//import java.util.Scanner;
import java.util.Random;
public class playTicTacToe 
{
    
    public static void play(){
        Random random = new Random(); //create new Random object to generate random numbers
        char b11, b12, b13,
             b21, b22, b23,
             b31, b32, b33;
        int n;
        
        //the following if blocks "place" the an X, O, or nothing on each space
        n = random.nextInt(3);
        if (n==0)
            b11 = 'O';
        else if (n==1)
            b11 = 'X';
        else
            b11 = ' ';
        
        n = random.nextInt(3);
        if (n==0)
            b12 = 'O';
        else if (n==1)
            b12 = 'X';
        else
            b12 = ' ';
        
        n = random.nextInt(3);
        if (n==0)
            b13 = 'O';
        else if (n==1)
            b13 = 'X';
        else
            b13 = ' ';
        
        n = random.nextInt(3);
        if (n==0)
            b21 = 'O';
        else if (n==1)
            b21 = 'X';
        else
            b21 = ' ';
        
        n = random.nextInt(3);
        if (n==0)
            b22 = 'O';
        else if (n==1)
            b22 = 'X';
        else
            b22 = ' ';
        
        n = random.nextInt(3);
        if (n==0)
            b23 = 'O';
        else if (n==1)
            b23 = 'X';
        else
            b23 = ' ';
        
        n = random.nextInt(3);
        if (n==0)
            b31 = 'O';
        else if (n==1)
            b31 = 'X';
        else
            b31 = ' ';
        
        n = random.nextInt(3);
        if (n==0)
            b32 = 'O';
        else if (n==1)
            b32 = 'X';
        else
            b32 = ' ';
        
        n = random.nextInt(3);
        if (n==0)
            b33 = 'O';
        else if (n==1)
            b33 = 'X';
        else
            b33 = ' ';
        
                        //check X vertical win 
        boolean xWin = ((b11=='X' && b21=='X' && b31=='X') || 
                        (b12=='X' && b22=='X' && b32=='X') || 
                        (b13=='X' && b23=='X' && b33=='X')) ||
                        //check o horizontal win
                       ((b11=='X' && b12=='X' && b13=='X') || 
                        (b21=='X' && b22=='X' && b23=='X') || 
                        (b31=='X' && b32=='X' && b33=='X'))||
                        //check O diagonal win
                       ((b11=='X' && b22=='X' && b33=='X') || 
                        (b13=='X' && b22=='X' && b31=='X'));
        
                        //check O vertical win
        boolean oWin = ((b11=='O' && b21=='O' && b31=='O') || 
                        (b12=='O' && b22=='O' && b32=='O') || 
                        (b13=='O' && b23=='O' && b33=='O')) ||
                        //check O horizontal win
                       ((b11=='O' && b12=='O' && b13=='O') || 
                        (b21=='O' && b22=='O' && b23=='O') || 
                        (b31=='O' && b32=='O' && b33=='O')) ||
                        //check O diagonal win
                       ((b11=='O' && b22=='O' && b33=='O') || 
                        (b13=='O' && b22=='O' && b31=='O'));
        
        //print the board
        System.out.println(b11+"|"+b12+"|"+b13);
        System.out.println(b21+"|"+b22+"|"+b23);
        System.out.println(b31+"|"+b32+"|"+b33);
        
        //check win condition
        if (oWin && xWin)
            System.out.println("\nBoth win!");
        else if (oWin)
            System.out.println("\nO wins!");
        else if (xWin)
            System.out.println("\nX wins!");
        else
            System.out.println("\nNobody wins. Play again");
    }

    public static void main(String[] args) 
    {
        play();
    }
}
