import java.util.*;
public class numGuessing {
    public static void main (String[] args) {
    //Setting up the variables
    final int MAX = 100;
    final int MIN = 1;
    int correct_number, guess = 1;
    String another="Y";

    //Intializing scanner and random
    Scanner scan = new Scanner (System.in);
    Random rand = new Random();
    //System.out.println(rand);
    //play again loop
    while (another.equalsIgnoreCase("Y"))
    {
        //Generate a random number between 1 and 100
        correct_number = rand.nextInt(MAX-MIN)+1;

        System.out.print ("Guess the number! I would picked the number between "+MIN+" and "+ MAX + "!\n");
        for(int i=0;;i++){
            System.out.println("Enter your guess: ");
            guess = scan.nextInt();
            System.out.println(correct_number);
            if (guess<correct_number && guess != 0) {
                System.out.println("Your guess was too low, go higher! (0 to exit) ");
            }
            else if (guess>correct_number) {
                System.out.println("Your guess was too high, go lower!(0 to exit) ");
            } 
            else if (guess==0){
                System.out.println("You excited the current round.");
                break;
            } else {
                System.out.println("Your guess was correct!\n");
                System.out.println("It took "+i+" guesses to get the correct_number");
                break;
            }
        }
        //Asking players to play another game
        System.out.println("Do you want to play another game?(Y|N)");
        another = scan.next();
        if (another.equalsIgnoreCase("N"))
            System.out.println("Goodbye, thank you for playing");
        }
    }
}