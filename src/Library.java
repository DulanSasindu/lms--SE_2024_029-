import java.util.ArrayList;

public class Library {
    //Create book list
    private ArrayList<Book> books = new ArrayList<>();

    //Input the new book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    //Display the all books
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("\n--- Library Books ---");
        for (Book book : books) {
            book.displayInfo();
        }
    }

    //Book borrowed
    public void borrowBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                if (!book.isBorrowed()) {
                    book.setBorrowed(true);
                    System.out.println("You borrowed: " + book.getTitle());
                } else {
                    System.out.println("Sorry, this book is already borrowed.");
                }
                return;
            }
        }
        System.out.println("Book with ID " + id + " not found.");
    }

    //Return book
    public void returnBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                if (book.isBorrowed()) {
                    book.setBorrowed(false);
                    System.out.println("Book returned successfully: " + book.getTitle());
                } else {
                    System.out.println("This book was not borrowed.");
                }
                return;
            }
        }
        System.out.println("Book with ID " + id + " not found.");
    }

}
