package ch.fhnw.oopI2.pruefung2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

/**
 * Erstellt von raphi am 15.04.14.
 * Version : 1.0.0
 * Modul: oopI2
 */

public class MyPanel extends JPanel implements MouseListener {

    private ArrayList<MyPoint> ad = new ArrayList<MyPoint>();
    private int type;

    public MyPanel()
    {
        this.addMouseListener(this);
    }

    public void setType(int a)
    {
        this.type = a;
    }

    @Override
    public void paint(Graphics g)
    {
        if (g == null) return;
        super.paint(g);

        for (int i = 0; i < ad.size(); i++)
        {
            int xCenter = this.getWidth()/2;
            int yCenter = this.getHeight()/2;

            switch (ad.get(i).getType())
            {
                case 1:
                    g.drawLine(ad.get(i).getPoint().getX(), ad.get(i).getPoint().getY(), xCenter, yCenter);
                    break;
                case 2:
                    g.drawString("x",ad.get(i).getPoint().getX(), ad.get(i).getPoint().getY());
                    break;
                case 3:
                    g.drawRect(ad.get(i).getPoint().getX()-5, ad.get(i).getPoint().getY()-5,10,10);
                    break;
                case 4:
                    g.drawOval(ad.get(i).getPoint().getX()-5, ad.get(i).getPoint().getY()-5,10,10);
                    break;
            }
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        switch (this.type)
        {
            case 1:
                ad.add(new MyPoint(new Point(e.getX(),e.getY()), this.type));
                repaint();
                break;
            case 2:
                ad.add(new MyPoint(new Point(e.getX(),e.getY()), this.type));
                repaint();
                break;
            case 3:
                ad.add(new MyPoint(new Point(e.getX(),e.getY()), this.type));
                repaint();
                break;
            case 4:
                ad.add(new MyPoint(new Point(e.getX(),e.getY()), this.type));
                repaint();
                break;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
