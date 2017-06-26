package HomeTask_2_2;

import java.util.*;

public class MyQueue<T> extends AbstractQueue {
    int value;
    int check;
    Queue<T> myQueue = new LinkedList<T>();
    Scanner sc = new Scanner(System.in);

    @Override
    public int size() {

        System.out.println("Please enter Queue size:");
        intFromScanner();
        value = check;

        if (value <= 0) {
            System.out.println("Your value incorrect, default value is 16");
            value = 16;
        } else {
            System.out.println("Queue size is:" + " " + value);
            value = check;

        }
        return value;

    }


    public int intFromScanner() {
        int i;
        try {
            i = sc.nextInt();

        } catch (InputMismatchException e) {
            System.err.println("Please enter integer!");
            sc.next();
            i = intFromScanner();

        }
        return check = i;
    }


    //while (!sc.hasNextInt()) {
    //  System.err.println("Please enter integer!");
    //sc.next();
    //  }
    // return check = sc.nextInt();
    //  }

    public void displayQueue() {
        System.out.println(myQueue);
    }


    public T addElem(T obj) {
        if (myQueue.size() < value) {
            myQueue.offer(obj);

        } else {
            myQueue.poll();
            myQueue.offer(obj);
        }
        return obj;
    }

    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public Object poll() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public Iterator iterator() {
        return null;
    }


}



