package ch.fhnw.oopI2.wo1.u2_List;

public class Main {

    public static void main(String[] args){

        List l1 = new List();

        try {
            l1.popFront();
        }
        catch (NullPointerException e){
            System.out.println("Kein Objekt in der Liste vorhanden");
        }

    }

}
