import java.util.*;
/* Functions and methods
    Main benifits of function is to modualize the big application. 
*/
public class lec_1007 {
  static int classVar = 10;
  static int classVar2 = 110;
  /* scope of a var */
  public static void main(String[] args) {
    int i, j, k, randNum, total;
    String name;
    name = "Bob";
    j = 12;
    k = 23;
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    randNum = rand.nextInt(100) + 1;
    printHi();
    printHi2(name);
    sum(j,k);
    dob(6);
    total = 10;
    dob(total);
    System.out.println("total = " + total);


  }

  public static void printHi() {
    System.out.println("Hi from function");
  }
  public static void printHi2(String n) {
    System.out.println("Hi from " + n + ", he was here");
  }

  public static void sum(int j, int k) {
    printHi();
    System.out.println(j+k);
  }
  /* Call by value */
  public static void dob(int n) {
    n = n*2;
    System.out.println("n = " + n);
  }

}