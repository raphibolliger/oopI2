package ch.fhnw.oopI2.wo4.Pruefungsaufgabe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyTextSwitchPanel extends JPanel implements MouseListener {

    private JLabel l1 = new JLabel();
    private JLabel l2 = new JLabel();
    private JLabel l3 = new JLabel();
    private String text;

    public MyTextSwitchPanel()
    {
        this.setLayout(new GridLayout(3,1));

        this.l1.addMouseListener(this);
        this.l2.addMouseListener(this);
        this.l3.addMouseListener(this);

        this.add(l1);
        this.add(l2);
        this.add(l3);
    }

    public void setText(String text)
    {
        this.text = text;
        this.l1.setText(text);
        this.l2.setText(text);
        this.l3.setText(text);
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
        JLabel test = (JLabel)e.getComponent();
        if (l1.equals(test)) l1.setText("");
        if (l2.equals(test)) l2.setText("");
        if (l3.equals(test)) l3.setText("");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        JLabel test = (JLabel)e.getComponent();
        if (l1.equals(test)) l1.setText(text);
        if (l2.equals(test)) l2.setText(text);
        if (l3.equals(test)) l3.setText(text);
    }
}
