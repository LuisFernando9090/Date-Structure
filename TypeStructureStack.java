package DateStructure;

import java.util.Scanner;
import java.util.Stack;

public class TypeStructureStack {

    Scanner input = new Scanner(System.in);

    Stack<String> stackBooks = new Stack<>();
    Stack<String> booksRead = new Stack<>();

    public void addStack() {
        System.out.println("Name is Book ? ");
        String name = input.next();
        stackBooks.push(name);
    }

    public void removeStack() {
        booksRead.push(stackBooks.pop());
    }

    public void viewStack() {
        if (stackBooks.isEmpty()) {
            System.out.println("---------------------");
            System.out.println("Stack is Empty! ");
            System.out.println("---------------------");
            System.out.println("Complete Read Books! ");
            System.out.println(booksRead.toString().replace("[", " ").replace("]", " "));
            System.out.println("---------------------");
        } else {
            System.out.println("---------------------");
            System.out.println("Quantity: " + stackBooks.size() + " Elements: "
                    + stackBooks.toString().replace("[", " ").replace("]", " "));
            System.out.println("---------------------");
            System.out.println("Complete Read Books! ");
            System.out.println(booksRead.toString().replace("[", " ").replace("]", " "));
            System.out.println("---------------------");
        }
    }
}
