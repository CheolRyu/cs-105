import java.util.Scanner;
import java.lang.*;
public class quadracitcEquasion {
    public static void main(String[] args) {
        int i = 0;
        do {
            Scanner input = new Scanner(System.in);    
            double a, b, c, result, r1, r2;
            System.out.print("Input a: ");
            a = input.nextDouble();
            System.out.print("Input b: ");
            b = input.nextDouble();
            System.out.print("Input c: ");
            c = input.nextDouble();
            result = b * b - 4.0 * a * c;

            if (result > 0.0) {
                r1 = (-b + Math.sqrt(result)) / (2.0 * a);
                r2 = (-b - Math.sqrt(result)) / (2.0 * a);
                System.out.println("The roots are " + r1 + " and " + r2);
            } else if (result == 0.0) {
                r1 = -b / (2.0 * a);
                System.out.println("The root is " + r1);
            } else {
                System.out.println("The equation has no real roots.");     
                System.out.println("Countinue? 1 for Yes, 2 for No");    
                i = input.nextInt();
            }
        }while(i == 1);
    } 
}