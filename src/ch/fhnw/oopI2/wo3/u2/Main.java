package ch.fhnw.oopI2.wo3.u2;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 * Created by raphi on 03.03.14.
 */
public class Main {

    public static void main(String[] args)
    {

        ArrayList<Integer> liste = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        for (int i = 0; i < 10; i++)
        {
            liste.add(i);
            stack.add(i);
            queue.add(i);
        }

        for (int i = 0; i < liste.size(); i++)
        {
            System.out.println(liste.get(i));
        }
        System.out.println();

        for (int i = 0; i < liste.size(); i++)
        {
            liste.remove(i);
        }

        int stackSize = stack.size();
        for (int i = 0; i < stackSize; i++)
        {
            System.out.println(stack.pop());
        }

        int queueSize = queue.size();
        for (int i = 0; i < queueSize; i++)
        {
            System.out.println(queue.poll());
        }

    }


}
