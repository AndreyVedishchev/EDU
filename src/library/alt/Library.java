package library.alt;

class Library {
    private String name;
    private Reader[] readerList;
    private Book[] bookList;

    public Library(String name, int maxBooks, int maxReaders){
        this.name = name;
        this.bookList = new Book[maxBooks];
        this.readerList = new Reader[maxReaders];
    }

    public int getCntBook() {
        int lk = 0;
        for (int j = 0; j < bookList.length; j++) {
            if (bookList[j] != null) {
                lk++;
            }
        }
        return lk;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void addReader(Reader reader) throws ReaderAlreadyInLibraryException, LibraryIsFull {
       if (reader.getLibrary() != null) {
           throw new ReaderAlreadyInLibraryException();
       }
        if (getCntReader() < readerList.length) {
            for (int i = 0; i < readerList.length; i++) {
                if (readerList[i] == null) {
                    readerList[i] = reader;
                    break;
                }
            }
            reader.setLibrary(this);
        }
        else {
           throw new LibraryIsFull();
        }
    }

    void removeReader(Reader reader) throws Exception {
        if (reader.getLibrary() == this) {
            reader.setLibrary(null);
        }
        else {
            throw new Exception();
        }
        for (int i = 0; i < readerList.length; i++) {
            if (readerList[i] != null) {
                readerList[i] = null;
                break;
            }
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

    void addBook(Book book) throws LibraryIsFull{
        if (getCntBook() < bookList.length) {
            for (int i = 0; i < bookList.length; i++){
               if (bookList[i] == null) {
                   bookList[i] = book;
                   break;
               }
            }
            book.setLibrary(this);
        }else {
            throw new LibraryIsFull();
        }
    }

    void removeBook (Book book) throws Exception{
        if (book.getLibrary() == this) {
            book.setLibrary(null);
        } else {
            throw new Exception();
        }
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] != null) {
                bookList[i] = null;
                break;
            }
        }
    }
}
