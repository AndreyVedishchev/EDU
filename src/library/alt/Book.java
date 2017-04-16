package library.alt;

public class Book {

    private String caption;
    private String author;
    private int cntPages;
    private Library library;
    private Reader reader;

    public Book(String caption, String author, int cntPages) {
        this.caption = caption;
        this.author = author;
        this.cntPages = cntPages;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Library getLibrary() {
        return library;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public void setCntPages(int cntPages) {
        if (cntPages <= 0) this.cntPages = 1;
        else this.cntPages = cntPages;
    }

    public int getCntPages() {
        return cntPages;
    }

    public String getCaption() {
        return caption;
    }
}
