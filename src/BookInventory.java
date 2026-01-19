import javax.swing.JOptionPane;

    public class BookInventory {
        public static void main(String[] args) {
            Book[] books = new Book[3];

            for (int i = 0; i < 3; i++) {
                String title = JOptionPane.showInputDialog(
                        "Enter book title:");
                int total = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Enter the total number:" + title));

                books[i] = new Book(title, total);
            }

            System.out.println("----- Book Inventory -----");
            for (Book b : books) {
                System.out.println(
                        b.getTitle() + " has " +
                                b.getTotalBook() + " books, can borrow " +
                                b.getAvailableBook() + " books."
                );
            }
        }
    }
