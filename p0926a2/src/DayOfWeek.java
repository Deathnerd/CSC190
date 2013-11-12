/*
 * class: CSC190
 * project: p0926a
 * date: 09/26/2013
 * author: Wes Gilleland
 * purpose: This program
 */

import java.util.Scanner;
public class DayOfWeek {
    //return 1 if y is leap, or 0 otherwise
    public static int getLeap(int y) {
        if (y%4 != 0)
            return 0; //2013 (common)
        if (y%100 != 0)
            return 1; //2012 (leap)
        if (y%400 != 0)
            return 0; //1900 (common)
        return 1; //2000 (leap)
    }
    
    public static String getDW(int y, int m, int d) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter dw of Jan. 1st, "+y+" (0 for Sen, 1 for "
                + "Mon, ...6 Sat):");
        int dw1 = in.nextInt(); //output-
        int days;
        
        switch(m) {
            case 1:
                days = d-1;
                break;
            case 2: 
                days = 31+d-1;
                break;
            case 3:
                days = 31+(28+getLeap(y))+d-1;
                break;
            case 4:
                days = 30+31+(28+getLeap(y))+d-1;
                break;
            case 5:
                days = 31+30+31+(28+getLeap(y))+d-1;
                break;
            case 6:
                days = 30+31+30+31+(28+getLeap(y))+d-1;
                break;
            case 7:
                days = 31+30+31+30+31+(28+getLeap(y))+d-1;
                break;
            case 8:
                days = 31+31+30+31+30+31+(28+getLeap(y))+d-1;
                break;
            case 9:
                days = 30+31+31+30+31+30+31+(28+getLeap(y))+d-1;
                break;
            case 10:
                days = 31+30+31+31+30+31+30+31+(28+getLeap(y))+d-1;
                break;
            case 11:
                days = 30+31+30+31+31+30+31+30+31+(28+getLeap(y))+d-1;
                break;
            default:
                days = 31+30+31+30+31+31+30+31+30+31+(28+getLeap(y))+d-1;
        }
        
        switch ((days+dw1)%7) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            default:
                return "Saturday";
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int year, month, day; //input
        String dw; //output
        
        System.out.print("Enter a year >= 1900: ");
        year = in.nextInt();
        System.out.print("Enter a month (1-12): ");
        month = in.nextInt();
        System.out.print("Enter a day: ");
        day = in.nextInt();
        
        System.out.println("It is "+getDW(year,month,day)+".");
    }
}
