package HomeTask_2_2;

import java.util.*;

public class MyQueue <T> {
    int size;
    int check;
    Queue<T> myQueue = new LinkedList<T>();
    Scanner sc = new Scanner(System.in);

    public int sizeQueue() {
        System.out.println("Please enter Queue size:");
        intFromScanner(sc);
        size = check;

        if (size <= 0) {
            System.out.println("Your value incorrect, default value is 16");
            size = 16;
        } else {
            System.out.println("Queue size is:" + " " + size);
            size = check;

        }
        return size;

    }


    public int intFromScanner(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.err.println("Please enter integer!");
            sc.next();
        }
        return check = sc.nextInt();
    }

    public void displayQueue() {
        System.out.println(myQueue);
    }


    public T addElem(T obj) {
        if (myQueue.size() < size) {
            myQueue.offer(obj);
        }else {
            myQueue.poll();
            myQueue.offer(obj);
        }
        return obj;
    }
        }



