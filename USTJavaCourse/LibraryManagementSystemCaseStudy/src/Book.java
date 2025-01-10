import java.io.Serializable;

public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    private String ISBN;
    private String title;
    private String author;
    private double price;
    private boolean availability;
    private String genre;

    public Book(String ISBN, String title, String author, double price, boolean availability, String genre) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
        this.genre = genre;
    }

    public String getISBN() { return ISBN; }
    public void setISBN(String ISBN) { this.ISBN = ISBN; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public boolean isAvailability() { return availability; }
    public void setAvailability(boolean availability) { this.availability = availability; }
    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    @Override
    public String toString() {
        return "Book [ISBN=" + ISBN + ", Title=" + title + ", Author=" + author + 
               ", Price=" + price + ", Availability=" + availability + ", Genre=" + genre + "]";
    }
}
