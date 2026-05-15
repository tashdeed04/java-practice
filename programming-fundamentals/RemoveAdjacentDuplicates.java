import java.util.Scanner;

public class RemoveAdjacentDuplicates {
  public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in);

    System.out.println("N = ");
    int length = sc.nextInt();
    int[] arr1 = new int[length];

    System.out.println("Enter the elements:");
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = sc.nextInt();
    }
    
    int[] arr2 = new int[length];
    arr2[0] = arr1[0];
    int newInd = 1;
    int removeCount = 0;    
    for (int i = 1; i < length; i++) {
      if (arr1[i] != arr1[i - 1]) {
       arr2[newInd] = arr1[i];
        newInd++;
      } else {
        removeCount++;
      }
    }
    System.out.println("Number of elements removed: " + removeCount);
    
    System.out.print("New array: ");
    for (int i = 0; i < newInd; i++) {
      System.out.print(arr2[i] + " ");
    }    
  }
}