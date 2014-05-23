package ch.fhnw.oopI2.wo6.Runnable;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JButton implements Runnable, ActionListener {

    private JLabel counter;

    public MyButton(JLabel label)
    {
        this.counter = label;
        addActionListener(this);
    }

    @Override
    public void run()
    {
        while (true) {
            setText("clicken");
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setText("");
            try {
                Thread.sleep((int) (Math.random() * 10000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getActionCommand() == "clicken")
        {
            int c = Integer.parseInt(this.counter.getText());
            this.counter.setText("" + (++c));
        }
    }
}
