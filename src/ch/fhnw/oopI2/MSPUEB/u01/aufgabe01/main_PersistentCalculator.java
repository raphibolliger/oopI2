package ch.fhnw.oopI2.MSPUEB.u01.aufgabe01;

//******************************************************************************
//  RPN Calculator with persistent data (Streams)                         vtg  *
// --------------------------------------------------------------------------- *
//  version 1   : 2007-09                                                      *
//  version 2   : 2008-10 : data entry improved                                *
//  version 3   : 2009-09 : user interface outsourced (Calculator)             *
//  version 3.1 : 2010-06 : minor changes                                      *
//  version 3.2 : 2010-09 : minor changes                                      *
//  version 4.0 : 2014-01 : recycled as Stream excercise                       *
// --------------------------------------------------------------------------- *
//  Used libraries/classes : VTerm 1.4, Fraction                               *
//******************************************************************************

import java.io.*;

public class main_PersistentCalculator
{

  public static void main(String[] args)
  {
      Calculator c = new Calculator();

      // datei einlesen
      File file = new File("calculator.ini");
      if (file.exists())
      {
          try
          {
              int[] values = new int[4];
              int counter = 0;
              FileReader fileReader = new FileReader("calculator.ini");
              BufferedReader bufferedReader = new BufferedReader(fileReader);
              String line = bufferedReader.readLine();

              while (line != null && counter < 4)
              {
                  String[] splitted = line.split("=");
                  values[counter] = Integer.parseInt(splitted[1].trim());
                  counter++;
                  line = bufferedReader.readLine();
              }
              c.setPosition(values[0], values[1]);
              c.setFraction(0, new Fraction(values[2], values[3]));
          }
          catch (FileNotFoundException e)
          {
              e.printStackTrace();
          }
          catch (IOException e)
          {
              e.printStackTrace();
          }
      }

      // programm starten
      c.run();

      // werte auslesen und abspeichern
      int[] position = c.getPosition();
      Fraction firstFraction = c.getFraction(0);

      try
      {
          // initialize writers
          FileWriter fileWriter = new FileWriter("calculator.ini");
          BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

          // write window coordinats
          bufferedWriter.write("posx = " + position[0]);
          bufferedWriter.newLine();
          bufferedWriter.write("posy = " + position[1]);
          bufferedWriter.newLine();

          // write first fraction
          bufferedWriter.write("nx = " + firstFraction.getNumerator());
          bufferedWriter.newLine();
          bufferedWriter.write("dx = " + firstFraction.getDenominator());
          bufferedWriter.newLine();

          // close writers
          bufferedWriter.close();
          fileWriter.close();

      }
      catch (IOException e)
      {
          e.printStackTrace();
      }


      System.exit(0);
  }
  
}
