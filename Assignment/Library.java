package Assignment;

public class Library {
	public static String addBook(String bookTitle) {
        System.out.println("Book added successfully: " + bookTitle);
        return bookTitle;
    }

    // Method to issue a book
    public void issueBook(String bookTitle) {
        System.out.println("Book issued successfully: " + bookTitle);
    }

    // Main class with the main method
    public static class Main {
        public static void main(String[] args) {
            // Creating an object of the Library class
            Library myLibrary = new Library();

            // Calling addBook method and storing the returned book title
            String bookTitle = Library.addBook("Romeo and Juliet");

            // Calling issueBook method with the valid book title
            myLibrary.issueBook(bookTitle);
        }
    }
}