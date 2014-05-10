package ch.fhnw.oopI2.wo5.MyCanvas;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class MyCanvas extends Canvas implements MouseListener {

    private int oldX;
    private int oldY;
    private int enterX;
    private int enterY;
    private ArrayList<Line> lineList = new ArrayList<Line>();
    private Color myColor;

    public MyCanvas()
    {
        this.setBackground(Color.WHITE);
        this.addMouseListener(this);

        this.myColor = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(myColor);
        for (int i = 0; i < lineList.size(); i++)
        {
            Line temp = lineList.get(i);
            g.drawLine(temp.xStart, temp.yStart, temp.xEnd, temp.yEnd);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        this.myColor = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        this.oldX = e.getX();
        this.oldY = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        lineList.add(new Line(oldX,oldY,e.getX(),e.getY()));
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
        this.enterX = e.getX();
        this.enterY = e.getY();
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
        lineList.add(new Line(enterX,enterY,e.getX(),e.getY()));
        repaint();
    }
}
