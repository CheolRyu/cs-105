import java.util.*;
public class lect_092020 {
    public enum AutoColor { RED, GREEN, WHITE, BLACK, BLUE } /* enum type declaration occurs outside of the main method*/
    public static void main(String[] args) {
        final int MAX_SIZE = 5;
        Scanner scanner = new Scanner(System.in); /* initialazation for scanner */
        Random random = new Random(); /* initialazation for random number */

        String inputWord; /* initialazations */
        int wordCount, i, digitCount, otherCounts, temp, sum = 0, avg = 0; /* initialazations */
/* --------------------------------------------------------------------------- */
        // System.out.println("Enter a word: ");
        // inputWord = scanner.nextLine();

        // wordCount = 0;
        // digitCount = 0;
        // otherCounts = 0;
        // for(i=0; i<inputWord.length(); i++) {
        //     if(Character.isLetter(inputWord.charAt(i))) {
        //         wordCount += 1;
                
        //     } else if (Character.isDigit(inputWord.charAt(i))) { /* i of the first letter of the word */
        //         digitCount += 1;
        //     } else 
        //         otherCounts += 1;
        // }
        // System.out.println("You have " + wordCount + " words" + " and " + digitCount + " numbers" + " and " + otherCounts + " other counts");

/* --------------------------------------------------------------------------- */
        // for(i=0; i < 10; i++){
        //     if(i == 8) {
        //         break;
        //     }
        //     else if (i == 5) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }

/* --------------------------------------------------------------------------- */
        /* new enhanced loop after Java 5 and also caleed foreach statement */
        // for (AutoColor aColor : AutoColor.values()) {
        //     System.out.println(aColor);
        // }

/* --------------------------------------------------------------------------- */

        // i = 10;
        // while (i > 0) {
        //     System.out.println(i);
        //     i--;
        // } 
        // System.out.println("--------------------------");

        // i = 10;
        // do {
        //     System.out.println(i);
        //     i--;
        // } while (i>0);

/* ------------------------------ARRAY------------------------------- */
        int [] numbers = new int[MAX_SIZE];
        int [] studentId = new int[MAX_SIZE];
        int [] num = {10,11,12};
        int [] n = new int[MAX_SIZE];
        // System.out.println(num.length);
        String [] lastName = {"Ryu", "Collins"};

        // numbers[5] = 19;
        // System.out.println(numbers[6]);
        

        // for(i=0; i < numbers.length; i++) {
        //     numbers[i] = i+1;
        // }
        // System.out.println("--------------------------");

        for(i=0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(5)+1;
        }
        
        // for(i=0; i < studentId.length; i++) {
        //     studentId[i] = i+1;
        // }
        for(i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
        // System.out.println("--------------------------");
        // int temp;
        // temp = numbers[0];
        // numbers[0] = numbers[numbers.length-1];
        // numbers[numbers.length-1] = temp;

        // for(i=0; i < numbers.length; i++) {
        //     System.out.println(numbers[i]);
        // }
        // System.out.println("--------------------------");

        // for (i = 0; i < numbers.length; i++ ) {
        //     System.out.println("Student " + studentId[i] + " has the score of " + numbers[i]);
        // }

        /* ------------------------------copying an array------------------------------- */

        // for (i = 0; i < numbers.length; i++){
        //     studentId[i] = numbers[i];
        // } 

        // for (i = 0; i < numbers.length; i++ ) {
        //     System.out.println("Student " + studentId[i] + " has the score of " + numbers[i]);
        // }

        /* ------------------------------reversing an array------------------------------- */
        // for(i = 0; i<numbers.length; i++) {
        //     System.out.println(numbers[i]);
        // }

        // for (i = 0; i < numbers.length / 2; i++) {
        //     temp = numbers[i];
        //     numbers[i] = numbers[numbers.length-1-i]; // this would give the number of the last value that we want.
        //     numbers[numbers.length-1-i] = temp;
        // }
        // System.out.println("--------------------------");
        // for(i = 0; i<numbers.length; i++) {
        //     System.out.println(numbers[i]);
        // }

        /* ------------------------------LAB ASSIGNMENT------------------------------ */
        // 1. A + B
        for(i=0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("The sum is " + sum);
    }
}