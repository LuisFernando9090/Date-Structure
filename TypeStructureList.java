package DateStructure;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TypeStructureList {

    Scanner input = new Scanner(System.in);

    List<String> list = new LinkedList<>();

    public void addList() {
        System.out.println("Name: ");
        String name = input.next();
        list.add(name);
    }

    public void nextList() {
        int counter = 0;
        if (list.size() == 1) {
            counter++;
            System.out.println("Number: " + counter + " Name: " + list.toString().replace("[", " ").replace("]", " "));
        }
        for (int cont = 1; cont < list.size(); cont++) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println("Number: " + cont + " Name: " + list.get(i).toUpperCase());
                cont++;
            }
        }
    }

    public void removeList() {
        System.out.println("Remove by Name! ");
        System.out.println("Name : ");
        String nameRemove = input.next();
        list.remove(nameRemove);
        System.out.println("Successfully Remove! ");
    }

    public void viewList() {
        System.out.println("---------------------");
        System.out.println("Name: " + list.toString().toUpperCase().replace("[", " ").replace("]", " "));
        System.out.println("List size: " + list.size());
    }
}
