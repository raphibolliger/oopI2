package ch.fhnw.oopI2.wo4.Messstation;

import java.util.Observable;

public class Station extends Observable {

    public static double MAX_VALUE = 0.8;

    public void nextMeasurement()
    {
        int messung = (int)(Math.random() * 2);

        if (messung > MAX_VALUE)
        {
            setChanged();
            notifyObservers();
        }
    }
}
