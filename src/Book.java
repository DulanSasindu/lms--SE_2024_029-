public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isBorrowed;

    // Constructor:
    public Book(int id,String title,String author){
        this.id=id;
        this.title=title;
        this.author=author;
        this.isBorrowed=false; //at the first books are available
    }

    // Getters & Setters: Private Variables
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public boolean isBorrowed(){
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed){
        isBorrowed=borrowed;
    }

    //Display
    public void displayInfo(){
        String status=isBorrowed? "Borrowed" : "Available";
        System.out.println("ID: " + id + " | Title: " + title + " | Author: " + author + " | Status: " + status);
    }
}
