import java.util.Scanner;
public class FrequencyCounter {
  public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in);

    System.out.println("N = ");
    int length = sc.nextInt();
    int[] arr1 = new int[length];

    for (int i = 0; i < arr1.length; i++) {
      System.out.println("Enter the elements: ");
      arr1[i] = sc.nextInt();
    }
    
    for (int i = 0; i < length; i++) {
      int count = 0;
      for (int j = 0; j < length; j++) {
        if (arr1[i] == arr1[j]) {
          count++;
        }
      }
      
      boolean multiple = false;
      for (int k = 0; k < i; k++) {
        if (arr1[k] == arr1[i]) {
          multiple = true;
          break;
        }
      }
      
      if (!multiple) {
        System.out.println(arr1[i] + " - " + count + " times");
      }
    }
  }
}