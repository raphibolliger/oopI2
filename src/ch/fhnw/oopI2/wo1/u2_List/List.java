package ch.fhnw.oopI2.wo1.u2_List;

public class List {

    private ListElement head;
    private ListElement tail;

    public List()
    {
        this.head = null;
        this.tail = null;
    }

    public ListElement getElement(int index)
    {
        if (this.head == null)
        {
            return null;
        }
        ListElement temp = head;
        for (int i = 0; i < index; i++)
        {
            temp = temp.getNext();
        }
        return temp;
    }

    public int size()
    {
        ListElement temp = head;
        int counter = 0;

        while (temp != null){
            temp = temp.getNext();
            counter++;
        }

        return counter;
    }

    public void pushBack(ListElement p)
    {
        if (head == null && tail == null)
        {
            this.head = p;
            this.tail = p;
        }

        tail.setNext(p);
        tail = p;
    }

    public ListElement popFront()
    {
        ListElement temp = getElement(0);
        head = getElement(1);
        return temp;
    }


}
