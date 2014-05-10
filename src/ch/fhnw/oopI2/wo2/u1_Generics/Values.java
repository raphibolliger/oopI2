package ch.fhnw.oopI2.wo2.u1_Generics;

public class Values  <T extends Comparable<T>> {

    private T val1;
    private T val2;

    public Values(T v1,T v2)
    {
        this.val1 = v1;
        this.val2 = v2;
    }

    public T getVal1()
    {
        return val1;
    }

    public void setVal1(T val1)
    {
        this.val1 = val1;
    }

    public T getVal2()
    {
        return val2;
    }

    public void setVal2(T val2)
    {
        this.val2 = val2;
    }

    public T getBigger()
    {
        if (val1.compareTo(val2) < 0) { return val1; }
            else { return val2; }
    }

    public boolean areEqual() { return val1.equals(val2); }
}
