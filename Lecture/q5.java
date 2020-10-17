import java.util.*;

public class q5 {
  public static void main(String[] args) {
    int i,top;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a top: ");
    top = scanner.nextInt();

    for(i=top; i > -1; i--){
      System.out.println("Numbers are: " + i);
    }
    
  }
}
