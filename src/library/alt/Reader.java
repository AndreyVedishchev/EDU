package library.alt;

public class Reader {
    private Library library;
    private String fio;
    private int age;
    private Book[] bookList;

    public Reader(String fio, int age) {
        this.fio = fio;
        this.age = age;
        this.bookList = new Book[3];
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {

        this.library = library;
    }

    public String getFio() {
        return fio;
    }

    public void printLibrary(){
        if(this.library != null){
            System.out.println(this.fio + " является читателем библиотеки им. " + this.library.getName());
        }
        else {
            System.out.println(this.fio + " не читает книги!");
        }
    }

    void addBook(Book book) {
        try {
            if (book.getReader() == null) {
                this.bookList[getBookCnt()] = book;
                book.setReader(this);
            }
        }
        catch (ArrayIndexOutOfBoundsException exc) {
        }
    }

    int getBookCnt(){
        int cnt = 0;
        for (int i = 0; i < bookList.length; i++){
            if (bookList[i] != null){
                cnt++;
            }
        }
        return cnt;
    }

    void printReaderBooklist() {
        if (this.library != null) {
        System.out.print(this.fio + " имеет следующие книги: ");
        for (Book book : bookList) {
            if(book !=null) {
                System.out.print(book.getCaption() + ", ");}
            }
        System.out.println();}
        else {System.out.println(this.fio + " не имеет книг");}
    }
}
