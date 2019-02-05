package tasks.form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Reader extends JFrame {

    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    eHandler handler = new eHandler();
    JButton save;
    String sur, name, pat;

    public Reader(String s) {
        super(s);
        setLayout(new FlowLayout());
        save = new JButton("Сохранить");
        save.setPreferredSize(new Dimension(100,20));

        t1 = new JTextField(16);
        t2 = new JTextField(16);
        t3 = new JTextField(16);

        l1 = new JLabel("Фамилия");
        l2 = new JLabel("Имя");
        l3 = new JLabel("Отчество");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(save);
        save.addActionListener(handler);
    }

    public class eHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == save) {
                sur = t1.getText();
                name = t2.getText();
                pat = t3.getText();

                File file = new File("testWrite.txt");
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
                    writer.write(sur+";"+name+";"+pat+";");
                    writer.flush();
                    writer.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}

