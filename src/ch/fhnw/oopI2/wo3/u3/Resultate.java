package ch.fhnw.oopI2.wo3.u3;

import java.util.ArrayList;

/**
 * Created by raphi on 03.03.14.
 */
public class Resultate<T extends Sportler> {

    private ArrayList<T> al = new ArrayList<T>();

    public void add(T resultat)
    {
        al.add(resultat);
    }

    public double computeAverage()
    {
        int tempresult = 0;

        for (int i = 0; i < al.size(); i++)
        {
            tempresult += al.get(i).getMessung();
        }
        double test = (double)tempresult / (double)al.size();
        return test;
    }

    public T getWinner()
    {
        if (al.size() == 0) return null;

        T temp = al.get(0);

        for (int i = 0; i < al.size()-1;i++)
        {
            if (temp.isBetter(al.get(i+1))) temp = al.get(i+1);
        }
        return temp;
    }

}
