package library.alt;

import java.lang.*;

class Library {
    private int cntBook; //необязательная индексная переменная
    private int cntReader; //необязательная индексная переменная
    private String name;
    private Reader[] readerList;
    private Book[] bookList;

    @Deprecated
    public Library(int cntBook, String name) {
        this.cntBook = 0;
        this.cntReader = 0;
        this.name = name;
    }

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

    void addReader(Reader readerList) throws ReaderAlreadyInLibraryException{
        if (readerList.getLibrary() == null){
            this.readerList[this.cntReader] = readerList;//здесь может быть ошибка!! подумай какая, и как ее отлавливать!
            readerList.setLibrary(this);
            this.cntReader++;
        }
        else {
            throw new ReaderAlreadyInLibraryException();
        }

    }


    void removeReader(Reader reader){
        if (reader.getLibrary() == this) {
            //TODO продумай алгоритм удаления читателя из спсика читателей!
            reader.setLibrary(null);
            this.cntReader--;
            //System.out.println("удаляем читателя\nчитателей "+getCntReader()+" осталось книг "+getCntBook());
        }
    }
}
