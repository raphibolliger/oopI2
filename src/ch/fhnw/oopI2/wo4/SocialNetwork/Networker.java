package ch.fhnw.oopI2.wo4.SocialNetwork;

import java.util.Observable;
import java.util.Observer;

public class Networker extends Observable implements Observer {

    private String name;
    private String message;

    public Networker(String name)
    {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg)
    {
        if (o instanceof Networker)
        {
            Networker myFriend = (Networker) o;
            System.out.println("Dear "+ ((Networker) o).name + " I have seen that you posted: "+ ((Networker) o).message);
        }
    }

    public void postMessage(String message)
    {
        this.message = message;
        setChanged();
        notifyObservers();
    }

}
