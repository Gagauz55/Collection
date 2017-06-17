package HomeTask_2_2;

import java.util.*;

/**
 * Необходимо реализовать коллекцию, которая имеет фиксированный размер.
 * Размер задаётся:
 * <p>
 * по умолчанию 16
 * по указанию пользователя.
 * <p>
 * Размер коллекции после инициализации меняться не может.
 * <p>
 * Каждый новый элемент добавляется в конец. После того, как количество элементов достигло максимума -
 * при добавлении нового элемента коллекция "сдвигается" влево.
 * <p>
 * 1-й элемент удаляется, а каждый следующий смещается на один элемент влево.
 * <p>
 * Результатом выполнения задания должен быть репозиторий с коллекцией, классом, тестирующим данную коллекцию,
 * описанием задания и README файлом с инструкцией по запуску приложения
 * <p>
 * Trunov Dmitry/
 */
public class RunApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyQueue<Integer> run = new MyQueue<Integer>();
        run.sizeQueue();


        boolean test;
        do {
            System.out.println("Enter the elements of collection. For quit enter 0");

            Integer choice=0;
            run.intFromScanner();
            choice=run.check;

            if (choice.equals(0)) {
                test = false;
                run.displayQueue();
                return;
            } else {
                run.addElem(choice);
                run.displayQueue();
                test = true;
            }


        } while (test = true);
    }
}

















