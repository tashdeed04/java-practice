public class Library {
    public int capacity;
    public int totalBooks;
    public String[] bookList;
    
    public Library() {
        this.capacity = 0;
        this.totalBooks = 0;
        this.bookList = new String[capacity];
    }
    
    public void setBookCapacity(int capacity) {
        this.capacity = capacity;
        this.bookList = new String[capacity];
    }
    
    public void addBook(String bookName) {
        if (totalBooks < capacity) {
            bookList[totalBooks] = bookName;
            totalBooks++;
            System.out.println("Book '" + bookName + "' added to the library");
        } else {
            System.out.println("Maximum capacity exceeds. You can't add more than " + capacity + " books");
        }
    }
    
    public void printDetail() {
        System.out.println("Maximum Capacity: " + capacity);
        System.out.println("Total Books: " + totalBooks);
        System.out.println("Book list: ");
        for (int i = 0; i < totalBooks; i++) {
            System.out.println(bookList[i]);
        }
    }
}