package ch.fhnw.oopI2.wo1.u1_myVector;

import java.util.Arrays;

public class MyVector {

    private Object[] myvector;

    public MyVector (int capacity)
    {
        myvector = new Object[capacity];
    }

    public Object getElement(int index)
    {
        if (myvector[index] != null){
            return null;
        }
        else {
            return myvector[index];
        }
    }

    public int size(){

        int counter = 0;

        for (int i = 0; i < myvector.length; i++){
            if (myvector[i] != null){
                counter++;
            }
        }

        return counter;
    }

    public int capacity(){

        int counter = 0;

        for (int i = 0; i < myvector.length; i++){
            if (myvector[i] == null){
                counter++;
            }
        }

        return counter;
    }

    public void pushBack(Object p)
    {
        if (capacity() <= 0){
            this.myvector = Arrays.copyOf(this.myvector,myvector.length+1);
        }

        for (int i = 0; i < myvector.length; i++)
        {
            if (myvector[i] == null)
            {
                myvector[i] = p;
                return;
            }
        }
    }

    public Object popFront()
    {
        Object temp = myvector[0];
        myvector = Arrays.copyOfRange(myvector,1,myvector.length);
        return temp;
    }

}

