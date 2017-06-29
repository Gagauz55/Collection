package HomeTask_2_2;

import java.util.*;


public class MyQueue<T> extends AbstractQueue {

    int value;
    int check;

    public MyQueue() {
        int value = 0;
        int check = 0;
        int element = 0;
    }


    Queue<T> queue = new LinkedList<>();
    CheckException checkException = new CheckException();
    Scanner sc = new Scanner(System.in);


    @Override
    public int size() {

        System.out.println("Please enter Queue size:");
        checkException.intFromScanner();
        value = checkException.check;

        if (value <= 0) {
            System.out.println("Your value incorrect, default value is 16");
            value = 16;
        } else {
            System.out.println("Queue size is:" + " " + value);
            value = checkException.check;

        }
        return value;

    }

    public void queueCreate() {
        boolean test;
        do {
            System.out.println("Enter the elements of collection. For quit enter 0");

            Integer choice = 0;
            checkException.intFromScanner();
            choice = checkException.check;

            if (choice.equals(0)) {
                test = false;
                displayQueue();
                return;
            } else {
                addElem((T) choice);
                displayQueue();
                test = true;
            }


        } while (test = true);

    }


    public void displayQueue() {
        System.out.println(queue.toString());
    }


    public T addElem(T obj) {
        if (queue.size() < value) {
            queue.offer((T) obj);

        } else {
            queue.poll();
            queue.offer(obj);
        }
        return obj;
    }


    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public Object poll() {
        return null;
    }

    @Override
    public Object element() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }
}

