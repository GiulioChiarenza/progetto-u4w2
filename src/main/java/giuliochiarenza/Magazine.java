package giuliochiarenza;


public class Magazine extends Publications {

    private Periodicity periodicity;

    public Magazine(int codeISBN, String title, int publicationYear, int pageNumber, Periodicity periodicity) {
        super(codeISBN, title, publicationYear, pageNumber);
       this.periodicity= periodicity;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "codeISBN=" + getCodeISBN() +
                ", title='" + getTitle() + '\'' +
                ", publicationYear=" + getPublicationYear() +
                ", pageNumber=" + getPageNumber() +
                ", periodicity=" + periodicity +
                '}';
    }


}
