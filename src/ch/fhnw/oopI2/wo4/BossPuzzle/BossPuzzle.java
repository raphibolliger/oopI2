package ch.fhnw.oopI2.wo4.BossPuzzle;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class BossPuzzle extends JFrame {

    private JButton[] buttons;
    private JButton startButton;
    private JLabel anzahlZuege;
    private JLabel titel;

    public BossPuzzle()
    {
        super("Boss Puzzle");

        startButton = new JButton("Start");
        anzahlZuege = new JLabel("test");
        titel = new JLabel("Willkommen");

        BorderLayout allOverLayout = new BorderLayout();
        GridLayout buttonLayout = new GridLayout(3,3);
        GridLayout controlLayout = new GridLayout(2,1);

        JPanel buttonPanel = new JPanel();
        JPanel controlPanel = new JPanel();

        this.titel.setFont(new Font("Arial",1,24));
        this.anzahlZuege.setFont(new Font("Arial", 1, 20));
        this.startButton.setFont(new Font("Arial",1,20));

        this.titel.setHorizontalAlignment(JLabel.CENTER);

        allOverLayout.setHgap(20);

        buttonLayout.setHgap(10);
        buttonLayout.setVgap(10);

        controlLayout.setHgap(5);

        setLayout(allOverLayout);
        buttonPanel.setLayout(buttonLayout);
        controlPanel.setLayout(controlLayout);

        controlPanel.setBorder(new EmptyBorder(5,60,5,60));

        this.buttons = new JButton[9];
        Font buttonFont = new Font("Arial",1,38);

        for (Integer i = 0; i < this.buttons.length; i++)
        {
            this.buttons[i] = new JButton();
            this.buttons[i].setText(i.toString());
            this.buttons[i].setFont(buttonFont);
            buttonPanel.add(this.buttons[i]);
        }

        this.buttons[8].setText("");

        controlPanel.add(this.startButton);
        controlPanel.add(this.anzahlZuege);

        this.add(buttonPanel);
        this.add(this.titel, BorderLayout.NORTH);
        this.add(controlPanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);

    }

    public void moveButtons(JButton button)
    {
        if (button == this.buttons[0])
        {

        }
    }


}
