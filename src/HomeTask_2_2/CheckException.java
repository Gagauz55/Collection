package HomeTask_2_2;

import java.util.*;

public class CheckException {
    int check;

    Scanner sc = new Scanner(System.in);

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
}

