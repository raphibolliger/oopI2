package ch.fhnw.oopI2.wo6.Einlesen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class GUI extends JFrame {

    private JTextField textFieldName = new JTextField();
    private JButton buttonShowInfo = new JButton("show Info");
    private JButton buttonshowDirectory = new JButton("show Directory");
    private JButton buttonUseFileReader = new JButton("use FileReader");
    private JButton buttonUseBufferedReader = new JButton("use BufferedReader");
    private JButton buttonUseLineNumberReader = new JButton("use LineNumberReader");
    private JButton buttonSaveText = new JButton("save Text");
    private JTextArea textAreaOutput = new JTextArea();
    private JTextField textFieldErrorMessage = new JTextField();

    public GUI()
    {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Übung Einlesen");
        setLayout(new BorderLayout());

        // create top panel
        JPanel top = new JPanel();
        top.setLayout(new GridLayout(4,4));

        // add listeners to all buttons
        buttonShowInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                showInfo();
            }
        });

        // add all components to the top panel
        top.add(new JLabel("Name:"));
        top.add(textFieldName);
        top.add(buttonShowInfo);
        top.add(buttonshowDirectory);
        top.add(buttonUseFileReader);
        top.add(buttonUseBufferedReader);
        top.add(buttonUseLineNumberReader);
        top.add(buttonSaveText);

        // add top panel and bottom text field
        add(top, BorderLayout.NORTH);
        add(textAreaOutput, BorderLayout.CENTER);
        add(textFieldErrorMessage, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    private void showInfo()
    {
        textAreaOutput.setText("");
        textFieldErrorMessage.setText("");

        String filename = textFieldName.getText();
        File theFile = new File(filename);

        try
        {
            if (theFile.exists())
            {
                textAreaOutput.append("exisitert \n");
                if (theFile.isFile())
                    textAreaOutput.append("ist ein File \n");

                if (theFile.isDirectory())
                    textAreaOutput.append("ist ein Directory \n");

                if (theFile.canRead())
                    textAreaOutput.append("Kann gelesen werden \n");

                if (theFile.canWrite())
                    textAreaOutput.append("Kann geschrieben werden \n");
            }
        }
        catch (Exception e1)
        {
            textFieldErrorMessage.setText("Fehler! " + e1.getMessage());
        }


    }
}
