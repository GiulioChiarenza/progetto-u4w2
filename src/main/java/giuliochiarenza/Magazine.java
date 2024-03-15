package giuliochiarenza;

public class Magazine extends Publications {

    private Periodicity periodicity;

    public Magazine(int codeISBN, String tile, int publicationYear, int pageNumber) {
        super(codeISBN, tile, publicationYear, pageNumber);
       this.periodicity= periodicity;
    }
}
