package library.alt;


class Library {
    private int cntBook; //необязательная индексная переменная TODO избавится от переменных
    private int cntReader;
    private String name;
    private Reader[] readerList;
    private Book[] bookList;

    public Library(String name, int maxBooks, int maxReaders){
        this.name = name;
        this.bookList = new Book[maxBooks];
        this.readerList = new Reader[maxReaders];
        this.cntBook = 0;
        //this.cntReader = 0;
    }

    public int getCntBook() {
        return cntBook;
    }

    public void setCntBook(int cntBook) {
        this.cntBook = cntBook;
    }

    public int getCntReader() {
        int ln = 0;
        for (int i = 0; i < readerList.length; i++) {
            if (readerList[i] != null) {
                ln++;
            }
        }
        return ln;
    }

    //public void setCntReader(int cntReader) {this.cntReader = cntReader;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void addReader(Reader reader) throws ReaderAlreadyInLibraryException {//TODO если мы попытаемся назначить уже занятого читчателя, то ReaderAlreadyInLibraryException

        for (int i = 0; i < readerList.length; i++) {//TODO проверка, что мы ДЕЙСТВИТЕЛЬНО записали в список читетеленй; Не прошли проверку - LibraryIsFull
            if (readerList[i] == null) {
                readerList[i] = reader;
                break;
            }

        }

        reader.setLibrary(this);
    }


    void removeReader(Reader reader){
        if (reader.getLibrary() == this) {//TODO продумай алгоритм удаления читателя из спсика читателей!
            reader.setLibrary(null);
            this.cntReader--;
        }
    }

    @Deprecated
    void printLibraryDepr() {
        for (int i = 0; i < 10; i++){
            try {
                System.out.println(i + " | " + readerList[i].getFio() + " | " + "Книга1, Книга 2, Книга 4\n"  );
            }
            catch (NullPointerException exc) {
            }
        }
    }
    void printLibrary(){
        for (int i = 0; i < 10; i++){
            if (readerList[i] != null) {
                System.out.println(i + " | " + readerList[i].getFio() + " | " + "Книга1, Книга 2, Книга 4\n"  );
            } else break;
        }
    }

    void addBook(Book book) {
        this.bookList[this.cntBook] = book;
        book.setLibrary(this);
    }
}
