package ch.fhnw.oopI2.wo6.Threads;

public class Main {

    public static void main(String[] args)
    {
        MyThread t1 = new MyThread(1);
        MyThread t2 = new MyThread(2);
        MyThread t3 = new MyThread(3);

        t1.start();
        t2.start();
        t3.start();
    }


}
