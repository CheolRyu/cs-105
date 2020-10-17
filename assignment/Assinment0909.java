import java.util.Scanner;
import java.lang.*;

public class Assinment0909 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of A: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value of B: ");
        double b = scanner.nextDouble();

        System.out.print("Enter value of C: ");
        double c = scanner.nextDouble();

        double root1;
        double root2;


        double discriminant = b * b - 4 * a * c;

        if( discriminant < 0) {
            System.out.println("Roots are imaginary...");
        }

        if(discriminant == 0) {
            System.out.println("Roots are equal.");

            // root = -b / 2 * a;

            root1 = -b / (2 * a);
            root2 = -b / (2 * a);

        }

        if(discriminant > 0 ){
            System.out.println("Roots are unequal.");

            root1 = (-b + Math.sqrt(discriminant)) / (2 * a );
            root2 = (-b + Math.sqrt(discriminant)) / (2 * a );
        }






    }
}
