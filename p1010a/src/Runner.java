/*
 * class: CSC190
 * project: p1010a
 * date: 10/10/2013
 * author: Wes Gilleland
 * purpose: This program
 */

import java.util.Scanner;

class Loop 
{
    void forLoop(){
        //print the following message 10 times
        
        //must initialize the tracking variable outside the loop
        int i;
        
        //i=1 is initializing the beginning number
        //i<=10 is the upper limit
        //i++ increments i by 1 every time the loop runs
        for (i = 1;i<=10 ;i++){
            //print these each time the loop runs
            System.out.println("I love CSC190! ");
            System.out.println("I love CSC191! ");
        }
        
        int sum = 0;
        //1+2+3+4...+100
        for (i = 1; i<=100;i++){
            sum += i; //same as sum = sum +i;
        }
        System.out.println("Sum !100 = "+sum);
        //sum += i;
        //sum -= i;
        //sum *= i;
        //sum /= i;
        //sum %= i;
        //i--; i = i-1;
        
        sum = 0;
        //1^2+2^2+3^2+4^2...+100^2
        for (i = 1; i <= 100; i++){
            sum += i*i;
        }
        System.out.println(sum+"\n");
        
        sum = 0;
        //1+3+5+7...+99
        for (i = 1; i <= 50; i+=2){ //more efficient way. Only adding odds, so only 50 numbers to add. increment by 2 to get all the odds
            sum += i;
        }
        System.out.println(sum+"\n");
        
        double sumD = 0;
        //1/1+1/2+1/3+1/4...+1/100
        for (i = 1; i <= 100; i++){
            sumD += 1.0/i;
        }
        System.out.println(sumD+"\n");
        
        
        sum = 0;
        //Print first 20 squares
        for (i = 1; i <= 20; i++){
            System.out.println(i*i+"\n");
        }
        
        //counting loops
        int cnt = 0;
        for (i = 1; i <= 100; i++)
            cnt++;
        System.out.println(cnt+"\n"); //100
        
        //counting loops
        cnt = 0;
        for (i = 10; i <= 100; i++)
            cnt++;
        System.out.println(cnt+"\n"); //91
        
        //counting loops
        cnt = 0;
        for (i = 100; i <= 100; i++)
            cnt++;
        System.out.println(cnt+"\n"); //1
        
        //counting loops
        cnt = 0;
        for (i = 101; i <= 100; i++)
            cnt++;
        System.out.println(cnt+"\n"); //0
        
        //counting loops
        cnt = 0;
        for (i = 1; i <= 100; i=i+2)
            cnt++;
        System.out.println(cnt+"\n"); //50
        
        //counting loops
        cnt = 0;
        for (i = 100; i >= 1; i--) //counting backwards
            cnt++;
        System.out.println(cnt+"\n"); //100
        
        //counting loops
        cnt = 0;
        for (i = 1; i <= 100; i++) //nested loops
            for (int j = 1; j<=100; j++) //this runs each time the parent loop runs
                cnt++;
        System.out.println(cnt+"\n"); //100
        
        //counting loops
        cnt = 0;
        for (i = 1; i <= 10; i++) //nested loops
            for (int j = 1; j<=i; j++){ //this runs each time the parent loop runs
                System.out.println(i+" "+j);
                cnt++;
            }
        System.out.println(cnt+"\n"); //5050
        
        //counting loops
        cnt = 0;
        for (i = 1; i <= 10; i++) //nested loops
            for (int j = 1; j<=i; j++) //this runs each time the parent loop runs
                for (int k = 1; k<=j; k++){//same here
                    //System.out.println(i+" "+j+" "+k);
                    cnt++;
                }
        System.out.println(cnt+"\n"); //171700
        
        
    }
}

public class Runner 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Loop myLoop = new Loop(); //create new Loop object from the Loop class above
        myLoop.forLoop();
    }
}
