package ch.fhnw.oopI2.MSPUEB.u03.aufgabe01;

public class Vector<T> {

    public static final int INITIAL_SIZE = 16;

    private Object[] array;
    private int size;

    public Vector()
    {
        array = new Object[INITIAL_SIZE];
        size = 0;
    }

    public Vector(Vector<T> vector)
    {

    }

    public T getElement(int index)
    {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("getElement: index out of range");
        return (T)array[index];
    }

    public void setElement(int index, T obj)
    {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("setElement: index out of range");
        array[index] = obj;
    }

    public int getSize()
    {
        return size;
    }

    public int getCapacity()
    {
        return array.length;
    }

    public void pushBack(T obj)
    {
        setElement(size+1, obj);
    }

    public T popFront()
    {
        if (array.length == 0)
        {
            return null;
        }
        else
        {
            T temp = (T)array[0];

            for (int i = 0; i < array.length-1; i++)
            {
                array[i] = array[i+1];
            }
            array[array.length-1] = null;

            return temp;

        }
    }



}
