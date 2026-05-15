import java.util.Scanner;
public class StringAsciiSum {
  public static void main (String[]args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    
    System.out.println("Enter the first string: ");
    String first = sc.nextLine();
    System.out.println("Enter the second string: ");
    String second = sc.nextLine();
    
    String add = first+" "+second;    
    
    for (int i = 0; i < add.length(); i++) {
      char x = add.charAt(i);
      if (Character.isLetter(x)) {
      sum += x;
      }
    }
    
    System.out.println(add);
    System.out.println(sum);
  }
}
