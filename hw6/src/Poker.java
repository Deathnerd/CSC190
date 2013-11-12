/*
 * class: CSC190
 * project: hw6
 * date: 10/10/2013
 * author: Wes Gilleland
 * purpose: This program will read a poker hand and determine what win condition,
 * if any, the user has
 */

import java.util.Scanner;
class Operations 
{
    int n1, n2, n3, n4, n5; //global variables
    //initialize the variables
    void init(int p1, int p2, int p3, int p4, int p5){
        n1 = p1;
        n2 = p2;
        n3 = p3;
        n4 = p4;
        n5 = p5;
    }
    
    //this sorts the numbers and returns them as a string
    void sort()
    {    
        for (int i = 1; i <=5; i++){
            if (n1 > n2)
            {
                int t = n1;
                n1 = n2;
                n2 = t;
            }
            if (n2 > n3)
            {
                int t = n2;
                n2 = n3;
                n3 = t;
            }
            if (n3 > n4)
            {
                int t = n3;
                n3 = n4;
                n4 = t;
            }
            if (n4 > n5)
            {
                int t = n4;
                n4 = n5;
                n5 = t;
            }
        }
    }
    
    String wins()
    {   
        //Four of a kind = first 4 numbers are equal
        if (n2==n3 && n3==n4 && n4==n5||
            n1==n2 && n2==n3 && n3==n4)
            return "Four of a kind!";
        /* Full house = 3 of 5 numbers equal, 
         * remaining two are equal but different than the first 3
         */
        else if (((n1==n2&&n1==n3)&&n4==n5)||(n1==n2&&(n3==n4&&n3==n5)))
            return "Full House!";
        // Straight = numbers are sequential (2,3,4,5,6)
        else if (n1==n2-1&&n2==n3-1&&n3==n4-1&&n4==n5-1)
            return "Straight!";
        // Three of a kind = only three numbers are equal to each other
        else if ((n1==n2&&n1==n3)||(n2==n3&&n2==n4)||(n3==n4&&n3==n5))
            return "Three of a Kind!";
        // Two pair = like a full house, but only two sets of two
        else if ((n1==n2&&n3==n4)||(n1==n2&&n4==n5)||(n1==n2&&n4==n5))
            return "Two Pair!";
        // One pair = like above, but only one set
        else if (n1==n2||n2==n3||n3==n4||n4==n5)
            return "One Pair!";
        // High card = no two cards are equal
        return "High Card!";
    }
}

public class Poker 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Operations ops = new Operations();
        
        int card1, card2, card3, card4, card5; //input
        
        System.out.print("Enter the first card (1-13): ");
        card1 = in.nextInt();
        System.out.print("Enter the second card (1-13): ");
        card2 = in.nextInt();
        System.out.print("Enter the third card (1-13): ");
        card3 = in.nextInt();
        System.out.print("Enter the fourth card (1-13): ");
        card4 = in.nextInt();
        System.out.print("Enter the fifth card (1-13): ");
        card5 = in.nextInt();
        
        ops.init(card1, card2, card3, card4, card5); //initialize the variables in the class
        ops.sort(); //sort them
        System.out.println(ops.wins()); //determine the win condition
    }
}
