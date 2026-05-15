import java.util.Scanner;
public class PositiveOddStatistics {
  public static void main (String [] args) {    
    Scanner sc = new Scanner (System.in);
    
    int sum = 0;
    int count = 0;
    int min = 0;
    int max = 0;    
    
    System.out.println("Enter 10 numbers: ");
    for (int i = 0; i < 10; i++) {
    int num = sc.nextInt();  
    
    if (num % 2 != 0 && num >= 0) {
      if (count == 0) {
        min = num;
        max = num;
      } else {
        if (num < min) min = num;
        if (num > max) max = num;
      }
      sum += num;
      count++;
    }
    }
    if (count > 0) {
      double avg = (double) sum / count;
      System.out.println("Sum = " + sum);
      System.out.println("Minimum = " + min);
      System.out.println("Maximum = " + max);
      System.out.println("Average = " + avg);
    } else {
      System.out.println("No positive odd number found.");
    }
  }
}