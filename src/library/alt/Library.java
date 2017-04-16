package library.alt;


class Library {
    private int cntBook; //необязательная индексная переменная TODO избавится от переменных
    private int cntReader; //необязательная индексная переменная TODO избавится от переменных
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
        }
        else {
            throw new ReaderAlreadyInLibraryException();
        }
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
