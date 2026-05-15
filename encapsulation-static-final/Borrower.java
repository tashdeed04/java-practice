public class Borrower {
  public static int book_count[] = {3, 3, 3};
  public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
  private String name;
  private String[] borrowedBooks;
  private int borrowedCount;
  
  public Borrower(String name) {
    this.name = name;
    this.borrowedBooks = new String[3];
    this.borrowedCount = 0;
  }
  
  public void borrowBook(String book) {
    if (borrowedCount >= borrowedBooks.length) {
      System.out.println("You cannot borrow more than 3 books.");
      return;
    }
    for (int i = 0; i < book_name.length; i++) {
      if (book_name[i].equals(book)) {
        if (book_count[i] > 0) {
          borrowedBooks[borrowedCount] = book;
          borrowedCount++;
          book_count[i]--;
          return;
        } else {
          System.out.println("This book is not available.");
          return;
        }
      }
    }
    System.out.println("This book does not exist in the library.");
  }
  
  public void borrowerDetails() {
    System.out.println("Name: " + name);
    System.out.println("Books Borrowed: ");
    for (int i = 0; i < borrowedCount; i++) {
      System.out.println(borrowedBooks[i]);
    }
  }
  
  public static int remainingBooks(String book) {
    for (int i = 0; i < book_name.length; i++) {
      if (book_name[i].equals(book)) {
        return book_count[i];
      }
    }
    return 0;
  }
  
  public static void bookStatus() {
    System.out.println("Available Books: ");
    for (int i = 0; i < book_name.length; i++) {
      System.out.println(book_name[i] + ": " + book_count[i]);
    }
  }
}