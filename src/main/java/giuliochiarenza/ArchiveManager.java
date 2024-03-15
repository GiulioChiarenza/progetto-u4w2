package giuliochiarenza;

import interfaces.Archive;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArchiveManager implements Archive {

    private List<Publications> publicationsList;

    public ArchiveManager(List<Publications> publicationsList) {
        this.publicationsList = new ArrayList<>();
    }

    @Override
    public void addPublication(Publications publication) {
        publicationsList.add(publication);
    }

    @Override
    public void removePublication(int codeISBN) {
        publicationsList.removeIf(publication -> publication.getCodeISBN() == codeISBN);
    }

    @Override
    public Publications findByISBN(int codeISBN) {
        return publicationsList.stream()
                .filter(publication -> publication.getCodeISBN() == codeISBN)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Publications> findByPublicationYear(int year) {
        return publicationsList.stream()
                .filter(publication -> publication.getPublicationYear() == year)
                .collect(Collectors.toList());
    }

    @Override
    public List<Publications> findByAuthor(String author) {
        return publicationsList.stream()
                .filter(publication -> publication instanceof Book)
                .map(publication -> (Book) publication)
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    @Override
    public void saveToFile(String filename) {
        File file = new File("src/disk.txt");
        try {
            StringBuilder content = new StringBuilder();
            for (Publications publication : publicationsList) {
                content.append(publication.toString()).append(System.lineSeparator());
            }
            FileUtils.writeStringToFile(file, content.toString(), StandardCharsets.UTF_8);
            System.out.println("Archivio salvato con successo su " + filename);
        } catch (IOException e) {
            System.err.println("Errore durante il salvataggio del file: " + e.getMessage());
        }
    }

    @Override
    public void loadFromFile(String filename) {

    }

    @Override
    public String toString() {
        return "ArchiveManager{" +
                "publicationsList=" + publicationsList +
                '}';
    }
}



