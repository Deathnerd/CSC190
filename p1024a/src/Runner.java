/*
 * class: CSC190
 * project: p1024a
 * date: 10/24/2013
 * author: Wes Gilleland
 * purpose: This program
 */

import java.util.Scanner;
class Calendar {
    //return 1 if year is leap, or 0 otherwise
    public static int getLeap(int year) {
        if (year%4 != 0)
            return 0; //2013 (common)
        if (year%100 != 0)
            return 1; //2012 (leap)
        if (year%400 != 0)
            return 0; //1900 (common)
        return 1; //2000 (leap)
    }
    
    int getDW(int year, int m) {
        int days = 0;
        
        for (int i = 1900; i < year; i++)
        {
            days += 365+getLeap(i);
        }
        
        switch(m) {
            case 1:
                break;
            case 2: 
                days += 31;
                break;
            case 3:
                days += 31+(28+getLeap(year));
                break;
            case 4:
                days += 30+31+(28+getLeap(year));
                break;
            case 5:
                days += 31+30+31+(28+getLeap(year));
                break;
            case 6:
                days += 30+31+30+31+(28+getLeap(year));
                break;
            case 7:
                days += 31+30+31+30+31+(28+getLeap(year));
                break;
            case 8:
                days += 31+31+30+31+30+31+(28+getLeap(year));
                break;
            case 9:
                days += 30+31+31+30+31+30+31+(28+getLeap(year));
                break;
            case 10:
                days += 31+30+31+31+30+31+30+31+(28+getLeap(year));
                break;
            case 11:
                days += 30+31+30+31+31+30+31+30+31+(28+getLeap(year));
                break;
            default:
                days += 31+30+31+30+31+31+30+31+30+31+(28+getLeap(year));
        }
        return ((days+1)%7);
    }
    
    String getName(int month)
    {
        switch (month) {
            case 1: 
                return "January";
            case 2: 
                return "February";
            case 3: 
                return "March";
            case 4: 
                return "April";
            case 5: 
                return "May";
            case 6: 
                return "June";
            case 7: 
                return "July";
            case 8: 
                return "August";
            case 9: 
                return "September";
            case 10: 
                return "October";
            case 11: 
                return "November";
            default: 
                return "December";
        }
    }
    
    int getDays(int month, int year)
    {
        switch (month){
            case 1:
                return 31;
            case 2:
                return 28+getLeap(year);
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            default:
                return 31;      
        }
    }
    
    void printCal(int year, int month){
        int dayOfWeek = getDW(year, month);
        
        System.out.println("    "+getName(month)+", "+year);
        System.out.println(" Su Mo Tu We Th Fr Sa");
        System.out.println("---------------------");
        
        for (int skip = 1; skip <= dayOfWeek; skip++)
        {
            System.out.print("   ");
        }
        
        int count = dayOfWeek;
        
        for (int day = 1; day<= getDays(month, year); day++)
        {
            if (count%7 == 0)
                System.out.println();
            
            System.out.printf("%3d", day);
            count++;
        }
    }
}
public class Runner{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calendar myCal = new Calendar();
        
        int year, month; //input
        
        System.out.print("Enter a year >= 1900: ");
        year = in.nextInt();
        System.out.print("Enter a month (1-12): ");
        month = in.nextInt();
        
        
        myCal.printCal(year,month);
        System.out.println();
    }
}
