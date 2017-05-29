package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reader extends JFrame {
    JButton b1, b2;
    JLabel l1, l2, l3, l4;
    JTextField t1, t2;
    int i, k;
    String a, b, numS = "0";
    eHandler handler = new eHandler();
    JButton arrayButton[];

    public Reader(String s) {
        super(s);
        setLayout(new FlowLayout());
        arrayButton = new JButton[16];
        t1 = new JTextField(16);
        arrayButton[0] = new JButton("0");
        arrayButton[1] = new JButton("1");
        arrayButton[2] = new JButton("2");
        arrayButton[3] = new JButton("3");
        arrayButton[4] = new JButton("4");
        arrayButton[5] = new JButton("5");
        arrayButton[6] = new JButton("6");
        arrayButton[7] = new JButton("7");
        arrayButton[8] = new JButton("8");
        arrayButton[9] = new JButton("9");
        arrayButton[10] = new JButton("+");
        arrayButton[11] = new JButton("-");
        arrayButton[12] = new JButton("*");
        arrayButton[13] = new JButton("/");
        arrayButton[14] = new JButton("C");
        arrayButton[15] = new JButton("=");
        add(t1);
        for (int r = 0; r < arrayButton.length; r++) {
            add(arrayButton[r]);
            arrayButton[r].addActionListener(handler);
        }

//        arrayButton[14].addActionListener(handler);
//        arrayButton[0].addActionListener(handler);
        //b2.addActionListener(handler);
        //b1.addActionListener(handler);
    }

    public class eHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == arrayButton[0]) {
                numS = Calc.count(numS, 0);
                double numOut = Double.parseDouble(numS);
                if (numOut - (int) numOut != 0) {
                    t1.setText(Double.toString(numOut));
                } else {
                    i = (int) numOut;
                    t1.setText(Integer.toString(i));//переводим число в текст
                }
            }


            if (e.getSource() == arrayButton[1]) {
                t1.setText("1");
                i = Integer.parseInt(t1.getText());
                //t1.setText(Integer.toString(i));
            }

                //try{
            if (e.getSource() == b2) {
                i = Integer.parseInt(t1.getText());//переводим текст в число
                k = Integer.parseInt(t2.getText());
                i++;
                k++;
                a = "Ваше первое число теперь равно " + i;//переводим число в текст
                b = "Ваше второе число теперь равно " + k;
                l3.setText(a);
                l4.setText(b);
            }

            if (e.getSource() == arrayButton[14]) {
                t1.setText(null);
            }
            //catch (Exception ex){ JOptionPane.showMessageDialog(null, "Введите в поле число"); }
        }
    }
}

