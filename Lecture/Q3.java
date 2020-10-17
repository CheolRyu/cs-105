import java.util.*;
public class Q3 {
  public static void main(String[] args) {
    float a, b, c;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a num with three desimals: ");
    a = scanner.nextFloat();

    System.out.println("Enter another num with three desimals: ");
    b = scanner.nextFloat();

    System.out.println("Enter last num with three desimals: ");
    c = scanner.nextFloat();

    System.out.println(sumMation(a, b, c));

  }

  public static float sumMation(float a, float b, float c) {
    return(a + b + c);
  }

  public static void sortMation(float a, float b, float c){
    float arr[] = {a, b, c};
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] > arr[i+1]) {
        arr[i] = arr[i+1];
      }
      return();
    }
  }
}
