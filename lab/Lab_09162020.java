package lab;
import java.util.*;
import java.lang.*;
import java.math.BigDecimal;
public class Lab_09162020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0, j = 0;
        double f1 = 0.9, f2 = 0.3, f3 = 0.6;
        String s1,s2, message = " ";

        // String letter_grade = " ";
        // System.out.print("Please enter i: ");
        // System.out.print("Please enter your letter grade: ");
        // i = scanner.nextInt();
        // letter_grade = scanner.nextLine();
        // switch(letter_grade) { // there are restriction to it, string, intiger, 
        //     case "A": case "a": // it has to be a constant like b or 5
        //         message = "Your score is greater than 90";
        //         break;
        //     case "B": case "b":
        //         message = "Your score is greater or equal to 80";
        //         break;
        //     case "C": case "c":
        //         message = "our score is greater or equal to 70";
        //         break;
        //     case "D": case "d":
        //         message = "our score is greater or equal to 60";
        //         break;
        //     default:
        //         System.out.println("Your grade is less than 60");
        // }
        // System.out.println(message);
        //-------------------------------------------//

        // if(i > 0) {
        //     j = 100;
        // }
        // else {
        //     j = 200;
        // }
        //---------------------------------------------//
        //conditional expression; condition ? expWhenTrue : expressFalseWhenFalse. ?: 
        // j = (i>0) ? 100 :200;
        // System.out.println("i = " + i + " j = " + j);

        /* --------------------------------------------- */

        // if(f1 == f2+f3) {
        //     System.out.println("Equal");
        // } else {
        //     System.out.println("Not Equal");
        // }

        // if (Math.abs(f1-(f2+f3)) < 0.0001) {
        //     System.out.println("Equal");
        // } else {
        //     System.out.println("Not Equal");
        // }
        // System.out.println("f1 is   " + new BigDecimal(f1));
        // System.out.println("f2+f3 is   " + new BigDecimal(f2+f3));

        //------------------------------------------------//

        /* string comparedTo, charAt, length, concat */
        // s1 = "abc";
        // s2 = "abd";

        // if (s1.compareTo(s2) < 0) {
        //     System.out.println(s1 + " is smaller than " +s2);
        // }
        // System.out.println(s1.charAt(1));
        // System.out.println(s1.length());
        // System.out.println(s1.concat(s2));

        /* char isLetter, isDigit, isWhiteSpace, toUpperCase, toLowerCase */

        System.out.print("Please enter a letter: ");
        message = scanner.nextLine();
        System.out.println(message);
        
        if (Character.isLetter(message.charAt(0))) {
            System.out.println(message.charAt(0) + "  is a letter.");
        }
        if (Character.isDigit(message.charAt(1))) {
            System.out.println(message.charAt(1) + "  is a digit.");
        }
        if (Character.isWhitespace(message.charAt(2))) {
            System.out.println("\"" + message.charAt(2) + "\"" + " is a space.");
        }

        System.out.println("Change " + message.charAt(3) + " to Upper case " + Character.toUpperCase(message.charAt(3)));
        System.out.println("Change " + message.charAt(4) + " to lower case " + Character.toLowerCase(message.charAt(4)));
    }
}
