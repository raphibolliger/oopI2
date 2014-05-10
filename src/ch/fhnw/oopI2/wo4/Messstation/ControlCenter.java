package ch.fhnw.oopI2.wo4.Messstation;

import java.util.Observable;
import java.util.Observer;

public class ControlCenter implements Observer {

    @Override
    public void update(Observable o, Object arg)
    {
        System.out.println("Der Messwert wurde überschritten.");
    }
}
