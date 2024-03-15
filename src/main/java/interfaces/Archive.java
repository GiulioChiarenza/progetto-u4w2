package interfaces;

import giuliochiarenza.Publications;

import java.util.List;

public interface Archive {
    void addPublication(Publications publication);
    void removePublication(int codeISBN);
    Publications findByISBN(int codeISBN);
    List<Publications> findByPublicationYear(int year);
    List<Publications> findByAuthor(String author);
    void saveToFile(String filename);
    void loadFromFile(String filename);


}
