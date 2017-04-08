package library.alt;

import java.lang.*;

class Library {
    private int cntBook;
    private int cntReader;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library(int cntBook, String name) {
        this.cntBook = cntBook;
        this.cntReader = 120;
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

    void addReader(Reader reader) throws ReaderAlreadyInLibraryException{
        //System.out.println("книг было "+getCntBook()+" шт.");
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
