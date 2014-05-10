package ch.fhnw.oopI2.wo4.u2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by raphi on 24.03.14.
 */
public class Mousevent extends JFrame implements MouseListener {

    private JLabel lblClicked;
    private JLabel lblEntered;
    private JLabel lblExited;
    private JLabel lblPressed;
    private JLabel lblReleased;

    private JTextField txtClicked;
    private JTextField txtEntered;
    private JTextField txtExited;
    private JTextField txtPressed;
    private JTextField txtReleased;

    private int countClicked;
    private int countEntered;
    private int countExited;
    private int countPressed;
    private int countRleased;

    public Mousevent()
    {
        super("Mouseevent");

        GridLayout gridLayout = new GridLayout(5,2);
        setLayout(gridLayout);

        this.lblClicked = new JLabel("Clicked");
        this.lblEntered = new JLabel("Entered");
        this.lblExited = new JLabel("Exited");
        this.lblPressed = new JLabel("Pressed");
        this.lblReleased = new JLabel("Released");

        this.txtClicked = new JTextField();
        this.txtEntered = new JTextField();
        this.txtExited = new JTextField();
        this.txtPressed = new JTextField();
        this.txtReleased = new JTextField();

        this.countClicked = 0;
        this.countEntered = 0;
        this.countExited = 0;
        this.countPressed = 0;
        this.countRleased = 0;

        add(lblClicked);
        add(txtClicked);
        add(lblEntered);
        add(txtEntered);
        add(lblExited);
        add(txtExited);
        add(lblPressed);
        add(txtPressed);
        add(lblReleased);
        add(txtReleased);

        this.addMouseListener(this);

        pack();
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        this.countClicked++;
        this.txtClicked.setText(""+this.countClicked);
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        this.countPressed++;
        this.txtPressed.setText(""+this.countPressed);
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        this.countRleased++;
        this.txtReleased.setText(""+this.countRleased);
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
        this.countEntered++;
        this.txtEntered.setText(""+this.countEntered);
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
        this.countExited++;
        this.txtExited.setText(""+this.countExited);
    }
}
