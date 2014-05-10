package ch.fhnw.oopI2.wo3.u3;

/**
 * Created by raphi on 03.03.14.
 */
public class Eiskunstlaeufer implements Sportler {

    private Integer messung;

    public Eiskunstlaeufer(int messung)
    {
        this.messung = messung;
    }

    @Override
    public int getMessung()
    {
        return this.messung;
    }

    @Override
    public boolean isBetter(Sportler s)
    {
        if (this.messung > s.getMessung())
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return this.messung.toString();
    }

}
