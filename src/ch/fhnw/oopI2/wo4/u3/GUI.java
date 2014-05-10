package ch.fhnw.oopI2.wo4.u3;

import javax.swing.*;

/**
 * Erstellt von raphi am 13.04.14.
 * Version : 1.0.0
 * Modul: algd1
 */
public class GUI extends JFrame {

    public GUI()
    {
        this.setTitle("GUI");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.add(new MyButton());

        this.pack();
        this.setVisible(true);

    }

}
