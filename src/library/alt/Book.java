package library.alt;

public class Book {
    private int cntPages;

    public Book(int cntPages) {
        this.cntPages = cntPages;
    }

    public void setCntPages(int cntPages) {
        if (cntPages <= 0) this.cntPages = 1;
        else this.cntPages = cntPages;
    }

    public int getCntPages() {
        return cntPages;
    }
}
