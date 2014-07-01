package ch.fhnw.oopI2.MSPUEB.PruefungVeitschegger.pruefung2.aufgabe02;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.metal.MetalBorders;
import java.awt.*;

public class MainWindow extends JFrame
{

    private JPanel leftPanel = new JPanel();
    private JPanel centerPanel = new JPanel();
    private JPanel bottomPanel = new JPanel();

    public MainWindow()
    {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("2014 - GUI - Prüfung 2");
        setLayout(new BorderLayout());

        // add left panel with RotaryKnobs
        leftPanel.setLayout(new GridLayout(3,2));
        leftPanel.setBorder(new CompoundBorder(new EmptyBorder(10,10,10,10), new CompoundBorder(new BevelBorder(BevelBorder.LOWERED), new BevelBorder(BevelBorder.LOWERED))));

        for (int i = 0; i < 6; i++)
        {
            leftPanel.add(new JButton());
        }
        add(leftPanel, BorderLayout.WEST);

        // add center panel with the two empty panels (borders!!!)
        centerPanel.setLayout(new GridLayout(1,2));
        centerPanel.setBorder(new EmptyBorder(10,10,10,10));
        JPanel centerLeftPanel = new JPanel();
        JPanel centerRightPanel = new JPanel();

        centerLeftPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
        centerRightPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));

        centerPanel.add(centerLeftPanel);
        centerPanel.add(centerRightPanel);

        add(centerPanel, BorderLayout.CENTER);

        // add bottom panel
        bottomPanel.setLayout(new GridLayout(1,7));
        bottomPanel.setBorder(new EmptyBorder(10,10,10,10));

        bottomPanel.add(new JPanel());
        for (int i = 0; i < 5; i++)
        {
            bottomPanel.add(new JButton());
        }
        bottomPanel.add(new JPanel());

        add(bottomPanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new MainWindow();
    }

}
