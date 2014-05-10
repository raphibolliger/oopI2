package ch.fhnw.oopI2.wo3.u4;

import java.util.*;

/**
 * Created by raphi on 16.03.14.
 */
public class Main {

    public static void main(String[] args)
    {

        Set<Person> set1= new HashSet<Person>();
        Set<Person> set2= new TreeSet<Person>();
        Map<Integer, Person> map1= new HashMap<Integer, Person>();
        Map<String, Person> map2= new HashMap<String, Person>();

        Person[] personen= new Person[6];
        personen[0]= new Person(34, "Paul", 3255346);
        personen[1]= new Person(21, "Peter", 6325436);
        personen[2]= new Person(25, "Karl", 3255346);
        personen[3]= new Person(23, "Sabrina", 1435425);
        personen[4]= new Person(21, "Judith", 1435425);
        personen[5]= new Person(25, "Johanna", 6325436);
        for (int i=0; i<personen.length; i++){
            set1.add(personen[i]);
            set1.add(personen[i]);
            set2.add(personen[i]);
            map1.put(personen[i].getAlter(), personen[i]);
            map2.put(personen[i].getName(), personen[i]);
        }
        System.out.println("set1: HashSet mit Size: "+ set1.size());
        System.out.println("set2: TreeSet mit Size: " +set2.size());
        System.out.println("map1: HashMap mit Size: " +map1.size());
        System.out.println("map2: HashMap mit Size: "+ map2.size());

        Iterator<Person> i1 = set1.iterator();
        Iterator<Person> i2 = set2.iterator();

        while (i1.hasNext())
        {
            System.out.println(i1.next());
        }

        while (i2.hasNext())
        {
            System.out.println(i2.next());
        }

    }

}
