package ch.fhnw.oopI2.wo6.Einlesen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

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
        buttonshowDirectory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDir();
            }
        });
        buttonUseFileReader.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showFile1();
            }
        });
        buttonUseBufferedReader.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showFile2();
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
            else
            {
                textFieldErrorMessage.setText("Datei oder Pfad exisitert nicht.");
            }
        }
        catch (Exception e1)
        {
            textFieldErrorMessage.setText("Fehler! " + e1.getMessage());
        }
    }

    private void showDir()
    {
        textAreaOutput.setText("");
        textFieldErrorMessage.setText("");

        String filename = textFieldName.getText();
        File theFile = new File(filename);

        try
        {
            if (theFile.exists())
            {
                if (theFile.isDirectory())
                {
                    String[] list = theFile.list();

                    for (String aList : list) {
                        textAreaOutput.append(aList + "\n");
                    }
                }
                else
                {
                    textFieldErrorMessage.setText("Dieser Pfad ist kein Directory");
                }
            }
            else
            {
                textFieldErrorMessage.setText("Dieser Pfad exisitert nicht");
            }
        }
        catch (Exception e2)
        {
            textFieldErrorMessage.setText("Fehler! "+ e2.getMessage());
        }
    }

    private void showFile1()
    {
        textAreaOutput.setText("");
        textFieldErrorMessage.setText("");

        String filename = textFieldName.getText();

        try
        {
            FileReader filereader = new FileReader(filename);
            int ascii;

            do
            {
                ascii = filereader.read();
                char b = (char) ascii;
                textAreaOutput.append(""+b);

            } while (ascii >= 0);
        }
        catch (FileNotFoundException e1)
        {
            textFieldErrorMessage.setText("Das File wurde nicht gefunden");
        }
        catch (IOException e)
        {
            textFieldErrorMessage.setText("Das File konnte nicht gelesen werden");
        }
    }

    private void showFile2()
    {
        textAreaOutput.setText("");
        textFieldErrorMessage.setText("");

        String filename = textFieldName.getText();

        try
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            String line;

            do
            {
                line = bufferedReader.readLine();
                textAreaOutput.append(line);
                textAreaOutput.append("\n");
            } while (line != null);
        }
        catch (FileNotFoundException e1)
        {
            textFieldErrorMessage.setText("Das File wurde nicht gefunden");
        }
        catch (IOException e)
        {
            textFieldErrorMessage.setText("Das File konnte nicht gelesen werden");
        }
    }
}
