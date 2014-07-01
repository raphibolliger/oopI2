package ch.fhnw.oopI2.MSPUEB.PruefungVeitschegger.pruefung1.aufgabe01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Erstellt von raphi am 26.06.14.
 * Version : 1.0.0
 * Modul: algd1
 */
public class LineReader {

    public int countLines(String fileName)
    {
        try
        {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int lineCount = 0;
            while (bufferedReader.readLine() != null)
            {
                lineCount++;
            }
            return lineCount;
        }
        catch (FileNotFoundException e1)
        {
            return -1;
        }
        catch (IOException e2)
        {
            return -1;
        }
    }

    public static void main(String[] args)
    {
        LineReader lineReader = new LineReader();
        System.out.println(lineReader.countLines("/Daten/adf.txt"));
    }

}
