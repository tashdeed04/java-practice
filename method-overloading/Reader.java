public class Reader {
    public String name;
    public int capacity;
    public String[] books;
    public int bookCount;    

    public String createReader(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        books = new String[capacity];
        return "A new reader is created!";
    }

    public void addBook(String book) {
        if (bookCount < capacity) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("No more capacity");
        }
    }

    public void readerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Books: ");
        if (bookCount == 0) {
            System.out.println("No books added yet");
        } else {
            for (int i = 0; i < bookCount; i++) {
                System.out.println("Book " + (i + 1) + ": " + books[i]);
            }
        }
    }
}
