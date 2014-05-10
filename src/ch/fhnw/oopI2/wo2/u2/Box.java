package ch.fhnw.oopI2.wo2.u2;

/**
 * Created by raphi on 24.02.14.
 */
public class Box<T> {

    private T val;

    public void setVal (T val)
    {
        this.val = val;
    }

    public T getVal()
    {
        return this.val;
    }

}
