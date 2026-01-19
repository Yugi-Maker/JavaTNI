public class Book {

    private String title;
    private int totalBook;
    private int availableBook;

    public Book(String title, int totalBook) {
        this.title = title;
        this.totalBook = totalBook;
        this.availableBook = totalBook;
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", 10);
        System.out.println("Title: " + b1.title);
        System.out.println("Total: " + b1.totalBook);
    }

    public Book(String title) {
        this.title = title;
        this.totalBook = 0;
        this.availableBook = 0;
    }

    public Book() {
        this.title = "";
        this.totalBook = 0;
        this.availableBook = 0;
    }

    public String getTitle() {
        return title;
    }

    public int getTotalBook() {
        return totalBook;
    }

    public int getAvailableBook() {
        return availableBook;
    }

    public void borrowBook() {
        if (availableBook > 0) {
            availableBook--;
        }
    }

    public void returnBook() {
        if (availableBook < totalBook) {
            availableBook++;
        }
    }
}
