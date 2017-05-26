package tasks.readingFromАFile;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo1{

        static Scanner scn;
        static File file;
        static int mas[] = new int[20];

public static void main(String args[]){
    file = new File("C:\\Users\\Vedischevan\\IdeaProjects\\EDU\\src\\tasks\\readingFromАFile\\1.txt");

    try {
        scn = new Scanner(file);
    } catch (FileNotFoundException e) {
        JOptionPane.showMessageDialog(null, "файл не найден");
    }
    while (scn.hasNext()){
        for (int i = 0; i < mas.length; i++){
            mas[i] = Integer.parseInt(scn.next());
            System.out.print(mas[i]+" ");
}}}}
