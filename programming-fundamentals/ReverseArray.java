import java.util.Scanner;
import java.util.Arrays;
public class ReverseArray {
  public static void main (String[]args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the length of the array: ");
    int length = sc.nextInt();
    int [] arr1 = new int [length];
    
    for (int i = 0; i <arr1.length; i++){
      System.out.println("Enter the elements: ");
      int elem = sc.nextInt();      
      arr1 [i] = elem;
    }
    for (int i = arr1.length - 1; i >= 0; i--) {
      System.out.print(arr1[i] + " ");
    }    
  }
}