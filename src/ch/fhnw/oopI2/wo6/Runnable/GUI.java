package ch.fhnw.oopI2.wo6.Runnable;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    public GUI()
    {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(300,300));

        setLayout(new BorderLayout());

        JLabel counter = new JLabel("0");
        add(counter, BorderLayout.SOUTH);

        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(5,5));
        for (int i = 0; i < 25; i++)
        {
            MyButton button = new MyButton(counter);
            Thread t = new Thread(button);
            t.start();
            buttons.add(button);
        }

        add(buttons, BorderLayout.CENTER);


        pack();
        setVisible(true);
    }

}
