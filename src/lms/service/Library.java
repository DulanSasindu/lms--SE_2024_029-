package lms.service;

import lms.model.LibraryItem;
import lms.model.Member;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<LibraryItem> items = new ArrayList<>();
    private final List<Member> members = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println("Item added successfully!");
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added successfully!");
    }

    public void listItems() {
        System.out.println("\n--- Items in the library ---");
        for (LibraryItem item : items) {
            System.out.println(item);
        }
    }

    public void listMembers() {
        System.out.println("\n--- Registered members ---");
        for (Member member : members) {
            System.out.println(member);
        }
    }

    public void printAllLateFees(int daysLate) {
        System.out.println("\n--- Late fees if " + daysLate + " day(s) late ---");
        for (LibraryItem item : items) {
            System.out.println(item.getTitle() + ": " + item.calculateLateFee(daysLate));
        }
    }
}