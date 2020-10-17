import java.util.*;
import java.lang.*;
public class q4 {
  public static void main(String[] args ) {
    Random rand = new Random();
    int max = 100;
    int min = 0;
    int arr[] = new int[10];
    int i;
    
    for(i = 0; i < arr.length; i++){
      int num = 1 + rand.nextInt(min - max);
      num += arr[i];
    }
    System.out.println(arr[i]);
  }

}
