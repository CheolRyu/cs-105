import java.util.*;
import java.lang.*;
public class lecture_20200923 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        /* Chapter 4 Lecture  */

        //counting down from 10
        /* how to start a while loop */
        int j, i, r, sum, factor, n1, n2, count;
        String wordinput;
        // j = ++i;
        // System.out.println("i = " + i);
        // System.out.println("j = " + j);
        // while (i > 0 ) { /* how to end an while loop*/
        //     System.out.println(i);
        //     System.out.println(j);
        //     i--; /* what to repeat  in while loop*/
        //     j = ++i;
        //     /* i++; */
        //     /* ++i; */
        //     /* i--; */
        //     /* --i; */
        // }
        // int i = 11;
        // while (i > 1 ){
        //     i--; /* order statement is very important */
        //     System.out.println(i);
        // }

        // int i = 11;
        // while (i > 1 ){ /* Infinite roop dont runout */
        //     i--; /* order statement is very important */
        // }


        /* Labs */

        /*-----------------------------------------------------------*/
        // int num = 13;

        // while (num <= 113) {
        //     if (num % 3 == 0) {
        //         System.out.println("Odd numbers are: " + num);
        //     }
        //     num++;
        // }

        /*-----------------------------------------------------------*/
        // i = 0;
        // System.out.println("Printing random numbers");

        // while(i <= 10) {
        //     // r = rand.nextInt(100); /* "Random" num. between 0-99 */
        //     r = rand.nextInt(10)+1; /* "Random" num. between 1-10 */
        //     System.out.println(r);
        //     i++;
        // }

        /*------------------------Sum-----------------------------------*/
        // i = 0;
        // sum = 0;
        // while(i <= 10 ) {
        //     sum += i;
        //     i++;
        // }
        // System.out.println("Sum is: " + sum);
        /*-----------------------Factorial------------------------------------*/
        // i = 1;
        // factor = 1;
        // while (i <= 10) {
        //     factor *= i;
        //     i++;
        // }
        // System.out.println("factor is: " + factor);
        /*-------------------------GCD----------------------------------*/
        
        // System.out.print("Please enter first num: ");
        // n1 = scanner.nextInt();

        // System.out.print("Please enter second num: ");
        // n2 = scanner.nextInt();

        // while(n1 != n2) {
        //     if(n2 > n1) {
        //         n2 -= n1;
        //     } else {
        //         n1 -= n2;
        //     }
        // }
        // System.out.println("GCD is: " + n1);

        /*-----------------------------------------------------------*/

        // i = 11;
        // while(i > 0 ) {
        //     i--;
        //     // if ( i == 5 ) {
        //     //     break;
        //     // }
        //     if ( i == 5 ) { /* Ignore argument "5" and go to the next iteration */
        //         continue; 
        //     }
        //     System.out.println(i);
        // }

        /*-----------------------------------------------------------*/

        // for (i = 0; i <=10; i++){ /* init condition, end codition, modification */
        //     System.out.println(i);
        // }

        /*------------------------Odd numbers-----------------------------------*/
        
        // for (i = 13; i <= 111; i++) {
        //     if(i % 2 != 0) {
        //         System.out.println("Odd numbers are: " + i);
        //     }
        // }

        /*----------------------------Summation-------------------------------*/
        // sum = 0;
        // for (i = 0; i <= 10; i++) {
        //     sum += i;
        // }
        // System.out.println("Sum is: " + sum);
        /*----------------------------Factorial-------------------------------*/
        // factor = 1;
        // for(i = 1; i <= 3; i++) {
        //     factor *= i;
        // }
        // System.out.println("Factor is: " + factor);

        /*----------------------------Random numbers-------------------------------*/
        // System.out.println("Printing random numbers!");
        // for(i = 10; i>=0; i--){
        //     r = rand.nextInt(10)+1; /* "Random" num. between 1-10 */
        //     System.out.println(r);
        // }
    }
}