package ch.fhnw.oopI2.MSPUEB.aufgabe01;

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


public class main_PersistentCalculator {

  public static void main(String[] args) {
    Calculator c = new Calculator();
    
    c.run();
    
    System.exit(0);
    
    
  }
  
}
