import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String address;
    private List<Book> books;

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String ISBN) throws BookNotFoundException {
        Book book = books.stream()
                         .filter(b -> b.getISBN().equals(ISBN))
                         .findFirst()
                         .orElseThrow(() -> new BookNotFoundException("Book with ISBN " + ISBN + " not found."));
        books.remove(book);
    }

    public List<Book> searchByAuthor(String author) {
        return books.stream()
                    .filter(b -> b.getAuthor().equalsIgnoreCase(author))
                    .collect(Collectors.toList());
    }

    public List<Book> searchByGenre(String genre) {
        return books.stream()
                    .filter(b -> b.getGenre().equalsIgnoreCase(genre))
                    .collect(Collectors.toList());
    }

    public void displayAvailableBooks() {
        books.stream()
             .filter(Book::isAvailability)
             .forEach(System.out::println);
    }
}
