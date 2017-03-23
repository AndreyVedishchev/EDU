package library.alt;

/**
 * Created by Erixon on 23.03.2017.
 */
class Library {
    private int cntBook;
    private  int cntReader;




    void addReader(Reader reader){
        reader.setLibrary(this);
        this.cntReader++;
    }

    void removeReader(Reader reader){
        if (reader.getLibrary() == this) {
            reader.setLibrary(null);
            this.cntReader--;
        }
    }
}
