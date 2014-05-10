package ch.fhnw.oopI2.wo1.u2_List;

public class ListElement {

    private ListElement next;
    private int value;

    public ListElement(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return this.value;
    }

    public ListElement getNext()
    {
        return next;
    }

    public void setNext(ListElement next)
    {
        this.next = next;
    }

    public boolean equals(Object o)
    {
        Object temp = (Object)this.value;
        return temp.equals(o);
    }
}
