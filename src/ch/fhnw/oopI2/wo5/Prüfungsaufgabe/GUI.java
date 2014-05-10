package ch.fhnw.oopI2.wo5.Prüfungsaufgabe;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    public static void main(String[] args)
    {
        new GUI();
    }

    public GUI()
    {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(300,300));
        setTitle("Logo Painter");
        pack();
        setVisible(true);
    }

    public void paint(Graphics g)
    {
        LogoPainter logoPainter = new LogoPainter();
        logoPainter.paintLogo(g, Color.BLUE, 500, 30, 50);
    }
}
