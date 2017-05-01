package Calculator;

import javax.swing.JFrame;

public class Test {
    public static void main (String[] args) {
        Reader r = new Reader("Счетчик микробов");
        r.setVisible(true);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.setSize(200, 200);
        r.setResizable(false);
        r.setLocationRelativeTo(null);
    }
}
