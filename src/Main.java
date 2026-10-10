package lms;

import lms.model.Book;
import lms.model.DVD;
import lms.model.Student;
import lms.model.Staff;
import lms.service.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // 1. Add Books and DVD
        library.addItem(new Book("B001", "Clean Code", "Robert C. Martin"));
        library.addItem(new Book("B002", "Effective Java", "Joshua Bloch"));
        library.addItem(new DVD("D001", "Introduction to Algorithms", 120));

        // 2. Add Members (Student and Staff)
        library.addMember(new Student("M001", "Nadeesha Perera"));
        library.addMember(new Staff("M002", "Mr. Kasun Silva"));

        // 3. Display items, members, and late fees (Polymorphism in action!)
        library.listItems();
        library.listMembers();
        library.printAllLateFees(3);

        // 4. Test validation (try/catch for invalid book creation)
        try {
            new Book("B003", "", "Some Author");
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected invalid book: " + e.getMessage());
        }
    }
}
