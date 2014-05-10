package ch.fhnw.oopI2.wo4.HelloWorldGUI;

import javax.swing.*;
import java.awt.*;

public class HelloWorld extends JFrame {

    private JLabel myText = new JLabel("Label");
    private JButton myButton = new JButton("Button");
    private JTextField textField = new JTextField("Text Field");
    private JPanel panel = new JPanel();
    private JTextArea textArea = new JTextArea("Text Area");

    private JButton b1 = new JButton("Button 1");
    private JButton b2 = new JButton("Button 2");
    private JButton b3 = new JButton("Button 3");
    private JButton b4 = new JButton("Button 4");

    public HelloWorld()
    {
        // initiale definitionen
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(300,300));
        this.setTitle("Hello World");

        // create layout elements and add/set it to the main frame
        BorderLayout borderLayout = new BorderLayout();
        this.setLayout(borderLayout);

        // customize the elements and/or add more layouts to panels and more objects to panels
        this.panel.setBackground(Color.BLACK);
        this.panel.setLayout(new GridLayout(4,1));
        this.panel.add(b1);
        this.panel.add(b2);
        this.panel.add(b3);
        this.panel.add(b4);

        // add other elements -> BorderLayout.North etc. is only used by a BorderLayout
        // when its a gridLayout only use add(somthing) it will be placed automaticly
        this.add(myText, BorderLayout.NORTH);
        this.add(myButton, BorderLayout.SOUTH);
        this.add(textField, BorderLayout.EAST);
        this.add(panel, BorderLayout.WEST);
        this.add(textArea, BorderLayout.CENTER);

        // pack and make it visible
        this.pack();
        this.setVisible(true);
    }
}
