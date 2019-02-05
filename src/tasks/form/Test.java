package tasks.form;

import javax.swing.*;

public class Test {
    public static void main (String[] args) {
        Reader r = new Reader("");
        r.setVisible(true);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.setSize(200, 220);
        r.setResizable(false);
        r.setLocationRelativeTo(null);
    }
}
