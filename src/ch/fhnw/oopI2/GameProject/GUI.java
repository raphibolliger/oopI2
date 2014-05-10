package ch.fhnw.oopI2.GameProject;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Raphael Bolliger on 16.04.14.
 */

public class GUI extends JFrame implements ActionListener {

    public static void main(String[] args)
    {
        new GUI();
    }

    private JLabel titelLabel = new JLabel("Hangman");
    private JButton startButton = new JButton("Start");
    private JPanel topPanel = new JPanel();
    private JPanel imagePanel = new JPanel();
    private JPanel bottomPanel = new JPanel();
    private JLabel word = new JLabel();
    private Hangman hangmanGame;

    public GUI()
    {
        // Set default values for the window
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setPreferredSize(new DimensionUIResource(400,400));
        this.setLayout(new BorderLayout());

        // Set layout for the top panel and add the components
        topPanel.setLayout(new GridLayout(1,2));
        topPanel.add(titelLabel);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hangmanGame = new Hangman("GIRAFFE");
                word.setText(hangmanGame.getHiddenWord());
            }
        });
        topPanel.add(startButton);

        // Add topPanel and imagePanel to the main window
        this.add(topPanel, BorderLayout.NORTH);
        this.add(imagePanel, BorderLayout.SOUTH);

        // Set the layout at the bottom panel
        bottomPanel.setLayout(new GridLayout(2,1));
        bottomPanel.add(word);

        // Add the Buttons A - Z
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2,13));
        for (int i = 0; i < 26; i++)
        {
            char letter = (char)(65+i);
            JButton button = new JButton(""+letter);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        bottomPanel.add(buttonPanel);

        this.add(bottomPanel, BorderLayout.SOUTH);

        this.newGame();

        this.pack();
        this.setVisible(true);
    }

    public void newGame()
    {
        this.hangmanGame = new Hangman("KROKODIL");
        this.word.setText(hangmanGame.getHiddenWord());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        hangmanGame.tryLetter(e.getActionCommand().charAt(0));
        this.word.setText(hangmanGame.getHiddenWord());
        System.out.println("Button Pressed");
    }
}
