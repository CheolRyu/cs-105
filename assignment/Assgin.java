import java.util.Scanner;
import java.util.Random; // import random first
import java.lang.Math;
public class Assgin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // int i = 0, j = 0, temp = 0;

        // System.out.print("Enter i: ");
        // i = s.nextInt();

        // System.out.print("Enter j: ");
        // j = s.nextInt();

        // temp = i;
        // i = j;
        // j = temp;
        
        // System.out.println("Output: " + "i = " + i + " j = " + j);
        // System.out.println("Output: " + "i = " + i + " j = " + j);
        // System.out.println(f2/y);
        // System.out.println(f3/y);
        // System.out.println(10/3);
        // System.out.println(10.0/3);
        // System.out.printf("%.2f \n", 10.3/3);
// _________________________ end of lecture codes ______________________________________


        int x, y, i;
        y = 1233;
        x = 100;
        double f2 = 0.0;
        double f3 = 2.0;
        int f4, f5;
        f4 = 10/3;
        f5 = 12/6;
        final double GRAVITATIONAL_PULL = 9.8; // assign a constant double value
        final int TAX_RATE = 9; // assign a constant single or int value
        Random ranint = new Random(); // declaring a random number 
        int r = ranint.nextInt(122); // assingning the numbers to be a random number of arg
        System.out.println(r);
        r = ranint.nextInt(100)+1;
        System.out.println(r);
        System.out.println("-----------------Hello------------------");
        char ch = ' ';
        i = (int) 'a';
        System.out.println("ASCII code for "+ i +" is " + i);
        ch = (char) i;
        System.out.println("Char for ASCII code is 79 " + ch);

        // System.out.println("-----------------------------------");
        //     System.out.print("Please enter char: ");
        //     ch = s.next().charAt(1);
        //     System.out.println("ch is "+ ch);

        System.out.println("---------------reading whole line--------------------");
        System.out.print("Enter a line: ");
        String line = s.nextLine();
        System.out.println("The Line is: "+ line);
        System.out.println("---------------end reading whole line--------------------");



        // System.out.println("-----------------LAB ASSGINMENT-------------------");
        // System.out.println("sqrt of " + f3 + " is " + Math.sqrt(f3));
        // System.out.println("Pow of " + f3 +" and "+ f4 + " is " + Math.pow(f3, f4));
        // System.out.println("Maximum number of " + x + " and " + y + " is: " + Math.max(x, y));
        // System.out.println("Square root of " + y + " is: " + Math.sqrt(y));   
        // System.out.println("Power of "+ x +" and "+ y +" is: " + Math.pow(x, y));  
        // System.out.println("log1p of " + x + " is: " + Math.log1p(x));     
        // System.out.println("Logarithm of " + x + " is: " + Math.log(x));     
        // System.out.println("Random number between 0 - 100 is " + r);
        // System.out.println("log10 of x is: " + Math.log10(x));   
        // System.out.println("log10 of y is: " + Math.log10(y));    
        // System.out.println("-------------------END OF LAB ASSIGNMENT-----------------");
 
        // ----------------------------end of lab codes ---------------------------------------
    }
    
}