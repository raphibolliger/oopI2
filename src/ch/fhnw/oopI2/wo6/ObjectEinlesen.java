package ch.fhnw.oopI2.wo6;

import java.io.*;

public class ObjectEinlesen {

    public static void main(String[] args)
    {
        try
        {
            FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            Plant p = new Plant();
            p.age = 3;
            p.height = 4.3;
            p.indoor = true;

            objectOutputStream.writeObject(p);

            FileInputStream fileInputStream = new FileInputStream("test.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            p = (Plant) objectInputStream.readObject();
            p.print();
        }
        catch (FileNotFoundException e1)
        {
            System.out.println(e1.getMessage());
        }
        catch (IOException e2)
        {
            System.out.println(e2.getMessage());
        }
        catch (ClassNotFoundException e3)
        {
            e3.getMessage();
        }


    }

}

