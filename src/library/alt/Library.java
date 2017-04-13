package library.alt;

import java.lang.*;

class Library {
    private int cntBook; //необязательная индексная переменная
    private int cntReader; //необязательная индексная переменная
    private String name;
    private Reader[] readerList;
    private Book[] bookList;

    public Library(String name, int maxBooks, int maxReaders){
        this.name = name;
        this.bookList = new Book[maxBooks];
        this.readerList = new Reader[maxReaders];
        this.cntBook = 0;
        this.cntReader = 0;
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

    void addReader(Reader reader) throws ReaderAlreadyInLibraryException{
        if (reader.getLibrary() == null){
            this.readerList[this.cntReader] = reader;//здесь может быть ошибка!! подумай какая, и как ее отлавливать!
            reader.setLibrary(this);
            this.cntReader++;
            System.out.println("кол-во читателей "+cntReader);
        }
        else {
            throw new ReaderAlreadyInLibraryException();
        }
    }

    void removeReader(Reader reader){
        if (reader.getLibrary() == this) {
            this.readerList[this.cntReader] = null;//TODO продумай алгоритм удаления читателя из спсика читателей!
            reader.setLibrary(null);
            this.cntReader--;
            System.out.println("кол-во читателей "+cntReader);
        }
    }
}
