package library.alt;

class Library {
    private int cntBook;
    private int cntReader;


    public Library(int cntBook, int cntReader) {
        this.cntBook = cntBook;
        this.cntReader = cntReader;
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

    void addReader(Reader reader){
        System.out.println("книг было "+getCntBook()+" шт.");
        reader.setLibrary(this);
        this.cntReader++;
        this.cntBook--;
        System.out.println("добавляем читателя\nчитателей "+getCntReader()+" осталось книг "+getCntBook());
    }

    void removeReader(Reader reader){
        if (reader.getLibrary() == this) {
            reader.setLibrary(null);
            this.cntReader--;
            this.cntBook++;
            System.out.println("удаляем читателя\nчитателей "+getCntReader()+" осталось книг "+getCntBook());
        }
    }
}
