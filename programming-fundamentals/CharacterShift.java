import java.util.Scanner;
public class CharecterShift {
  public static void main (String[]args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a string:");
    String user = sc.nextLine();
    String result = "";

    for (char ch : user.toCharArray()) {
      result += (ch == 'a') ? 'z' : (char) (ch - 1);
    }

      System.out.println("Output: " + result);
    }
}