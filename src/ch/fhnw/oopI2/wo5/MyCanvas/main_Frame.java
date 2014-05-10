package ch.fhnw.oopI2.wo5.MyCanvas;

import javax.swing.*;

public class main_Frame extends JFrame {

    MyCanvas canvas;

    public main_Frame()
    {
        this.setTitle("Zeichnen mit Maus-Events");
        canvas = new MyCanvas();
        add(canvas);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200,200);
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        new main_Frame();
    }

}
