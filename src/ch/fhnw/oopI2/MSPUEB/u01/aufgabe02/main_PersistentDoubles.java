package ch.fhnw.oopI2.MSPUEB.u01.aufgabe02;

// vtg - 2014-01-27 - OOP2 : Streams : Assignment 2

import ch.fhnw.oopI2.HelperClasses.Terminal;

import java.io.*;
import java.util.Arrays;

public class main_PersistentDoubles{

    private static final int INITIAL_SIZE = 10;
    private static final int DELTA = 20;

    private static double[] values = null;

    public static void main(String[] args)
    {
        int count = 0;
        double newValue = 0;

        // initialize program
        File file = new File("double.dat");
        if (file.exists())
        {
            try {
                FileInputStream fileInputStream = new FileInputStream("double.dat");
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                count = dataInputStream.readInt();
                values = new double[count];
                for (int i = 0; i < count; i++)
                {
                    values[i] = dataInputStream.readDouble();
                }
                System.out.println(Arrays.toString(values));
            }
            catch (FileNotFoundException e1)
            {
                e1.printStackTrace();
            }
            catch (IOException e2)
            {
                e2.printStackTrace();
            }
        }
        else
        {
            values = new double[INITIAL_SIZE];
        }

        // acquire new data
        while (true)
        {
            System.out.print("value #" + count + " : ");
            try
            {
                newValue = Terminal.readDouble();
            }
            catch (NumberFormatException e)
            {
                try
                {
                    FileOutputStream fileOutputStream = new FileOutputStream("double.dat");
                    DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                    dataOutputStream.writeInt(count);
                    for (int i = 0; i < values.length; i++)
                    {
                        dataOutputStream.writeDouble(values[i]);
                    }
                }
                catch (FileNotFoundException e1)
                {
                    e1.printStackTrace();
                }
                catch (IOException e2)
                {
                    e2.printStackTrace();
                }
                System.out.println("program terminated");
                System.exit(0);
            }
            if (count==values.length)
            {
                enlargeArray();
            }
            values[count++] = newValue;
        }
    }
  
    private static void enlargeArray()
    {
        double[] temp = new double[values.length + DELTA];
        for (int i=0; i<values.length; ++i){
        temp[i] = values[i];
      }
      values = temp;
    }
  
}
