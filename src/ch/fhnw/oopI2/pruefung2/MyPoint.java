package ch.fhnw.oopI2.pruefung2;

/**
 * Erstellt von raphi am 15.04.14.
 * Version : 1.0.0
 * Modul: oopI2
 */

public class MyPoint {

    private Point point;
    private int type;

    public MyPoint(Point point, int type) {
        this.point = point;
        this.type = type;
    }

    public Point getPoint() {
        return point;
    }

    public int getType() {
        return type;
    }
}
