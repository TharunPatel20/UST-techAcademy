public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library("City Library", "123 Main Street");

        // Adding books to the library
        library.addBook(new Book("12345", "1984", "George Orwell", 9.99, true, "Dystopian"));
        library.addBook(new Book("67890", "To Kill a Mockingbird", "Harper Lee", 7.99, true, "Classic"));

        // Creating a member
        Member member = new Member("M001", "John Doe");

        try {
        	library.displayAvailableBooks();
            // Borrow a book
            member.borrowBook(library, "67890");

            // Display borrowed books
            member.displayBorrowedBooks();

            // Return the book
            member.returnBook(library, "12345");

            // Display available books after return
            library.displayAvailableBooks();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
