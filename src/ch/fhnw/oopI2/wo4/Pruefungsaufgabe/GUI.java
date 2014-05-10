package ch.fhnw.oopI2.wo4.Pruefungsaufgabe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Erstellt von raphi am 13.04.14.
 * Version : 1.0.0
 * Modul: algd1
 */
public class GUI extends JFrame {

    private JButton b1 = new JButton("löschen");
    private JButton b2 = new JButton("übernehmen");
    JTextArea t1 = new JTextArea();
    MyTextSwitchPanel mtsp = new MyTextSwitchPanel();
    JPanel left = new JPanel();

    public GUI()
    {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("GUI-Testaufgabe");

        this.b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mtsp.setText("");
            }
        });
        this.b2.addActionListener(new MyButtonListener());

        this.left.setLayout(new GridLayout(3,1));
        this.left.add(b1);
        this.left.add(t1);
        this.left.add(b2);

        this.setLayout(new GridLayout(1,2));
        this.add(left);
        this.add(mtsp);

        this.pack();
        this.setVisible(true);
    }

    private class MyButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            mtsp.setText(t1.getText());
        }
    }
}
