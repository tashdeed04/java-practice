import java.util.Scanner;
public class PrimeCounter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int primeCount = 0;
    

    System.out.println("Starting number: ");
    int start = sc.nextInt();
    System.out.println("Ending number: ");
    int end = sc.nextInt();

    if (start > end) {
      for (int i = start; i >= end; i--) { 
        int count = 0;
        for (int j = 2; j <= i - 1; j++) {
          if (i % j == 0) {
            count++;
            
          }
        }
        if (count == 0 && i > 1) {
          primeCount++;
        }
      }
    } else {
      for (int i = start; i <= end; i++) { 
        int count = 0;
        for (int j = 2; j <= i - 1; j++) {
          if (i % j == 0) {
            count++;
            
          }
        }
        if (count == 0 && i > 1) {
          primeCount++;
        }
      }
    }

    System.out.println("There are " + primeCount + " prime numbers between " + start + " and " + end + ".");
    
  }
}