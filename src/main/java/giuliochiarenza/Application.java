package giuliochiarenza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc= new Scanner(System.in);

        List<Publications> publicationsList= new ArrayList<>();

        Publications book1= new Book(1001, "Harry Potter 1", 1997, 300, "J.K Rowling", "action, family, drama, comedy, horror, adventure, fantasy");
        publicationsList.add(book1);
        Publications book2= new Book(1002, "Lo Hobbit", 1937, 330, "J.R.R Tolkien", "novel, epic, fantasy, adventure");
        publicationsList.add(book2);
        Publications book3= new Book(1003, "One Piece Vol.1044", 1999, 17, "Eiichiro Oda", "adventure, fantasy, comedy, action");
        publicationsList.add(book3);
        Publications book4= new Book(1004, "Moby Dick", 1851, 732, "Herman Melville", "novel, adventure, sea fiction");
        publicationsList.add(book4);
        Publications book5= new Book(1005, "the Great Gatsby", 1925, 540, "F. Scott Fitzgerald", "novel, tragedy, literary fiction");
        publicationsList.add(book5);
        Publications magazine1= new Magazine(1006,"Time", 1923, 32, Periodicity.WEEKLY);
        publicationsList.add(magazine1);
        Publications magazine2= new Magazine(1007,"Vanity Fair", 1990, 40, Periodicity.WEEKLY);
        publicationsList.add(magazine2);
        Publications magazine3= new Magazine(1008,"Focus", 1992, 73, Periodicity.MONTHLY);
        publicationsList.add(magazine3);
        Publications magazine4= new Magazine(1009,"Vogue", 1892, 45, Periodicity.MONTHLY);
        publicationsList.add(magazine4);
        Publications magazine5= new Magazine(1010,"Shonen Jump", 1959, 19, Periodicity.WEEKLY);
        publicationsList.add(magazine5);

    }
}
