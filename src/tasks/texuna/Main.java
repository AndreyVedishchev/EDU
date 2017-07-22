package tasks.texuna;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("C:\\Git\\EDU\\src\\tasks\\texuna\\text");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
