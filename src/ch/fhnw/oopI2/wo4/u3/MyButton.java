package ch.fhnw.oopI2.wo4.u3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.EventListener;

/**
 * Erstellt von raphi am 13.04.14.
 * Version : 1.0.0
 * Modul: algd1
 */
public class MyButton extends JButton implements ActionListener, MouseListener {

    public MyButton()
    {
        this.addActionListener(this);
        this.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setText("gecklickt");
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setBackground(Color.GREEN);
        this.setOpaque(true);
        this.setBorderPainted(false);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBackground(Color.RED);
        this.setOpaque(true);
        this.setBorderPainted(false);
    }
}
