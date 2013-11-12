/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * class: CSC190
 * project: p0822a
 * date: 08/22/2013
 * author: Wes Gilleland
 * purpose: This program shows how arithmetic operators work
 */
public class Arithmetic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        System.out.println(190); 
        System.out.println(7+2); //9
        System.out.println(7-2); //5
        System.out.println(7*2); //14
        System.out.println(7/2); //
        
        System.out.println(7.0+2.0); //9.0
        System.out.println(7.0-2.0); //5.0
        System.out.println(7.0*2.0); //14.0
        System.out.println(7.0/2.0); //3.5
        
        //on / and %(modulo)
        System.out.println(); //print a new line or you could use a newline character "\n"
        System.out.println(7/2); //3 (quotient)
        System.out.println(7%2); //1 (remainder)
        System.out.println(7/-2); //-3
        System.out.println(7%-2); //1 sign of the remainder is same as sign of the dividend (7)
        System.out.println(-7/2); //-3
        System.out.println(-7%2); //-1
        System.out.println(-7/-2); //3
        System.out.println(-7%-2); //-1
        
        System.out.println();
        System.out.println(Math.sqrt(5));
        System.out.println(Math.sqrt(5.0));
        System.out.println(Math.sqrt(-5)); //ERROR! NaN
        System.out.println(Math.pow(5,2));
        System.out.println(Math.pow(5.0, 2.0));
        System.out.println(Math.pow(5,-2));
        System.out.println(Math.pow(-5,2));
        System.out.println(Math.pow(-5,-2));
        
        System.out.println();
        System.out.println(Math.ceil(1.4)); //2 
        System.out.println(Math.ceil(1.5)); //2
        System.out.println(Math.ceil(1.6)); //2
        System.out.println(Math.ceil(1.0)); //1
        System.out.println(Math.floor(1.4)); //1 
        System.out.println(Math.floor(1.5)); //1
        System.out.println(Math.floor(1.6)); //1
        System.out.println(Math.floor(1.0)); //1
        System.out.println(Math.round(1.4)); //1 
        System.out.println(Math.round(1.5)); //2
        System.out.println(Math.round(1.6)); //2
        System.out.println(Math.round(1.0)); //1
        System.out.println(Math.ceil(-1.4)); //-1 
        System.out.println(Math.ceil(-1.5)); //-1
        System.out.println(Math.ceil(-1.6)); //-1
        System.out.println(Math.ceil(-1.0)); //-1
        System.out.println(Math.floor(-1.4)); //-2 
        System.out.println(Math.floor(-1.5)); //-2
        System.out.println(Math.floor(-1.6)); //-2
        System.out.println(Math.floor(-1.0)); //-1
        System.out.println(Math.round(-1.4)); //-1 
        System.out.println(Math.round(-1.5)); //-1
        System.out.println(Math.round(-1.6)); //-2
        System.out.println(Math.round(-1.0)); //-1
        
        System.out.println();
        System.out.println(Math.max(-1,2)); //2
        System.out.println(Math.min(-1,2)); //-1
        //find the largets of 1,2,3
        System.out.println(Math.max(Math.max(1,2),3)); //3
    }
}
