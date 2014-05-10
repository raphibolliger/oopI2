package ch.fhnw.oopI2.pruefung2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Erstellt von raphi am 15.04.14.
 * Version : 1.0.0
 * Modul: oopI2
 */

public class GUI extends JFrame implements ActionListener {

    public static void main(String[] args)
    {
        new GUI();
    }

    private JLabel label = new JLabel("");
    private JButton b1 = new JButton("1");
    private JButton b2 = new JButton("2");
    private JButton b3 = new JButton("3");
    private JButton b4 = new JButton("4");
    private MyPanel mp = new MyPanel();

    public GUI()
    {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(250,600));
        setTitle("OOPI2 Prüfung");

        // Add the listeners
        this.b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mp.setType(3);
                label.setText("3");
            }
        });

        this.b1.addActionListener(this);
        this.b2.addActionListener(this);
        this.b4.addActionListener(this);

        // Set up the GUI
        this.setLayout(new BorderLayout());

        this.add(label, BorderLayout.NORTH);
        this.add(mp, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2,2));
        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        buttonPanel.add(b4);

        this.add(buttonPanel, BorderLayout.SOUTH);

        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand() == "1")
        {
            this.mp.setType(1);
            this.label.setText("1");
        }
        if (e.getActionCommand() == "2")
        {
            this.mp.setType(2);
            this.label.setText("2");
        }
        if (e.getActionCommand() == "4")
        {
            this.mp.setType(4);
            this.label.setText("4");
        }
    }
}
