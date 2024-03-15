package giuliochiarenza;

public abstract class Publications {
    private int codeISBN;
    private String tile;
    private int publicationYear;
    private int pageNumber;


    public Publications(int codeISBN, String tile, int publicationYear, int pageNumber) {
        this.codeISBN = codeISBN;
        this.tile = tile;
        this.publicationYear = publicationYear;
        this.pageNumber = pageNumber;
    }


    public int getCodeISBN() {
        return codeISBN;
    }

    public void setCodeISBN(int codeISBN) {
        this.codeISBN = codeISBN;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return "Publications{" +
                "codeISBN=" + codeISBN +
                ", tile='" + tile + '\'' +
                ", publicationYear=" + publicationYear +
                ", pageNumber=" + pageNumber +
                '}';
    }
}
