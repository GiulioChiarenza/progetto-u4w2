package giuliochiarenza;

import interfaces.Archive;

import java.util.List;

public class Book extends Publications implements Archive {

    private String author;
    private String type;

    public Book(int codeISBN, String tile, int publicationYear, int pageNumber, String author, String type) {
        super(codeISBN, tile, publicationYear, pageNumber);
        this.author= author;
        this.type= type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void addPublication(Publications publication) {

    }

    @Override
    public void removePublication(int codeISBN) {

    }

    @Override
    public Publications findByISBN(int codeISBN) {
        return null;
    }

    @Override
    public List<Publications> findByPublicationYear(int year) {
        return null;
    }

    @Override
    public List<Publications> findByAuthor(String author) {
        return null;
    }

    @Override
    public void saveToFile(String filename) {

    }

    @Override
    public void loadFromFile(String filename) {

    }
}
