package library.alt;

import java.lang.*;

class Library {
    private int cntBook;
    private int cntReader;
    private String name;
    private Reader reader;
    private Book book;

    public Library(int cntBook, String name) {
        this.cntBook = cntBook;
        this.cntReader = 0;
        this.name = name;
    }

    public int getCntBook() {
        return cntBook;
    }

    public void setCntBook(int cntBook) {
        this.cntBook = cntBook;
    }

    public int getCntReader() {
        return cntReader;
    }

    public void setCntReader(int cntReader) {
        this.cntReader = cntReader;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    void addReader(Reader reader) throws ReaderAlreadyInLibraryException{
        if (reader.getLibrary() == null){
            reader.setLibrary(this);
            this.cntReader++;
            this.cntBook--;
        }
        else {
            throw new ReaderAlreadyInLibraryException();
        }

        //System.out.println("добавляем читателя\nчитателей "+getCntReader()+" осталось книг "+getCntBook());
    }

    void removeReader(Reader reader){
        if (reader.getLibrary() == this) {
            reader.setLibrary(null);
            this.cntReader--;
            this.cntBook++;
            //System.out.println("удаляем читателя\nчитателей "+getCntReader()+" осталось книг "+getCntBook());
        }
    }
}
