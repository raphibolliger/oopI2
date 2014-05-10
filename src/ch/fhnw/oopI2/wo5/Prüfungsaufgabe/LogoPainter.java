package ch.fhnw.oopI2.wo5.Prüfungsaufgabe;

import javax.swing.*;
import java.awt.*;

public class LogoPainter extends JPanel {

    public void paintLogo(Graphics g, Color color, int size, int posX, int posY)
    {
        if (g == null) return;
        super.paint(g);
        g.setColor(color);
        g.fillRect(posX, posY, size, size);
        if (color == Color.WHITE) g.setColor(Color.LIGHT_GRAY);
        else g.setColor(Color.WHITE);
        g.fillOval(posX+5, posY+5,size-10,size-10);
        g.setColor(Color.BLACK);
        g.fillRect(posX+(size/2)-5,posY+(size/2)-5,10,10);
    }
}
