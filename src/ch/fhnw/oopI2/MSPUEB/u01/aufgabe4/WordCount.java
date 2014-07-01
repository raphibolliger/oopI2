package ch.fhnw.oopI2.MSPUEB.u01.aufgabe4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

    private String path = "/Daten/";
    private String file;
    private long wordCounter;

    public WordCount(String file)
    {
        this.file = file;
        this.wordCounter = 0;
    }

    public void countWords()
    {
        this.wordCounter = 0;
        try
        {
            boolean seperatorBefore = false;
            FileReader fileReader = new FileReader(path+file);
            int c;
            while ((c = fileReader.read()) != -1)
            {
                if (isSeperator(c))
                {
                    if (!seperatorBefore)
                    {
                        wordCounter++;
                        seperatorBefore = true;
                    }
                }
                else
                {
                    seperatorBefore = false;
                }
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e2)
        {
            e2.printStackTrace();
        }
        System.out.println(this.wordCounter);
    }

    public void printCharNumbers()
    {
        try
        {
            FileReader fileReader = new FileReader(path+file);
            int c;
            while ((c = fileReader.read()) != -1)
            {
                //System.out.print(c + " ");
                if (isSeperator(c))
                    System.out.print("+");
                else
                    System.out.print("-");
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e2)
        {
            e2.printStackTrace();
        }
    }

    private boolean isSeperator(int c)
    {
        if ((c == 45) || (c == 228) || (c == 246) || (c == 252) || (c == 196) || (c == 214) || (c == 220))
            return false;
        else if (c > 48 && c < 75)
            return false;
        else if (c > 65 && c < 90)
            return false;
        else if (c > 97 && c < 122)
            return false;


        return true;
    }

    public static void main(String[] args)
    {
        WordCount wordCount = new WordCount("test.txt");
        wordCount.printCharNumbers();
        System.out.println();
        wordCount.countWords();
    }

}
