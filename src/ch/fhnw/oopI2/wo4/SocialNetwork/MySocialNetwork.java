package ch.fhnw.oopI2.wo4.SocialNetwork;

public class MySocialNetwork {

    public static void main(String[] args)
    {

        Networker peter = new Networker("Peter");
        Networker andrea = new Networker("Andrea");
        Networker paul = new Networker("Paul");
        Networker maike = new Networker("Maike");

        peter.addObserver(paul);
        paul.addObserver(peter);
        andrea.addObserver(maike);
        maike.addObserver(andrea);
        peter.addObserver(maike);
        maike.addObserver(peter);

        paul.postMessage("Hello everybody");

        peter.postMessage("I have a girlfriend");
        maike.postMessage("I have a boyfriend");

        peter.deleteObserver(maike);
        maike.deleteObserver(peter);

        maike.postMessage("I am single");
        peter.postMessage("I am single");

    }



}
