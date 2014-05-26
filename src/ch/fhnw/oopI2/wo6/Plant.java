package ch.fhnw.oopI2.wo6;

import java.io.Serializable;

public class Plant implements Serializable
{
    boolean indoor = false;
    int age = 3;
    double height = 2.3;
    public void print()
    {
        System.out.println(indoor +" / "+ age +" / "+ height);
    }
}
