/**
 * class: CSC190
 * project: p0903a
 * date: 09/03/2013
 * author: Wes Gilleland
 * purpose: This program...
 */

import java.util.Scanner;

public class Units 
{

    public static void main(String[] args) 
    {        
        Scanner in = new Scanner(System.in);
        
        long bits; //input
        long tb, gb, mb, kb, by, bi; //output
        
        System.out.print("Enter num:");
        bits = in.nextLong();
        
        by = bits/8;
        bi = bits%8;
        kb = by/1024;
        by = by%1024;
        mb = kb/1024;
        kb = kb%1024;
        gb = mb/1024;
        mb = mb%1024;
        tb = gb/1024;
        gb = gb%1024;
        
        System.out.println(tb+','+gb+','+mb+','+kb+','+by+','+bi);
    }
}
