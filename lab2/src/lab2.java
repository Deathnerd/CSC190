/**
 * class: CSC190
 * project: lab2
 * date: 08/30/2013
 * author: Wes Gilleland
 * purpose: This program will read two times and add them together
 */
import java.util.Scanner;
public class lab2 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int h1, m1, s1, h2, m2, s2; //(input vars)The first set of hours, minutes, and seconds and second set
        int h3, m3, s3; //Output times
        int s_times, s_to_min; //temp var
        
        System.out.println("Enter h1: ");
        h1=in.nextInt();
        System.out.println("Enter m1: ");
        m1=in.nextInt();
        System.out.println("Enter s1: ");
        s1=in.nextInt();
        System.out.println("Enter h2: ");
        h2=in.nextInt();
        System.out.println("Enter m2: ");
        m2=in.nextInt();
        System.out.println("Enter s2: ");
        s2=in.nextInt();
        
        //calculation
        s3 = (s1+s2)%60; //get total seconds
        m3 = ((m1+m2)%60)+(s1+s2)/60; //get total minutes
        h3 = ((h1+h2)+(m1+m2)/60); //get total hours
        
        System.out.println(h3+":"+m3+":"+s3);
    }
}
