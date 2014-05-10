package ch.fhnw.oopI2.wo4.u2new;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Erstellt von raphi am 13.04.14.
 * Version : 1.0.0
 * Modul: algd1
 */
public class Mouseevent extends JFrame implements MouseListener {

    private JLabel l1 = new JLabel("Clicked");
    private JLabel l2 = new JLabel("Pressed");
    private JLabel l3 = new JLabel("Released");
    private JLabel l4 = new JLabel("Entered");
    private JLabel l5 = new JLabel("Exited");

    private JTextField t1 = new JTextField();
    private JTextField t2 = new JTextField();
    private JTextField t3 = new JTextField();
    private JTextField t4 = new JTextField();
    private JTextField t5 = new JTextField();

    private int count1 = 0;
    private int count2 = 0;
    private int count3 = 0;
    private int count4 = 0;
    private int count5 = 0;

    public Mouseevent()
    {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(200,600));
        this.setTitle("MouseEvent");

        this.setLayout(new GridLayout(5,2));

        this.add(l1);
        this.add(t1);
        this.add(l2);
        this.add(t2);
        this.add(l3);
        this.add(t3);
        this.add(l4);
        this.add(t4);
        this.add(l5);
        this.add(t5);

        this.addMouseListener(this);

        this.pack();
        this.setVisible(true);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        this.count1++;
        this.t1.setText(""+this.count1);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.count2++;
        this.t2.setText(""+this.count2);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.count3++;
        this.t3.setText(""+this.count3);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.count4++;
        this.t4.setText(""+this.count4);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.count5++;
        this.t5.setText(""+this.count5);
    }
}
