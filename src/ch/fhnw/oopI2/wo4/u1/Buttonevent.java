package ch.fhnw.oopI2.wo4.u1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by raphi on 24.03.14.
 */
public class Buttonevent extends JFrame {

    private JTextField textField;
    private JButton button;

    public Buttonevent()
    {

        super("Buttonevent");

        GridLayout gridLayout = new GridLayout(2,1);
        setLayout(gridLayout);

        this.textField = new JTextField();
        this.button = new JButton("Button");

        add(this.textField);
        add(this.button);

        this.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                buttonClick();
            }
        });

        this.button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                buttonClick();
            }

            @Override
            public void mousePressed(MouseEvent e)
            {

            }

            @Override
            public void mouseReleased(MouseEvent e)
            {

            }

            @Override
            public void mouseEntered(MouseEvent e)
            {
                buttonEntered();
            }

            @Override
            public void mouseExited(MouseEvent e)
            {

            }
        });



        pack();
        setVisible(true);

    }

    private void buttonEntered()
    {
        this.button.setText("HDF This");
    }

    public void buttonClick()
    {
        this.textField.setText("Knopf wurde gedrückt");
    }

}
