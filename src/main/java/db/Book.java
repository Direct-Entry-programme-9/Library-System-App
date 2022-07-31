package db;

public class Book {
    private String isbn;
    private String bookName;
    private String author;
    private String availability;

    public Book() {
    }

    public Book(String isbn, String bookName, String author, String availability) {
        this.isbn = isbn;
        this.bookName = bookName;
        this.author = author;
        this.availability = availability;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String name) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
