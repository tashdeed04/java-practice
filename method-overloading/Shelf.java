public class Shelf {
    
    public int capacity;
    public int books;

    
    public Shelf() {
        this.capacity = 0;
        this.books = 0;
    }
    
    public void addBooks(int num) {
        if (capacity == 0) {
            System.out.println("Zero capacity. Cannot add books.");
        } else if (books + num > capacity) {
            System.out.println("Exceeds capacity");
        } else {
            books += num;
            System.out.println(num + " books added to shelf");
        }
    }
    
    public void showDetails() {
        System.out.println("Shelf capacity: " + capacity);
        System.out.println("Number of books: " + books);
    }
}