import java.util.*; // imports all the relavent tools from "util"
import java.lang.*; // imports all the relavent tools from "lang"

/* ------------------CLASS LECTURE 09/16/2020-----------------------*/
public class Lect_09162020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use pre-sudo code:  get i, add one to i regardless, print i;
        int i = 0; //init i
        int j = 0; //init j
        int score = 0;
        String grade = " ";
        // System.out.print("Enter i: ");
        System.out.print("Enter Score: ");
        // i = scanner.nextInt();
        score = scanner.nextInt();
//-------------------- IF STATEMENT --------------
        //cheking for positive i
        // if(i > 0){
        //     i++; // if it is, add 1
        // }
        // System.out.println("i = " + i); // print i

//--------------------- 2 -----------------------
        // if(i < 0){ // check for i 
        //     i++; // add one
        // }
        // else { // else, subtract i
        //     i--; // subtraction one
        // }
        // System.out.println("i = " + i); // print i

//------------------- 3 --------------------------
        // if(i > 0){ // check for i 
        //     i++; // add one
        // }
        // else if(i < 0){ // checking i is less than 0
        //     i--; // skips this becuase i == 0
        // }
        // System.out.println("i = " + i); // print i

//------------------- 4 -------------------------
        // if(i > 0) { // check for i 
        //     i++; // add one
        // }
        // else if(i < 0) { // checking i is less than 0
        //     i--; // skips this becuase i == 0
        // }
        // else {
        //     i = 100; // or i set it to 100
        // }
        // System.out.println("i = " + i); // print i

//------------------------------------------------
        //get a score from user, depending on logical expressions; give the score.
        if(score > 95 ) {
            grade = "A+";
        }
        else if(score >= 90 && score < 95){
            grade = "A";
        }
        else if(score >= 80 && score < 90){
            grade = "B";
        }
        else if(score >= 70 && score < 80) {
            grade = "C";
        }
        else if(score >= 60 && score < 70) {
            grade = "D";
        }
        else {
            grade = "F";
        }
        System.out.println("Your grade is: " + grade);
//---------------------- SWITCH STATEMENT-----------
        
    }
}
/* ---------------END OF CLASS LECTURE--------------------------*/