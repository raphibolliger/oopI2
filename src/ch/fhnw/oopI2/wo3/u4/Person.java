package ch.fhnw.oopI2.wo3.u4;

/**
 * Created by raphi on 16.03.14.
 */
public class Person implements Comparable<Person> {

    private int alter;
    private String name;
    private int matrikelnummer;

    public Person(int alter, String name, int matrikelnummer)
    {
        this.alter = alter;
        this.name = name;
        this.matrikelnummer = matrikelnummer;
    }

    public int getAlter()
    {
        return alter;
    }

    public void setAlter(int alter)
    {
        this.alter = alter;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getMatrikelnummer()
    {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer)
    {
        this.matrikelnummer = matrikelnummer;
    }

    @Override
    public String toString()
    {
        String temp = this.name + " (" + this.alter + ") " + "hat die Nummer: " + this.matrikelnummer;
        return temp;
    }

    public boolean equals(Person person)
    {
        if (this.alter == person.getAlter())
        {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Person person)
    {
        int temp = 0;
        if (this.alter > person.getAlter()) temp = 1;
        if (this.alter < person.getAlter()) temp = -1;
        return temp;
    }

    @Override
    public int hashCode()
    {
        return this.alter;
    }
}
