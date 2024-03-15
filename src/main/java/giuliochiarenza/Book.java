package giuliochiarenza;

public class Book extends Publications {

    private String author;
    private String type;

    public Book(int codeISBN, String tile, int publicationYear, int pageNumber) {
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
}
