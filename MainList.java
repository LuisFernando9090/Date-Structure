package DateStructure;

import java.util.Scanner;

public class MainList {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            TypeStructureList client = new TypeStructureList();

            System.out.println("---------------------");
            System.out.println("Good Morning! ");

            while (true) {
                System.out.println("---------------------");
                System.out.println("1 - Add List! ");
                System.out.println("2 - Next List! ");
                System.out.println("3 - Remove List! ");
                System.out.println("4 - View List! ");
                System.out.println("5 - System Close! ");
                System.out.println("---------------------");
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        client.addList();
                        break;
                    case 2:
                        client.nextList();
                        break;
                    case 3:
                        client.removeList();
                        break;
                    case 4:
                        client.viewList();
                        break;
                    case 5:
                        System.out.close();
                    default:
                        break;
                }
            }
        }
    }

}
