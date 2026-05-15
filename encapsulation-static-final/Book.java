public class Book {
  public static int total_books_sold = 0;
  public static double total_revenue = 0.0;
  private String title;
  private double price;
  private double discountPercentage;
  private static final double BASE_PRICE = 150.0;
  
  public Book(String title, double discountPercentage) {
    this.title = title;
    this.discountPercentage = discountPercentage;
    calculatePrice();
    total_books_sold++;
    total_revenue += this.price;
  }
  
  private void calculatePrice() {
    this.price = BASE_PRICE - (BASE_PRICE * discountPercentage / 100);
  }
  
  public void bookDetails() {
    System.out.println("Title: " + title);
    System.out.println("Price after Discount: " + price + " TK");
  }
}
