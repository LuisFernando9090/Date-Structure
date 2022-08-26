package DateStructure;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class TypeStructureQueue {

    Scanner input = new Scanner(System.in);

    Queue<String> queue = new LinkedList<>();
    List<String> list = new LinkedList<>();

    public void addQueue() {
        System.out.println("Name: ");
        String name = input.next();
        queue.add(name);
    }

    public void nextAndRemove() {
        int counter = 0;
        if (queue.size() == 1) {
            System.out.println("---------------------");
            counter++;
            System.out.println("Element: " + counter + " Name: " + queue.element());
            list.add(queue.poll());
        } else if (queue.isEmpty()) {
            System.out.println("---------------------");
            System.out.println("Is Empty! ");
        }
        for (int cont = 1; cont < queue.size(); cont++) {
            for (int i = 0; i < queue.size(); i++) {
                System.out.println("---------------------");
                System.out.println("Element: " + cont + " Name: " + queue.element());
                cont++;
                list.add(queue.poll());
                System.out.println("---------------------");
                System.out.println("Next Queue! ");
                System.out.println("Element: " + cont + " Name: " + queue.element());
            }
        }
    }

    public void viewQueue() {
        if (queue.isEmpty()) {
            System.out.println("---------------------");
            System.out.println("Is Empty!");
        } else {
            System.out.println("---------------------");
            System.out.println("Complete: " + list);
            System.out.println("Queue: " + queue);
            System.out.println("---------------------");
            System.out.println("Contained: " + queue.size());
        }
    }
}
