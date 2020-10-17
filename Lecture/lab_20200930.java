import java.util.*;
public class lab_20200930 {
    public static void main (String[] args) {
        final int MAX_SIZE = 5;
        double sum = 0, avg = 0;
        int i;
        Scanner scanner = new Scanner(System.in); /* initialazation for scanner */
        Random random = new Random(); /* initialazation for random number */
        int [] numbers = new int[MAX_SIZE];

        /* ----------------Number 1: a, b----------------------- */
        for(i=0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(5)+1;
            System.out.println("Random number is: " + numbers[i]);
        }
        // for(i=0; i<numbers.length; i++) {
        //     System.out.println("Random number is: " + numbers[i]);
        // }

        for(i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        avg = sum / numbers.length; 
        
        System.out.println("Sum of rands: " + sum);
        System.out.println("Avg of rands: " + avg);
        
        /* ----------------Number 2----------------------- */
        // int[] fib = new int[20];
        // fib[0] = 1;
        // fib[1] = 1;
        // for (i = 2; i < fib.length; i++) {
        //   fib[i] = fib[i - 1] + fib[i - 2];
        // }
        // System.out.print(Arrays.toString(fib));

        
    }
}
