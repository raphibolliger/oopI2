package ch.fhnw.oopI2.wo4.u1new;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttonevent extends JFrame {

    private JButton button = new JButton("Button");
    private JTextField textField = new JTextField("TextField");
    private int buttonCount = 0;
    private int buttonColor = 0;

    public Buttonevent()
    {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(300,300));

        this.setLayout(new GridLayout(2,1));

        this.button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                buttonClicked();
            }
        }
        );

        this.add(button);
        this.add(textField);

        this.pack();
        this.setVisible(true);
    }

    private void buttonClicked()
    {
        if (buttonColor < 2 )
            buttonColor++;
        else
            buttonColor = 0;

        this.buttonCount++;
        this.textField.setText("Button gederückt!");
        this.button.setText(""+this.buttonCount);

        switch (buttonColor)
        {
            case 0:
                this.button.setBackground(Color.YELLOW);
                break;
            case 1:
                this.button.setBackground(Color.BLUE);
                break;
            case 2:
                this.button.setBackground(Color.GREEN);
                break;
        }

        this.button.setOpaque(true);
        this.button.setBorderPainted(false);
    }

}
