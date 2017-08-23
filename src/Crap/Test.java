package Crap;

import library.alt.Reader;

import java.io.FileNotFoundException;

/**
 * Created by User on 13.03.2017.
 */
public class Test {
    public static void main (String[] args) throws FileNotFoundException {
        new RuntimeException();
        throw new FileNotFoundException();
    }
}
