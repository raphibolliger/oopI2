package ch.fhnw.oopI2.MSPUEB.PruefungVeitschegger.pruefung1.aufgabe04;

import java.util.ArrayList;

public class Stack<T> {

    private ArrayList<T> al;
    private int size;

    public Stack()
    {
        al = new ArrayList<T>();
        size = -1;
    }

    public boolean isEmpty()
    {
        return al.isEmpty();
    }

    public void push(T object)
    {
        al.add(object);
        size++;
    }

    public T pop()
    {
        if (size < 0)
        {
            return null;
        }
        else
        {
            T temp = al.remove(size);
            size--;
            return temp;
        }
    }

    public T top()
    {
        if (size < 0)
        {
            return null;
        }
        else
        {
            return al.get(size);
        }
    }
}
