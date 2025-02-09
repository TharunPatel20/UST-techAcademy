import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Member implements Serializable {
    private static final long serialVersionUID = 1L;

    private String memberId;
    private String name;
    private List<Book> borrowedBooks;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Library library, String ISBN) throws BookNotFoundException, NotEnoughBooksException {
        // Find the book by ISBN
        Book book = library.searchByAuthor(ISBN).stream()
                .filter(Book::isAvailability)
                .findFirst()
                .orElseThrow(() -> new BookNotFoundException("Book with ISBN " + ISBN + " is not available."));

        // Check if the book is available
        if (!book.isAvailability()) {
            throw new NotEnoughBooksException("Book is currently unavailable for borrowing.");
        }

        // Update book availability and add to borrowed list
        book.setAvailability(false);
        borrowedBooks.add(book);
    }

    public void returnBook(Library library, String ISBN) throws BookNotFoundException {
        // Find the book in the borrowed list
        Book book = borrowedBooks.stream()
                .filter(b -> b.getISBN().equals(ISBN))
                .findFirst()
                .orElseThrow(() -> new BookNotFoundException("Book with ISBN " + ISBN + " was not borrowed."));

        // Update book availability and remove from borrowed list
        book.setAvailability(true);
        borrowedBooks.remove(book);
    }

    public void displayBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            System.out.println("Borrowed Books:");
            borrowedBooks.forEach(System.out::println);
        }
    }

    @Override
    public String toString() {
        return "Member [ID=" + memberId + ", Name=" + name + ", Borrowed Books Count=" + borrowedBooks.size() + "]";
    }
}
