package giuliochiarenza;

import interfaces.Archive;

import java.util.List;

public class Magazine extends Publications implements Archive {

    private Periodicity periodicity;

    public Magazine(int codeISBN, String tile, int publicationYear, int pageNumber, Periodicity periodicity) {
        super(codeISBN, tile, publicationYear, pageNumber);
       this.periodicity= periodicity;
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
