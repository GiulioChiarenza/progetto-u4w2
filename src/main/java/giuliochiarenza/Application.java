package giuliochiarenza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);

        List<Publications> publicationsList = new ArrayList<>();

        Publications book1 = new Book(1001, "Harry Potter And The Philosopher's Stone", 1997, 300, "J.K Rowling", "action, family, drama, comedy, horror, adventure, fantasy");
        publicationsList.add(book1);
        Publications book2 = new Book(1002, "Lo Hobbit", 1937, 330, "J.R.R Tolkien", "novel, epic, fantasy, adventure");
        publicationsList.add(book2);
        Publications book3 = new Book(1003, "One Piece Vol.1044", 1997, 17, "Eiichiro Oda", "adventure, fantasy, comedy, action");
        publicationsList.add(book3);
        Publications book4 = new Book(1004, "Moby Dick", 1851, 732, "Herman Melville", "novel, adventure, sea fiction");
        publicationsList.add(book4);
        Publications book5 = new Book(1005, "the Great Gatsby", 1925, 540, "F. Scott Fitzgerald", "novel, tragedy, literary fiction");
        publicationsList.add(book5);
        Publications magazine1 = new Magazine(1006, "Time", 1923, 32, Periodicity.WEEKLY);
        publicationsList.add(magazine1);
        Publications magazine2 = new Magazine(1007, "Vanity Fair", 1990, 40, Periodicity.WEEKLY);
        publicationsList.add(magazine2);
        Publications magazine3 = new Magazine(1008, "Focus", 1992, 73, Periodicity.MONTHLY);
        publicationsList.add(magazine3);
        Publications magazine4 = new Magazine(1009, "Vogue", 1892, 45, Periodicity.MONTHLY);
        publicationsList.add(magazine4);
        Publications magazine5 = new Magazine(1010, "Shonen Jump", 1959, 19, Periodicity.WEEKLY);
        publicationsList.add(magazine5);

        ArchiveManager archiveManager = new ArchiveManager(publicationsList);

        for (Publications publication : publicationsList) {
            archiveManager.addPublication(publication);
        }

        System.out.println(archiveManager);


        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add new publication");
            System.out.println("2. Remove publication");
            System.out.println("3. Search publication by ISBN");
            System.out.println("4. Search publications by year of publication");
            System.out.println("5. Search publications by author");
            System.out.println("6. Save the archive to disk");
            System.out.println("7. Load the archive from disk");
            System.out.println("8. Exit");
            System.out.print("Choice: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }


            switch (choice) {
                case 1:
                    addNewPublication(sc, archiveManager);
                    break;
                case 2:
                    removePublication(sc, archiveManager);
                    break;
                case 3:
                    findByISBN(sc, archiveManager);
                    break;
                case 4:
                    findByPublicationYear(sc, archiveManager);
                    break;
                case 5:
                    findByAuthor(sc, archiveManager);
                    break;
                case 6:
                    saveToFile(sc, archiveManager);
                    break;
                case 7:
                    loadFromFile(sc, archiveManager);
                    break;
                case 8:
                    System.out.println("Bye!");
                    return;
                default:
                    System.out.println("Invalid choice. try again.");
            }
        }
    }
    private static void addNewPublication(Scanner sc, ArchiveManager archiveManager) {
        System.out.println("Enter the publication details:");

        System.out.print("Code ISBN: ");
        int codeISBN = Integer.parseInt(sc.nextLine());


        System.out.print("Title: ");
        String title = sc.nextLine();

        System.out.print("Publication year: ");
        int publicationYear = Integer.parseInt(sc.nextLine());


        System.out.print("Page number: ");
        int pageNumber = Integer.parseInt(sc.nextLine());


        System.out.print("Author: ");
        String author = sc.nextLine();

        System.out.print("Type (if it's a book): ");
        String type = sc.nextLine();

        Publications publication = new Book(codeISBN, title, publicationYear, pageNumber, author, type);
        archiveManager.addPublication(publication);

        System.out.println("Publication added successfully.");
        System.out.println(archiveManager);
    }

    private static void removePublication(Scanner sc, ArchiveManager archiveManager) {
        System.out.print("Enter the ISBN code of the publication you want to remove: ");
        int codeISBN = Integer.parseInt(sc.nextLine());
        archiveManager.removePublication(codeISBN);
        System.out.println("Post successfully removed.");
        System.out.println(archiveManager);
    }

    }


