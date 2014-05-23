package ch.fhnw.oopI2.wo6.Threads;

public class MyThread extends Thread {

    private static int counter = 0;
    private int number;

    public MyThread(int number)
    {
        this.number = number;
    }

    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Thread " + number + " " + count());
            try {
                sleep((int)(Math.random()*10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread " + number + " fertig.");
        }
    }

    private static synchronized int count()
    {
        return counter++;
    }

}
