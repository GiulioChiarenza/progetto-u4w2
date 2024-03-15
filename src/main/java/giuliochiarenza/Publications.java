package giuliochiarenza;

public abstract class Publications {
    private int codeISBN;
    private String title;
    private int publicationYear;
    private int pageNumber;


    public Publications(int codeISBN, String title, int publicationYear, int pageNumber) {
        this.codeISBN = codeISBN;
        this.title = title;
        this.publicationYear = publicationYear;
        this.pageNumber = pageNumber;
    }


    public int getCodeISBN() {
        return codeISBN;
    }

    public void setCodeISBN(int codeISBN) {
        this.codeISBN = codeISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTile(String tile) {
        this.title = title;
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
                ", tile='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                ", pageNumber=" + pageNumber +
                '}';
    }
}
