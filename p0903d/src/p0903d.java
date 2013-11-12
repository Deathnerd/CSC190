/**
 * class: CSC190
 * project: p0903c
 * date: 09/03/2013
 * author: Wes Gilleland
 * purpose: This program...
 */
import java.util.Scanner;

public class p0903d 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
//        int mAge; //input
//        int wAge; //output
//        
//        System.out.print("Input the man's age: ");
//        mAge = in.nextInt();
//        wAge = (mAge/2)+7;
//        System.out.println("Ideal age of his wife: "+wAge);
//        
//        double weight, height; //input
//        int bmi; //output
//        
//        System.out.print("Input weight: ");
//        weight = in.nextDouble();
//        System.out.print("Input height in inches: ");
//        height = in.nextDouble();
//        
//        bmi = (int)Math.round(703*weight/(height*height));
//        System.out.println("BMI = "+bmi);
        
//        int weight; 
//        float firstOunce, restOunces, cost;
//        
//        System.out.print("Input the weight of the package in ounces: ");
//        weight = (int)Math.ceil(in.nextFloat());
//        
//        firstOunce = 25;
//        restOunces = Math.abs((weight-1)*55);
//        cost = firstOunce+restOunces;
//        
//        System.out.println("First Ounce: "+firstOunce);
//        System.out.println("Rest Ounces: "+restOunces);
//        System.out.println("Total cost (in cents): "+cost);
        
//          float input; //input
//          int dollars, cents;
//          
//          System.out.print("Input amount: ");
//          input = in.nextFloat();
//          
//          dollars = (int)input/1;
//          cents = (int)(input*100)%100;
//          
//          System.out.println(dollars+" Dollars and "+cents+" cents");
        
            double input;
            int dollars, quarters, dimes, nickels, pennies, total, iAmount;
            
            System.out.print("Input amount: ");
            input = in.nextDouble();
            iAmount = (int)(input*100);
            
            dollars = iAmount/100; //get dollars
            iAmount = iAmount%100;
            quarters = iAmount/25; //get quarters
            iAmount = iAmount%25;
            dimes = iAmount/10; //get dimes
            iAmount = iAmount%10;
            nickels = iAmount/5; //get nickels
            pennies = iAmount%5;
            
            total = dollars+quarters+dimes+nickels+pennies;
            
            System.out.println("Dollars: "+dollars);
            System.out.println("Quarters: "+quarters);
            System.out.println("Dimes: "+dimes);
            System.out.println("Nickels: "+nickels);
            System.out.println("Pennies: "+pennies);
            System.out.println("Total : "+total);
            
          
          
          
    }
}
